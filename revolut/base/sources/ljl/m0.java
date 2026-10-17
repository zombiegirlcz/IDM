package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 implements xki.c, bml.a, gml.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrConsentFlowContract$InputData f196028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f196029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f196030c;
    public final m0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f196031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f196032h;

    public m0(q0 q0Var, ViewController viewController, QrConsentFlowContract$InputData qrConsentFlowContract$InputData) {
        this.f196030c = q0Var;
        this.f196028a = qrConsentFlowContract$InputData;
        this.f196029b = viewController;
        int i = 5;
        this.e = e4m.b.b(new u(q0Var, this, 1, i));
        this.f = e4m.b.b(new u(q0Var, this, 2, i));
        this.f196031g = e4m.b.b(new u(q0Var, this, 0, i));
        this.f196032h = e4m.b.b(new u(q0Var, this, 3, i));
    }

    @Override // bml.a
    public final d1 b() {
        return new d1(this.f196030c, this.d, 0);
    }

    @Override // gml.a
    public final f1 c() {
        return new f1(this.f196030c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196032h.get());
    }

    @Override // xki.e
    public final Set g() {
        tll.f extension = new tll.f((tll.e) this.f196031g.get());
        cml.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        return ImmutableSet.of(extension);
    }
}
