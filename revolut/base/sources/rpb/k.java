package rpb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f256327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f256328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f256329c;
    public final o d;

    public k(f periodType, j currentData, j jVar, o selectedSavingsAccount) {
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        Intrinsics.checkNotNullParameter(selectedSavingsAccount, "selectedSavingsAccount");
        this.f256327a = periodType;
        this.f256328b = currentData;
        this.f256329c = jVar;
        this.d = selectedSavingsAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f256327a == kVar.f256327a && Intrinsics.f(this.f256328b, kVar.f256328b) && Intrinsics.f(this.f256329c, kVar.f256329c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f256328b.hashCode() + (this.f256327a.hashCode() * 31)) * 31;
        j jVar = this.f256329c;
        return this.d.hashCode() + ((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }
}
