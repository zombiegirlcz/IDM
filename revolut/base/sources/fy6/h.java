package fy6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f138935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f138936b;

    public h(n recurringPeriod, m limit) {
        Intrinsics.checkNotNullParameter(recurringPeriod, "recurringPeriod");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f138935a = recurringPeriod;
        this.f138936b = limit;
    }

    public static h a(h hVar, n recurringPeriod, m limit, int i) {
        if ((i & 1) != 0) {
            recurringPeriod = hVar.f138935a;
        }
        if ((i & 2) != 0) {
            limit = hVar.f138936b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPeriod, "recurringPeriod");
        Intrinsics.checkNotNullParameter(limit, "limit");
        return new h(recurringPeriod, limit);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f138935a, hVar.f138935a) && Intrinsics.f(this.f138936b, hVar.f138936b);
    }

    public final int hashCode() {
        return this.f138936b.hashCode() + (this.f138935a.hashCode() * 31);
    }
}
