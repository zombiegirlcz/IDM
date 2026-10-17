package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements xki.c, j4b.a, x3b.a, r4b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2b.e f201878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f201879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f201880c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201882h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f201883j;
    public final e4m.e k;

    public p(v vVar, ViewController viewController, y2b.e eVar) {
        this.f201879b = vVar;
        this.f201878a = eVar;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.e = e4m.b.b(new lzk.b(vVar, this, 2, i));
        this.f = e4m.b.b(new lzk.b(vVar, this, 1, i));
        this.f201881g = e4m.b.b(new lzk.b(vVar, this, 0, i));
        this.f201882h = e4m.b.b(new lzk.b(vVar, this, 3, i));
        this.i = e4m.b.b(new lzk.b(vVar, this, 5, i));
        this.f201883j = e4m.b.b(new lzk.b(vVar, this, 4, i));
        this.k = e4m.b.b(new lzk.b(vVar, this, 6, i));
    }

    @Override // x3b.a
    public final z b() {
        return new z(this.f201879b, this.f201880c, 0);
    }

    @Override // j4b.a
    public final b0 c() {
        return new b0(this.f201879b, this.f201880c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f201881g.get());
    }

    @Override // r4b.a
    public final d0 j() {
        return new d0(this.f201879b, this.f201880c, 0);
    }

    public final o7.b q() {
        ybl.d dVarH = this.f201879b.e.h();
        vc.s.j(dVarH);
        return new o7.b(dVarH);
    }

    public final ryc.a s() {
        kge.d cfdPositionsInteractor = this.f201879b.f201923c.a();
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        y2b.e inputData = this.f201878a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ryc.a aVar = new ryc.a();
        aVar.f258289a = cfdPositionsInteractor;
        aVar.f258290b = inputData;
        return aVar;
    }
}
