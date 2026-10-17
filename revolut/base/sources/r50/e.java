package r50;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.chat_core.R$string;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementIncidentItem;
import com.revolut.core.chaosmanagement.ui.model.ChaosManagementIncidentUiItem;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f251523a;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((ChaosManagementIncidentUiItem) it8.next()).f51358b == nd0.a.ACTIVE) {
                    z = true;
                    break;
                }
            }
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.chat_ongoing_outage_title, null, null, 14), null, null, null, false, 30);
        List<ChaosManagementIncidentUiItem> list2 = domainState.f251523a;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ChaosManagementIncidentUiItem chaosManagementIncidentUiItem : list2) {
            LayeredImage layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_repair, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
            String strQ = j6.a.q("chaos_management_incident_", chaosManagementIncidentUiItem.f51357a);
            ChaosManagementIncidentItem.Banner banner = chaosManagementIncidentUiItem.f51359c;
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(strQ, new TextClause(banner.f51346a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(banner.f51347b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new m(layeredImageI, (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), null, ActionWidgetDelegate.Model.a.C0393a.f51604a, null, null, null, false, 8144);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return new cii.b(z ? new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.chat_ongoing_outage_notify, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55) : null, arrayList, aVar);
    }
}
