package amh;

import ael.b1;
import cli.y;
import g48.r0;
import java.time.LocalDate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends oki.h implements g {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ylh.h f6426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f6427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vyd.a f6428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n0e.b f6429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ybl.o f6430t;
    public final ybl.k u;
    public final ybl.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r0 f6431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f6432x;

    public x(e mapper, f input, ylh.h periodSelector, ang.f userInteractor, vyd.a dialogModelConfigurationFactory, n0e.b statementsNaviCommandsFactory, ybl.o tradingStatementsInteractor, ybl.k tradingAccountsInteractor, ybl.l tradingConfigInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(periodSelector, "periodSelector");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(tradingStatementsInteractor, "tradingStatementsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.o = input;
        this.f6426p = periodSelector;
        this.f6427q = userInteractor;
        this.f6428r = dialogModelConfigurationFactory;
        this.f6429s = statementsNaviCommandsFactory;
        this.f6430t = tradingStatementsInteractor;
        this.u = tradingAccountsInteractor;
        this.v = tradingConfigInteractor;
        this.f6431w = jointAccountsInteractor;
        this.f6432x = mra.d.b(this, new h("TAB_ID_PDF", f0.f322471a, null, false, null, null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarX = this.f6427q.f(false).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(rd0.e.b(rVarX), new a0e.m(continuation, this, 23)), null, null, new o(this, continuation, 0), 3);
        yji.l.a1(this, ((ylh.t) this.f6426p).f314732q, null, null, new o(this, continuation, 1), 3);
        yji.l.a1(this, new a07.p(ybl.l.d(this.v), 7), null, null, new o(this, continuation, 2), 3);
    }

    public final ufm.i I2(String accountId, ybl.n format, LocalDate from, LocalDate to6) {
        b1 b1Var = (b1) this.f6430t;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(format, "format");
        return b1Var.b(accountId, from, to6, format, xbl.e.MONTHLY);
    }

    public final ufm.i J2(String accountId, ybl.n format, LocalDate from, LocalDate to6) {
        b1 b1Var = (b1) this.f6430t;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(format, "format");
        return b1Var.b(accountId, from, to6, format, xbl.e.REALISED_PNL);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f6432x;
    }
}
