package pk9;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.intro.IntroControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfk.o0;
import ti9.n;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements dli.b {
    public final ti9.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final IntroControllerContract$InputData f236949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f236950q;

    public k(ti9.l interactor, IntroControllerContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f236949p = inputData;
        this.f236950q = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.n(((n) this.o).b(this.f236949p.f78927a), h0.f322473a), null, null, new o0(this, (Continuation) null, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236950q;
    }
}
