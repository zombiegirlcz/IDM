package n16;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ms1.s;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b26.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ut5.l f211259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ash.j f211260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f211261c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f211262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f211263h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f211264j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f211265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f211266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f211267n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f211268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f211269q;

    public d(b bVar, ViewController viewController, ut5.l lVar, ash.j jVar) {
        this.f211261c = bVar;
        this.f211259a = lVar;
        this.f211260b = jVar;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.e = e4m.b.b(new s(bVar, this, 2, i));
        this.f = e4m.b.b(new s(bVar, this, 1, i));
        this.f211262g = e4m.b.b(new s(bVar, this, 0, i));
        this.f211263h = e4m.b.b(new s(bVar, this, 5, i));
        this.i = e4m.b.b(new s(bVar, this, 4, i));
        this.f211264j = e4m.b.b(new s(bVar, this, 3, i));
        this.k = e4m.b.b(new s(bVar, this, 6, i));
        this.f211265l = e4m.b.b(new s(bVar, this, 7, i));
        this.f211266m = e4m.b.b(new s(bVar, this, 8, i));
        this.f211267n = e4m.b.b(new s(bVar, this, 9, i));
        this.o = e4m.b.b(new s(bVar, this, 10, i));
        this.f211268p = e4m.b.b(new s(bVar, this, 11, i));
        this.f211269q = e4m.b.b(new s(bVar, this, 12, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f211265l.get());
        ash.e extension = (ash.e) this.f211266m.get();
        l46.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        Set setB = y0.b(extension);
        vc.s.k(setB);
        builderBuilderWithExpectedSize.addAll((Iterable) setB);
        builderBuilderWithExpectedSize.add(this.f211267n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        return j6.a.g(this.f211268p, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f211262g.get(), (yji.d) this.f211264j.get());
    }
}
