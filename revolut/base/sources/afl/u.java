package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f4649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f4650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f4651c;

    public u(dj0.d dVar, Long l2, Long l3) {
        this.f4649a = dVar;
        this.f4650b = l2;
        this.f4651c = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f4649a, uVar.f4649a) && Intrinsics.f(this.f4650b, uVar.f4650b) && Intrinsics.f(this.f4651c, uVar.f4651c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f4649a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Long l2 = this.f4650b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f4651c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
