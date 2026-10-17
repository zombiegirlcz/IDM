package nfd;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214898a;

    public a(String watchlistId) {
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        this.f214898a = watchlistId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f214898a, ((a) obj2).f214898a);
    }

    public final int hashCode() {
        return this.f214898a.hashCode();
    }
}
