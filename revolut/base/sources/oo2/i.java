package oo2;

import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2.a f226997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wn2.d f226998c;
    public final Data d;
    public final BankInformation e;
    public final Boolean f;

    public i(String requestId, mn2.a serviceType, wn2.d switchPreference, Data payments, BankInformation fromBank, Boolean bool) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(fromBank, "fromBank");
        this.f226996a = requestId;
        this.f226997b = serviceType;
        this.f226998c = switchPreference;
        this.d = payments;
        this.e = fromBank;
        this.f = bool;
    }

    public static i a(i iVar, Data data, Boolean bool, int i) {
        String requestId = iVar.f226996a;
        mn2.a serviceType = iVar.f226997b;
        wn2.d switchPreference = iVar.f226998c;
        if ((i & 8) != 0) {
            data = iVar.d;
        }
        Data payments = data;
        BankInformation fromBank = iVar.e;
        if ((i & 32) != 0) {
            bool = iVar.f;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(fromBank, "fromBank");
        return new i(requestId, serviceType, switchPreference, payments, fromBank, bool);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f226996a, iVar.f226996a) && this.f226997b == iVar.f226997b && this.f226998c == iVar.f226998c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + kii.e.c(this.d, (this.f226998c.hashCode() + ((this.f226997b.hashCode() + (this.f226996a.hashCode() * 31)) * 31)) * 31, 31)) * 31;
        Boolean bool = this.f;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
