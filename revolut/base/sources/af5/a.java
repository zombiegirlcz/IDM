package af5;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements hf5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f3887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f3888c;
    public final e4m.e d;

    public a(d dVar) {
        this.f3886a = dVar;
        this.f3887b = e4m.b.b(new a1e.c(dVar, this, 1, 4));
        this.f3888c = e4m.b.b(new a1e.c(dVar, this, 0, 4));
        this.d = e4m.b.b(new a1e.c(dVar, this, 2, 4));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.addAll((Iterable) this.f3888c.get());
        return j6.a.g(this.f3887b, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
