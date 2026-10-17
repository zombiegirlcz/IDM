package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223124a;

    public o0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f223124a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f223124a, ((o0) obj2).f223124a);
    }

    public final int hashCode() {
        return this.f223124a.hashCode();
    }
}
