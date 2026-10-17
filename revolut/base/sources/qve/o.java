package qve;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f249642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249644c;
    public final e4m.e d;

    public o(k kVar, m mVar) {
        this.f249642a = kVar;
        this.f249643b = e4m.b.b(new ppd.j(kVar, mVar, this, 1, 17));
        int i = 17;
        this.f249644c = e4m.b.b(new ppd.j(kVar, mVar, this, 2, i));
        this.d = e4m.b.b(new ppd.j(kVar, mVar, this, 0, i));
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
