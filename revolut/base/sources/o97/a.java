package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223085a;

    public a(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f223085a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f223085a, ((a) obj2).f223085a);
    }

    public final int hashCode() {
        return this.f223085a.hashCode();
    }
}
