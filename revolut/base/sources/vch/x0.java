package vch;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreenContract$Input;
import java.time.Instant;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 extends jki.g implements v {
    public final ych.a A;
    public final fah.b B;
    public final prl.e C;
    public final rbh.r D;
    public final mbh.d E;
    public final n1h.b F;
    public final ubh.a G;
    public final j2 H;
    public a2 I;
    public boolean J;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f287742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WithdrawScreenContract$Input f287743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f287744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f287745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i0 f287746t;
    public final t1h.i u;
    public final t1h.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t1h.e f287747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t1h.n f287748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t1h.o f287749y;
    public final ybl.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(k initialState, WithdrawScreenContract$Input input, f0 mapper, j60.a bottomExpandableDialogControllerExtension, w80.b amountFormatter, i0 withdrawAmountValidator, t1h.i portfolioInfoProvider, t1h.f disclaimerProvider, t1h.e disclaimerParcelHandler, t1h.n toolbarProvider, t1h.o toolbarParcelHandler, ybl.d portfolioInteractor, ych.a dialogMapper, fah.b networkConnectionErrorExtension, prl.e wealthBalancesFilterInteractorFactory, rbh.r pocketPickerProvider, mbh.d currencyExchangeProvider, n1h.b currencyExchangeExtension, ubh.a pocketPickerAllowedBalanceTypesProvider) {
        super(mapper);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(withdrawAmountValidator, "withdrawAmountValidator");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(disclaimerParcelHandler, "disclaimerParcelHandler");
        Intrinsics.checkNotNullParameter(toolbarProvider, "toolbarProvider");
        Intrinsics.checkNotNullParameter(toolbarParcelHandler, "toolbarParcelHandler");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(networkConnectionErrorExtension, "networkConnectionErrorExtension");
        Intrinsics.checkNotNullParameter(wealthBalancesFilterInteractorFactory, "wealthBalancesFilterInteractorFactory");
        Intrinsics.checkNotNullParameter(pocketPickerProvider, "pocketPickerProvider");
        Intrinsics.checkNotNullParameter(currencyExchangeProvider, "currencyExchangeProvider");
        Intrinsics.checkNotNullParameter(currencyExchangeExtension, "currencyExchangeExtension");
        Intrinsics.checkNotNullParameter(pocketPickerAllowedBalanceTypesProvider, "pocketPickerAllowedBalanceTypesProvider");
        this.f287742p = initialState;
        this.f287743q = input;
        this.f287744r = bottomExpandableDialogControllerExtension;
        this.f287745s = amountFormatter;
        this.f287746t = withdrawAmountValidator;
        this.u = portfolioInfoProvider;
        this.v = disclaimerProvider;
        this.f287747w = disclaimerParcelHandler;
        this.f287748x = toolbarProvider;
        this.f287749y = toolbarParcelHandler;
        this.z = portfolioInteractor;
        this.A = dialogMapper;
        this.B = networkConnectionErrorExtension;
        this.C = wealthBalancesFilterInteractorFactory;
        this.D = pocketPickerProvider;
        this.E = currencyExchangeProvider;
        this.F = currencyExchangeExtension;
        this.G = pocketPickerAllowedBalanceTypesProvider;
        this.H = vkm.q.c(Instant.now());
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        wkm.l lVarQ = vkm.q.Q(this.H, new l0(0, continuation, this));
        yji.l.a1(this, lVarQ, null, null, new m0(1, continuation, this), 3);
        Flow flowE = boh.f.e(lVarQ, new g0(this, 1));
        yji.l.a1(this, flowE, null, null, new m0(2, continuation, this), 3);
        yji.l.a1(this, mo3.a.g(zh9.u0.m(lVarQ, flowE), null, null, 3), null, null, new m0(3, continuation, this), 3);
        WithdrawScreenContract$Input withdrawScreenContract$Input = this.f287743q;
        String f95657a = withdrawScreenContract$Input.f95652a.getF95657a();
        xi0.b bVar = withdrawScreenContract$Input.f95653b;
        t1h.n nVar = this.f287748x;
        yji.l.a1(this, nVar.a(f95657a, bVar), null, null, new m0(4, continuation, this), 3);
        yji.l.a1(this, nVar.b(withdrawScreenContract$Input.f95652a.getF95657a(), bVar), null, null, new m0(5, continuation, this), 3);
        yji.l.a1(this, mo3.a.e(c8g.a.D(rd0.e.n(c6d.b.i(nim.a.v(lVarQ, new h0(1)), new g0(this, 2)), zhm.h0.f322473a)), new v78.d(20), new v78.d(18)), null, null, new m0(0, continuation, this), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        efm.r map = this.f287744r.C().map(new v6l.e0(25, new v80.a(25)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.b(map), null, new r0(this, null), 3);
        yji.l.b1(this, this.v.a(), null, new m0(6, continuation, this), 3);
        boolean z = this.J;
        this.J = true;
        if (z && !((k) t2()).f287713j) {
            x2(new v80.a(26));
        }
        yji.l.b1(this, vkm.q.Q(vkm.q.q(new tnb.k(q2(), 21)), new sdi.a(continuation, vkm.q.Q(yh5.b.d(t1.h(vkm.q.q(new tnb.k(q2(), 20)), 300L, new v80.a(27)), vkm.q.q(new tnb.k(q2(), 22))), new l0(1, continuation, this)), this, 18)), null, new m0(7, continuation, this), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f287742p;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y2(dj0.d r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vch.x0.y2(dj0.d):void");
    }
}
