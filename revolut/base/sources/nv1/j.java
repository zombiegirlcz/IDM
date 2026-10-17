package nv1;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f219419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f219420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f219421c;

    public j(g gVar, e eVar) {
        this.f219419a = gVar;
        this.f219420b = e4m.b.b(new ned.h(gVar, eVar, this, 1, 10));
        this.f219421c = e4m.b.b(new ned.h(gVar, eVar, this, 0, 10));
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
