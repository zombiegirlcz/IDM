package wr1;

import cli.y;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreenContract$Input;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.w;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends oki.h implements l {
    public final wsg.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f299507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l2j.a f299508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tr1.g f299509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tr1.f f299510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f299511t;

    public u(wsg.n walletInteractor, w80.b amountFormatter, l2j.a currencyChooserFlowFactory, tr1.g tapiInteractor, tr1.f tapiBalanceInteractor, TapiTransferAmountScreenContract$Input inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(tapiInteractor, "tapiInteractor");
        Intrinsics.checkNotNullParameter(tapiBalanceInteractor, "tapiBalanceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = walletInteractor;
        this.f299507p = amountFormatter;
        this.f299508q = currencyChooserFlowFactory;
        this.f299509r = tapiInteractor;
        this.f299510s = tapiBalanceInteractor;
        dj0.d dVar = inputData.f61547a;
        dj0.d dVar2 = inputData.f61548b;
        if (dVar2 == null) {
            xi0.b.Companion.getClass();
            dVar2 = new dj0.d(0L, xi0.b.z);
        }
        dj0.d dVar3 = dVar2;
        dj0.d dVar4 = inputData.f61549c;
        if (dVar4 == null) {
            xi0.b.Companion.getClass();
            dVar4 = new dj0.d(Long.MAX_VALUE, xi0.b.z);
        }
        xi0.b.Companion.getClass();
        this.f299511t = mra.d.b(this, new g(dVar, dVar3, dVar4, new dj0.d(Long.MAX_VALUE, xi0.b.z), inputData.d, new ur1.a(0), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new s(this, continuation, 0), new yi5.b(26));
        w wVar = new w(15);
        y yVar = this.f299511t;
        v0b.b bVar = new v0b.b(vkm.q.q(yVar.B(wVar)), this, 25);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.d(bVar, h0Var), null, null, new p(this, null, 1), 3);
        yji.l.a1(this, rd0.e.d(vkm.q.Q(vkm.q.r(new wm9.k(20), yVar.B(new w(16))), new w2a.q(continuation, this, 21)), h0Var), null, null, new p(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f299511t;
    }
}
