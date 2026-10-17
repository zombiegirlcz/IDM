package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes15.dex */
abstract class ProjectionDecoder {
    public static Projection decode(byte[] bArr, int i) {
        ArrayList<Projection.Mesh> proj;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            proj = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new Projection(proj.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(proj.get(0), proj.get(1), i);
    }

    private static int decodeZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i == 1886547818;
    }

    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt();
        Projection.Mesh mesh = null;
        if (i > 10000) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = parsableByteArray.readFloat();
        }
        int i3 = parsableByteArray.readInt();
        if (i3 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i) * 2.0d) / dLog);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        int i5 = 8;
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[i3 * 5];
        int[] iArr = new int[5];
        int i6 = 0;
        int i21 = 0;
        while (i6 < i3) {
            Projection.Mesh mesh2 = mesh;
            int i22 = 0;
            while (i22 < 5) {
                int iDecodeZigZag = iArr[i22] + decodeZigZag(parsableBitArray.readBits(iCeil));
                if (iDecodeZigZag >= i || iDecodeZigZag < 0) {
                    return mesh2;
                }
                fArr2[i21] = fArr[iDecodeZigZag];
                iArr[i22] = iDecodeZigZag;
                i22++;
                i21++;
            }
            i6++;
            mesh = mesh2;
        }
        Projection.Mesh mesh3 = mesh;
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i32 = 32;
        int bits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i33 = 0;
        while (i33 < bits) {
            int bits2 = parsableBitArray.readBits(i5);
            int bits3 = parsableBitArray.readBits(i5);
            int bits4 = parsableBitArray.readBits(i32);
            if (bits4 > 128000) {
                return mesh3;
            }
            int i43 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(((double) i3) * d) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int i59 = 0;
            int i66 = 0;
            while (i59 < bits4) {
                int iDecodeZigZag2 = i66 + decodeZigZag(parsableBitArray.readBits(iCeil2));
                if (iDecodeZigZag2 < 0 || iDecodeZigZag2 >= i3) {
                    return mesh3;
                }
                int i74 = i59 * 3;
                int i92 = iDecodeZigZag2 * 5;
                fArr3[i74] = fArr2[i92];
                fArr3[i74 + 1] = fArr2[i92 + 1];
                fArr3[i74 + 2] = fArr2[i92 + 2];
                int i96 = i59 * 2;
                fArr4[i96] = fArr2[i92 + 3];
                fArr4[i96 + 1] = fArr2[i92 + 4];
                i59++;
                i66 = iDecodeZigZag2;
            }
            subMeshArr[i33] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i33++;
            bits = i43;
            i32 = 32;
            d = 2.0d;
            i5 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int i = parsableByteArray.readInt();
        if (i == 1684433976) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } finally {
                inflater.end();
            }
        } else if (i != 1918990112) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }

    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        int i;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && (i = parsableByteArray.readInt() + position) > position && i <= iLimit) {
            int i2 = parsableByteArray.readInt();
            if (i2 == 2037673328 || i2 == 1836279920) {
                parsableByteArray.setLimit(i);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(i);
            position = i;
        }
        return null;
    }

    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i = parsableByteArray.readInt() + position;
            if (i <= position || i > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == 1835365224) {
                Projection.Mesh mesh = parseMesh(parsableByteArray);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            parsableByteArray.setPosition(i);
            position = i;
        }
        return arrayList;
    }
}
