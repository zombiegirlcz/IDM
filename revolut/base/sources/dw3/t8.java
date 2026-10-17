package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class t8 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119867a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedIntroScreenContract$InputData f119868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119869c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119871h;
    public final e4m.e i;

    public t8(c1 c1Var, n4 n4Var, ViewController viewController, AnimatedIntroScreenContract$InputData animatedIntroScreenContract$InputData) {
        this.f119868b = animatedIntroScreenContract$InputData;
        this.f119869c = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        q8 q8Var = new q8(c1Var, n4Var, this, 1, i);
        this.i = q8Var;
        this.d = e4m.b.b(q8Var);
        this.e = e4m.b.b(new q8(c1Var, n4Var, this, 0, i));
        this.f = e4m.b.b((q8) this.i);
        this.f119870g = e4m.b.b(new q8(c1Var, n4Var, this, 3, i));
        this.f119871h = e4m.b.b(new q8(c1Var, n4Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f119867a) {
        }
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f119867a) {
        }
        return ImmutableSet.of((yji.d) this.e.get());
    }

    public t8(c1 c1Var, q4 q4Var, ViewController viewController, AnimatedIntroScreenContract$InputData animatedIntroScreenContract$InputData) {
        this.f119868b = animatedIntroScreenContract$InputData;
        this.f119869c = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        q8 q8Var = new q8(c1Var, q4Var, this, 1, i);
        this.i = q8Var;
        this.d = e4m.b.b(q8Var);
        this.e = e4m.b.b(new q8(c1Var, q4Var, this, 0, i));
        this.f = e4m.b.b((q8) this.i);
        this.f119870g = e4m.b.b(new q8(c1Var, q4Var, this, 3, i));
        this.f119871h = e4m.b.b(new q8(c1Var, q4Var, this, 2, i));
    }

    public t8(c1 c1Var, f4 f4Var, ViewController viewController, AnimatedIntroScreenContract$InputData animatedIntroScreenContract$InputData) {
        this.f119868b = animatedIntroScreenContract$InputData;
        this.f119869c = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        q8 q8Var = new q8(c1Var, f4Var, this, 1, i);
        this.i = q8Var;
        this.d = e4m.b.b(q8Var);
        this.e = e4m.b.b(new q8(c1Var, f4Var, this, 0, i));
        this.f = e4m.b.b((q8) this.i);
        this.f119870g = e4m.b.b(new q8(c1Var, f4Var, this, 3, i));
        this.f119871h = e4m.b.b(new q8(c1Var, f4Var, this, 2, i));
    }
}
