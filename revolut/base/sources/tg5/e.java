package tg5;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xki.c, zg5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f271079b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f271080c = e4m.b.b(new r96.a(15));

    public e(d dVar) {
        this.f271078a = dVar;
    }

    @Override // zg5.c
    public final zg5.a b() {
        return new g(this.f271078a, this.f271079b);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
