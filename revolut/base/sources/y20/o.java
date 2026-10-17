package y20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v30.c0 f310529a;

    public o(v30.c0 feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f310529a = feedType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f310529a == ((o) obj2).f310529a;
    }

    public final int hashCode() {
        return this.f310529a.hashCode();
    }
}
