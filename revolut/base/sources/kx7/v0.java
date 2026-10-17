package kx7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zw7.g1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v0 extends kotlin.jvm.internal.q implements Function1 {
    public static final v0 f = new v0();

    public v0() {
        super(1, hx7.l.class, "toDomain", "toDomain(Lcom/revolut/feature/insurance_pet/impl/network/model/PlanQuotesDto;)Lcom/revolut/feature/insurance_pet/api/model/PlanQuotes;", 1);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterator it8;
        String str;
        zw7.h0 h0Var;
        Iterator it9;
        String str2;
        zw7.j0 j0Var;
        ix7.r p0 = (ix7.r) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        String str3 = "<this>";
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List plans = p0.getPlans();
        Intrinsics.checkNotNullParameter(plans, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it10 = plans.iterator();
        while (it10.hasNext()) {
            ix7.q qVar = (ix7.q) it10.next();
            Intrinsics.checkNotNullParameter(qVar, str3);
            zw7.g0 g0Var = (zw7.g0) u1.v(qVar.getName(), hx7.n.f156405a);
            if (g0Var != null) {
                String id10 = qVar.getId();
                String displayName = qVar.getDisplayName();
                String coverageAmount = qVar.getCoverageAmount();
                ArrayList arrayListZ = i26.l.z(qVar.getQuotes());
                List coverages = qVar.getCoverages();
                Object obj3 = hx7.k.f156404a;
                Intrinsics.checkNotNullParameter(coverages, str3);
                List<ix7.p> list = coverages;
                ArrayList arrayList2 = new ArrayList();
                for (ix7.p pVar : list) {
                    Intrinsics.checkNotNullParameter(pVar, str3);
                    zw7.i0 i0Var = (zw7.i0) u1.v(pVar.getState(), hx7.k.f156404a);
                    if (i0Var != null) {
                        it9 = it10;
                        String icon = pVar.getIcon();
                        str2 = str3;
                        j0Var = new zw7.j0(icon != null ? (zw7.i) u1.v(icon, hx7.f.f156397a) : null, pVar.getName(), i0Var);
                    } else {
                        it9 = it10;
                        str2 = str3;
                        j0Var = null;
                    }
                    if (j0Var != null) {
                        arrayList2.add(j0Var);
                    }
                    it10 = it9;
                    str3 = str2;
                }
                it8 = it10;
                str = str3;
                ArrayList arrayListA = hx7.d.a(qVar.getDocuments());
                ix7.b0 promotionalBanner = qVar.getPromotionalBanner();
                h0Var = new zw7.h0(id10, g0Var, displayName, coverageAmount, arrayListZ, arrayList2, arrayListA, promotionalBanner != null ? new g1(promotionalBanner.getTitle(), promotionalBanner.getContent()) : null);
            } else {
                it8 = it10;
                str = str3;
                h0Var = null;
            }
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
            it10 = it8;
            str3 = str;
        }
        return new zw7.k0(arrayList);
    }
}
