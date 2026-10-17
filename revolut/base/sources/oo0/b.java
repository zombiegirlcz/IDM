package oo0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f226971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f226972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f226973c;

    public b(long j2, long j3, a playbackStatus) {
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        this.f226971a = playbackStatus;
        this.f226972b = j2;
        this.f226973c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f226971a == bVar.f226971a && this.f226972b == bVar.f226972b && this.f226973c == bVar.f226973c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f226973c) + a0.d.c(this.f226971a.hashCode() * 31, 31, this.f226972b);
    }
}
