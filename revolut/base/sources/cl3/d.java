package cl3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24926a;

    public d(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f24926a = query;
    }

    @Override // cl3.b
    public final String a() {
        return this.f24926a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f24926a, ((d) obj2).f24926a);
    }

    public final int hashCode() {
        return this.f24926a.hashCode();
    }
}
