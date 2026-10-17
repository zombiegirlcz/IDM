package mjk;

import android.os.Parcelable;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class w {
    public static final boolean a(iha.q qVar) {
        ArrayList arrayList = qVar.f161349b;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            iha.i iVar = ((iha.o) it8.next()).f161344b;
            if (iVar != null && c(iVar) == null) {
                return true;
            }
        }
        return false;
    }

    public static final PlanOfferPromptLayout.Asset b(iha.k kVar) {
        com.revolut.retail.feature.pricing_plans.ui.api.models.d dVar;
        String str = kVar.f161332a;
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
        return new PlanOfferPromptLayout.Asset(dVar, kVar.f161333b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final PricingPlanAction c(iha.i iVar) {
        List list;
        String str;
        String str2;
        iha.t tVar;
        String str3 = iVar.f161327a;
        iha.j jVar = iVar.f161328b;
        switch (str3.hashCode()) {
            case -2034635050:
                if (str3.equals("DECLINE")) {
                    return PricingPlanAction.Decline.f102800a;
                }
                return null;
            case -1907201458:
                if (str3.equals("SEE_ALL_DOCUMENTS") && jVar != null && (list = jVar.d) != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        return new PricingPlanAction.SeeAllDocuments(list);
                    }
                }
                return null;
            case -1905312150:
                if (str3.equals("DISMISS")) {
                    return PricingPlanAction.Dismiss.f102801a;
                }
                return null;
            case 69924934:
                if (!str3.equals("SEE_ALL_BENEFITS") || jVar == null || (str = jVar.f161329a) == null) {
                    return null;
                }
                return new PricingPlanAction.SeeAllBenefits(str);
            case 279273946:
                if (!str3.equals("OPEN_URL") || jVar == null || (str2 = jVar.f161330b) == null) {
                    return null;
                }
                return new PricingPlanAction.OpenUrl(str2);
            case 1669100192:
                if (!str3.equals("CONFIRM") || jVar == null || (tVar = jVar.f161331c) == null) {
                    return null;
                }
                return new PricingPlanAction.Confirm(tVar.f161353a, tVar.f161354b);
            default:
                return null;
        }
    }

    public static final PricingPlanLayoutHyperText d(iha.q qVar) {
        String str = qVar.f161348a;
        ArrayList<iha.o> arrayList = qVar.f161349b;
        ArrayList arrayList2 = new ArrayList();
        for (iha.o oVar : arrayList) {
            iha.i iVar = oVar.f161344b;
            String str2 = oVar.f161343a;
            Parcelable strikethrough = null;
            PricingPlanAction pricingPlanActionC = iVar != null ? c(iVar) : null;
            if (pricingPlanActionC != null) {
                strikethrough = new PricingPlanLayoutHyperText.Descriptor.Clickable(pricingPlanActionC, str2);
            } else if (Intrinsics.f(oVar.f161345c, "STRIKETHROUGH")) {
                strikethrough = new PricingPlanLayoutHyperText.Descriptor.Strikethrough(str2);
            }
            if (strikethrough != null) {
                arrayList2.add(strikethrough);
            }
        }
        return new PricingPlanLayoutHyperText(str, arrayList2);
    }
}
