package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151862b;

    public l(String liveSearchId, long j2) {
        Intrinsics.checkNotNullParameter(liveSearchId, "liveSearchId");
        this.f151861a = liveSearchId;
        this.f151862b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f151861a, lVar.f151861a) && this.f151862b == lVar.f151862b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f151862b) + (this.f151861a.hashCode() * 31);
    }
}
