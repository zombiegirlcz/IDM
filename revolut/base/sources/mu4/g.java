package mu4;

import al4.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import ll4.w;
import mkk.q;
import om4.x2;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements dli.b {
    public final CreditCardRepaySpeiDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f208957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f208958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f208959r;

    public g(CreditCardRepaySpeiDetailsScreenContract$InputData inputData, cli.n stateMapper, n creditCardInteractor, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.o = inputData;
        this.f208957p = creditCardInteractor;
        this.f208958q = clipboard;
        this.f208959r = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardRepaySpeiDetailsScreenContract$InputData creditCardRepaySpeiDetailsScreenContract$InputData = this.o;
        String str = creditCardRepaySpeiDetailsScreenContract$InputData.f69601a;
        w wVar = w.SPEI;
        x2 x2Var = (x2) this.f208957p;
        l.a1(this, rd0.e.n(nim.a.v(u0.m(x2Var.C(str, wVar, w4l.i.f294643c), x2Var.h(creditCardRepaySpeiDetailsScreenContract$InputData.f69601a, w4l.h.f294642c)), new msb.c(14)), h0.f322473a), null, null, new q(this, null, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f208959r;
    }
}
