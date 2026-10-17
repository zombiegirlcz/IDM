package org.jmrtd.lds;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.BiometricEncodingType;
import org.jmrtd.cbeff.CBEFFInfo;
import org.jmrtd.cbeff.ComplexCBEFFInfo;
import org.jmrtd.cbeff.ISO781611Decoder;
import org.jmrtd.cbeff.ISO781611Encoder;
import org.jmrtd.cbeff.SimpleCBEFFInfo;

/* JADX INFO: loaded from: classes14.dex */
public abstract class CBEFFDataGroup extends DataGroup {
    protected static final Logger LOGGER = Logger.getLogger("org.jmrtd.lds");
    private static final long serialVersionUID = 2702959939408371946L;
    protected BiometricEncodingType encodingType;
    private Random random;
    protected boolean shouldAddRandomDataIfEmpty;
    private List<BiometricDataBlock> subRecords;

    public CBEFFDataGroup(int i, BiometricEncodingType biometricEncodingType, List<? extends BiometricDataBlock> list, boolean z) {
        super(i);
        addAll(list);
        this.encodingType = biometricEncodingType;
        this.shouldAddRandomDataIfEmpty = z;
        this.random = new SecureRandom();
    }

    private void add(BiometricDataBlock biometricDataBlock) {
        if (this.subRecords == null) {
            this.subRecords = new ArrayList();
        }
        this.subRecords.add(biometricDataBlock);
    }

    private void addAll(List<? extends BiometricDataBlock> list) {
        if (this.subRecords == null) {
            this.subRecords = new ArrayList();
        }
        this.subRecords.addAll(list);
    }

    public boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof CBEFFDataGroup)) {
            return false;
        }
        try {
            List<BiometricDataBlock> subRecords = getSubRecords();
            List<BiometricDataBlock> subRecords2 = ((CBEFFDataGroup) obj2).getSubRecords();
            int size = subRecords.size();
            if (size != subRecords2.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                BiometricDataBlock biometricDataBlock = subRecords.get(i);
                BiometricDataBlock biometricDataBlock2 = subRecords2.get(i);
                if (biometricDataBlock == null) {
                    if (biometricDataBlock2 != null) {
                        return false;
                    }
                } else if (!biometricDataBlock.equals(biometricDataBlock2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException e) {
            LOGGER.log(Level.WARNING, "Wrong class", (Throwable) e);
            return false;
        }
    }

    public abstract ISO781611Decoder<BiometricDataBlock> getDecoder();

    public abstract ISO781611Encoder<BiometricDataBlock> getEncoder();

    public BiometricEncodingType getEncodingType() {
        return this.encodingType;
    }

    public List<BiometricDataBlock> getSubRecords() {
        if (this.subRecords == null) {
            this.subRecords = new ArrayList();
        }
        return new ArrayList(this.subRecords);
    }

    public int hashCode() {
        Iterator<BiometricDataBlock> it8 = getSubRecords().iterator();
        int iHashCode = 1234567891;
        while (it8.hasNext()) {
            BiometricDataBlock next = it8.next();
            iHashCode = next == null ? (iHashCode * 3) + 5 : ((next.hashCode() + iHashCode) * 5) + 7;
        }
        return ((this.shouldAddRandomDataIfEmpty ? (iHashCode * 13) + LDSFile.EF_DG15_TAG : (iHashCode * 17) + 123) * 7) + 11;
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void readContent(InputStream inputStream) throws IOException {
        ISO781611Decoder<BiometricDataBlock> decoder = getDecoder();
        this.encodingType = decoder.getEncodingType();
        for (CBEFFInfo cBEFFInfo : decoder.decode(inputStream).getSubRecords()) {
            if (!(cBEFFInfo instanceof SimpleCBEFFInfo)) {
                throw new IOException("Was expecting a SimpleCBEFFInfo, found ".concat(cBEFFInfo.getClass().getSimpleName()));
            }
            add(((SimpleCBEFFInfo) cBEFFInfo).getBiometricDataBlock());
        }
        this.encodingType = decoder.getEncodingType();
    }

    @Override // org.jmrtd.lds.DataGroup, org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        StringBuilder sb6 = new StringBuilder("CBEFFDataGroup [");
        List<BiometricDataBlock> list = this.subRecords;
        if (list == null) {
            sb6.append("null");
        } else {
            Iterator<BiometricDataBlock> it8 = list.iterator();
            boolean z = true;
            while (it8.hasNext()) {
                BiometricDataBlock next = it8.next();
                if (z) {
                    z = false;
                } else {
                    sb6.append(", ");
                }
                sb6.append(next == null ? "null" : next.toString());
            }
        }
        sb6.append(']');
        return sb6.toString();
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void writeContent(OutputStream outputStream) throws IOException {
        ISO781611Encoder<BiometricDataBlock> encoder = getEncoder();
        ComplexCBEFFInfo complexCBEFFInfo = new ComplexCBEFFInfo();
        Iterator<BiometricDataBlock> it8 = getSubRecords().iterator();
        while (it8.hasNext()) {
            complexCBEFFInfo.add(new SimpleCBEFFInfo(it8.next()));
        }
        encoder.encode(complexCBEFFInfo, outputStream);
        if (this.shouldAddRandomDataIfEmpty) {
            writeOptionalRandomData(outputStream);
        }
    }

    public void writeOptionalRandomData(OutputStream outputStream) throws IOException {
        if (this.subRecords.isEmpty()) {
            TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
            tLVOutputStream.writeTag(83);
            byte[] bArr = new byte[8];
            this.random.nextBytes(bArr);
            tLVOutputStream.writeValue(bArr);
        }
    }

    public CBEFFDataGroup(int i, InputStream inputStream, boolean z) throws IOException {
        super(i, inputStream);
        this.shouldAddRandomDataIfEmpty = z;
        this.random = new Random();
    }
}
