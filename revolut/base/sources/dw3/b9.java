package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b9 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118396a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OfferContentScreenContract$InputData f118397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118398c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118400h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118401j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118402l;

    public b9(c1 c1Var, q4 q4Var, ViewController viewController, OfferContentScreenContract$InputData offerContentScreenContract$InputData) {
        this.f118398c = c1Var;
        this.f118397b = offerContentScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        q8 q8Var = new q8(c1Var, q4Var, this, 1, i);
        this.f118402l = q8Var;
        this.e = e4m.b.b(q8Var);
        this.f = e4m.b.b(new q8(c1Var, q4Var, this, 0, i));
        this.f118399g = e4m.b.b(new q8(c1Var, q4Var, this, 2, i));
        this.f118400h = e4m.b.b(new q8(c1Var, q4Var, this, 3, i));
        this.i = e4m.b.b((q8) this.f118402l);
        this.f118401j = e4m.b.b(new q8(c1Var, q4Var, this, 5, i));
        this.k = e4m.b.b(new q8(c1Var, q4Var, this, 4, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        switch (this.f118396a) {
        }
        return (cx4.b) this.f118399g.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f118396a) {
        }
        return ImmutableSet.of((yji.n) this.f118400h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f118396a) {
        }
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f118399g.get());
    }

    public b9(c1 c1Var, f4 f4Var, ViewController viewController, OfferContentScreenContract$InputData offerContentScreenContract$InputData) {
        this.f118398c = c1Var;
        this.f118397b = offerContentScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        q8 q8Var = new q8(c1Var, f4Var, this, 1, i);
        this.f118402l = q8Var;
        this.e = e4m.b.b(q8Var);
        this.f = e4m.b.b(new q8(c1Var, f4Var, this, 0, i));
        this.f118399g = e4m.b.b(new q8(c1Var, f4Var, this, 2, i));
        this.f118400h = e4m.b.b(new q8(c1Var, f4Var, this, 3, i));
        this.i = e4m.b.b((q8) this.f118402l);
        this.f118401j = e4m.b.b(new q8(c1Var, f4Var, this, 5, i));
        this.k = e4m.b.b(new q8(c1Var, f4Var, this, 4, i));
    }
}
