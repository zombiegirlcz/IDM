package org.jmrtd.cbeff;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import j6.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVUtil;
import org.jmrtd.cbeff.BiometricDataBlock;

/* JADX INFO: loaded from: classes14.dex */
public class ISO781611Decoder<B extends BiometricDataBlock> implements ISO781611 {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.cbeff");
    private Map<Integer, BiometricDataBlockDecoder<B>> bdbDecoders;
    private BiometricEncodingType encodingType;

    public ISO781611Decoder(BiometricDataBlockDecoder<B> biometricDataBlockDecoder) {
        this(toMap(biometricDataBlockDecoder));
    }

    private byte[] decodeSMTValue(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int tag2 = tLVInputStream.readTag();
        int length = tLVInputStream.readLength();
        if (tag2 == 129) {
            return tLVInputStream.readValue();
        }
        if (tag2 == 133) {
            throw new IllegalStateException("Access denied. Biometric Information Template is statically protected.");
        }
        long jSkip = 0;
        if (tag2 == 142) {
            while (true) {
                long j2 = length;
                if (jSkip >= j2) {
                    return null;
                }
                jSkip += tLVInputStream.skip(j2);
            }
        } else {
            if (tag2 != 158) {
                LOGGER.info("Unsupported data object tag " + Integer.toHexString(tag2));
                return null;
            }
            while (true) {
                long j3 = length;
                if (jSkip >= j3) {
                    return null;
                }
                jSkip += tLVInputStream.skip(j3);
            }
        }
    }

    private StandardBiometricHeader readBHT(InputStream inputStream, int i, int i2, int i3) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (i != 161) {
            LOGGER.warning("Expected tag " + Integer.toHexString(161) + ", found " + Integer.toHexString(i));
        }
        HashMap map = new HashMap();
        int length = 0;
        while (length < i2) {
            int tag2 = tLVInputStream.readTag();
            int lengthLength = TLVUtil.getLengthLength(tLVInputStream.readLength()) + TLVUtil.getTagLength(tag2) + length;
            byte[] value = tLVInputStream.readValue();
            length = lengthLength + value.length;
            map.put(Integer.valueOf(tag2), value);
        }
        return new StandardBiometricHeader(map);
    }

    private CBEFFInfo<B> readBIT(InputStream inputStream, int i) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        return readBIT(tLVInputStream.readTag(), tLVInputStream.readLength(), inputStream, i);
    }

    private ComplexCBEFFInfo<B> readBITGroup(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int tag2 = tLVInputStream.readTag();
        if (tag2 == 32609) {
            return readBITGroup(tag2, tLVInputStream.readLength(), inputStream);
        }
        throw new IllegalArgumentException("Expected tag " + Integer.toHexString(ISO781611.BIOMETRIC_INFORMATION_GROUP_TEMPLATE_TAG) + ", found " + Integer.toHexString(tag2));
    }

    private B readBiometricDataBlock(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int tag2 = tLVInputStream.readTag();
        if (tag2 == 24366 || tag2 == 32558) {
            this.encodingType = BiometricEncodingType.fromBDBTag(tag2);
            int length = tLVInputStream.readLength();
            BiometricDataBlockDecoder<B> biometricDataBlockDecoder = this.bdbDecoders.get(Integer.valueOf(tag2));
            if (biometricDataBlockDecoder != null) {
                return (B) biometricDataBlockDecoder.decode(inputStream, standardBiometricHeader, i, length);
            }
            throw new IllegalArgumentException(a.n(tag2, new StringBuilder("No decoder for biometric data block tag ")));
        }
        StringBuilder sb6 = new StringBuilder("Expected tag BIOMETRIC_DATA_BLOCK_TAG (");
        sb6.append(Integer.toHexString(ISO781611.BIOMETRIC_DATA_BLOCK_TAG));
        sb6.append(") or BIOMETRIC_DATA_BLOCK_CONSTRUCTED_ALT (");
        sb6.append(Integer.toHexString(ISO781611.BIOMETRIC_DATA_BLOCK_CONSTRUCTED_TAG));
        sb6.append("), found ");
        throw new IllegalArgumentException(a.n(tag2, sb6));
    }

    private void readStaticallyProtectedBIT(InputStream inputStream, int i, int i2, int i3) throws IOException {
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(decodeSMTValue(inputStream)));
        try {
            readBiometricDataBlock(new ByteArrayInputStream(decodeSMTValue(inputStream)), readBHT(tLVInputStream, tLVInputStream.readTag(), tLVInputStream.readLength(), i3), i3);
        } finally {
            tLVInputStream.close();
        }
    }

    private static <R extends BiometricDataBlock> Map<Integer, BiometricDataBlockDecoder<R>> toMap(BiometricDataBlockDecoder<R> biometricDataBlockDecoder) {
        HashMap map = new HashMap();
        map.put(Integer.valueOf(ISO781611.BIOMETRIC_DATA_BLOCK_TAG), biometricDataBlockDecoder);
        map.put(Integer.valueOf(ISO781611.BIOMETRIC_DATA_BLOCK_CONSTRUCTED_TAG), biometricDataBlockDecoder);
        return map;
    }

    public ComplexCBEFFInfo<B> decode(InputStream inputStream) throws IOException {
        return readBITGroup(inputStream);
    }

    public BiometricEncodingType getEncodingType() {
        return this.encodingType;
    }

    public ISO781611Decoder(Map<Integer, BiometricDataBlockDecoder<B>> map) {
        this.bdbDecoders = map;
    }

    private CBEFFInfo<B> readBIT(int i, int i2, InputStream inputStream, int i3) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (i == 32608) {
            int tag2 = tLVInputStream.readTag();
            int length = tLVInputStream.readLength();
            if (tag2 == 125) {
                readStaticallyProtectedBIT(inputStream, tag2, length, i3);
                return null;
            }
            if ((tag2 & 160) == 160) {
                return new SimpleCBEFFInfo(readBiometricDataBlock(inputStream, readBHT(inputStream, tag2, length, i3), i3));
            }
            throw new IllegalArgumentException(a.n(tag2, new StringBuilder("Unsupported template tag: ")));
        }
        throw new IllegalArgumentException("Expected tag BIOMETRIC_INFORMATION_TEMPLATE_TAG (" + Integer.toHexString(ISO781611.BIOMETRIC_INFORMATION_TEMPLATE_TAG) + "), found " + Integer.toHexString(i) + ", index is " + i3);
    }

    private ComplexCBEFFInfo<B> readBITGroup(int i, int i2, InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        ComplexCBEFFInfo<B> complexCBEFFInfo = new ComplexCBEFFInfo<>();
        if (i == 32609) {
            int tag2 = tLVInputStream.readTag();
            if (tag2 == 2) {
                int length = tLVInputStream.readLength();
                if (length == 1) {
                    byte[] value = tLVInputStream.readValue();
                    int i3 = value[0] & UnsignedBytes.MAX_VALUE;
                    for (int i5 = 0; i5 < i3; i5++) {
                        complexCBEFFInfo.add(readBIT(inputStream, i5));
                    }
                    return complexCBEFFInfo;
                }
                throw new IllegalArgumentException(d.n("BIOMETRIC_INFO_COUNT should have length 1, found length ", length));
            }
            throw new IllegalArgumentException("Expected tag BIOMETRIC_INFO_COUNT_TAG (" + Integer.toHexString(2) + ") in CBEFF structure, found " + Integer.toHexString(tag2));
        }
        throw new IllegalArgumentException("Expected tag " + Integer.toHexString(ISO781611.BIOMETRIC_INFORMATION_GROUP_TEMPLATE_TAG) + ", found " + Integer.toHexString(i));
    }
}
