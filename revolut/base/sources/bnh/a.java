package bnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f17169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f17170b;

    public a(dj0.d totalBalance, dj0.d totalPerformance) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(totalPerformance, "totalPerformance");
        this.f17169a = totalBalance;
        this.f17170b = totalPerformance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f17169a, aVar.f17169a) && Intrinsics.f(this.f17170b, aVar.f17170b);
    }

    public final int hashCode() {
        return this.f17170b.hashCode() + (this.f17169a.hashCode() * 31);
    }
}
