package bq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddressHostingInfo f17704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoAddress f17705c;
    public final String d;

    public e0(String counterpartyId, CryptoAddressHostingInfo hostingInfo, CryptoAddress cryptoAddress, String str) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(hostingInfo, "hostingInfo");
        this.f17703a = counterpartyId;
        this.f17704b = hostingInfo;
        this.f17705c = cryptoAddress;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f17703a, e0Var.f17703a) && Intrinsics.f(this.f17704b, e0Var.f17704b) && Intrinsics.f(this.f17705c, e0Var.f17705c) && Intrinsics.f(this.d, e0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f17704b.hashCode() + (this.f17703a.hashCode() * 31)) * 31;
        CryptoAddress cryptoAddress = this.f17705c;
        int iHashCode2 = (iHashCode + (cryptoAddress == null ? 0 : cryptoAddress.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
