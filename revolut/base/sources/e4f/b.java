package e4f;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f122541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f122542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f122543c;
    public final boolean d;

    public b(ArrayList transactions, Long l2, Long l3, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f122541a = transactions;
        this.f122542b = l2;
        this.f122543c = l3;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f122541a.equals(bVar.f122541a) && Intrinsics.f(this.f122542b, bVar.f122542b) && Intrinsics.f(this.f122543c, bVar.f122543c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f122541a.hashCode() * 31;
        Long l2 = this.f122542b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f122543c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31);
    }
}
