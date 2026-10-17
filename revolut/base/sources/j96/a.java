package j96;

import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DepositAmount f172291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f172292c;

    public a(DepositAmount depositAmount, String companyName, String str) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        this.f172290a = companyName;
        this.f172291b = depositAmount;
        this.f172292c = str;
    }

    public static a a(a aVar, String companyName, DepositAmount depositAmount, String str, int i) {
        if ((i & 1) != 0) {
            companyName = aVar.f172290a;
        }
        if ((i & 2) != 0) {
            depositAmount = aVar.f172291b;
        }
        if ((i & 4) != 0) {
            str = aVar.f172292c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        return new a(depositAmount, companyName, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f172290a, aVar.f172290a) && Intrinsics.f(this.f172291b, aVar.f172291b) && Intrinsics.f(this.f172292c, aVar.f172292c);
    }

    public final int hashCode() {
        int iHashCode = (this.f172291b.hashCode() + (this.f172290a.hashCode() * 31)) * 31;
        String str = this.f172292c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
