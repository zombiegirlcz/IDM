package nh2;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f215365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f215366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f215367c;
    public final e4m.e d;

    public z(o oVar) {
        this.f215365a = oVar;
        this.f215366b = e4m.b.b(new ms1.s(oVar, this, 0, 27));
        this.f215367c = e4m.b.b(new ms1.s(oVar, this, 2, 27));
        this.d = e4m.b.b(new ms1.s(oVar, this, 1, 27));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f215366b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
