package ir9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168034b;

    public h(String groupId, String billId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(billId, "billId");
        this.f168033a = groupId;
        this.f168034b = billId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f168033a, hVar.f168033a) && Intrinsics.f(this.f168034b, hVar.f168034b);
    }

    public final int hashCode() {
        return this.f168034b.hashCode() + (this.f168033a.hashCode() * 31);
    }
}
