package ubf;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import u45.w0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbf.f f278846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f278847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f278848c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f278849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f278850h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f278851j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f278852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f278853m;

    public a(d dVar, e eVar, BaseScreen baseScreen, lbf.f fVar) {
        this.f278846a = fVar;
        this.f278847b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 11;
        this.f278848c = e4m.b.b(new w0(dVar, this, 2, i));
        this.d = e4m.b.b(new w0(dVar, this, 1, i));
        this.e = e4m.b.b(new w0(dVar, this, 0, i));
        this.f = e4m.b.b(new w0(dVar, this, 5, i));
        this.f278849g = e4m.b.b(new w0(dVar, this, 6, i));
        this.f278850h = e4m.b.b(new w0(dVar, this, 7, i));
        this.i = e4m.b.b(new w0(dVar, this, 8, i));
        this.f278851j = e4m.b.b(new w0(dVar, this, 4, i));
        this.k = e4m.b.b(new w0(dVar, this, 9, i));
        this.f278852l = e4m.b.b(new w0(dVar, this, 10, i));
        this.f278853m = e4m.b.b(new w0(dVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
