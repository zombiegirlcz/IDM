package alb;

import cli.n;
import cli.y;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreenContract$InputData;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import wf0.f0;
import zhm.h0;
import zk1.p;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements f {
    public final SavingsCalculatorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ykb.c f6181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ykb.e f6182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f6183r;

    public j(n stateMapper, SavingsCalculatorScreenContract$InputData inputData, ykb.c savingsCalculatorRangeGenerator, ykb.e savingsEstimatedReturnCalculator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsCalculatorRangeGenerator, "savingsCalculatorRangeGenerator");
        Intrinsics.checkNotNullParameter(savingsEstimatedReturnCalculator, "savingsEstimatedReturnCalculator");
        this.o = inputData;
        this.f6181p = savingsCalculatorRangeGenerator;
        this.f6182q = savingsEstimatedReturnCalculator;
        this.f6183r = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow flowA;
        SavingsProduct savingsProduct = this.o.f83211a;
        ykb.c cVar = this.f6181p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        zkb.b bVar = cVar.f314602a;
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        xi0.b bVar2 = savingsProduct.f86618b;
        xi0.b.Companion.getClass();
        xi0.b bVar3 = xi0.b.f306272g;
        Continuation continuation = null;
        if (Intrinsics.f(bVar2, bVar3) || Intrinsics.f(bVar2, xi0.b.i) || Intrinsics.f(bVar2, xi0.b.f306273h)) {
            flowA = zkb.b.a(LivenessConstants.MAX_VIDEO_SIZE_BYTES, savingsProduct);
        } else {
            z70.c cVar2 = bVar.f322933a;
            xi0.b toCurrency = savingsProduct.f86618b;
            Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
            flowA = q.Q(mo3.a.g(nim.a.v(rd0.e.b(((ppk.f) cVar2.f319851a).b(v1.c.w(bVar3, toCurrency), false)), new zii.c(27)), null, new p(5), 1), new f0(continuation, bVar, savingsProduct, 18));
        }
        yji.l.a1(this, rd0.e.e(new a3i.i(new y5j.e(flowA, 15), this, 16), h0.f322473a, new a09.p(this, continuation, 7)), null, null, new af4.e(this, continuation, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f6183r;
    }
}
