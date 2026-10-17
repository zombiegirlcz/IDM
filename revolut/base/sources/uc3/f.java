package uc3;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f278979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f278980b;

    public f(e status, Instant instant) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f278979a = status;
        this.f278980b = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f278979a == fVar.f278979a && Intrinsics.f(this.f278980b, fVar.f278980b);
    }

    public final int hashCode() {
        int iHashCode = this.f278979a.hashCode() * 31;
        Instant instant = this.f278980b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }
}
