package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v8 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120025a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OfferContentScreenContract$InputData f120026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120027c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120029h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120030j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120031l;

    public v8(c1 c1Var, q4 q4Var, ViewController viewController, OfferContentScreenContract$InputData offerContentScreenContract$InputData) {
        this.f120027c = c1Var;
        this.f120026b = offerContentScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        q8 q8Var = new q8(c1Var, q4Var, this, 1, i);
        this.f120031l = q8Var;
        this.e = e4m.b.b(q8Var);
        this.f = e4m.b.b(new q8(c1Var, q4Var, this, 0, i));
        this.f120028g = e4m.b.b(new q8(c1Var, q4Var, this, 2, i));
        this.f120029h = e4m.b.b(new q8(c1Var, q4Var, this, 3, i));
        this.i = e4m.b.b((q8) this.f120031l);
        this.f120030j = e4m.b.b(new q8(c1Var, q4Var, this, 5, i));
        this.k = e4m.b.b(new q8(c1Var, q4Var, this, 4, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        switch (this.f120025a) {
        }
        return (cx4.b) this.f120028g.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f120025a) {
        }
        return ImmutableSet.of((yji.n) this.f120029h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f120025a) {
        }
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f120028g.get());
    }

    public v8(c1 c1Var, f4 f4Var, ViewController viewController, OfferContentScreenContract$InputData offerContentScreenContract$InputData) {
        this.f120027c = c1Var;
        this.f120026b = offerContentScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        q8 q8Var = new q8(c1Var, f4Var, this, 1, i);
        this.f120031l = q8Var;
        this.e = e4m.b.b(q8Var);
        this.f = e4m.b.b(new q8(c1Var, f4Var, this, 0, i));
        this.f120028g = e4m.b.b(new q8(c1Var, f4Var, this, 2, i));
        this.f120029h = e4m.b.b(new q8(c1Var, f4Var, this, 3, i));
        this.i = e4m.b.b((q8) this.f120031l);
        this.f120030j = e4m.b.b(new q8(c1Var, f4Var, this, 5, i));
        this.k = e4m.b.b(new q8(c1Var, f4Var, this, 4, i));
    }
}
