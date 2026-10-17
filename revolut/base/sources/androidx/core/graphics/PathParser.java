package androidx.core.graphics;

import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j6.a;
import java.util.ArrayList;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes15.dex */
public abstract class PathParser {

    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c2, float[] fArr) {
        arrayList.add(new PathDataNode(c2, fArr));
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            if (pathDataNodeArr[i].mType != pathDataNodeArr2[i].mType || pathDataNodeArr[i].mParams.length != pathDataNodeArr2[i].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int iNextStart = nextStart(str, i2);
            String strTrim = str.substring(i, iNextStart).trim();
            if (!strTrim.isEmpty()) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i = iNextStart;
            i2 = iNextStart + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            addNode(arrayList, str.charAt(i), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(a.q("Error in parsing ", str), e);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.mEndWithNegOrDot = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.mEndWithNegOrDot = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException(p.a.p("error in parsing \"", str, "\""), e);
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                    continue;
                }
                i++;
            }
            if (cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c2 = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c2, pathDataNode.mType, pathDataNode.mParams);
            c2 = pathDataNode.mType;
        }
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            for (int i2 = 0; i2 < pathDataNodeArr2[i].mParams.length; i2++) {
                pathDataNodeArr[i].mParams[i2] = pathDataNodeArr2[i].mParams[i2];
            }
        }
    }

    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        public PathDataNode(char c2, float[] fArr) {
            this.mType = c2;
            this.mParams = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i;
            int i2;
            boolean z;
            boolean z3;
            char c5;
            char c6;
            int i3;
            float f;
            boolean z4;
            float f4;
            float f5;
            float f6;
            float f32;
            float f35;
            boolean z6;
            float f36;
            float f37;
            float f41;
            float f42;
            float f57;
            float f69;
            float f75;
            float f77;
            float f81;
            float f82;
            Path path2 = path;
            boolean z11 = false;
            float f93 = fArr[0];
            boolean z12 = true;
            float f94 = fArr[1];
            char c7 = 2;
            float f99 = fArr[2];
            char c16 = 3;
            float f100 = fArr[3];
            float f101 = fArr[4];
            float f102 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    i2 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i2 = i;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case LDSFile.EF_DG4_TAG /* 118 */:
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case LDSFile.EF_DG12_TAG /* 108 */:
                case LDSFile.EF_DG13_TAG /* 109 */:
                case 't':
                default:
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f101, f102);
                    f93 = f101;
                    f99 = f93;
                    f94 = f102;
                    f100 = f94;
                    i2 = 2;
                    break;
            }
            float f103 = f93;
            float f104 = f94;
            float f105 = f101;
            float f106 = f102;
            int i5 = 0;
            char c26 = c2;
            while (i5 < fArr2.length) {
                if (c3 == 'A') {
                    float f107 = f103;
                    float f108 = f104;
                    z = z11;
                    z3 = z12;
                    c5 = c7;
                    c6 = c16;
                    i3 = i5;
                    int i6 = i3 + 5;
                    float f109 = fArr2[i6];
                    int i21 = i3 + 6;
                    float f110 = fArr2[i21];
                    float f111 = fArr2[i3];
                    float f112 = fArr2[i3 + 1];
                    float f113 = fArr2[i3 + 2];
                    if (fArr2[i3 + 3] != BitmapDescriptorFactory.HUE_RED) {
                        f = 0.0f;
                        z4 = z3;
                    } else {
                        f = 0.0f;
                        z4 = z;
                    }
                    drawArc(path, f107, f108, f109, f110, f111, f112, f113, z4, fArr2[i3 + 4] != f ? z3 : z);
                    f99 = fArr2[i6];
                    f103 = f99;
                    f100 = fArr2[i21];
                    f104 = f100;
                } else if (c3 == 'C') {
                    z = z11;
                    z3 = z12;
                    c5 = c7;
                    c6 = c16;
                    i3 = i5;
                    int i22 = i3 + 2;
                    int i32 = i3 + 3;
                    int i33 = i3 + 4;
                    int i43 = i3 + 5;
                    path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i22], fArr2[i32], fArr2[i33], fArr2[i43]);
                    float f114 = fArr2[i33];
                    float f115 = fArr2[i43];
                    float f116 = fArr2[i22];
                    float f117 = fArr2[i32];
                    f103 = f114;
                    f104 = f115;
                    f100 = f117;
                    f99 = f116;
                } else if (c3 != 'H') {
                    if (c3 != 'Q') {
                        z = z11;
                        if (c3 == 'V') {
                            z3 = z12;
                            c5 = c7;
                            c6 = c16;
                            i3 = i5;
                            path2.lineTo(f103, fArr2[i3]);
                            f6 = fArr2[i3];
                        } else if (c3 != 'a') {
                            if (c3 != 'c') {
                                z3 = z12;
                                if (c3 != 'h') {
                                    if (c3 != 'q') {
                                        c5 = c7;
                                        if (c3 != 'v') {
                                            if (c3 != 'L') {
                                                if (c3 != 'M') {
                                                    c6 = c16;
                                                    if (c3 == 'S') {
                                                        if (c26 == 'c' || c26 == 's' || c26 == 'C' || c26 == 'S') {
                                                            f103 = (f103 * 2.0f) - f99;
                                                            f104 = (f104 * 2.0f) - f100;
                                                        }
                                                        float f118 = f103;
                                                        float f119 = f104;
                                                        int i59 = i5 + 1;
                                                        int i66 = i5 + 2;
                                                        int i74 = i5 + 3;
                                                        path2.cubicTo(f118, f119, fArr2[i5], fArr2[i59], fArr2[i66], fArr2[i74]);
                                                        f4 = fArr2[i5];
                                                        f5 = fArr2[i59];
                                                        f103 = fArr2[i66];
                                                        f104 = fArr2[i74];
                                                        i3 = i5;
                                                    } else if (c3 == 'T') {
                                                        if (c26 == 'q' || c26 == 't' || c26 == 'Q' || c26 == 'T') {
                                                            f103 = (f103 * 2.0f) - f99;
                                                            f104 = (f104 * 2.0f) - f100;
                                                        }
                                                        int i92 = i5 + 1;
                                                        path2.quadTo(f103, f104, fArr2[i5], fArr2[i92]);
                                                        float f120 = fArr2[i5];
                                                        f6 = fArr2[i92];
                                                        f99 = f103;
                                                        f100 = f104;
                                                        i3 = i5;
                                                        f103 = f120;
                                                    } else if (c3 == 'l') {
                                                        int i96 = i5 + 1;
                                                        path2.rLineTo(fArr2[i5], fArr2[i96]);
                                                        f103 += fArr2[i5];
                                                        f42 = fArr2[i96];
                                                    } else if (c3 == 'm') {
                                                        float f121 = fArr2[i5];
                                                        f103 += f121;
                                                        float f122 = fArr2[i5 + 1];
                                                        f104 += f122;
                                                        if (i5 > 0) {
                                                            path2.rLineTo(f121, f122);
                                                        } else {
                                                            path2.rMoveTo(f121, f122);
                                                            f105 = f103;
                                                        }
                                                    } else if (c3 == 's') {
                                                        if (c26 == 'c' || c26 == 's' || c26 == 'C' || c26 == 'S') {
                                                            f75 = f104 - f100;
                                                            f77 = f103 - f99;
                                                        } else {
                                                            f77 = BitmapDescriptorFactory.HUE_RED;
                                                            f75 = BitmapDescriptorFactory.HUE_RED;
                                                        }
                                                        int i99 = i5 + 1;
                                                        int i100 = i5 + 2;
                                                        int i101 = i5 + 3;
                                                        path2.rCubicTo(f77, f75, fArr2[i5], fArr2[i99], fArr2[i100], fArr2[i101]);
                                                        f36 = fArr2[i5] + f103;
                                                        f37 = fArr2[i99] + f104;
                                                        f103 += fArr2[i100];
                                                        f41 = fArr2[i101];
                                                    } else if (c3 == 't') {
                                                        if (c26 == 'q' || c26 == 't' || c26 == 'Q' || c26 == 'T') {
                                                            f81 = f103 - f99;
                                                            f82 = f104 - f100;
                                                        } else {
                                                            f82 = BitmapDescriptorFactory.HUE_RED;
                                                            f81 = BitmapDescriptorFactory.HUE_RED;
                                                        }
                                                        int i102 = i5 + 1;
                                                        path2.rQuadTo(f81, f82, fArr2[i5], fArr2[i102]);
                                                        float f123 = f81 + f103;
                                                        float f124 = f82 + f104;
                                                        f103 += fArr2[i5];
                                                        f104 += fArr2[i102];
                                                        f100 = f124;
                                                        f99 = f123;
                                                    }
                                                } else {
                                                    c6 = c16;
                                                    f57 = fArr2[i5];
                                                    f69 = fArr2[i5 + 1];
                                                    if (i5 > 0) {
                                                        path2.lineTo(f57, f69);
                                                    } else {
                                                        path2.moveTo(f57, f69);
                                                        f103 = f57;
                                                        f105 = f103;
                                                        f104 = f69;
                                                    }
                                                }
                                                f106 = f104;
                                            } else {
                                                c6 = c16;
                                                int i103 = i5 + 1;
                                                path2.lineTo(fArr2[i5], fArr2[i103]);
                                                f57 = fArr2[i5];
                                                f69 = fArr2[i103];
                                            }
                                            f103 = f57;
                                            f104 = f69;
                                        } else {
                                            c6 = c16;
                                            path2.rLineTo(BitmapDescriptorFactory.HUE_RED, fArr2[i5]);
                                            f42 = fArr2[i5];
                                        }
                                        f104 += f42;
                                    } else {
                                        c5 = c7;
                                        c6 = c16;
                                        int i104 = i5 + 1;
                                        int i105 = i5 + 2;
                                        int i106 = i5 + 3;
                                        path2.rQuadTo(fArr2[i5], fArr2[i104], fArr2[i105], fArr2[i106]);
                                        f36 = fArr2[i5] + f103;
                                        f37 = fArr2[i104] + f104;
                                        f103 += fArr2[i105];
                                        f41 = fArr2[i106];
                                    }
                                    f104 += f41;
                                    f99 = f36;
                                    f100 = f37;
                                } else {
                                    c5 = c7;
                                    c6 = c16;
                                    path2.rLineTo(fArr2[i5], BitmapDescriptorFactory.HUE_RED);
                                    f103 += fArr2[i5];
                                }
                            } else {
                                z3 = z12;
                                c5 = c7;
                                c6 = c16;
                                int i107 = i5 + 2;
                                int i108 = i5 + 3;
                                int i109 = i5 + 4;
                                int i110 = i5 + 5;
                                path2.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i107], fArr2[i108], fArr2[i109], fArr2[i110]);
                                float f125 = fArr2[i107] + f103;
                                float f126 = fArr2[i108] + f104;
                                f103 += fArr2[i109];
                                f104 += fArr2[i110];
                                f99 = f125;
                                f100 = f126;
                            }
                            i3 = i5;
                        } else {
                            z3 = z12;
                            c5 = c7;
                            c6 = c16;
                            int i111 = i5 + 5;
                            float f127 = fArr2[i111] + f103;
                            int i112 = i5 + 6;
                            float f128 = fArr2[i112] + f104;
                            float f129 = fArr2[i5];
                            float f130 = fArr2[i5 + 1];
                            float f131 = fArr2[i5 + 2];
                            if (fArr2[i5 + 3] != BitmapDescriptorFactory.HUE_RED) {
                                f32 = 0.0f;
                                f35 = f104;
                                z6 = z3;
                            } else {
                                f32 = 0.0f;
                                f35 = f104;
                                z6 = z;
                            }
                            i3 = i5;
                            boolean z29 = fArr2[i5 + 4] != f32 ? z3 : z;
                            float f132 = f103;
                            drawArc(path, f132, f35, f127, f128, f129, f130, f131, z6, z29);
                            f103 = f132 + fArr2[i111];
                            f104 = f35 + fArr2[i112];
                            f99 = f103;
                            f100 = f104;
                        }
                        f104 = f6;
                    } else {
                        z = z11;
                        z3 = z12;
                        c5 = c7;
                        c6 = c16;
                        i3 = i5;
                        int i113 = i3 + 1;
                        int i114 = i3 + 2;
                        int i115 = i3 + 3;
                        path2.quadTo(fArr2[i3], fArr2[i113], fArr2[i114], fArr2[i115]);
                        f4 = fArr2[i3];
                        f5 = fArr2[i113];
                        f103 = fArr2[i114];
                        f104 = fArr2[i115];
                    }
                    f99 = f4;
                    f100 = f5;
                } else {
                    z = z11;
                    z3 = z12;
                    c5 = c7;
                    c6 = c16;
                    i3 = i5;
                    path2.lineTo(fArr2[i3], f104);
                    f103 = fArr2[i3];
                }
                i5 = i3 + i2;
                path2 = path;
                c26 = c3;
                z11 = z;
                z12 = z3;
                c7 = c5;
                c16 = c6;
            }
            fArr[z11 ? 1 : 0] = f103;
            fArr[z12 ? 1 : 0] = f104;
            fArr[c7] = f99;
            fArr[c16] = f100;
            fArr[4] = f105;
            fArr[5] = f106;
        }

        private static void arcToBezier(Path path, double d, double d5, double d6, double d10, double d15, double d41, double d51, double d68, double d81) {
            double d82 = d6;
            int iCeil = (int) Math.ceil(Math.abs((d81 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d51);
            double dSin = Math.sin(d51);
            double dCos2 = Math.cos(d68);
            double dSin2 = Math.sin(d68);
            double d95 = -d82;
            double d100 = d95 * dCos;
            double d101 = d10 * dSin;
            double d102 = (d100 * dSin2) - (d101 * dCos2);
            double d103 = d95 * dSin;
            double d104 = d10 * dCos;
            double d105 = (dCos2 * d104) + (dSin2 * d103);
            double d106 = d81 / ((double) iCeil);
            double d107 = d105;
            double d108 = d102;
            int i = 0;
            double d109 = d15;
            double d110 = d41;
            double d111 = d68;
            while (i < iCeil) {
                double d112 = d111 + d106;
                double dSin3 = Math.sin(d112);
                double dCos3 = Math.cos(d112);
                double d113 = (((d82 * dCos) * dCos3) + d) - (d101 * dSin3);
                int i2 = i;
                double d114 = (d104 * dSin3) + (d6 * dSin * dCos3) + d5;
                double d115 = (d100 * dSin3) - (d101 * dCos3);
                double d116 = (dCos3 * d104) + (dSin3 * d103);
                double d117 = d112 - d111;
                double dTan = Math.tan(d117 / 2.0d);
                double dSqrt = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d117)) / 3.0d;
                path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                path.cubicTo((float) ((d108 * dSqrt) + d109), (float) ((d107 * dSqrt) + d110), (float) (d113 - (dSqrt * d115)), (float) (d114 - (dSqrt * d116)), (float) d113, (float) d114);
                dSin = dSin;
                d106 = d106;
                d109 = d113;
                d103 = d103;
                dCos = dCos;
                d107 = d116;
                d108 = d115;
                d82 = d6;
                d110 = d114;
                i = i2 + 1;
                iCeil = iCeil;
                d111 = d112;
            }
        }

        private static void drawArc(Path path, float f, float f4, float f5, float f6, float f32, float f35, float f36, boolean z, boolean z3) {
            double d;
            double d5;
            double radians = Math.toRadians(f36);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d6 = f;
            double d10 = f4;
            double d15 = f32;
            double d41 = ((d10 * dSin) + (d6 * dCos)) / d15;
            double d51 = f35;
            double d68 = ((d10 * dCos) + (((double) (-f)) * dSin)) / d51;
            double d81 = f6;
            double d82 = ((d81 * dSin) + (((double) f5) * dCos)) / d15;
            double d95 = ((d81 * dCos) + (((double) (-f5)) * dSin)) / d51;
            double d100 = d41 - d82;
            double d101 = d68 - d95;
            double d102 = (d41 + d82) / 2.0d;
            double d103 = (d68 + d95) / 2.0d;
            double d104 = (d101 * d101) + (d100 * d100);
            if (d104 == 0.0d) {
                return;
            }
            double d105 = (1.0d / d104) - 0.25d;
            if (d105 < 0.0d) {
                String str = "Points are too far apart " + d104;
                float fSqrt = (float) (Math.sqrt(d104) / 1.99999d);
                drawArc(path, f, f4, f5, f6, f32 * fSqrt, fSqrt * f35, f36, z, z3);
                return;
            }
            double dSqrt = Math.sqrt(d105);
            double d106 = dSqrt * d100;
            double d107 = dSqrt * d101;
            if (z == z3) {
                d = d102 - d107;
                d5 = d103 + d106;
            } else {
                d = d102 + d107;
                d5 = d103 - d106;
            }
            double dAtan2 = Math.atan2(d68 - d5, d41 - d);
            double dAtan22 = Math.atan2(d95 - d5, d82 - d) - dAtan2;
            if (z3 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d108 = d * d15;
            double d109 = d5 * d51;
            arcToBezier(path, (d108 * dCos) - (d109 * dSin), (d109 * dCos) + (d108 * dSin), d15, d51, d6, d10, radians, dAtan2, dAtan22);
        }

        @Deprecated
        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }
    }
}
