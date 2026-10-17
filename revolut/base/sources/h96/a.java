package h96;

import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DepositAmount f150177c;

    public a(DepositAmount depositAmount, String str, String companyName) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        this.f150175a = str;
        this.f150176b = companyName;
        this.f150177c = depositAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150175a, aVar.f150175a) && Intrinsics.f(this.f150176b, aVar.f150176b) && Intrinsics.f(this.f150177c, aVar.f150177c);
    }

    public final int hashCode() {
        String str = this.f150175a;
        return this.f150177c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f150176b);
    }
}
