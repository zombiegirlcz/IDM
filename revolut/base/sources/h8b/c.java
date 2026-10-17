package h8b;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.youTransactor.uCube.rpc.Constants;
import iel.p;
import ip0.ck0;
import java.util.List;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx0.a f149972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f149973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.k f149974c;
    public final l80.e d;

    public c(j8b.a bubblesMapper, jx0.a eventContentMapper, ybl.d portfolioInteractor, ybl.k tradingAccountsInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(bubblesMapper, "bubblesMapper");
        Intrinsics.checkNotNullParameter(eventContentMapper, "eventContentMapper");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f149972a = eventContentMapper;
        this.f149973b = portfolioInteractor;
        this.f149974c = tradingAccountsInteractor;
        this.d = dateProvider;
    }

    public final y a(iel.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(event, "event");
        return new y(u.c(new TextDelegate.Model("event_description", j8b.k.c(event), false, new ck0(0), null, null, 0, 0, 0, 0, 2036)), new t(new TextLocalisedClause(j8b.k.g(event), null, null, 14), null, null, 30), null, null, null, null, "CORPORATE_EVENTS_DELEGATES_KEY", null, null, null, 3836);
    }

    public final m8b.e b(kp3.b corporateEvent, List restructuredInstruments, Data data) throws Throwable {
        Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
        Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
        Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
        Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
        t1 t1Var = (t1) this.f149972a.f179038b;
        Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
        Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
        if (!(corporateEvent instanceof kp3.a)) {
            if (corporateEvent instanceof kp3.c) {
                return ((kp3.c) corporateEvent).f188166a instanceof p ? new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_market_holiday_title, null, null, 14), new TextLocalisedClause(R$string.feature_corporate_events_bubble_market_holiday_description, null, null, 14), new CdnImage("Market-Closed", "assets/categories-v2", null, null, null, null, Constants.TAG_FC_SPEED_MODE), new WhiteCircleBadge(dw0.a.Moon), 16) : new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_screen_title_events, null, null, 14), (TextLocalisedClause) null, (Image) null, (CircleIconBadge) null, 30);
            }
            throw new NoWhenBranchMatchedException();
        }
        ib7.j jVar = (ib7.j) t1Var.f185240b;
        kp3.a aVar = (kp3.a) corporateEvent;
        iel.a aVar2 = aVar.f188164a;
        k8b.a aVarA = jVar.a(aVar2);
        if (aVarA != null) {
            return aVarA.a(aVar2, aVar.f188165b, restructuredInstruments, data);
        }
        hx7.e.n(new IllegalStateException("No AssetEventMapper registered for ".concat(aVar2.getClass().getSimpleName())));
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_screen_title_events, null, null, 14), (TextLocalisedClause) null, (Image) null, (CircleIconBadge) null, 30);
    }
}
