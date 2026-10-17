package qy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f250149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f250150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f250151c;

    public f(long j2, Long l2, boolean z) {
        this.f250149a = z;
        this.f250150b = j2;
        this.f250151c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f250149a == fVar.f250149a && this.f250150b == fVar.f250150b && Intrinsics.f(this.f250151c, fVar.f250151c);
    }

    public final int hashCode() {
        int iC = a0.d.c(Boolean.hashCode(this.f250149a) * 31, 31, this.f250150b);
        Long l2 = this.f250151c;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
