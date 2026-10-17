package hve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155820b;

    public a(String accountDetailsId, String str) {
        Intrinsics.checkNotNullParameter(accountDetailsId, "accountDetailsId");
        this.f155819a = accountDetailsId;
        this.f155820b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f155819a, aVar.f155819a) && Intrinsics.f(this.f155820b, aVar.f155820b);
    }

    public final int hashCode() {
        int iHashCode = this.f155819a.hashCode() * 31;
        String str = this.f155820b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
