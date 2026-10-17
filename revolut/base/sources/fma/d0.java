package fma;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileFlowContract$InputData f136084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f136085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f136086c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f136087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f136088h;
    public final e4m.e i;

    public d0(c0 c0Var, ViewController viewController, ProfileFlowContract$InputData profileFlowContract$InputData) {
        this.f136085b = c0Var;
        this.f136084a = profileFlowContract$InputData;
        this.d = e4m.b.b(new fa0.q(c0Var, this, 0, 24));
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.f = e4m.b.b(new fa0.q(c0Var, this, 1, i));
        this.f136087g = e4m.b.b(new fa0.q(c0Var, this, 2, i));
        this.f136088h = e4m.b.b(new fa0.q(c0Var, this, 3, i));
        this.i = e4m.b.b(new fa0.q(c0Var, this, 4, i));
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
