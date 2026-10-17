package om2;

import bn2.p;
import im2.f;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rk0.c f226500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f226501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f226502c;
    public final an0.c d;
    public final ckg.a e;
    public final hm2.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l70.e f226503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f226504h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f226505j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f226506l;

    public e(l70.e eVar, ee0.a aVar, nj0.a aVar2, rk0.c cVar, an0.c cVar2, ckg.a aVar3, hm2.d dVar) {
        this.f226500a = cVar;
        this.f226501b = aVar2;
        this.f226502c = aVar;
        this.d = cVar2;
        this.e = aVar3;
        this.f = dVar;
        this.f226503g = eVar;
        int i = 7;
        this.f226504h = e4m.b.b(new of3.e(this, 1, i));
        this.i = e4m.b.b(new of3.e(this, 3, i));
        this.f226505j = e4m.b.b(new of3.e(this, 4, i));
        this.k = e4m.b.b(new of3.e(this, 2, i));
        this.f226506l = e4m.b.b(new of3.e(this, 0, i));
    }

    public final fn2.c a() {
        a aVar = b.Companion;
        hm2.d dVar = this.f;
        Optional customImplementation = dVar.b();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(customImplementation, "customImplementation");
        Intrinsics.checkNotNullParameter(customImplementation, "<this>");
        return new fn2.c((f) customImplementation.orElse(null), dVar.a());
    }

    public final p b() {
        return (p) this.f226506l.get();
    }
}
