package xf6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn6.g f304841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f304842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304843c;

    public f(e eVar, pn6.g gVar) {
        this.f304841a = gVar;
        this.f304842b = e4m.b.b(new xb1.m(eVar, this, 1, 5));
        this.f304843c = e4m.b.b(new xb1.m(eVar, this, 0, 5));
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
