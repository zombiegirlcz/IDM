package sec;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q7c.s;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends oki.h implements f {
    public final DeliveryMethodsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f262175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f262176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f262177r;

    public o(DeliveryMethodsContract$InputData inputData, s shippingInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shippingInteractor, "shippingInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f262175p = shippingInteractor;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f262176q = z1VarB;
        this.f262177r = mra.d.b(this, new b(new Data(null, null, true, 3, null), inputData.f84750c, inputData.f84749b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, q.Q(this.f262176q, new s9b.n((Continuation) null, this, 3)), null, null, new n(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f262177r;
    }
}
