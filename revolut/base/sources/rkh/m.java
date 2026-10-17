package rkh;

import ael.t0;
import akg.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import efm.r;
import jlh.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mic.a0;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.l f254883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f254884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.i f254885c;

    public m(ybl.l configInteractor, qkh.a mapper, p tradingDisclosuresInteractor, ybl.i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(tradingDisclosuresInteractor, "tradingDisclosuresInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        this.f254883a = configInteractor;
        this.f254884b = tradingDisclosuresInteractor;
        this.f254885c = productGroupAvailabilityInteractor;
    }

    @Override // rkh.f
    public final go.g a() {
        return zi0.c.i(new TextLocalisedClause(R$string.trading_disclosures_title, null, null, 14));
    }

    @Override // rkh.f
    public final Flow b() {
        ybl.l lVar = this.f254883a;
        n nVarD = ybl.l.d(lVar);
        r rVarX = new ufm.i(((t0) lVar).f(), new a0(6, j.f254881a), 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return nim.a.v(u0.m(nVarD, rd0.e.b(rVarX)), new rj7.b(this, 21));
    }

    @Override // rkh.f
    public final Flow c() {
        return xam.a.h(new rk9.d(this, null, 2), ybl.l.d(this.f254883a));
    }
}
