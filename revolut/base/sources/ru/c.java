package ru;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f257357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f257358c;
    public final Integer d;

    public c(int i, dj0.d dVar, Long l2, Integer num) {
        this.f257356a = i;
        this.f257357b = dVar;
        this.f257358c = l2;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f257356a == cVar.f257356a && Intrinsics.f(this.f257357b, cVar.f257357b) && Intrinsics.f(this.f257358c, cVar.f257358c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f257356a) * 31;
        dj0.d dVar = this.f257357b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Long l2 = this.f257358c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
