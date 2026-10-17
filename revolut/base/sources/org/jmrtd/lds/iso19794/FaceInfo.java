package org.jmrtd.lds.iso19794;

import j6.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.data.Gender;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;
import org.jmrtd.lds.iso19794.FaceImageInfo;

/* JADX INFO: loaded from: classes14.dex */
public class FaceInfo extends AbstractListInfo<FaceImageInfo> implements BiometricDataBlock {
    private static final int FORMAT_IDENTIFIER = 1178682112;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final int VERSION_NUMBER = 808529920;
    private static final long serialVersionUID = -6053206262773400725L;

    /* JADX INFO: renamed from: sbh, reason: collision with root package name */
    private StandardBiometricHeader f228975sbh;

    public FaceInfo(List<FaceImageInfo> list) {
        this((StandardBiometricHeader) null, list);
    }

    public void addFaceImageInfo(FaceImageInfo faceImageInfo) {
        add(faceImageInfo);
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!super.equals(obj2) || getClass() != obj2.getClass()) {
            return false;
        }
        FaceInfo faceInfo = (FaceInfo) obj2;
        StandardBiometricHeader standardBiometricHeader = this.f228975sbh;
        if (standardBiometricHeader == null) {
            return faceInfo.f228975sbh == null;
        }
        StandardBiometricHeader standardBiometricHeader2 = faceInfo.f228975sbh;
        return standardBiometricHeader == standardBiometricHeader2 || standardBiometricHeader.equals(standardBiometricHeader2);
    }

    public List<FaceImageInfo> getFaceImageInfos() {
        return getSubRecords();
    }

    @Override // org.jmrtd.cbeff.BiometricDataBlock
    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.f228975sbh == null) {
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{2});
            treeMap.put(130, new byte[]{0});
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 8});
            this.f228975sbh = new StandardBiometricHeader(treeMap);
        }
        return this.f228975sbh;
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        StandardBiometricHeader standardBiometricHeader = this.f228975sbh;
        return iHashCode + (standardBiometricHeader == null ? 0 : standardBiometricHeader.hashCode());
    }

    @Override // org.jmrtd.lds.AbstractListInfo
    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int i = dataInputStream.readInt();
        if (i != FORMAT_IDENTIFIER) {
            LOGGER.log(Level.WARNING, "'FAC' marker expected! Found " + Integer.toHexString(i));
            if (i == 12) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(i);
                short s2 = dataInputStream.readShort();
                dataOutputStream.writeShort(s2);
                int i2 = 0;
                while (i2 < s2) {
                    byte[] bArr = new byte[2048];
                    int i3 = dataInputStream.read(bArr);
                    if (i3 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr);
                    i2 += i3;
                }
                add(new FaceImageInfo(Gender.UNKNOWN, FaceImageInfo.EyeColor.UNSPECIFIED, 0, 0, 0, new int[]{0, 0, 0}, new int[]{0, 0, 0}, 1, 0, 0, 0, 0, new FaceImageInfo.FeaturePoint[0], 0, 0, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), s2, 1));
                return;
            }
        }
        int i5 = dataInputStream.readInt();
        if (i5 != VERSION_NUMBER) {
            throw new IllegalArgumentException(a.n(i5, new StringBuilder("'010' version number expected! Found ")));
        }
        long j2 = (((long) dataInputStream.readInt()) & BodyPartID.bodyIdMax) - 14;
        int unsignedShort = dataInputStream.readUnsignedShort();
        long recordLength = 0;
        for (int i6 = 0; i6 < unsignedShort; i6++) {
            FaceImageInfo faceImageInfo = new FaceImageInfo(inputStream);
            recordLength += faceImageInfo.getRecordLength();
            add(faceImageInfo);
        }
        if (j2 != recordLength) {
            Logger logger = LOGGER;
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "ConstructedDataLength and dataLength differ: dataLength = ", ", constructedDataLength = ");
            sbV.append(recordLength);
            logger.warning(sbV.toString());
        }
    }

    public void removeFaceImageInfo(int i) {
        remove(i);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FaceInfo [");
        Iterator<FaceImageInfo> it8 = getSubRecords().iterator();
        while (it8.hasNext()) {
            sb6.append(it8.next().toString());
        }
        sb6.append("]");
        return sb6.toString();
    }

    @Override // org.jmrtd.lds.AbstractListInfo, org.jmrtd.lds.AbstractLDSInfo
    public void writeObject(OutputStream outputStream) throws IOException {
        List<FaceImageInfo> subRecords = getSubRecords();
        Iterator<FaceImageInfo> it8 = subRecords.iterator();
        long recordLength = 0;
        while (it8.hasNext()) {
            recordLength += it8.next().getRecordLength();
        }
        long j2 = ((long) 14) + recordLength;
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(FORMAT_IDENTIFIER);
        dataOutputStream.writeInt(VERSION_NUMBER);
        dataOutputStream.writeInt((int) (BodyPartID.bodyIdMax & j2));
        dataOutputStream.writeShort(subRecords.size());
        Iterator<FaceImageInfo> it9 = subRecords.iterator();
        while (it9.hasNext()) {
            it9.next().writeObject(dataOutputStream);
        }
    }

    public FaceInfo(StandardBiometricHeader standardBiometricHeader, List<FaceImageInfo> list) {
        this.f228975sbh = standardBiometricHeader;
        addAll(list);
    }

    public FaceInfo(InputStream inputStream) throws IOException {
        this((StandardBiometricHeader) null, inputStream);
    }

    public FaceInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) throws IOException {
        this.f228975sbh = standardBiometricHeader;
        readObject(inputStream);
    }
}
