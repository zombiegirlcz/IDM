package ofj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c {
    public static final EsimDataPlanOfferInfo a(kfj.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        String type = pVar.getType();
        if (Intrinsics.f(type, "FREE_TEASER")) {
            return new EsimDataPlanOfferInfo.FreeTeaser(pVar.getId());
        }
        if (Intrinsics.f(type, "PRICING_PLAN_BENEFIT")) {
            return new EsimDataPlanOfferInfo.PlanBenefit(pVar.getId());
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimDataPlanOfferMapping.kt", j6.a.q("Unsupported offer type: ", pVar.getType()), null, h0Var);
        return null;
    }

    public static final kfj.p b(EsimDataPlanOfferInfo esimDataPlanOfferInfo) {
        String str;
        Intrinsics.checkNotNullParameter(esimDataPlanOfferInfo, "<this>");
        String f100237a = esimDataPlanOfferInfo.getF100237a();
        if (esimDataPlanOfferInfo instanceof EsimDataPlanOfferInfo.FreeTeaser) {
            str = "FREE_TEASER";
        } else if (esimDataPlanOfferInfo instanceof EsimDataPlanOfferInfo.PlanBenefit) {
            str = "PRICING_PLAN_BENEFIT";
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimDataPlanOfferMapping.kt", "Unsupported offer type: " + esimDataPlanOfferInfo, null, h0Var);
            str = "Undefined";
        }
        return new kfj.p(f100237a, str);
    }
}
