package gtd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f146575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146576c;

    public a(int i, dj0.d totalSpent, String tripId) {
        Intrinsics.checkNotNullParameter(tripId, "tripId");
        Intrinsics.checkNotNullParameter(totalSpent, "totalSpent");
        this.f146574a = tripId;
        this.f146575b = totalSpent;
        this.f146576c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f146574a, aVar.f146574a) && Intrinsics.f(this.f146575b, aVar.f146575b) && this.f146576c == aVar.f146576c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f146576c) + v7.c(this.f146574a.hashCode() * 31, 31, this.f146575b);
    }
}
