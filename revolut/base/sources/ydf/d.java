package ydf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4l.a f312688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f312689b;

    public d(o4l.a nextSession, long j2) {
        Intrinsics.checkNotNullParameter(nextSession, "nextSession");
        this.f312688a = nextSession;
        this.f312689b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f312688a, dVar.f312688a) && this.f312689b == dVar.f312689b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f312689b) + (this.f312688a.hashCode() * 31);
    }
}
