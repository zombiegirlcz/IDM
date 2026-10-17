package rr1;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sr1.c f256649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f256650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f256651c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e(a aVar, sr1.c cVar) {
        this.f256650b = aVar;
        this.f256649a = cVar;
        int i = 21;
        this.d = e4m.b.b(new o(aVar, this, 0, i));
        this.e = e4m.b.b(new o(aVar, this, 2, i));
        this.f = e4m.b.b(new o(aVar, this, 1, i));
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
