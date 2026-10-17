package jcj;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f172825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f172826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoAddress f172827c;

    public g(a3 transactionToReturn, Data feeData, CryptoAddress selectedAddress) {
        Intrinsics.checkNotNullParameter(transactionToReturn, "transactionToReturn");
        Intrinsics.checkNotNullParameter(feeData, "feeData");
        Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
        this.f172825a = transactionToReturn;
        this.f172826b = feeData;
        this.f172827c = selectedAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f172825a, gVar.f172825a) && Intrinsics.f(this.f172826b, gVar.f172826b) && Intrinsics.f(this.f172827c, gVar.f172827c);
    }

    public final int hashCode() {
        return this.f172827c.hashCode() + kii.e.c(this.f172826b, this.f172825a.hashCode() * 31, 31);
    }
}
