package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.qr_challenge.displayer.QrDisplayerControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrDisplayerControllerContract$InputData f196038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f196039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196040c;

    public n0(q0 q0Var, c cVar, QrDisplayerControllerContract$InputData qrDisplayerControllerContract$InputData) {
        this.f196039b = cVar;
        this.f196038a = qrDisplayerControllerContract$InputData;
        this.f196040c = e4m.b.b(new ld1.g(q0Var, this, 14));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196039b.Q.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f196039b.P.get());
    }
}
