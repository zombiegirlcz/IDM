package es6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f128868c;
    public final b d;
    public final Float e;

    public d(String id10, String moneyBoxId, c state, b automaticAllocation, Float f) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(moneyBoxId, "moneyBoxId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(automaticAllocation, "automaticAllocation");
        this.f128866a = id10;
        this.f128867b = moneyBoxId;
        this.f128868c = state;
        this.d = automaticAllocation;
        this.e = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f128866a, dVar.f128866a) && Intrinsics.f(this.f128867b, dVar.f128867b) && this.f128868c == dVar.f128868c && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f128868c.hashCode() + p.a.c(this.f128866a.hashCode() * 31, 31, this.f128867b)) * 31)) * 31;
        Float f = this.e;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}
