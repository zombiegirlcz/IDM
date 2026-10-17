package mkh;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements hmh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d.b f206340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f206341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206342c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f206343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f206344h;

    public k(s sVar, o5d.b bVar) {
        this.f206341b = sVar;
        this.f206340a = bVar;
        this.f206342c = e4m.b.b(new mjl.b(sVar, this, 1, 8));
        this.d = e4m.b.b(new mjl.b(sVar, this, 0, 8));
        this.e = e4m.b.b(new mjl.b(sVar, this, 2, 8));
        this.f = e4m.b.b(new mjl.b(sVar, this, 3, 8));
        this.f206343g = e4m.b.b(new mjl.b(sVar, this, 5, 8));
        this.f206344h = e4m.b.b(new mjl.b(sVar, this, 4, 8));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
