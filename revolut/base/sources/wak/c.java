package wak;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import r7d.w;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f295953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f295954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f295955c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f295956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f295957h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f295958j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f295959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f295960m;

    public c(f fVar, e eVar) {
        this.f295953a = fVar;
        this.f295954b = e4m.b.b(new w(fVar, eVar, this, 0, 28));
        int i = 28;
        this.f295955c = e4m.b.b(new w(fVar, eVar, this, 2, i));
        this.d = e4m.b.b(new w(fVar, eVar, this, 1, i));
        this.e = e4m.b.b(eVar.f);
        this.f = e4m.b.b(new w(fVar, eVar, this, 6, i));
        this.f295956g = e4m.b.b(new w(fVar, eVar, this, 5, i));
        this.f295957h = e4m.b.b(new w(fVar, eVar, this, 4, i));
        this.i = e4m.b.b(new w(fVar, eVar, this, 3, i));
        this.f295958j = e4m.b.b(new w(fVar, eVar, this, 7, i));
        this.k = e4m.b.b(new w(fVar, eVar, this, 8, i));
        this.f295959l = e4m.b.b(new w(fVar, eVar, this, 10, i));
        this.f295960m = e4m.b.b(new w(fVar, eVar, this, 9, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f295954b.get(), (n) this.d.get(), (n) this.i.get(), (n) this.f295958j.get(), (n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
