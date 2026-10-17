package iw6;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreenContract$InputData;
import et6.b1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends oki.h implements f {
    public final b1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerCustomerDetailsScreenContract$InputData f168981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f168982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f168983r;

    public m(b1 freelancerCustomersInteractor, FreelancerCustomerDetailsScreenContract$InputData inputData, p stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerCustomersInteractor, "freelancerCustomersInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerCustomersInteractor;
        this.f168981p = inputData;
        this.f168982q = new vii.b();
        this.f168983r = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f168982q, new l(continuation, this, 0)), null, null, new iug.j(this, continuation, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f168983r;
    }
}
