package org.jmrtd;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.FileInfo;
import net.sf.scuba.smartcards.FileSystemStructured;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.util.Hex;
import org.jmrtd.io.FragmentBuffer;
import org.jmrtd.lds.LDSFileUtil;
import org.jmrtd.protocol.SecureMessagingWrapper;

/* JADX INFO: loaded from: classes14.dex */
public class DefaultFileSystem implements FileSystemStructured {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int NO_SFI = -1;
    private static final int READ_AHEAD_LENGTH = 8;
    private Map<Short, Byte> fidToSFI;
    private Map<Short, DefaultFileInfo> fileInfos;
    private boolean isSFIEnabled;
    private boolean isSelected;
    private int maxReadBinaryLength;
    private APDUWrapper oldWrapper;
    private short selectedFID;
    private APDULevelReadBinaryCapable service;
    private APDUWrapper wrapper;

    public static class DefaultFileInfo extends FileInfo implements Serializable {
        private static final long serialVersionUID = 6727369753765119839L;
        private FragmentBuffer buffer;

        /* JADX INFO: renamed from: fid, reason: collision with root package name */
        private short f228964fid;

        public DefaultFileInfo(short s2, int i) {
            this.f228964fid = s2;
            if (i >= 0) {
                this.buffer = new FragmentBuffer(i);
            }
        }

        public void addFragment(int i, byte[] bArr) {
            FragmentBuffer fragmentBuffer = this.buffer;
            if (fragmentBuffer == null) {
                DefaultFileSystem.LOGGER.warning("Not adding fragment to null");
            } else {
                fragmentBuffer.addFragment(i, bArr);
            }
        }

        public byte[] getBuffer() {
            FragmentBuffer fragmentBuffer = this.buffer;
            if (fragmentBuffer == null) {
                return null;
            }
            return fragmentBuffer.getBuffer();
        }

        @Override // net.sf.scuba.smartcards.FileInfo
        public short getFID() {
            return this.f228964fid;
        }

        @Override // net.sf.scuba.smartcards.FileInfo
        public int getFileLength() {
            FragmentBuffer fragmentBuffer = this.buffer;
            if (fragmentBuffer == null) {
                return -1;
            }
            return fragmentBuffer.getLength();
        }

        public FragmentBuffer.Fragment getSmallestUnbufferedFragment(int i, int i2) {
            FragmentBuffer fragmentBuffer = this.buffer;
            if (fragmentBuffer == null) {
                return null;
            }
            return fragmentBuffer.getSmallestUnbufferedFragment(i, i2);
        }

        public String toString() {
            return Integer.toHexString(this.f228964fid);
        }
    }

    public DefaultFileSystem(APDULevelReadBinaryCapable aPDULevelReadBinaryCapable, boolean z) {
        this(aPDULevelReadBinaryCapable, z, LDSFileUtil.FID_TO_SFI);
    }

    private synchronized DefaultFileInfo getFileInfo() throws CardServiceException {
        byte[] bArrSendReadBinary;
        try {
            short s2 = this.selectedFID;
            if (s2 <= 0) {
                throw new CardServiceException("No file selected");
            }
            DefaultFileInfo defaultFileInfo = this.fileInfos.get(Short.valueOf(s2));
            if (defaultFileInfo != null) {
                return defaultFileInfo;
            }
            try {
                if (this.isSFIEnabled) {
                    Byte b4 = this.fidToSFI.get(Short.valueOf(this.selectedFID));
                    if (b4 == null) {
                        throw new NumberFormatException("Unknown FID " + Integer.toHexString(this.selectedFID));
                    }
                    bArrSendReadBinary = sendReadBinary((b4.byteValue() & UnsignedBytes.MAX_VALUE) | 128, 0, 8, false);
                    this.isSelected = true;
                } else {
                    if (!this.isSelected) {
                        sendSelectFile(this.selectedFID);
                        this.isSelected = true;
                    }
                    bArrSendReadBinary = sendReadBinary(0, 8, false);
                }
                if (bArrSendReadBinary != null && bArrSendReadBinary.length != 0) {
                    int fileLength = getFileLength(this.selectedFID, 8, bArrSendReadBinary);
                    if (fileLength < bArrSendReadBinary.length) {
                        bArrSendReadBinary = Arrays.copyOf(bArrSendReadBinary, fileLength);
                    }
                    DefaultFileInfo defaultFileInfo2 = new DefaultFileInfo(this.selectedFID, fileLength);
                    defaultFileInfo2.addFragment(0, bArrSendReadBinary);
                    this.fileInfos.put(Short.valueOf(this.selectedFID), defaultFileInfo2);
                    return defaultFileInfo2;
                }
                LOGGER.warning("Something is wrong with prefix, prefix = " + Hex.bytesToHexString(bArrSendReadBinary));
                return null;
            } catch (IOException e) {
                throw new CardServiceException("Error getting file info for " + Integer.toHexString(this.selectedFID), e);
            } catch (CardServiceException unused) {
                DefaultFileInfo defaultFileInfo3 = new DefaultFileInfo(this.selectedFID, -1);
                this.fileInfos.put(Short.valueOf(this.selectedFID), defaultFileInfo3);
                return defaultFileInfo3;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    private static int getFileLength(short s2, int i, byte[] bArr) throws IOException {
        if (bArr.length < i) {
            return bArr.length;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        TLVInputStream tLVInputStream = new TLVInputStream(byteArrayInputStream);
        try {
            try {
                if (tLVInputStream.readTag() == 66) {
                    try {
                        return 36;
                    } catch (IOException e) {
                        return 36;
                    }
                }
                int length = (bArr.length - byteArrayInputStream.available()) + tLVInputStream.readLength();
                try {
                    tLVInputStream.close();
                    return length;
                } catch (IOException e2) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e2);
                    return length;
                }
            } finally {
                try {
                    tLVInputStream.close();
                } catch (IOException e4) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e4);
                }
            }
        } catch (Exception e5) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e5);
            try {
                tLVInputStream.close();
                return -1;
            } catch (IOException e6) {
                LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e6);
                return -1;
            }
        }
    }

    public int getMaxReadBinaryLength() {
        return this.maxReadBinaryLength;
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public synchronized FileInfo[] getSelectedPath() throws CardServiceException {
        DefaultFileInfo fileInfo = getFileInfo();
        if (fileInfo == null) {
            return null;
        }
        return new DefaultFileInfo[]{fileInfo};
    }

    public APDUWrapper getWrapper() {
        return this.wrapper;
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public synchronized byte[] readBinary(int i, int i2) throws CardServiceException {
        byte[] bArr;
        byte[] bArrSendReadBinary;
        try {
            try {
                try {
                    if (this.selectedFID <= 0) {
                        throw new CardServiceException("No file selected");
                    }
                    DefaultFileInfo fileInfo = getFileInfo();
                    if (fileInfo == null) {
                        throw new CardServiceException("Could not get file info");
                    }
                    int iMin = Math.min(i2, this.maxReadBinaryLength);
                    FragmentBuffer.Fragment smallestUnbufferedFragment = fileInfo.getSmallestUnbufferedFragment(i, iMin);
                    if (smallestUnbufferedFragment.getLength() > 0) {
                        boolean z = true;
                        if (!this.isSFIEnabled || i >= 256) {
                            if (!this.isSelected) {
                                sendSelectFile(this.selectedFID);
                                this.isSelected = true;
                            }
                            int offset = smallestUnbufferedFragment.getOffset();
                            int length = smallestUnbufferedFragment.getLength();
                            if (i <= 32767) {
                                z = false;
                            }
                            bArrSendReadBinary = sendReadBinary(offset, length, z);
                        } else {
                            Byte b4 = this.fidToSFI.get(Short.valueOf(this.selectedFID));
                            if (b4 == null) {
                                throw new NumberFormatException("Unknown FID " + Integer.toHexString(this.selectedFID));
                            }
                            bArrSendReadBinary = sendReadBinary((b4.byteValue() & UnsignedBytes.MAX_VALUE) | 128, smallestUnbufferedFragment.getOffset(), smallestUnbufferedFragment.getLength(), false);
                            this.isSelected = true;
                        }
                        if (bArrSendReadBinary == null) {
                            throw new IllegalStateException("Could not read bytes");
                        }
                        if (bArrSendReadBinary.length > 0) {
                            fileInfo.addFragment(smallestUnbufferedFragment.getOffset(), bArrSendReadBinary);
                        }
                        if (bArrSendReadBinary.length < smallestUnbufferedFragment.getLength()) {
                            iMin = bArrSendReadBinary.length;
                        }
                    }
                    bArr = new byte[iMin];
                    System.arraycopy(fileInfo.getBuffer(), i, bArr, 0, iMin);
                } catch (CardServiceException e) {
                    if ((((short) e.getSW()) & ISO7816.SW_WRONG_LENGTH) != 26368 || this.maxReadBinaryLength <= 223) {
                        StringBuilder sb6 = new StringBuilder("Read binary failed on file ");
                        sb6.append((Object) (0 == 0 ? Integer.toHexString(this.selectedFID) : null));
                        throw new CardServiceException(sb6.toString(), e);
                    }
                    this.wrapper = this.oldWrapper;
                    this.maxReadBinaryLength = PassportService.DEFAULT_MAX_BLOCKSIZE;
                    return new byte[0];
                }
            } catch (Exception e2) {
                StringBuilder sb9 = new StringBuilder("Read binary failed on file ");
                sb9.append((Object) (0 == 0 ? Integer.toHexString(this.selectedFID) : null));
                throw new CardServiceException(sb9.toString(), e2);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return bArr;
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public synchronized void selectFile(short s2) throws CardServiceException {
        if (this.selectedFID == s2) {
            return;
        }
        this.selectedFID = s2;
        this.isSelected = false;
        DefaultFileInfo fileInfo = getFileInfo();
        if (fileInfo == null || fileInfo.getBuffer() == null) {
            throw new CardServiceException("Could not select file");
        }
    }

    public synchronized byte[] sendReadBinary(int i, int i2, boolean z) throws CardServiceException {
        try {
            APDUWrapper secureMessagingWrapper = this.wrapper;
            if (secureMessagingWrapper instanceof SecureMessagingWrapper) {
                secureMessagingWrapper = SecureMessagingWrapper.getInstance((SecureMessagingWrapper) secureMessagingWrapper);
            }
            this.oldWrapper = secureMessagingWrapper;
        } catch (Throwable th10) {
            throw th10;
        }
        return this.service.sendReadBinary(this.wrapper, -1, i, i2, false, z);
    }

    public synchronized void sendSelectFile(short s2) throws CardServiceException {
        this.service.sendSelectFile(this.wrapper, s2);
    }

    public void setWrapper(APDUWrapper aPDUWrapper) {
        this.oldWrapper = this.wrapper;
        this.wrapper = aPDUWrapper;
    }

    public DefaultFileSystem(APDULevelReadBinaryCapable aPDULevelReadBinaryCapable, boolean z, Map<Short, Byte> map) {
        this.service = aPDULevelReadBinaryCapable;
        this.fileInfos = new HashMap();
        this.selectedFID = (short) 0;
        this.isSelected = false;
        this.isSFIEnabled = z;
        this.fidToSFI = map;
        this.maxReadBinaryLength = 65536;
    }

    public synchronized byte[] sendReadBinary(int i, int i2, int i3, boolean z) throws CardServiceException {
        return this.service.sendReadBinary(this.wrapper, i, i2, i3, true, z);
    }
}
