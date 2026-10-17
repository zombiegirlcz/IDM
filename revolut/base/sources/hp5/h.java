package hp5;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f154474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f154475c;
    public final String d;

    public h(dj0.d inputMoney, String addressId, String str, xi0.b senderCurrency) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(inputMoney, "inputMoney");
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        this.f154473a = addressId;
        this.f154474b = inputMoney;
        this.f154475c = senderCurrency;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f154473a, hVar.f154473a) && Intrinsics.f(this.f154474b, hVar.f154474b) && Intrinsics.f(this.f154475c, hVar.f154475c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f154475c, v7.c(this.f154473a.hashCode() * 31, 31, this.f154474b), 31);
        String str = this.d;
        return iJ + (str == null ? 0 : str.hashCode());
    }
}
