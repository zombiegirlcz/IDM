package efl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f125366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125368c;

    public e(dj0.d amount, String str, String str2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f125366a = amount;
        this.f125367b = str;
        this.f125368c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f125366a, eVar.f125366a) && Intrinsics.f(this.f125367b, eVar.f125367b) && Intrinsics.f(this.f125368c, eVar.f125368c);
    }

    public final int hashCode() {
        int iHashCode = this.f125366a.hashCode() * 31;
        String str = this.f125367b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f125368c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
