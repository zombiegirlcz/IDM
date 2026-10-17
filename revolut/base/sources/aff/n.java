package aff;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.merchant_history.MerchantHistoryScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends jki.g implements jki.h {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MerchantHistoryScreenContract$InputData f4045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kef.a f4046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ce9.j f4047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f4048s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p stateMapper, MerchantHistoryScreenContract$InputData inputData, kef.a interactor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f4045p = inputData;
        this.f4046q = interactor;
        this.f4047r = new ce9.j(new a9d.p(24), new ack.f(this, 10));
        this.f4048s = new e(inputData.f91837a, new ce9.p(null, null, 63));
    }

    @Override // yji.l
    public final void I1() {
        ce9.j jVar = this.f4047r;
        yji.l.a1(this, rd0.e.b(jVar.e), null, null, new af4.e(this, null, 2), 3);
        io3.h.a(jVar, ce9.n.REFRESH);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f4048s;
    }
}
