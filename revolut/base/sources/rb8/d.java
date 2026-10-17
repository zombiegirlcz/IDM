package rb8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import r6e.m;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec8.h f252991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f252992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252993c;
    public final e4m.e d;

    public d(a aVar, ec8.h hVar) {
        this.f252992b = aVar;
        this.f252991a = hVar;
        this.f252993c = e4m.b.b(aVar.f252985r);
        this.d = e4m.b.b(new m(aVar, this, 7));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f252993c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
