package gpb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends oki.h implements h {
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final skb.f f145422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ijb.a f145423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterestAndFeesScreenContract$InputData f145424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f145425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f145426t;

    public o(j60.a bottomDialogExtension, skb.f productInfoSheetsModelProvider, ijb.a savingsProductInteractor, InterestAndFeesScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(productInfoSheetsModelProvider, "productInfoSheetsModelProvider");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = bottomDialogExtension;
        this.f145422p = productInfoSheetsModelProvider;
        this.f145423q = savingsProductInteractor;
        this.f145424r = inputData;
        this.f145425s = new vii.b();
        this.f145426t = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f145425s, new g6f.l(continuation, this, 12)), null, null, new gii.b(this, continuation, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f145426t;
    }
}
