package cbk;

import bw4.s;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PendingPaymentContract$InputData f22873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f22874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f22875n;
    public final vki.a o;

    public h(PendingPaymentContract$InputData inputData, j apmHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmHandler, "apmHandler");
        this.f22873l = inputData;
        this.f22874m = apmHandler;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f22875n = z1VarB;
        this.o = pyd.c.a(this, new Data(null, null, true, 3, null));
    }

    @Override // yji.n
    public final void D2() {
        Continuation continuation = null;
        yji.n.j2(this, q.Q(this.f22875n, new s(continuation, this, 12)), null, new cbh.g(this, continuation, 1), 3);
    }

    @Override // cbk.g
    public final void Z2(f parcel, sak.c paymentData) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        boolean zF = Intrinsics.f(parcel, e.f22872a);
        j jVar = this.f22874m;
        if (zF) {
            jVar.c3(paymentData);
        } else {
            if (!Intrinsics.f(parcel, d.f22871a)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar.b3(paymentData);
        }
    }

    @Override // cbk.g
    public final void b3() {
        this.f22875n.k(Unit.f186387a);
        X2(this.o, new c8i.c(22));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
