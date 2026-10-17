package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import e0f.u0;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McyTopupFlowContract$InputData f249625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f249626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f249627c;
    public final m d = this;
    public final e4m.e e;
    public final e4m.e f;

    public m(k kVar, ViewController viewController, McyTopupFlowContract$InputData mcyTopupFlowContract$InputData) {
        this.f249627c = kVar;
        this.f249625a = mcyTopupFlowContract$InputData;
        this.f249626b = viewController;
        int i = 15;
        this.e = e4m.b.b(new v1(kVar, this, 0, i));
        this.f = e4m.b.b(new v1(kVar, this, 1, i));
    }

    public final u0 b() {
        sf0.h hVarB = this.f249627c.f249615p.b();
        vc.s.j(hVarB);
        return new u0(hVarB);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
