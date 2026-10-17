package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzd.e f130805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f130806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130807c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130809h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130810j;
    public final e4m.e k;

    public o(b0 b0Var, n nVar, ViewController viewController, tzd.e eVar) {
        this.f130805a = eVar;
        this.f130806b = e4m.b.b(e4m.c.a(viewController));
        this.f130807c = e4m.b.b(new j(b0Var, this, 2, 3));
        this.d = e4m.b.b(new j(b0Var, this, 4, 3));
        this.e = e4m.b.b(new j(b0Var, this, 5, 3));
        this.f = e4m.b.b(new j(b0Var, this, 3, 3));
        this.f130808g = e4m.b.b(new j(b0Var, this, 1, 3));
        this.f130809h = e4m.b.b(new j(b0Var, this, 0, 3));
        this.i = e4m.b.b(new j(b0Var, this, 6, 3));
        this.f130810j = e4m.b.b(new j(b0Var, this, 7, 3));
        this.k = e4m.b.b(new j(b0Var, this, 8, 3));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f130810j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f130809h.get(), (yji.d) this.i.get());
    }
}
