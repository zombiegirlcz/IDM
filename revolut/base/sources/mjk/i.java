package mjk;

import bjk.y0;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ljk.m;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    public static ArrayList a(ArrayList arrayList) {
        PlanHubScreenHeader.Standard.TitleContent plainText;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            String str = (String) pair.f186385a;
            String str2 = (String) pair.f186386b;
            if (Intrinsics.f(str, "REVOLUT_LOGO")) {
                plainText = PlanHubScreenHeader.Standard.TitleContent.RevolutLogo.f102689a;
            } else {
                if (!Intrinsics.f(str, "PLAIN_TEXT") || str2 == null) {
                    return null;
                }
                plainText = new PlanHubScreenHeader.Standard.TitleContent.PlainText(str2);
            }
            arrayList2.add(plainText);
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader$Standard$Action] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.revolut.retail.feature.pricing_plans.ui.api.models.b] */
    public static PlanHubScreenHeader.Standard.Action b(y0.b.a aVar) {
        ?? r06;
        PlanHubScreenHeader.Standard.Action.Icon icon;
        String id10 = aVar.getId();
        y0.b.a.C0108a icon2 = aVar.getIcon();
        int i = 0;
        if (icon2 != null) {
            String url2 = icon2.getUrl();
            String assetName = icon2.getAssetName();
            Boolean dot = icon2.getDot();
            icon = new PlanHubScreenHeader.Standard.Action.Icon(assetName, url2, dot != null ? dot.booleanValue() : false);
            r06 = 0;
        } else {
            r06 = 0;
            icon = null;
        }
        String label = aVar.getLabel();
        String deeplink = aVar.getDeeplink();
        if (deeplink == null) {
            return r06;
        }
        PlanScreenElementView.Action action = new PlanScreenElementView.Action(deeplink);
        String animation = aVar.getAnimation();
        if (animation != null) {
            com.revolut.retail.feature.pricing_plans.ui.api.models.b[] bVarArrValues = com.revolut.retail.feature.pricing_plans.ui.api.models.b.values();
            int length = bVarArrValues.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.revolut.retail.feature.pricing_plans.ui.api.models.b bVar = bVarArrValues[i];
                if (a0.z(bVar.name(), animation, true)) {
                    r06 = bVar;
                    break;
                }
                i++;
            }
        }
        return new PlanHubScreenHeader.Standard.Action(id10, icon, label, action, r06);
    }

    public static PlanHubScreenHeader.Standard.Action c(m.b.a aVar) {
        com.revolut.retail.feature.pricing_plans.ui.api.models.b bVar;
        PlanHubScreenHeader.Standard.Action.Icon icon;
        String id10 = aVar.getId();
        m.b.a.C1112a icon2 = aVar.getIcon();
        int i = 0;
        if (icon2 != null) {
            String url2 = icon2.getUrl();
            String assetName = icon2.getAssetName();
            Boolean dot = icon2.getDot();
            icon = new PlanHubScreenHeader.Standard.Action.Icon(assetName, url2, dot != null ? dot.booleanValue() : false);
            bVar = null;
        } else {
            bVar = null;
            icon = null;
        }
        String label = aVar.getLabel();
        PlanScreenElementView.Action action = new PlanScreenElementView.Action(aVar.getDeeplink());
        String animation = aVar.getAnimation();
        if (animation != null) {
            com.revolut.retail.feature.pricing_plans.ui.api.models.b[] bVarArrValues = com.revolut.retail.feature.pricing_plans.ui.api.models.b.values();
            int length = bVarArrValues.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.revolut.retail.feature.pricing_plans.ui.api.models.b bVar2 = bVarArrValues[i];
                if (a0.z(bVar2.name(), animation, true)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        }
        return new PlanHubScreenHeader.Standard.Action(id10, icon, label, action, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader.Standard d(bjk.y0 r13) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.i.d(bjk.y0):com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader$Standard");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader.Standard e(ljk.m r15) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.i.e(ljk.m):com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader$Standard");
    }

    public static m.b.a f(PlanHubScreenHeader.Standard.Action action) {
        m.b.a.C1112a c1112a;
        String str;
        String strName;
        String str2;
        String str3 = action.f102670a;
        PlanHubScreenHeader.Standard.Action.Icon icon = action.f102671b;
        if (icon != null) {
            c1112a = new m.b.a.C1112a(icon.f102674b, icon.f102673a, Boolean.valueOf(icon.f102675c));
            str = null;
        } else {
            c1112a = null;
            str = null;
        }
        String str4 = action.f102672c;
        String str5 = action.d.f81005a;
        com.revolut.retail.feature.pricing_plans.ui.api.models.b bVar = action.e;
        if (bVar != null) {
            str2 = str5;
            strName = bVar.name();
        } else {
            strName = str;
            str2 = str5;
        }
        return new m.b.a(str3, c1112a, str4, str2, strName);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ljk.m.b g(com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader r19) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.i.g(com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader):ljk.m$b");
    }
}
