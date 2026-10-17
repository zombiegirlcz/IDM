package nv1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f219422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f219423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f219424c;
    public final e4m.e d;

    public k(g gVar, e eVar, Alias alias) {
        this.f219423b = gVar;
        this.f219422a = alias;
        this.f219424c = e4m.b.b(new ned.h(gVar, eVar, this, 1, 11));
        this.d = e4m.b.b(new ned.h(gVar, eVar, this, 0, 11));
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
