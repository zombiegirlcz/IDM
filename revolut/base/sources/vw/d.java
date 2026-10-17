package vw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f292577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f292578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f292579c;
    public final Long d;
    public final Integer e;

    public d(boolean z, Long l2, Integer num, Long l3, Integer num2) {
        this.f292577a = z;
        this.f292578b = l2;
        this.f292579c = num;
        this.d = l3;
        this.e = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f292577a == dVar.f292577a && Intrinsics.f(this.f292578b, dVar.f292578b) && Intrinsics.f(this.f292579c, dVar.f292579c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f292577a) * 31;
        Long l2 = this.f292578b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f292579c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }
}
