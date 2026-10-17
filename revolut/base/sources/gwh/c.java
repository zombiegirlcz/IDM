package gwh;

import com.revolut.feature.card_management.api.CardManagementKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import e7l.g;
import efm.d0;
import efm.r;
import gvi.p;
import ha3.x;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import pfm.z;
import ue0.e;
import v6e.d;
import v6l.b1;
import v6l.k;
import w4l.h;
import z6l.s;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements rv2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f147329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha3.f f147330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f147331c;
    public final fk3.a d;

    public c(f revolutCardsInteractor, ha3.f cardsConfigInteractor, ang.f userInteractor, fk3.a configInteractor) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f147329a = revolutCardsInteractor;
        this.f147330b = cardsConfigInteractor;
        this.f147331c = userInteractor;
        this.d = configInteractor;
    }

    public final BridgeDestination a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardManagementKompotFeatureConfig.ActivatePinDestination(cardId), false, (Integer) null, 0, 61))));
    }

    public final z b() {
        d0 d0VarFirstOrError = m70.a.g(kli.a.h(this.f147331c.k(false), ((ik3.c) this.d).k(g.b.f123407a)), null, new gug.c(6), 1).distinctUntilChanged().map(new gv5.b(new p(7), 2)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return e.I(d0VarFirstOrError, h0.f322473a, new p(8));
    }

    public final r c(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "cardId");
        x xVar = (x) this.f147329a;
        Intrinsics.checkNotNullParameter(id10, "id");
        s sVar = xVar.f;
        Intrinsics.checkNotNullParameter(id10, "id");
        b1 b1Var = (b1) sVar.f319829a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r map = (z ? b1Var.f286435r.e(id10, loadingStrategy) : b1Var.f286434q.e(id10, loadingStrategy)).map(new k(18, new d(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(rd0.e.c(rd0.e.b(map), kotlin.coroutines.g.f186406a), new p(5));
    }
}
