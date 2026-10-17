package cs8;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f108453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108454c;
    public final String d;

    public a(d amount, String walletId, String str, String str2) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f108452a = walletId;
        this.f108453b = amount;
        this.f108454c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f108452a, aVar.f108452a) && Intrinsics.f(this.f108453b, aVar.f108453b) && Intrinsics.f(this.f108454c, aVar.f108454c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f108452a.hashCode() * 31, 31, this.f108453b);
        String str = this.f108454c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
