package gcm;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes22.dex */
public final class h4 extends ecm.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142672a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f142673b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f142674c;
    public final /* synthetic */ ecm.a1 d;

    public h4(j4 j4Var, j4 j4Var2) {
        this.d = j4Var;
        this.f142674c = (j4) Preconditions.checkNotNull(j4Var2, "pickFirstLeafLoadBalancer");
    }

    @Override // ecm.y0
    public final ecm.v0 a(q4 q4Var) {
        switch (this.f142672a) {
            case 0:
                if (this.f142673b.compareAndSet(false, true)) {
                    ecm.k2 k2VarD = ((j4) this.d).f.d();
                    j4 j4Var = (j4) this.f142674c;
                    Objects.requireNonNull(j4Var);
                    k2VarD.execute(new fp0.l(j4Var, 2));
                }
                break;
            default:
                if (this.f142673b.compareAndSet(false, true)) {
                    ((o4) this.d).f.d().execute(new ag.q(this, 13));
                }
                break;
        }
        return ecm.v0.e;
    }

    public h4(o4 o4Var, ecm.x0 x0Var) {
        this.d = o4Var;
        this.f142674c = (ecm.x0) Preconditions.checkNotNull(x0Var, "subchannel");
    }
}
