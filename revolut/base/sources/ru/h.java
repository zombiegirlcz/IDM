package ru;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f257364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f257365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f257366c;

    public h(int i, dj0.d dVar, Integer num) {
        this.f257364a = dVar;
        this.f257365b = num;
        this.f257366c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f257364a, hVar.f257364a) && Intrinsics.f(this.f257365b, hVar.f257365b) && this.f257366c == hVar.f257366c;
    }

    public final int hashCode() {
        dj0.d dVar = this.f257364a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Integer num = this.f257365b;
        return Integer.hashCode(this.f257366c) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
