package l8;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kl.t1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements c8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f192735a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f192736b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(j jVar, f8.f fVar) {
        try {
            int iB = jVar.b();
            if ((iB & 65496) == 65496 || iB == 19789 || iB == 18761) {
                int iG = g(jVar);
                if (iG != -1) {
                    byte[] bArr = (byte[]) fVar.c(iG, byte[].class);
                    try {
                        return h(jVar, bArr, iG);
                    } finally {
                        fVar.g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                String str = "Parser doesn't handle magic number: " + iB;
                return -1;
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType f(j jVar) {
        try {
            int iB = jVar.b();
            if (iB == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iB << 8) | jVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | jVar.d();
            if (iD2 == -1991225785) {
                jVar.skip(21L);
                try {
                    return jVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                jVar.skip(4L);
                if (((jVar.b() << 16) | jVar.b()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iB2 = (jVar.b() << 16) | jVar.b();
                if ((iB2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iB2 & 255;
                if (i == 88) {
                    jVar.skip(4L);
                    short sD = jVar.d();
                    return (sD & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sD & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                jVar.skip(4L);
                return (jVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((jVar.b() << 16) | jVar.b()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iB3 = (jVar.b() << 16) | jVar.b();
            if (iB3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iB3 == 1635150182;
            jVar.skip(4L);
            int i3 = iD2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iB4 = (jVar.b() << 16) | jVar.b();
                    if (iB4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iB4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(l8.j r9) {
        /*
        L0:
            short r0 = r9.d()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L18
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5a
            java.lang.String r9 = "Unknown segmentId="
            p.a.z(r0, r9, r4)
            return r3
        L18:
            short r0 = r9.d()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L21
            goto L5a
        L21:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L2f
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5a
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            return r3
        L2f:
            int r1 = r9.b()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L5b
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5a
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r2 = ", but actually skipped: "
            java.lang.String r5 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = com.google.android.gms.internal.mlkit_vision_face.a.w(r5, r0, r1, r9, r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
        L5a:
            return r3
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.k.g(l8.j):int");
    }

    public static int h(j jVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        String str;
        int iA = jVar.a(i, bArr);
        if (iA == i) {
            byte[] bArr2 = f192735a;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i2 = 0;
                while (true) {
                    if (i2 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i2] != bArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                kye.e eVar = new kye.e(bArr, i);
                short sG = eVar.g(6);
                if (sG != 18761) {
                    if (sG != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        p.a.z(sG, "Unknown endianness = ", "DfltImageHeaderParser");
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                eVar.o(byteOrder);
                int iH = eVar.h(10);
                short sG2 = eVar.g(iH + 6);
                for (int i3 = 0; i3 < sG2; i3++) {
                    int i5 = (i3 * 12) + iH + 8;
                    short sG3 = eVar.g(i5);
                    if (sG3 == 274) {
                        short sG4 = eVar.g(i5 + 2);
                        if (sG4 >= 1 && sG4 <= 12) {
                            int iH2 = eVar.h(i5 + 4);
                            if (iH2 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Got tagIndex=", i3, sG3, " tagType=", " formatCode=");
                                    sbW.append((int) sG4);
                                    sbW.append(" componentCount=");
                                    sbW.append(iH2);
                                    sbW.toString();
                                }
                                int i6 = iH2 + f192736b[sG4];
                                if (i6 <= 4) {
                                    int i21 = i5 + 8;
                                    if (i21 >= 0 && i21 <= eVar.j()) {
                                        if (i6 >= 0 && i6 + i21 <= eVar.j()) {
                                            return eVar.g(i21);
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            p.a.z(sG3, "Illegal number of bytes for TI tag data tagType=", "DfltImageHeaderParser");
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        String str2 = "Illegal tagValueOffset=" + i21 + " tagType=" + ((int) sG3);
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    str = "Got byte count > 4, not orientation, continuing, formatCode=";
                                    p.a.z(sG4, str, "DfltImageHeaderParser");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Got invalid format code = ";
                            p.a.z(sG4, str, "DfltImageHeaderParser");
                        }
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            String str3 = "Unable to read exif segment data, length: " + i + ", actually read: " + iA;
            return -1;
        }
        return -1;
    }

    @Override // c8.f
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return f(new kl.b0(inputStream, 4));
    }

    @Override // c8.f
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        y8.f.c(byteBuffer, "Argument must not be null");
        return f(new t1(byteBuffer));
    }

    @Override // c8.f
    public final int c(ByteBuffer byteBuffer, f8.f fVar) {
        t1 t1Var = new t1(byteBuffer);
        y8.f.c(fVar, "Argument must not be null");
        return e(t1Var, fVar);
    }

    @Override // c8.f
    public final int d(InputStream inputStream, f8.f fVar) {
        kl.b0 b0Var = new kl.b0(inputStream, 4);
        y8.f.c(fVar, "Argument must not be null");
        return e(b0Var, fVar);
    }
}
