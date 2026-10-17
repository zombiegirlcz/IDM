package ove;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDetailsScreenDescriptor$InputData f230074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f230075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230076c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f230077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230078h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f230079j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f230080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f230081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f230082n;
    public final e4m.e o;

    public i(t tVar, ViewController viewController, CardDetailsScreenDescriptor$InputData cardDetailsScreenDescriptor$InputData) {
        this.f230074a = cardDetailsScreenDescriptor$InputData;
        this.f230075b = e4m.b.b(e4m.c.a(viewController));
        this.f230076c = e4m.b.b(new oi9.a(tVar, this, 1, 24));
        this.d = e4m.b.b(new oi9.a(tVar, this, 0, 24));
        this.e = e4m.b.b(new oi9.a(tVar, this, 4, 24));
        this.f = e4m.b.b(new oi9.a(tVar, this, 3, 24));
        this.f230077g = e4m.b.b(new oi9.a(tVar, this, 2, 24));
        this.f230078h = e4m.b.b(new oi9.a(tVar, this, 6, 24));
        this.i = e4m.b.b(new oi9.a(tVar, this, 5, 24));
        this.f230079j = e4m.b.b(new oi9.a(tVar, this, 8, 24));
        this.k = e4m.b.b(new oi9.a(tVar, this, 12, 24));
        this.f230080l = e4m.b.b(new oi9.a(tVar, this, 11, 24));
        this.f230081m = e4m.b.b(new oi9.a(tVar, this, 10, 24));
        this.f230082n = e4m.b.b(new oi9.a(tVar, this, 9, 24));
        this.o = e4m.b.b(new oi9.a(tVar, this, 7, 24));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.f230077g.get(), (yji.d) this.i.get());
    }
}
