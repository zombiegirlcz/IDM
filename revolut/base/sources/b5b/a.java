package b5b;

import android.os.Parcelable;
import avk.i;
import aw0.e;
import aw0.n6;
import b2b.c;
import b2b.d;
import b2b.f;
import b4b.z;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import grl.k9;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.x;
import vkm.j2;
import ybl.b;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f12481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f12482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f12483n;

    public a(b instrumentTickerInteractor, f cfdSwipeActionsInstrumentRefsProvider) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(cfdSwipeActionsInstrumentRefsProvider, "cfdSwipeActionsInstrumentRefsProvider");
        this.f12481l = instrumentTickerInteractor;
        this.f12482m = cfdSwipeActionsInstrumentRefsProvider;
        this.f12483n = pyd.c.a(this, new d(null));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, boh.f.e(this.f12482m.M1(), new z(this, 13)), null, new i(this, null, 27), 3);
    }

    @Override // b2b.c
    public final void Z2(vh clickData) {
        List list;
        Object next;
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.f54883a.f;
        b2b.b bVar = obj2 instanceof b2b.b ? (b2b.b) obj2 : null;
        if (bVar == null) {
            return;
        }
        nel.n nVar = bVar.f11933b;
        Data data = ((d) ((j2) this.f12483n.f22677a).getValue()).f11935a;
        if (data == null || (list = (List) data.getContent()) == null) {
            return;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((InstrumentTicker) next).f105112b, nVar.f214596b)) {
                    break;
                }
            }
        }
        InstrumentTicker instrumentTicker = (InstrumentTicker) next;
        if (instrumentTicker == null) {
            return;
        }
        if (x.a(instrumentTicker)) {
            A2(new CfdTradingFeatureConfig.CfdClosePositionReviewDestination(bVar.f11932a, bVar.f11934c, bVar.d, nVar));
            return;
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_cfds_market_closed_title, null, null, 14), new TextLocalisedClause(R$string.wealth_cfds_market_closed_description, null, null, 14), null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        n.P2(this, new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f12483n;
    }
}
