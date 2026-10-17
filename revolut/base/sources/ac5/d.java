package ac5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lac5/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAccountNumberFormat", "accountNumberFormat", "b", "getAccountNumber", "accountNumber", "c", "getBankIdentifier", "bankIdentifier", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountNumberFormat")
    @NotNull
    private final String accountNumberFormat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountNumber")
    @NotNull
    private final String accountNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bankIdentifier")
    private final String bankIdentifier;

    public d(String accountNumberFormat, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumberFormat, "accountNumberFormat");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumberFormat = accountNumberFormat;
        this.accountNumber = accountNumber;
        this.bankIdentifier = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.accountNumberFormat, dVar.accountNumberFormat) && Intrinsics.f(this.accountNumber, dVar.accountNumber) && Intrinsics.f(this.bankIdentifier, dVar.bankIdentifier);
    }

    public final int hashCode() {
        int iC = p.a.c(this.accountNumberFormat.hashCode() * 31, 31, this.accountNumber);
        String str = this.bankIdentifier;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
