package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f4652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f4653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f4654c;
    public final dj0.d d;
    public final dj0.d e;

    public v(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, dj0.d dVar5) {
        this.f4652a = dVar;
        this.f4653b = dVar2;
        this.f4654c = dVar3;
        this.d = dVar4;
        this.e = dVar5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f4652a, vVar.f4652a) && Intrinsics.f(this.f4653b, vVar.f4653b) && Intrinsics.f(this.f4654c, vVar.f4654c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        dj0.d dVar = this.f4652a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f4653b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f4654c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        dj0.d dVar5 = this.e;
        return iHashCode4 + (dVar5 != null ? dVar5.hashCode() : 0);
    }
}
