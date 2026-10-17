package org.jmrtd.lds.icao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.BiometricDataBlockDecoder;
import org.jmrtd.cbeff.BiometricDataBlockEncoder;
import org.jmrtd.cbeff.BiometricEncodingType;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.cbeff.ISO781611Decoder;
import org.jmrtd.cbeff.ISO781611Encoder;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.CBEFFDataGroup;
import org.jmrtd.lds.iso19794.FingerInfo;
import org.jmrtd.lds.iso39794.FingerImageDataBlock;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class DG3File extends CBEFFDataGroup {
    private static final ISO781611Decoder<BiometricDataBlock> DECODER = new ISO781611Decoder<>(getDecoderMap());
    private static final ISO781611Encoder<BiometricDataBlock> ISO_19794_ENCODER = new ISO781611Encoder<>(new BiometricDataBlockEncoder<BiometricDataBlock>() { // from class: org.jmrtd.lds.icao.DG3File.3
        @Override // org.jmrtd.cbeff.BiometricDataBlockEncoder
        public void encode(BiometricDataBlock biometricDataBlock, OutputStream outputStream) throws IOException {
            if (biometricDataBlock instanceof FingerInfo) {
                ((FingerInfo) biometricDataBlock).writeObject(outputStream);
            }
        }

        @Override // org.jmrtd.cbeff.BiometricDataBlockEncoder
        public BiometricEncodingType getEncodingType() {
            return BiometricEncodingType.ISO_19794;
        }
    });
    private static final ISO781611Encoder<BiometricDataBlock> ISO_39794_ENCODER = new ISO781611Encoder<>(new BiometricDataBlockEncoder<BiometricDataBlock>() { // from class: org.jmrtd.lds.icao.DG3File.4
        @Override // org.jmrtd.cbeff.BiometricDataBlockEncoder
        public void encode(BiometricDataBlock biometricDataBlock, OutputStream outputStream) throws IOException {
            if (biometricDataBlock instanceof FingerImageDataBlock) {
                TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
                tLVOutputStream.writeTag(161);
                tLVOutputStream.writeValue(((FingerImageDataBlock) biometricDataBlock).getEncoded());
            }
        }

        @Override // org.jmrtd.cbeff.BiometricDataBlockEncoder
        public BiometricEncodingType getEncodingType() {
            return BiometricEncodingType.ISO_39794;
        }
    });
    private static final long serialVersionUID = -1037522331623814528L;

    /* JADX INFO: renamed from: org.jmrtd.lds.icao.DG3File$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$cbeff$BiometricEncodingType;

        static {
            int[] iArr = new int[BiometricEncodingType.values().length];
            $SwitchMap$org$jmrtd$cbeff$BiometricEncodingType = iArr;
            try {
                iArr[BiometricEncodingType.ISO_19794.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jmrtd$cbeff$BiometricEncodingType[BiometricEncodingType.ISO_39794.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Deprecated
    public DG3File(List<FingerInfo> list) {
        this(list, true);
    }

    public static DG3File createISO19794DG3File(List<FingerInfo> list) {
        return new DG3File(BiometricEncodingType.ISO_19794, list, false);
    }

    public static DG3File createISO39794DG3File(List<FingerImageDataBlock> list) {
        return new DG3File(BiometricEncodingType.ISO_39794, list, false);
    }

    private static Map<Integer, BiometricDataBlockDecoder<BiometricDataBlock>> getDecoderMap() {
        HashMap map = new HashMap();
        map.put(Integer.valueOf(ISO781611.BIOMETRIC_DATA_BLOCK_TAG), new BiometricDataBlockDecoder<BiometricDataBlock>() { // from class: org.jmrtd.lds.icao.DG3File.1
            @Override // org.jmrtd.cbeff.BiometricDataBlockDecoder
            public BiometricDataBlock decode(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) throws IOException {
                return new FingerInfo(standardBiometricHeader, inputStream);
            }
        });
        map.put(Integer.valueOf(ISO781611.BIOMETRIC_DATA_BLOCK_CONSTRUCTED_TAG), new BiometricDataBlockDecoder<BiometricDataBlock>() { // from class: org.jmrtd.lds.icao.DG3File.2
            @Override // org.jmrtd.cbeff.BiometricDataBlockDecoder
            public BiometricDataBlock decode(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) throws IOException {
                if (standardBiometricHeader != null && standardBiometricHeader.hasFormatType(7)) {
                    return new FingerInfo(standardBiometricHeader, inputStream);
                }
                if (standardBiometricHeader != null && !standardBiometricHeader.hasFormatType(40)) {
                    CBEFFDataGroup.LOGGER.warning("Unexpected format type in standard biometric header " + standardBiometricHeader + ", assuming ISO-39794 encoding");
                }
                TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
                int tag2 = tLVInputStream.readTag();
                if (tag2 != 161) {
                    CBEFFDataGroup.LOGGER.warning("Expected tag A1, found " + Integer.toHexString(tag2));
                }
                tLVInputStream.readLength();
                return new FingerImageDataBlock(standardBiometricHeader, inputStream);
            }
        });
        return map;
    }

    private static List<FingerInfo> toFingerInfos(List<BiometricDataBlock> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (BiometricDataBlock biometricDataBlock : list) {
            if (biometricDataBlock instanceof FingerInfo) {
                arrayList.add((FingerInfo) biometricDataBlock);
            }
        }
        return arrayList;
    }

    @Override // org.jmrtd.lds.CBEFFDataGroup
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return super.equals(obj2) && getClass() == obj2.getClass() && this.shouldAddRandomDataIfEmpty == ((DG3File) obj2).shouldAddRandomDataIfEmpty;
    }

    @Override // org.jmrtd.lds.CBEFFDataGroup
    public ISO781611Decoder<BiometricDataBlock> getDecoder() {
        return DECODER;
    }

    @Override // org.jmrtd.lds.CBEFFDataGroup
    public ISO781611Encoder<BiometricDataBlock> getEncoder() {
        int i;
        BiometricEncodingType biometricEncodingType = this.encodingType;
        if (biometricEncodingType != null && (i = AnonymousClass5.$SwitchMap$org$jmrtd$cbeff$BiometricEncodingType[biometricEncodingType.ordinal()]) != 1 && i == 2) {
            return ISO_39794_ENCODER;
        }
        return ISO_19794_ENCODER;
    }

    @Deprecated
    public List<FingerInfo> getFingerInfos() {
        return toFingerInfos(getSubRecords());
    }

    @Override // org.jmrtd.lds.CBEFFDataGroup
    public int hashCode() {
        return (super.hashCode() * 31) + (this.shouldAddRandomDataIfEmpty ? 1231 : 1237);
    }

    @Override // org.jmrtd.lds.CBEFFDataGroup, org.jmrtd.lds.DataGroup, org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        return a.i(new StringBuilder("DG3File ["), super.toString(), "]");
    }

    @Deprecated
    public DG3File(List<FingerInfo> list, boolean z) {
        this(BiometricEncodingType.ISO_19794, list, z);
    }

    private DG3File(BiometricEncodingType biometricEncodingType, List<? extends BiometricDataBlock> list, boolean z) {
        super(99, biometricEncodingType, list, z);
    }

    public DG3File(InputStream inputStream) throws IOException {
        super(99, inputStream, false);
    }
}
