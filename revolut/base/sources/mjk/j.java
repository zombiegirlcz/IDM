package mjk;

import android.os.Parcelable;
import bjk.d1;
import bjk.h3;
import bjk.i3;
import bjk.v2;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j {
    public static final PlanOfferPromptLayout.Asset a(d1 d1Var) {
        com.revolut.retail.feature.pricing_plans.ui.api.models.d dVar;
        String str = d1Var.f15833a;
        com.revolut.retail.feature.pricing_plans.ui.api.models.d[] dVarArrValues = com.revolut.retail.feature.pricing_plans.ui.api.models.d.values();
        int length = dVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i];
            if (a0.z(dVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (dVar == null) {
            dVar = com.revolut.retail.feature.pricing_plans.ui.api.models.d.UNKNOWN;
        }
        return new PlanOfferPromptLayout.Asset(dVar, d1Var.f15834b);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter b(bjk.c3 r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.List r1 = r12.f15708a
            r2 = 0
            if (r1 == 0) goto L5d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r1.next()
            bjk.z2 r4 = (bjk.z2) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r5 = r4.f16153a
            if (r5 == 0) goto L4a
            ggk.p1[] r6 = ggk.p1.values()
            int r7 = r6.length
            r8 = 0
        L34:
            if (r8 >= r7) goto L47
            r9 = r6[r8]
            java.lang.String r10 = r9.name()
            r11 = 1
            boolean r10 = kotlin.text.a0.z(r10, r5, r11)
            if (r10 == 0) goto L44
            goto L48
        L44:
            int r8 = r8 + 1
            goto L34
        L47:
            r9 = r2
        L48:
            if (r9 != 0) goto L4c
        L4a:
            ggk.p1 r9 = ggk.p1.UNKNOWN
        L4c:
            java.lang.String r5 = r4.f16154b
            bjk.v2 r4 = r4.f16155c
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction r4 = mjk.t.a(r4)
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton r6 = new com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton
            r6.<init>(r9, r5, r4)
            r3.add(r6)
            goto L1b
        L5d:
            r3 = r2
        L5e:
            if (r3 != 0) goto L62
            zhm.f0 r3 = zhm.f0.f322471a
        L62:
            bjk.i3 r12 = r12.f15709b
            if (r12 == 0) goto L6a
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText r2 = c(r12)
        L6a:
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter r12 = new com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter
            r12.<init>(r3, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.j.b(bjk.c3):com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter");
    }

    public static final PricingPlanLayoutHyperText c(i3 i3Var) {
        a aVar;
        Intrinsics.checkNotNullParameter(i3Var, "<this>");
        String str = i3Var.f15987a;
        List<h3> list = i3Var.f15988b;
        List list2 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (h3 h3Var : list) {
                String str2 = h3Var.f15977c;
                String str3 = h3Var.f15975a;
                if (str2 != null) {
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    for (int i = 0; i < length; i++) {
                        aVar = aVarArrValues[i];
                        if (a0.z(aVar.name(), str2, true)) {
                            break;
                        }
                    }
                    aVar = null;
                } else {
                    aVar = null;
                }
                v2 v2Var = h3Var.f15976b;
                Parcelable clickable = v2Var != null ? new PricingPlanLayoutHyperText.Descriptor.Clickable(t.a(v2Var), str3) : aVar == a.STRIKETHROUGH ? new PricingPlanLayoutHyperText.Descriptor.Strikethrough(str3) : null;
                if (clickable != null) {
                    arrayList.add(clickable);
                }
            }
            list2 = arrayList;
        }
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        return new PricingPlanLayoutHyperText(str, list2);
    }
}
