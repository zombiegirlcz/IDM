package t80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f268761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f268762b;

    public c(e directoryLocation, long j2) {
        Intrinsics.checkNotNullParameter(directoryLocation, "directoryLocation");
        this.f268761a = directoryLocation;
        this.f268762b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f268761a, cVar.f268761a) && this.f268762b == cVar.f268762b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f268762b) + (this.f268761a.hashCode() * 31);
    }
}
