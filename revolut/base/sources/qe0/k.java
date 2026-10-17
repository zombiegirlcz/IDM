package qe0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f245030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f245031b;

    public k(Object params, long j2) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f245030a = params;
        this.f245031b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f245030a, kVar.f245030a) && kotlin.time.b.d(this.f245031b, kVar.f245031b);
    }

    public final int hashCode() {
        int iHashCode = this.f245030a.hashCode() * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f245031b) + iHashCode;
    }
}
