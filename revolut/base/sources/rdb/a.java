package rdb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f253392b;

    public a(String reservationPageId, int i) {
        Intrinsics.checkNotNullParameter(reservationPageId, "reservationPageId");
        this.f253391a = reservationPageId;
        this.f253392b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f253391a, aVar.f253391a) && this.f253392b == aVar.f253392b;
    }

    public final int hashCode() {
        return j6.a.b(this.f253392b, this.f253391a.hashCode() * 31, 31);
    }
}
