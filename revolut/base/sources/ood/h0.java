package ood;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f227045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final amd.i f227046b;

    public h0(i tripData, amd.i filter) {
        Intrinsics.checkNotNullParameter(tripData, "tripData");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f227045a = tripData;
        this.f227046b = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f227045a, h0Var.f227045a) && this.f227046b == h0Var.f227046b;
    }

    public final int hashCode() {
        return this.f227046b.hashCode() + (this.f227045a.hashCode() * 31);
    }
}
