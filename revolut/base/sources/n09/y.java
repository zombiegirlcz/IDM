package n09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u09.v f210971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210972b;

    public y(u09.v domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f210971a = domain;
        this.f210972b = domain.name();
    }

    @Override // n09.z
    public final String a() {
        return this.f210972b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f210971a == ((y) obj2).f210971a;
    }

    public final int hashCode() {
        return this.f210971a.hashCode();
    }
}
