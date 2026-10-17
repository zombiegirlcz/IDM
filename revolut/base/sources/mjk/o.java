package mjk;

import android.os.Parcelable;
import bjk.f2;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanUnlockableBenefitsLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o {
    public static final PlanUnlockableBenefitsLayout a(f2 f2Var) {
        Parcelable secondary;
        Intrinsics.checkNotNullParameter(f2Var, "<this>");
        f2.c header = f2Var.getHeader();
        PlanUnlockableBenefitsLayout.Header header2 = new PlanUnlockableBenefitsLayout.Header(header.getId(), header.getTitle(), header.getSubtitle(), header.getDescription(), header.getDeeplink(), header.getBackgroundImageUrl(), header.getBackgroundVideoUrl());
        List content = f2Var.getContent();
        ArrayList arrayList = new ArrayList(zhm.w.t(content, 10));
        Iterator it8 = content.iterator();
        while (true) {
            PlanUnlockableBenefitsLayout.Icon icon = null;
            if (!it8.hasNext()) {
                break;
            }
            f2.b bVar = (f2.b) it8.next();
            String title = bVar.getTitle();
            f2.d icon2 = bVar.getIcon();
            if (icon2 != null) {
                icon = new PlanUnlockableBenefitsLayout.Icon(icon2.getAssetName());
            }
            arrayList.add(new PlanUnlockableBenefitsLayout.ContentItem(title, icon, bVar.getDeeplink()));
        }
        List<f2.a> buttons = f2Var.getButtons();
        ArrayList arrayList2 = new ArrayList();
        for (f2.a aVar : buttons) {
            String type = aVar.getType();
            if (Intrinsics.f(type, "BUTTON_PRIMARY")) {
                secondary = new PlanUnlockableBenefitsLayout.Button.Primary(aVar.getTitle(), aVar.getDeeplink());
            } else if (Intrinsics.f(type, "BUTTON_SECONDARY")) {
                secondary = new PlanUnlockableBenefitsLayout.Button.Secondary(aVar.getTitle(), aVar.getDeeplink());
            } else {
                hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown unlockable benefits button type: ", aVar.getType())));
                secondary = null;
            }
            if (secondary != null) {
                arrayList2.add(secondary);
            }
        }
        return new PlanUnlockableBenefitsLayout(header2, arrayList, arrayList2);
    }
}
