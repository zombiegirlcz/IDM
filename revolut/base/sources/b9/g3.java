package b9;

import android.graphics.Matrix;
import android.util.Xml;
import ch.qos.logback.core.CoreConstants;
import com.caverock.androidsvg.SVGParseException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes16.dex */
public final class g3 {
    public int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m2 f13350a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q1 f13351b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13352c = false;
    public boolean e = false;
    public e3 f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StringBuilder f13353g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13354h = false;
    public StringBuilder i = null;

    public static Matrix A(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        v0 v0Var = new v0(str);
        v0Var.w();
        while (!v0Var.j()) {
            String str2 = (String) v0Var.f13490c;
            String strSubstring = null;
            if (!v0Var.j()) {
                int i = v0Var.f13488a;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = v0Var.d();
                    }
                }
                int i2 = v0Var.f13488a;
                while (v0.l(iCharAt)) {
                    iCharAt = v0Var.d();
                }
                if (iCharAt == 40) {
                    v0Var.f13488a++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    v0Var.f13488a = i;
                }
            }
            if (strSubstring == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    v0Var.w();
                    float fO = v0Var.o();
                    v0Var.v();
                    float fO2 = v0Var.o();
                    v0Var.v();
                    float fO3 = v0Var.o();
                    v0Var.v();
                    float fO4 = v0Var.o();
                    v0Var.v();
                    float fO5 = v0Var.o();
                    v0Var.v();
                    float fO6 = v0Var.o();
                    v0Var.w();
                    if (Float.isNaN(fO6) || !v0Var.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fO, fO3, fO5, fO2, fO4, fO6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    v0Var.w();
                    float fO7 = v0Var.o();
                    float fU = v0Var.u();
                    float fU2 = v0Var.u();
                    v0Var.w();
                    if (Float.isNaN(fO7) || !v0Var.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fU)) {
                        matrix.preRotate(fO7);
                    } else {
                        if (Float.isNaN(fU2)) {
                            throw new SVGParseException("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fO7, fU, fU2);
                    }
                    break;
                    break;
                case "scale":
                    v0Var.w();
                    float fO8 = v0Var.o();
                    float fU3 = v0Var.u();
                    v0Var.w();
                    if (Float.isNaN(fO8) || !v0Var.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fU3)) {
                        matrix.preScale(fO8, fU3);
                    } else {
                        matrix.preScale(fO8, fO8);
                    }
                    break;
                    break;
                case "skewX":
                    v0Var.w();
                    float fO9 = v0Var.o();
                    v0Var.w();
                    if (Float.isNaN(fO9) || !v0Var.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fO9)), BitmapDescriptorFactory.HUE_RED);
                    break;
                    break;
                case "skewY":
                    v0Var.w();
                    float fO10 = v0Var.o();
                    v0Var.w();
                    if (Float.isNaN(fO10) || !v0Var.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan(Math.toRadians(fO10)));
                    break;
                    break;
                case "translate":
                    v0Var.w();
                    float fO11 = v0Var.o();
                    float fU4 = v0Var.u();
                    v0Var.w();
                    if (Float.isNaN(fO11) || !v0Var.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fU4)) {
                        matrix.preTranslate(fO11, fU4);
                    } else {
                        matrix.preTranslate(fO11, BitmapDescriptorFactory.HUE_RED);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException(p.a.p("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (v0Var.j()) {
                return matrix;
            }
            v0Var.v();
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x046a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(b9.m1 r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.g3.E(b9.m1, java.lang.String, java.lang.String):void");
    }

    public static int b(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f4, float f5) {
        float f6 = BitmapDescriptorFactory.HUE_RED;
        float f32 = f % 360.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f32 += 360.0f;
        }
        float f35 = f32 / 60.0f;
        float f36 = f4 / 100.0f;
        float f37 = f5 / 100.0f;
        if (f36 < BitmapDescriptorFactory.HUE_RED) {
            f36 = 0.0f;
        } else if (f36 > 1.0f) {
            f36 = 1.0f;
        }
        if (f37 >= BitmapDescriptorFactory.HUE_RED) {
            f6 = f37 > 1.0f ? 1.0f : f37;
        }
        float f41 = f6 <= 0.5f ? (f36 + 1.0f) * f6 : (f6 + f36) - (f36 * f6);
        float f42 = (f6 * 2.0f) - f41;
        return b(e(f42, f41, f35 - 2.0f) * 256.0f) | (b(e(f42, f41, f35 + 2.0f) * 256.0f) << 16) | (b(e(f42, f41, f35) * 256.0f) << 8);
    }

    public static float e(float f, float f4, float f5) {
        if (f5 < BitmapDescriptorFactory.HUE_RED) {
            f5 += 6.0f;
        }
        if (f5 >= 6.0f) {
            f5 -= 6.0f;
        }
        return f5 < 1.0f ? j6.a.a(f4, f, f5, f) : f5 < 3.0f ? f4 : f5 < 4.0f ? j6.a.a(4.0f, f5, f4 - f, f) : f;
    }

    public static void g(o1 o1Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (x2.f13513b[a10.b.e(attributes, i)]) {
                case 21:
                    v0 v0Var = new v0(strTrim);
                    HashSet hashSet = new HashSet();
                    while (!v0Var.j()) {
                        String strR = v0Var.r();
                        if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(strR.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        v0Var.w();
                    }
                    o1Var.g(hashSet);
                    break;
                case 22:
                    o1Var.j(strTrim);
                    break;
                case 23:
                    v0 v0Var2 = new v0(strTrim);
                    HashSet hashSet2 = new HashSet();
                    while (!v0Var2.j()) {
                        String strR2 = v0Var2.r();
                        int iIndexOf = strR2.indexOf(45);
                        if (iIndexOf != -1) {
                            strR2 = strR2.substring(0, iIndexOf);
                        }
                        hashSet2.add(new Locale(strR2, "", "").getLanguage());
                        v0Var2.w();
                    }
                    o1Var.h(hashSet2);
                    break;
                case 24:
                    v0 v0Var3 = new v0(strTrim);
                    HashSet hashSet3 = new HashSet();
                    while (!v0Var3.j()) {
                        hashSet3.add(v0Var3.r());
                        v0Var3.w();
                    }
                    o1Var.d(hashSet3);
                    break;
                case 25:
                    ArrayList arrayListR = r(strTrim);
                    o1Var.i(arrayListR != null ? new HashSet(arrayListR) : new HashSet(0));
                    break;
            }
        }
    }

    public static void h(s1 s1Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                s1Var.f13463c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    s1Var.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SVGParseException(j6.a.q("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    s1Var.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(b9.i0 r4, org.xml.sax.Attributes r5) throws com.caverock.androidsvg.SVGParseException {
        /*
            r0 = 0
        L1:
            int r1 = r5.getLength()
            if (r0 >= r1) goto L79
            java.lang.String r1 = r5.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = b9.x2.f13513b
            int r3 = a10.b.e(r5, r0)
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L5c
            switch(r2) {
                case 32: goto L3a;
                case 33: goto L33;
                case 34: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L76
        L1e:
            b9.j0 r2 = b9.j0.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L25
            r4.k = r2     // Catch: java.lang.IllegalArgumentException -> L25
            goto L76
        L25:
            com.caverock.androidsvg.SVGParseException r4 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r5 = "Invalid spreadMethod attribute. \""
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r5 = p.a.p(r5, r1, r0)
            r4.<init>(r5)
            throw r4
        L33:
            android.graphics.Matrix r1 = A(r1)
            r4.f13364j = r1
            goto L76
        L3a:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L47
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.i = r1
            goto L76
        L47:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L54
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.i = r1
            goto L76
        L54:
            com.caverock.androidsvg.SVGParseException r4 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r5 = "Invalid value for attribute gradientUnits"
            r4.<init>(r5)
            throw r4
        L5c:
            java.lang.String r2 = ""
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L74
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L76
        L74:
            r4.f13365l = r1
        L76:
            int r0 = r0 + 1
            goto L1
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.g3.i(b9.i0, org.xml.sax.Attributes):void");
    }

    public static void j(y0 y0Var, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (d3.a(attributes.getLocalName(i)) == d3.points) {
                v0 v0Var = new v0(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                v0Var.w();
                while (!v0Var.j()) {
                    float fO = v0Var.o();
                    if (Float.isNaN(fO)) {
                        throw new SVGParseException(p.a.p("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    v0Var.v();
                    float fO2 = v0Var.o();
                    if (Float.isNaN(fO2)) {
                        throw new SVGParseException(p.a.p("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    v0Var.v();
                    arrayList.add(Float.valueOf(fO));
                    arrayList.add(Float.valueOf(fO2));
                }
                y0Var.o = new float[arrayList.size()];
                Iterator it8 = arrayList.iterator();
                int i2 = 0;
                while (it8.hasNext()) {
                    y0Var.o[i2] = ((Float) it8.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void k(s1 s1Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int i2 = x2.f13513b[a10.b.e(attributes, i)];
                if (i2 == 45) {
                    v0 v0Var = new v0(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strS = v0Var.s(CoreConstants.COLON_CHAR, false);
                        v0Var.w();
                        if (!v0Var.g(CoreConstants.COLON_CHAR)) {
                            break;
                        }
                        v0Var.w();
                        String strS2 = v0Var.s(';', true);
                        if (strS2 == null) {
                            break;
                        }
                        v0Var.w();
                        if (v0Var.j() || v0Var.g(';')) {
                            if (s1Var.f == null) {
                                s1Var.f = new m1();
                            }
                            E(s1Var.f, strS, strS2);
                            v0Var.w();
                        }
                    }
                } else if (i2 != 46) {
                    if (s1Var.e == null) {
                        s1Var.e = new m1();
                    }
                    E(s1Var.e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    f fVar = new f(strTrim);
                    ArrayList arrayList = null;
                    while (!fVar.j()) {
                        String strR = fVar.r();
                        if (strR != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strR);
                            fVar.w();
                        }
                    }
                    s1Var.f13464g = arrayList;
                }
            }
        }
    }

    public static void l(h2 h2Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = x2.f13513b[a10.b.e(attributes, i)];
            if (i2 == 1) {
                h2Var.f13360n = u(strTrim);
            } else if (i2 == 2) {
                h2Var.o = u(strTrim);
            } else if (i2 == 19) {
                h2Var.f13361p = u(strTrim);
            } else if (i2 == 20) {
                h2Var.f13362q = u(strTrim);
            }
        }
    }

    public static void m(m0 m0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (d3.a(attributes.getLocalName(i)) == d3.transform) {
                m0Var.k(A(attributes.getValue(i)));
            }
        }
    }

    public static void n(y1 y1Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = x2.f13513b[a10.b.e(attributes, i)];
            if (i2 == 7) {
                y(y1Var, strTrim);
            } else if (i2 != 87) {
                continue;
            } else {
                v0 v0Var = new v0(strTrim);
                v0Var.w();
                float fO = v0Var.o();
                v0Var.v();
                float fO2 = v0Var.o();
                v0Var.v();
                float fO3 = v0Var.o();
                v0Var.v();
                float fO4 = v0Var.o();
                if (Float.isNaN(fO) || Float.isNaN(fO2) || Float.isNaN(fO3) || Float.isNaN(fO4)) {
                    throw new SVGParseException("Invalid viewBox definition - should have four numbers");
                }
                if (fO3 < BitmapDescriptorFactory.HUE_RED) {
                    throw new SVGParseException("Invalid viewBox. width cannot be negative");
                }
                if (fO4 < BitmapDescriptorFactory.HUE_RED) {
                    throw new SVGParseException("Invalid viewBox. height cannot be negative");
                }
                y1Var.o = new b0(fO, fO2, fO3, fO4);
            }
        }
    }

    public static e0 o(String str) throws SVGParseException {
        long j2;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            v vVar = null;
            if (1 < length) {
                long j3 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j2 = j3 * 16;
                            i = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j2 = j3 * 16;
                            i = cCharAt - 'a';
                        }
                        j3 = j2 + ((long) i) + 10;
                    } else {
                        j3 = (j3 * 16) + ((long) (cCharAt - '0'));
                    }
                    if (j3 > BodyPartID.bodyIdMax) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    vVar = new v(j3, i2);
                }
            }
            if (vVar == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j5 = vVar.f13487b;
            int i3 = vVar.f13486a;
            if (i3 == 4) {
                int i5 = (int) j5;
                int i6 = i5 & 3840;
                int i21 = i5 & 240;
                int i22 = i5 & 15;
                return new e0(i22 | (i6 << 8) | (-16777216) | (i6 << 12) | (i21 << 8) | (i21 << 4) | (i22 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new e0(((int) j5) | (-16777216));
                }
                if (i3 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i32 = (int) j5;
                return new e0((i32 >>> 8) | (i32 << 24));
            }
            int i33 = (int) j5;
            int i43 = 61440 & i33;
            int i59 = i33 & 3840;
            int i66 = i33 & 240;
            int i74 = i33 & 15;
            return new e0((i74 << 24) | (i74 << 28) | (i43 << 8) | (i43 << 4) | (i59 << 4) | i59 | i66 | (i66 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            v0 v0Var = new v0(str.substring(zStartsWith ? 5 : 4));
            v0Var.w();
            float fO = v0Var.o();
            if (!Float.isNaN(fO) && v0Var.g(CoreConstants.PERCENT_CHAR)) {
                fO = (fO * 256.0f) / 100.0f;
            }
            float f = v0Var.f(fO);
            if (!Float.isNaN(f) && v0Var.g(CoreConstants.PERCENT_CHAR)) {
                f = (f * 256.0f) / 100.0f;
            }
            float f4 = v0Var.f(f);
            if (!Float.isNaN(f4) && v0Var.g(CoreConstants.PERCENT_CHAR)) {
                f4 = (f4 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                v0Var.w();
                if (Float.isNaN(f4) || !v0Var.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new e0((b(fO) << 16) | (-16777216) | (b(f) << 8) | b(f4));
            }
            float f5 = v0Var.f(f4);
            v0Var.w();
            if (Float.isNaN(f5) || !v0Var.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new e0((b(f5 * 256.0f) << 24) | (b(fO) << 16) | (b(f) << 8) | b(f4));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) z2.f13518a.get(lowerCase);
            if (num != null) {
                return new e0(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        v0 v0Var2 = new v0(str.substring(zStartsWith2 ? 5 : 4));
        v0Var2.w();
        float fO2 = v0Var2.o();
        float f6 = v0Var2.f(fO2);
        if (!Float.isNaN(f6)) {
            v0Var2.g(CoreConstants.PERCENT_CHAR);
        }
        float f32 = v0Var2.f(f6);
        if (!Float.isNaN(f32)) {
            v0Var2.g(CoreConstants.PERCENT_CHAR);
        }
        if (!zStartsWith2) {
            v0Var2.w();
            if (Float.isNaN(f32) || !v0Var2.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new e0(d(fO2, f6, f32) | (-16777216));
        }
        float f35 = v0Var2.f(f32);
        v0Var2.w();
        if (Float.isNaN(f35) || !v0Var2.g(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new e0((b(f35 * 256.0f) << 24) | d(fO2, f6, f32));
    }

    public static float p(int i, String str) throws SVGParseException {
        float fA = new w().a(0, i, str);
        if (Float.isNaN(fA)) {
            throw new SVGParseException(j6.a.q("Invalid float value: ", str));
        }
        return fA;
    }

    public static float q(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return p(length, str);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    public static ArrayList r(String str) {
        v0 v0Var = new v0(str);
        ArrayList arrayList = null;
        do {
            String strQ = v0Var.q();
            if (strQ == null) {
                strQ = v0Var.s(CoreConstants.COMMA_CHAR, true);
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            v0Var.v();
        } while (!v0Var.j());
        return arrayList;
    }

    public static String s(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static o0 t(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        j2 j2VarValueOf = j2.f13378px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            j2VarValueOf = j2.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                j2VarValueOf = j2.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new o0(p(length, str), j2VarValueOf);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList u(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        v0 v0Var = new v0(str);
        v0Var.w();
        while (!v0Var.j()) {
            float fO = v0Var.o();
            if (Float.isNaN(fO)) {
                StringBuilder sb6 = new StringBuilder("Invalid length list value: ");
                String str2 = (String) v0Var.f13490c;
                int i = v0Var.f13488a;
                while (!v0Var.j() && !v0.l(str2.charAt(v0Var.f13488a))) {
                    v0Var.f13488a++;
                }
                String strSubstring = str2.substring(i, v0Var.f13488a);
                v0Var.f13488a = i;
                sb6.append(strSubstring);
                throw new SVGParseException(sb6.toString());
            }
            j2 j2VarT = v0Var.t();
            if (j2VarT == null) {
                j2VarT = j2.f13378px;
            }
            arrayList.add(new o0(fO, j2VarT));
            v0Var.v();
        }
        return arrayList;
    }

    public static o0 v(v0 v0Var) {
        return v0Var.h("auto") ? new o0(BitmapDescriptorFactory.HUE_RED) : v0Var.p();
    }

    public static Float w(String str) {
        try {
            float fQ = q(str);
            float f = BitmapDescriptorFactory.HUE_RED;
            if (fQ < BitmapDescriptorFactory.HUE_RED) {
                fQ = f;
            } else {
                f = 1.0f;
                if (fQ > 1.0f) {
                    fQ = f;
                }
            }
            return Float.valueOf(fQ);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static v1 x(String str) {
        boolean zStartsWith = str.startsWith("url(");
        v1 v1VarO = e0.f13340c;
        f0 f0Var = f0.f13346a;
        v1 v1Var = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return v1VarO;
            }
            if (str.equals("currentColor")) {
                return f0Var;
            }
            try {
                return o(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new t0(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    v1VarO = f0Var;
                } else {
                    try {
                        v1VarO = o(strTrim2);
                    } catch (SVGParseException unused2) {
                        v1VarO = null;
                    }
                }
            }
            v1Var = v1VarO;
        }
        return new t0(strTrim, v1Var);
    }

    public static void y(w1 w1Var, String str) throws SVGParseException {
        y yVar;
        v0 v0Var = new v0(str);
        v0Var.w();
        String strR = v0Var.r();
        if ("defer".equals(strR)) {
            v0Var.w();
            strR = v0Var.r();
        }
        x xVar = (x) y2.f13514a.get(strR);
        v0Var.w();
        if (v0Var.j()) {
            yVar = null;
        } else {
            String strR2 = v0Var.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                yVar = y.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                yVar = y.slice;
            }
        }
        w1Var.f13496n = new z(xVar, yVar);
    }

    public static HashMap z(v0 v0Var) {
        HashMap map = new HashMap();
        v0Var.w();
        String strS = v0Var.s('=', false);
        while (strS != null) {
            v0Var.g('=');
            map.put(strS, v0Var.q());
            v0Var.w();
            strS = v0Var.s('=', false);
        }
        return map;
    }

    public final void B(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            c3 c3Var = new c3(this);
            xMLReader.setContentHandler(c3Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c3Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e4) {
            throw new SVGParseException("SVG parse error", e4);
        }
    }

    public final void C(InputStream inputStream) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                f3 f3Var = new f3();
                f3Var.f13347a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        F();
                    } else if (eventType == 8) {
                        String str = "PROC INSTR: " + xmlPullParserNewPullParser.getText();
                        v0 v0Var = new v0(xmlPullParserNewPullParser.getText());
                        String strR = v0Var.r();
                        z(v0Var);
                        strR.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f13350a.f13407a == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                B(inputStream);
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name;
                        }
                        G(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, f3Var);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        I(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        H(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e) {
                throw new SVGParseException("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0335, code lost:
    
        r0 = "Bad path coords for " + ((char) r5) + " path segment";
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(org.xml.sax.Attributes r25) throws com.caverock.androidsvg.SVGParseException {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.g3.D(org.xml.sax.Attributes):void");
    }

    public final void F() {
        m2 m2Var = new m2();
        m2Var.f13407a = null;
        m2Var.f13408b = new q(0);
        m2Var.f13409c = new HashMap();
        this.f13350a = m2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:659:0x033c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0539, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(java.lang.String r17, java.lang.String r18, java.lang.String r19, org.xml.sax.Attributes r20) {
        /*
            Method dump skipped, instruction units count: 3088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.g3.G(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void H(String str) {
        if (this.f13352c) {
            return;
        }
        if (this.e) {
            if (this.f13353g == null) {
                this.f13353g = new StringBuilder(str.length());
            }
            this.f13353g.append(str);
        } else if (this.f13354h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.f13351b instanceof f2) {
            a(str);
        }
    }

    public final void I(char[] cArr, int i, int i2) {
        if (this.f13352c) {
            return;
        }
        if (this.e) {
            if (this.f13353g == null) {
                this.f13353g = new StringBuilder(i2);
            }
            this.f13353g.append(cArr, i, i2);
        } else if (this.f13354h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.f13351b instanceof f2) {
            a(new String(cArr, i, i2));
        }
    }

    public final void a(String str) {
        p1 p1Var = (p1) this.f13351b;
        int size = p1Var.i.size();
        u1 u1Var = size == 0 ? null : (u1) p1Var.i.get(size - 1);
        if (u1Var instanceof i2) {
            i2 i2Var = (i2) u1Var;
            i2Var.f13366c = v0.a.i(new StringBuilder(), i2Var.f13366c, str);
        } else {
            q1 q1Var = this.f13351b;
            i2 i2Var2 = new i2();
            i2Var2.f13366c = str;
            q1Var.c(i2Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.f13352c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.f13352c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = x2.f13512a[e3.a(str2).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 13 && i2 != 14) {
                switch (i2) {
                    case 22:
                    case 23:
                        this.e = false;
                        if (this.f13353g != null) {
                            e3 e3Var = this.f;
                            if (e3Var == e3.title || e3Var == e3.desc) {
                                this.f13350a.getClass();
                            }
                            this.f13353g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb6 = this.i;
                        if (sb6 != null) {
                            this.f13354h = false;
                            String string = sb6.toString();
                            h hVar = h.screen;
                            t tVar = t.Document;
                            u uVar = new u();
                            uVar.f13476a = false;
                            uVar.f13477b = hVar;
                            uVar.f13478c = tVar;
                            m2 m2Var = this.f13350a;
                            f fVar = new f(string);
                            fVar.w();
                            m2Var.f13408b.b(uVar.l(fVar));
                            this.i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f13351b = ((u1) this.f13351b).f13480b;
        }
    }

    public final m2 f(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            C(inputStream);
            return this.f13350a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
    }
}
