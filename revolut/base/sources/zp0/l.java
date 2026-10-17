package zp0;

import android.icu.text.DecimalFormat;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.w0;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f324126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u80.d f324127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324128c;
    public final boolean d;
    public final int e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u80.d f324129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final im.c f324130h;
    public final ArrayList i;

    public l(xi0.b currency, u80.d decimalFormat, boolean z, boolean z3, int i, BigDecimal bigDecimal) {
        im.c cVarL;
        String string;
        List listK;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        this.f324126a = currency;
        this.f324127b = decimalFormat;
        this.f324128c = z;
        this.d = z3;
        this.e = i;
        this.f = bigDecimal;
        u80.d dVar = new u80.d(decimalFormat.f278030b);
        Object objClone = decimalFormat.f278029a.clone();
        Intrinsics.i(objClone, "null cannot be cast to non-null type android.icu.text.DecimalFormat");
        dVar.f278029a = (DecimalFormat) objClone;
        dVar.f(i);
        this.f324129g = dVar;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        String strA = e.a(decimalFormat, z);
        List listB = e.b(decimalFormat);
        int iB = decimalFormat.b();
        if (z && iB == 1) {
            HashMap map = im.c.f162274c;
            cVarL = v13.d.l("[0]" + strA, listB);
        } else {
            HashMap map2 = im.c.f162274c;
            cVarL = v13.d.l(strA, listB);
        }
        this.f324130h = cVarL;
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        Intrinsics.checkNotNullParameter(currency, "currency");
        char monetaryGroupingSeparator = decimalFormat.f278029a.getDecimalFormatSymbols().getMonetaryGroupingSeparator();
        String strA2 = e.a(decimalFormat, z);
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        char cD = decimalFormat.d();
        int iMax = Math.max(i, currency.b());
        if (iMax == 0) {
            m70.a.c(t0.f186434a);
            string = "";
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("[" + cD + "]");
            sb6.append("[");
            sb6.append(kotlin.text.a0.C("9", iMax));
            sb6.append("]");
            string = sb6.toString();
        }
        List listB2 = e.b(decimalFormat);
        boolean z4 = z && decimalFormat.b() == 1;
        if (Intrinsics.f(decimalFormat.f278030b, new Locale("en", "in"))) {
            StringBuilder sbJ = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            sbJ.append("[000]");
            String string2 = sbJ.toString();
            StringBuilder sbJ2 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            sbJ2.append("[000]");
            String string3 = sbJ2.toString();
            String strQ = p.a.q(z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator), "[00]", monetaryGroupingSeparator, "[000]");
            String strQ2 = p.a.q(z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator), "[00]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ3 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ3);
            sbJ3.append("[000]");
            String string4 = sbJ3.toString();
            StringBuilder sbJ4 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ4);
            sbJ4.append("[000]");
            String string5 = sbJ4.toString();
            StringBuilder sbJ5 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ5);
            String strQ3 = p.a.q(sbJ5, "[00]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ6 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ6);
            String strQ4 = p.a.q(sbJ6, "[00]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ7 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ7);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ7);
            sbJ7.append("[000]");
            String string6 = sbJ7.toString();
            StringBuilder sbJ8 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ8);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ8);
            sbJ8.append("[000]");
            String string7 = sbJ8.toString();
            StringBuilder sbJ9 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ9);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ9);
            String strQ5 = p.a.q(sbJ9, "[00]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ10 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ10);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ10);
            String strQ6 = p.a.q(sbJ10, "[00]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ11 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ11);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ11);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ11);
            sbJ11.append("[000]");
            String string8 = sbJ11.toString();
            StringBuilder sbJ12 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ12);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ12);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ12);
            sbJ12.append("[000]");
            String string9 = sbJ12.toString();
            StringBuilder sbJ13 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ13);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ13);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ13);
            String strQ7 = p.a.q(sbJ13, "[00]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ14 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ14);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ14);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ14);
            String strQ8 = p.a.q(sbJ14, "[00]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ15 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ15);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ15);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ15);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ15);
            sbJ15.append("[000]");
            String string10 = sbJ15.toString();
            StringBuilder sbJ16 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ16);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ16);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ16);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ16);
            sbJ16.append("[000]");
            String strI = v0.a.i(z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator), "[000]", string);
            String strI2 = v0.a.i(z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator), "[000]", string);
            StringBuilder sbJ17 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            sbJ17.append("[00]");
            sbJ17.append(monetaryGroupingSeparator);
            sbJ17.append("[000]");
            sbJ17.append(string);
            String string11 = sbJ17.toString();
            StringBuilder sbJ18 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            sbJ18.append("[00]");
            sbJ18.append(monetaryGroupingSeparator);
            sbJ18.append("[000]");
            sbJ18.append(string);
            String string12 = sbJ18.toString();
            StringBuilder sbJ19 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ19);
            String strI3 = v0.a.i(sbJ19, "[000]", string);
            StringBuilder sbJ20 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ20);
            String strI4 = v0.a.i(sbJ20, "[000]", string);
            StringBuilder sbJ21 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ21);
            sbJ21.append("[00]");
            sbJ21.append(monetaryGroupingSeparator);
            sbJ21.append("[000]");
            sbJ21.append(string);
            String string13 = sbJ21.toString();
            StringBuilder sbJ22 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ22);
            sbJ22.append("[00]");
            sbJ22.append(monetaryGroupingSeparator);
            sbJ22.append("[000]");
            sbJ22.append(string);
            String string14 = sbJ22.toString();
            StringBuilder sbJ23 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ23);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ23);
            String strI5 = v0.a.i(sbJ23, "[000]", string);
            StringBuilder sbJ24 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ24);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ24);
            String strI6 = v0.a.i(sbJ24, "[000]", string);
            StringBuilder sbJ25 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ25);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ25);
            sbJ25.append("[00]");
            sbJ25.append(monetaryGroupingSeparator);
            sbJ25.append("[000]");
            sbJ25.append(string);
            String string15 = sbJ25.toString();
            StringBuilder sbJ26 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ26);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ26);
            sbJ26.append("[00]");
            sbJ26.append(monetaryGroupingSeparator);
            sbJ26.append("[000]");
            sbJ26.append(string);
            String string16 = sbJ26.toString();
            StringBuilder sbJ27 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ27);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ27);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ27);
            String strI7 = v0.a.i(sbJ27, "[000]", string);
            StringBuilder sbJ28 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ28);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ28);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ28);
            String strI8 = v0.a.i(sbJ28, "[000]", string);
            StringBuilder sbJ29 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ29);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ29);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ29);
            sbJ29.append("[00]");
            sbJ29.append(monetaryGroupingSeparator);
            sbJ29.append("[000]");
            sbJ29.append(string);
            String string17 = sbJ29.toString();
            StringBuilder sbJ30 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ30);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ30);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ30);
            sbJ30.append("[00]");
            sbJ30.append(monetaryGroupingSeparator);
            sbJ30.append("[000]");
            sbJ30.append(string);
            String string18 = sbJ30.toString();
            StringBuilder sbJ31 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ31);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ31);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ31);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ31);
            String strI9 = v0.a.i(sbJ31, "[000]", string);
            StringBuilder sbJ32 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[00]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ32);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ32);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ32);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[00]", "[00]", sbJ32);
            listK = zhm.v.k(a0.d.r(strA2, "[0]"), a0.d.r(strA2, "[*]"), a0.d.r(strA2, "[*][0]"), a0.d.r(strA2, "[*][00]"), strA2 + "[*]" + monetaryGroupingSeparator + "[000]", strA2 + "[*][0]" + monetaryGroupingSeparator + "[000]", string2, string3, strQ, strQ2, string4, string5, strQ3, strQ4, string6, string7, strQ5, strQ6, string8, string9, strQ7, strQ8, string10, sbJ16.toString(), com.google.android.gms.internal.mlkit_vision_face.a.o(strA2, "[0]", string), com.google.android.gms.internal.mlkit_vision_face.a.o(strA2, "[*]", string), com.google.android.gms.internal.mlkit_vision_face.a.o(strA2, "[*][0]", string), com.google.android.gms.internal.mlkit_vision_face.a.o(strA2, "[*][00]", string), strA2 + "[*]" + monetaryGroupingSeparator + "[000]" + string, strA2 + "[*][0]" + monetaryGroupingSeparator + "[000]" + string, strI, strI2, string11, string12, strI3, strI4, string13, string14, strI5, strI6, string15, string16, strI7, strI8, string17, string18, strI9, v0.a.i(sbJ32, "[000]", string));
        } else if (z4) {
            StringBuilder sbI = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI.append(strA2);
            String string19 = sbI.toString();
            StringBuilder sbI2 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI2.append(strA2);
            String string20 = sbI2.toString();
            StringBuilder sbI3 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI3.append(strA2);
            String string21 = sbI3.toString();
            StringBuilder sbI4 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI4.append(monetaryGroupingSeparator);
            sbI4.append("[000]");
            sbI4.append(strA2);
            String string22 = sbI4.toString();
            StringBuilder sbI5 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI5.append(monetaryGroupingSeparator);
            sbI5.append("[000]");
            sbI5.append(strA2);
            String string23 = sbI5.toString();
            StringBuilder sbI6 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI6.append(monetaryGroupingSeparator);
            sbI6.append("[000]");
            sbI6.append(strA2);
            String string24 = sbI6.toString();
            StringBuilder sbI7 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI7);
            sbI7.append(strA2);
            String string25 = sbI7.toString();
            StringBuilder sbI8 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI8);
            sbI8.append(strA2);
            String string26 = sbI8.toString();
            StringBuilder sbI9 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI9);
            sbI9.append(strA2);
            String string27 = sbI9.toString();
            StringBuilder sbI10 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI10);
            sbI10.append(monetaryGroupingSeparator);
            sbI10.append("[000]");
            sbI10.append(strA2);
            String string28 = sbI10.toString();
            StringBuilder sbI11 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI11);
            sbI11.append(monetaryGroupingSeparator);
            sbI11.append("[000]");
            sbI11.append(strA2);
            String string29 = sbI11.toString();
            StringBuilder sbI12 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI12);
            sbI12.append(monetaryGroupingSeparator);
            sbI12.append("[000]");
            sbI12.append(strA2);
            String string30 = sbI12.toString();
            StringBuilder sbI13 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI13);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI13);
            sbI13.append(strA2);
            String string31 = sbI13.toString();
            StringBuilder sbI14 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI14);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI14);
            sbI14.append(strA2);
            String string32 = sbI14.toString();
            StringBuilder sbI15 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI15);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI15);
            sbI15.append(strA2);
            String string33 = sbI15.toString();
            StringBuilder sbI16 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI16);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI16);
            sbI16.append(monetaryGroupingSeparator);
            sbI16.append("[000]");
            sbI16.append(strA2);
            String string34 = sbI16.toString();
            StringBuilder sbI17 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI17);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI17);
            sbI17.append(monetaryGroupingSeparator);
            sbI17.append("[000]");
            sbI17.append(strA2);
            String string35 = sbI17.toString();
            StringBuilder sbI18 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI18);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI18);
            sbI18.append(monetaryGroupingSeparator);
            sbI18.append("[000]");
            sbI18.append(strA2);
            String string36 = sbI18.toString();
            StringBuilder sbI19 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI19);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI19);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI19);
            sbI19.append(strA2);
            String string37 = sbI19.toString();
            StringBuilder sbI20 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI20);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI20);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI20);
            sbI20.append(strA2);
            String string38 = sbI20.toString();
            StringBuilder sbI21 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI21);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI21);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI21);
            sbI21.append(strA2);
            String strI10 = v0.a.i(z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]"), string, strA2);
            String strI11 = v0.a.i(z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]"), string, strA2);
            String strI12 = v0.a.i(z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]"), string, strA2);
            StringBuilder sbI22 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI22.append(monetaryGroupingSeparator);
            sbI22.append("[000]");
            sbI22.append(string);
            sbI22.append(strA2);
            String string39 = sbI22.toString();
            StringBuilder sbI23 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI23.append(monetaryGroupingSeparator);
            sbI23.append("[000]");
            sbI23.append(string);
            sbI23.append(strA2);
            String string40 = sbI23.toString();
            StringBuilder sbI24 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            sbI24.append(monetaryGroupingSeparator);
            sbI24.append("[000]");
            sbI24.append(string);
            sbI24.append(strA2);
            String string41 = sbI24.toString();
            StringBuilder sbI25 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI25);
            String strI13 = v0.a.i(sbI25, string, strA2);
            StringBuilder sbI26 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI26);
            String strI14 = v0.a.i(sbI26, string, strA2);
            StringBuilder sbI27 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI27);
            String strI15 = v0.a.i(sbI27, string, strA2);
            StringBuilder sbI28 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI28);
            sbI28.append(monetaryGroupingSeparator);
            sbI28.append("[000]");
            sbI28.append(string);
            sbI28.append(strA2);
            String string42 = sbI28.toString();
            StringBuilder sbI29 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI29);
            sbI29.append(monetaryGroupingSeparator);
            sbI29.append("[000]");
            sbI29.append(string);
            sbI29.append(strA2);
            String string43 = sbI29.toString();
            StringBuilder sbI30 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI30);
            sbI30.append(monetaryGroupingSeparator);
            sbI30.append("[000]");
            sbI30.append(string);
            sbI30.append(strA2);
            String string44 = sbI30.toString();
            StringBuilder sbI31 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI31);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI31);
            String strI16 = v0.a.i(sbI31, string, strA2);
            StringBuilder sbI32 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI32);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI32);
            String strI17 = v0.a.i(sbI32, string, strA2);
            StringBuilder sbI33 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI33);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI33);
            String strI18 = v0.a.i(sbI33, string, strA2);
            StringBuilder sbI34 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI34);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI34);
            sbI34.append(monetaryGroupingSeparator);
            sbI34.append("[000]");
            sbI34.append(string);
            sbI34.append(strA2);
            String string45 = sbI34.toString();
            StringBuilder sbI35 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI35);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI35);
            sbI35.append(monetaryGroupingSeparator);
            sbI35.append("[000]");
            sbI35.append(string);
            sbI35.append(strA2);
            String string46 = sbI35.toString();
            StringBuilder sbI36 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI36);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI36);
            sbI36.append(monetaryGroupingSeparator);
            sbI36.append("[000]");
            sbI36.append(string);
            sbI36.append(strA2);
            String string47 = sbI36.toString();
            StringBuilder sbI37 = z9h.n.i("[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI37);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI37);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI37);
            String strI19 = v0.a.i(sbI37, string, strA2);
            StringBuilder sbI38 = z9h.n.i("[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI38);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI38);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI38);
            String strI20 = v0.a.i(sbI38, string, strA2);
            StringBuilder sbI39 = z9h.n.i("[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator, "[000]");
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI39);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI39);
            r6.b.o(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbI39);
            listK = zhm.v.k(j6.a.q("[0]", strA2), j6.a.q("[*]", strA2), j6.a.q("[*][0]", strA2), j6.a.q("[*][00]", strA2), "[*]" + monetaryGroupingSeparator + "[000]" + strA2, "[*][0]" + monetaryGroupingSeparator + "[000]" + strA2, "[*][00]" + monetaryGroupingSeparator + "[000]" + strA2, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, sbI21.toString(), p.a.p("[0]", string, strA2), p.a.p("[*]", string, strA2), p.a.p("[*][0]", string, strA2), p.a.p("[*][00]", string, strA2), "[*]" + monetaryGroupingSeparator + "[000]" + string + strA2, "[*][0]" + monetaryGroupingSeparator + "[000]" + string + strA2, "[*][00]" + monetaryGroupingSeparator + "[000]" + string + strA2, strI10, strI11, strI12, string39, string40, string41, strI13, strI14, strI15, string42, string43, string44, strI16, strI17, strI18, string45, string46, string47, strI19, strI20, v0.a.i(sbI39, string, strA2));
        } else {
            StringBuilder sbJ33 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            sbJ33.append("[000]");
            String string48 = sbJ33.toString();
            StringBuilder sbJ34 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            sbJ34.append("[000]");
            String string49 = sbJ34.toString();
            StringBuilder sbJ35 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            sbJ35.append("[000]");
            String string50 = sbJ35.toString();
            String strQ9 = p.a.q(z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator), "[000]", monetaryGroupingSeparator, "[000]");
            String strQ10 = p.a.q(z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator), "[000]", monetaryGroupingSeparator, "[000]");
            String strQ11 = p.a.q(z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator), "[000]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ36 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ36);
            sbJ36.append("[000]");
            String string51 = sbJ36.toString();
            StringBuilder sbJ37 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ37);
            sbJ37.append("[000]");
            String string52 = sbJ37.toString();
            StringBuilder sbJ38 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ38);
            sbJ38.append("[000]");
            String string53 = sbJ38.toString();
            StringBuilder sbJ39 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ39);
            String strQ12 = p.a.q(sbJ39, "[000]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ40 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ40);
            String strQ13 = p.a.q(sbJ40, "[000]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ41 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ41);
            String strQ14 = p.a.q(sbJ41, "[000]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ42 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ42);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ42);
            sbJ42.append("[000]");
            String string54 = sbJ42.toString();
            StringBuilder sbJ43 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ43);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ43);
            sbJ43.append("[000]");
            String string55 = sbJ43.toString();
            StringBuilder sbJ44 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ44);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ44);
            sbJ44.append("[000]");
            String string56 = sbJ44.toString();
            StringBuilder sbJ45 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ45);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ45);
            String strQ15 = p.a.q(sbJ45, "[000]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ46 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ46);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ46);
            String strQ16 = p.a.q(sbJ46, "[000]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ47 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ47);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ47);
            String strQ17 = p.a.q(sbJ47, "[000]", monetaryGroupingSeparator, "[000]");
            StringBuilder sbJ48 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ48);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ48);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ48);
            sbJ48.append("[000]");
            String string57 = sbJ48.toString();
            StringBuilder sbJ49 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ49);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ49);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ49);
            sbJ49.append("[000]");
            String string58 = sbJ49.toString();
            StringBuilder sbJ50 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ50);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ50);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ50);
            sbJ50.append("[000]");
            String strI21 = v0.a.i(z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator), "[000]", string);
            String strI22 = v0.a.i(z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator), "[000]", string);
            String strI23 = v0.a.i(z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator), "[000]", string);
            StringBuilder sbJ51 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            sbJ51.append("[000]");
            sbJ51.append(monetaryGroupingSeparator);
            sbJ51.append("[000]");
            sbJ51.append(string);
            String string59 = sbJ51.toString();
            StringBuilder sbJ52 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            sbJ52.append("[000]");
            sbJ52.append(monetaryGroupingSeparator);
            sbJ52.append("[000]");
            sbJ52.append(string);
            String string60 = sbJ52.toString();
            StringBuilder sbJ53 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            sbJ53.append("[000]");
            sbJ53.append(monetaryGroupingSeparator);
            sbJ53.append("[000]");
            sbJ53.append(string);
            String string61 = sbJ53.toString();
            StringBuilder sbJ54 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ54);
            String strI24 = v0.a.i(sbJ54, "[000]", string);
            StringBuilder sbJ55 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ55);
            String strI25 = v0.a.i(sbJ55, "[000]", string);
            StringBuilder sbJ56 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ56);
            String strI26 = v0.a.i(sbJ56, "[000]", string);
            StringBuilder sbJ57 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ57);
            sbJ57.append("[000]");
            sbJ57.append(monetaryGroupingSeparator);
            sbJ57.append("[000]");
            sbJ57.append(string);
            String string62 = sbJ57.toString();
            StringBuilder sbJ58 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ58);
            sbJ58.append("[000]");
            sbJ58.append(monetaryGroupingSeparator);
            sbJ58.append("[000]");
            sbJ58.append(string);
            String string63 = sbJ58.toString();
            StringBuilder sbJ59 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ59);
            sbJ59.append("[000]");
            sbJ59.append(monetaryGroupingSeparator);
            sbJ59.append("[000]");
            sbJ59.append(string);
            String string64 = sbJ59.toString();
            StringBuilder sbJ60 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ60);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ60);
            String strI27 = v0.a.i(sbJ60, "[000]", string);
            StringBuilder sbJ61 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ61);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ61);
            String strI28 = v0.a.i(sbJ61, "[000]", string);
            StringBuilder sbJ62 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ62);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ62);
            String strI29 = v0.a.i(sbJ62, "[000]", string);
            StringBuilder sbJ63 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ63);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ63);
            sbJ63.append("[000]");
            sbJ63.append(monetaryGroupingSeparator);
            sbJ63.append("[000]");
            sbJ63.append(string);
            String string65 = sbJ63.toString();
            StringBuilder sbJ64 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ64);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ64);
            sbJ64.append("[000]");
            sbJ64.append(monetaryGroupingSeparator);
            sbJ64.append("[000]");
            sbJ64.append(string);
            String string66 = sbJ64.toString();
            StringBuilder sbJ65 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ65);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ65);
            sbJ65.append("[000]");
            sbJ65.append(monetaryGroupingSeparator);
            sbJ65.append("[000]");
            sbJ65.append(string);
            String string67 = sbJ65.toString();
            StringBuilder sbJ66 = z9h.n.j(strA2, "[*]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ66);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ66);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ66);
            String strI30 = v0.a.i(sbJ66, "[000]", string);
            StringBuilder sbJ67 = z9h.n.j(strA2, "[*][0]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ67);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ67);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ67);
            String strI31 = v0.a.i(sbJ67, "[000]", string);
            StringBuilder sbJ68 = z9h.n.j(strA2, "[*][00]", monetaryGroupingSeparator, "[000]", monetaryGroupingSeparator);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ68);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ68);
            v0.a.t(monetaryGroupingSeparator, monetaryGroupingSeparator, "[000]", "[000]", sbJ68);
            listK = zhm.v.k(a0.d.r(strA2, "[0]"), a0.d.r(strA2, "[*]"), a0.d.r(strA2, "[*][0]"), a0.d.r(strA2, "[*][00]"), strA2 + "[*]" + monetaryGroupingSeparator + "[000]", strA2 + "[*][0]" + monetaryGroupingSeparator + "[000]", strA2 + "[*][00]" + monetaryGroupingSeparator + "[000]", string48, string49, string50, strQ9, strQ10, strQ11, string51, string52, string53, strQ12, strQ13, strQ14, string54, string55, string56, strQ15, strQ16, strQ17, string57, string58, sbJ50.toString(), com.google.android.gms.internal.mlkit_vision_face.a.o(strA2, "[0]", string), com.google.android.gms.internal.mlkit_vision_face.a.o(strA2, "[*]", string), com.google.android.gms.internal.mlkit_vision_face.a.o(strA2, "[*][0]", string), com.google.android.gms.internal.mlkit_vision_face.a.o(strA2, "[*][00]", string), strA2 + "[*]" + monetaryGroupingSeparator + "[000]" + string, strA2 + "[*][0]" + monetaryGroupingSeparator + "[000]" + string, strA2 + "[*][00]" + monetaryGroupingSeparator + "[000]" + string, strI21, strI22, strI23, string59, string60, string61, strI24, strI25, strI26, string62, string63, string64, strI27, strI28, strI29, string65, string66, string67, strI30, strI31, v0.a.i(sbJ68, "[000]", string));
        }
        List<String> list = listK;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (String str : list) {
            HashMap map3 = im.c.f162274c;
            arrayList.add(v13.d.l(str, listB2));
        }
        this.i = arrayList;
    }

    public static List e(String str) {
        String strSubstring;
        bw0.j.Companion.getClass();
        bw0.j[] jVarArr = bw0.j.cachedValues;
        ArrayList arrayList = new ArrayList(jVarArr.length);
        for (bw0.j jVar : jVarArr) {
            arrayList.add(String.valueOf(jVar.b()));
        }
        int iV = d0.V(str, arrayList);
        if (iV < 0) {
            return zhm.v.k(new g(0, str), null);
        }
        String strSubstring2 = str.substring(0, iV);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        g gVar = new g(0, strSubstring2);
        int i = iV + 1;
        if (iV == str.length() - 1) {
            strSubstring = "";
        } else {
            strSubstring = str.substring(i, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        return zhm.v.k(gVar, new g(i, strSubstring));
    }

    public final Pair a(int i, String str) {
        im.c cVar;
        im.b bVarB;
        ArrayList arrayList = this.i;
        boolean zIsEmpty = arrayList.isEmpty();
        im.c cVar2 = this.f324130h;
        if (zIsEmpty) {
            return new Pair(cVar2, b(cVar2, str, i));
        }
        Iterator it8 = zhm.b0.L(arrayList).iterator();
        do {
            ListIterator listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                return new Pair(cVar2, b(cVar2, str, i));
            }
            cVar = (im.c) listIterator.previous();
            bVarB = b(cVar, str, i);
        } while (!bVarB.f162273c);
        return new Pair(cVar, bVarB);
    }

    public final im.b b(im.c cVar, String str, int i) {
        e eVar = Companion;
        u80.d dVar = this.f324127b;
        int iB = dVar.b();
        eVar.getClass();
        if (!this.f324128c || iB != 1 || d0.J(str, dVar.c(), false)) {
            return cVar.b(new jm.a(str, i), false);
        }
        String positiveSuffix = dVar.f278029a.getPositiveSuffix();
        Intrinsics.checkNotNullExpressionValue(positiveSuffix, "getPositiveSuffix(...)");
        return cVar.b(new jm.a(str + positiveSuffix, i), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a5, code lost:
    
        if (r17.equals("0" + zp0.e.a(r14, r0)) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bf, code lost:
    
        if (r17.equals(zp0.e.a(r14, r0) + "0") == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c6, code lost:
    
        return new zp0.j(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01da, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r17, zp0.e.a(r14, r0)) != false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zp0.i c(java.lang.String r17, int r18, boolean r19, java.lang.String r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zp0.l.c(java.lang.String, int, boolean, java.lang.String, int, int):zp0.i");
    }

    public final im.b d(String str, boolean z) {
        if (z && cp5.d.A(this.f324126a) && d0.K(str, this.f324127b.d())) {
            str = d0.a0(str, str.length() + this.e, '0');
        }
        return (im.b) a(0, str).f186386b;
    }
}
