package mjk;

import bjk.e2;
import bjk.g2;
import bjk.j3;
import bjk.k3;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.pricingplans.models.PricingPlanOfferCode;
import com.revolut.feature.pricingplans.models.PricingPlanOfferDiscount;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Badge;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Subtitle;
import ggk.v0;
import hha.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.joda.time.Period;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k {
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem a(bjk.g2.d.g r18) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.k.a(bjk.g2$d$g):com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem");
    }

    public static final PlansDashboardLayout$PlanPageLayout$BillingOptions b(g2.d.h hVar) {
        v0 v0Var;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String title = hVar.getTitle();
        String subtitle = hVar.getSubtitle();
        String upgradeType = hVar.getUpgradeType();
        v0[] v0VarArrValues = v0.values();
        int length = v0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                v0Var = null;
                break;
            }
            v0Var = v0VarArrValues[i];
            if (a0.z(v0Var.name(), upgradeType, true)) {
                break;
            }
            i++;
        }
        if (v0Var == null) {
            throw new IllegalStateException("Unsupported billing options upgrade type");
        }
        List options = hVar.getOptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(options, 10));
        Iterator it8 = options.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((g2.d.g) it8.next()));
        }
        return new PlansDashboardLayout$PlanPageLayout$BillingOptions(v0Var, title, subtitle, arrayList);
    }

    public static final hha.o c(g2.d.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        dj0.d dVarO = mo3.a.o(oVar.getTotal());
        dj0.d dVarO2 = mo3.a.o(oVar.getFee());
        List taxes = oVar.getTaxes();
        if (taxes == null) {
            taxes = f0.f322471a;
        }
        List<g2.d.y> list = taxes;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (g2.d.y yVar : list) {
            arrayList.add(new t0(mo3.a.o(yVar.getValue()), yVar.getType()));
        }
        return new hha.o(dVarO, dVarO2, arrayList);
    }

    public static final g2.d.g d(PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem) {
        g2.d.b bVar;
        k3 k3Var;
        g2.a aVar;
        boolean z;
        Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$BillingOptionItem, "<this>");
        String strX = cp5.d.X(plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102747a);
        dj0.d dVar = plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102748b;
        jo3.a aVarP = dVar != null ? mo3.a.p(dVar) : null;
        hha.o oVar = plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102749c;
        g2.d.o oVarE = oVar != null ? e(oVar) : null;
        PlansDashboardLayout$PlanPageLayout$BillingOptionItemContent plansDashboardLayout$PlanPageLayout$BillingOptionItemContent = plansDashboardLayout$PlanPageLayout$BillingOptionItem.d;
        Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$BillingOptionItemContent, "<this>");
        j3 j3Var = null;
        g2.d.o oVar2 = oVarE;
        String str = plansDashboardLayout$PlanPageLayout$BillingOptionItemContent.f102752a;
        PlansDashboardLayout$PlanPageLayout$Badge plansDashboardLayout$PlanPageLayout$Badge = plansDashboardLayout$PlanPageLayout$BillingOptionItemContent.f102753b;
        if (plansDashboardLayout$PlanPageLayout$Badge != null) {
            Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$Badge, "<this>");
            bVar = new g2.d.b(plansDashboardLayout$PlanPageLayout$Badge.f102745a, plansDashboardLayout$PlanPageLayout$Badge.f102746b);
        } else {
            bVar = null;
        }
        PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle = plansDashboardLayout$PlanPageLayout$BillingOptionItemContent.f102754c;
        g2.d.f fVar = new g2.d.f(str, bVar, plansDashboardLayout$PlanPageLayout$Subtitle != null ? r.p(plansDashboardLayout$PlanPageLayout$Subtitle) : null);
        e2 e2VarB = n.b(plansDashboardLayout$PlanPageLayout$BillingOptionItem.e);
        PlansDashboardLayout$Button plansDashboardLayout$Button = plansDashboardLayout$PlanPageLayout$BillingOptionItem.f;
        g2.a aVarB = plansDashboardLayout$Button != null ? q.b(plansDashboardLayout$Button) : null;
        boolean z3 = plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102750g;
        PricingPlanOffer pricingPlanOffer = plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102751h;
        if (pricingPlanOffer != null) {
            Intrinsics.checkNotNullParameter(pricingPlanOffer, "<this>");
            String str2 = pricingPlanOffer.f81123a;
            PricingPlanOfferDiscount pricingPlanOfferDiscount = pricingPlanOffer.f81124b;
            if (pricingPlanOfferDiscount != null) {
                Intrinsics.checkNotNullParameter(pricingPlanOfferDiscount, "<this>");
                String str3 = pricingPlanOfferDiscount.f81126a;
                jo3.a aVarP2 = mo3.a.p(pricingPlanOfferDiscount.f81127b);
                g2.d.o oVarE2 = e(pricingPlanOfferDiscount.f81128c);
                PricingPlanOfferCode pricingPlanOfferCode = pricingPlanOfferDiscount.d;
                String str4 = pricingPlanOfferCode != null ? pricingPlanOfferCode.f81125a : null;
                Period period = pricingPlanOfferDiscount.e;
                j3Var = new j3(str3, aVarP2, oVarE2, str4, period != null ? period.toString() : null);
            }
            k3 k3Var2 = new k3(str2, j3Var);
            aVar = aVarB;
            z = z3;
            k3Var = k3Var2;
        } else {
            k3Var = null;
            aVar = aVarB;
            z = z3;
        }
        return new g2.d.g(strX, aVarP, oVar2, fVar, e2VarB, aVar, z, k3Var);
    }

    public static final g2.d.o e(hha.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        jo3.a aVarP = mo3.a.p(oVar.f152326a);
        jo3.a aVarP2 = mo3.a.p(oVar.f152327b);
        List<t0> list = oVar.f152328c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (t0 t0Var : list) {
            jo3.a aVarP3 = mo3.a.p(t0Var.f152340a);
            String strA = t0Var.f152341b.a();
            if (strA == null) {
                strA = "UNKNOWN";
            }
            arrayList.add(new g2.d.y(aVarP3, strA));
        }
        return new g2.d.o(aVarP, aVarP2, arrayList);
    }
}
