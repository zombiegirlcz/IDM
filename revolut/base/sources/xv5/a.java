package xv5;

import hha.s;
import hha.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static ArrayList a(List pricingPlans, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : pricingPlans) {
            hha.d dVar = (hha.d) obj2;
            u uVarB = b(currency);
            if (uVarB == null || s.h(dVar, uVarB)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static u b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        xi0.b.Companion.getClass();
        if (!Intrinsics.f(currency, xi0.b.T) && !Intrinsics.f(currency, xi0.b.S) && !Intrinsics.f(currency, xi0.b.U) && !Intrinsics.f(currency, xi0.b.V)) {
            return null;
        }
        u.Companion.getClass();
        return u.C;
    }
}
