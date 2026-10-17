package ytf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements qji.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualTransferInputData f316724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f316725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f316726c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f316727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f316728h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f316729j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f316730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f316731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f316732n;
    public final e4m.e o;

    public b(e eVar, ManualTransferInputData manualTransferInputData) {
        this.f316725b = eVar;
        this.f316724a = manualTransferInputData;
        int i = 3;
        this.d = e4m.b.b(new yre.a(eVar, this, 0, i));
        this.e = e4m.b.b(new yre.a(eVar, this, 1, i));
        this.f = e4m.b.b(new yre.a(eVar, this, 2, i));
        this.f316727g = e4m.b.b(new yre.a(eVar, this, 3, i));
        this.f316728h = e4m.b.b(new yre.a(eVar, this, 5, i));
        this.i = e4m.b.b(new yre.a(eVar, this, 4, i));
        this.f316729j = e4m.b.b(new yre.a(eVar, this, 7, i));
        this.k = e4m.b.b(new yre.a(eVar, this, 6, i));
        this.f316730l = e4m.b.b(new yre.a(eVar, this, 8, i));
        this.f316731m = e4m.b.b(new yre.a(eVar, this, 10, i));
        this.f316732n = e4m.b.b(new yre.a(eVar, this, 9, i));
        this.o = e4m.b.b(new yre.a(eVar, this, 11, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of((n) this.i.get(), (n) this.k.get(), (n) this.f316730l.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get(), (yji.d) this.f.get(), (yji.d) this.f316727g.get());
    }
}
