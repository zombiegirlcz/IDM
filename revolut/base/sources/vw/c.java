package vw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f292574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f292575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f292576c;
    public final Long d;

    public c(boolean z, Long l2, Integer num, Long l3) {
        this.f292574a = z;
        this.f292575b = l2;
        this.f292576c = num;
        this.d = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f292574a == cVar.f292574a && Intrinsics.f(this.f292575b, cVar.f292575b) && Intrinsics.f(this.f292576c, cVar.f292576c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f292574a) * 31;
        Long l2 = this.f292575b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f292576c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.d;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }
}
