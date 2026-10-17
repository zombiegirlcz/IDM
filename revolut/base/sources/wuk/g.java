package wuk;

import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreen;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.kompot.navigable.a f300181b;

    public /* synthetic */ g(com.revolut.kompot.navigable.a aVar, int i) {
        this.f300180a = i;
        this.f300181b = aVar;
    }

    @Override // z0h.s1
    public final vkm.d r() {
        switch (this.f300180a) {
            case 0:
                return rd0.e.b(((BondDetailsController) this.f300181b).m0.d);
            case 1:
                return rd0.e.b(((SmartFeedScreen) this.f300181b).S.d);
            case 2:
                return rd0.e.b(((SharedCreateAlertRevampedScreen) this.f300181b).c0.d);
            case 3:
                return rd0.e.b(((SharedCreateAlertScreen) this.f300181b).c0.d);
            default:
                return rd0.e.b(((InstrumentNewsController) this.f300181b).Q.d);
        }
    }
}
