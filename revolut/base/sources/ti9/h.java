package ti9;

import com.revolut.data.model.Data;
import ft3.d1;
import ft3.j1;
import grl.r2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends qx4.f implements qx4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f271461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f271462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq3.j f271463c;

    public h(i payLaterProductInteractor, xoj.a featuresInteractor, xq3.j creditApplicationInteractor) {
        Intrinsics.checkNotNullParameter(payLaterProductInteractor, "payLaterProductInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        this.f271461a = payLaterProductInteractor;
        this.f271462b = featuresInteractor;
        this.f271463c = creditApplicationInteractor;
    }

    @Override // qx4.i
    public final Flow c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return n14.k.p(q.q(q.Q(h(loadingStrategy), new s9b.n((Continuation) null, this, 29))), new tfh.a(25));
    }

    @Override // qx4.i
    public final Flow d() {
        return q.q(nim.a.v(rd0.e.b(((cpj.b) this.f271462b).k(yoj.c.PAY_LATER_APPLICATION, yoj.d.DISABLED)), new tfh.a(24)));
    }

    @Override // qx4.f
    public final Flow g(r2 origin, boolean z) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return n14.k.p(new go.g(new Data(z ? xh9.b.f305834a : xh9.c.f305835a, null, false, 6, null), 2), new tfh.a(26));
    }

    @Override // qx4.f
    public final Flow k(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return nim.a.v(this.f271463c.k(mif.a.m(d1.Companion, j1.BUY_NOW_PAY_LATER, null)), new o95.f(origin, 5));
    }
}
