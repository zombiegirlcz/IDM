package e0h;

import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f121715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f121717c;
    public final Instant d;

    public a(List transactions, int i, Boolean bool, Instant instant) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f121715a = transactions;
        this.f121716b = i;
        this.f121717c = bool;
        this.d = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f121715a, aVar.f121715a) && this.f121716b == aVar.f121716b && Intrinsics.f(this.f121717c, aVar.f121717c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f121716b, this.f121715a.hashCode() * 31, 31);
        Boolean bool = this.f121717c;
        int iHashCode = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        Instant instant = this.d;
        return iHashCode + (instant != null ? instant.hashCode() : 0);
    }
}
