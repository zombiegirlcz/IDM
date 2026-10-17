package jl7;

import com.revolut.feature.insurance_car.impl.data.model.DocumentRequirementsPoint;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import com.revolut.feature.insurance_car.impl.data.model.RequestedDocumentRequirements;
import hl7.e9;
import hl7.h9;
import hl7.k9;
import hl7.m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl7.b2;
import kl7.c2;
import kl7.y1;
import kl7.z1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f175632a = r0.k(new Pair("DRIVING_LICENCE", z1.DRIVING_LICENCE), new Pair("PROOF_OF_DRIVING_EXPERIENCE", z1.PROOF_OF_DRIVING_EXPERIENCE), new Pair("NO_CLAIMS_STATEMENT", z1.NO_CLAIMS_STATEMENT), new Pair("OTHER", z1.OTHER));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f175633b = r0.k(new Pair("PENDING", y1.PENDING), new Pair("UPLOADED", y1.UPLOADED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f175634c = r0.k(new Pair("PENDING", b2.PENDING), new Pair("IN_REVIEW", b2.IN_REVIEW), new Pair("VALIDATED", b2.VALIDATED), new Pair("REJECTED", b2.REJECTED));

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    public static final c2 a(k9 k9Var) {
        b2 b2Var;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(k9Var, "<this>");
        Integer num = k9Var.f153175a;
        int iIntValue = num != null ? num.intValue() : 0;
        List list = k9Var.f153176b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            e9 e9Var = (e9) it8.next();
            Intrinsics.checkNotNullParameter(e9Var, str);
            String str2 = e9Var.f153082a;
            z1 z1Var = (z1) u1.t(e9Var.f153083b, z1.OTHER, f175632a);
            String str3 = e9Var.f153084c;
            String str4 = e9Var.d;
            String str5 = e9Var.e;
            String str6 = e9Var.f;
            String str7 = e9Var.f153085g;
            y1 y1Var = (y1) u1.u(e9Var.f153086h, f175633b);
            String str8 = e9Var.i;
            h9 h9Var = e9Var.f153087j;
            Intrinsics.checkNotNullParameter(h9Var, str);
            String str9 = h9Var.f153132a;
            List list2 = h9Var.f153133b;
            Iterator it9 = it8;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                m2 m2Var = (m2) it10.next();
                Intrinsics.checkNotNullParameter(m2Var, str);
                arrayList2.add(new DocumentRequirementsPoint(m2Var.f153210a, m2Var.f153211b, mr7.b.a(m2Var.f153212c)));
                str = str;
            }
            arrayList.add(new RequestedDocument(str2, z1Var, str3, str4, str5, str6, str7, y1Var, str8, new RequestedDocumentRequirements(str9, arrayList2)));
            it8 = it9;
            str = str;
        }
        String str10 = k9Var.f153177c;
        b2[] b2VarArrValues = b2.values();
        int length = b2VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                b2Var = null;
                break;
            }
            b2Var = b2VarArrValues[i];
            if (a0.z(b2Var.name(), str10, true)) {
                break;
            }
            i++;
        }
        if (b2Var == null) {
            b2Var = b2.PENDING;
        }
        return new c2(iIntValue, arrayList, b2Var);
    }
}
