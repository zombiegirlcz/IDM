package n71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212993c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f212994g;

    public c(String bankName, String beneficiaryName, String bankCode, String branchCode, String accountNumber, String companyRegisteredNumber, String transferTime) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(branchCode, "branchCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(companyRegisteredNumber, "companyRegisteredNumber");
        Intrinsics.checkNotNullParameter(transferTime, "transferTime");
        this.f212991a = bankName;
        this.f212992b = beneficiaryName;
        this.f212993c = bankCode;
        this.d = branchCode;
        this.e = accountNumber;
        this.f = companyRegisteredNumber;
        this.f212994g = transferTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f212991a, cVar.f212991a) && Intrinsics.f(this.f212992b, cVar.f212992b) && Intrinsics.f(this.f212993c, cVar.f212993c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f212994g, cVar.f212994g);
    }

    public final int hashCode() {
        return this.f212994g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f212991a.hashCode() * 31, 31, this.f212992b), 31, this.f212993c), 31, this.d), 31, this.e), 31, this.f);
    }
}
