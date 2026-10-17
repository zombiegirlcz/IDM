package ac5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lac5/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "mandateId", "b", "accountNumberFormat", "c", "accountNumber", "bankName", "", "e", "Z", "()Z", "selected", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mandateId")
    @NotNull
    private final String mandateId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountNumberFormat")
    @NotNull
    private final String accountNumberFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountNumber")
    @NotNull
    private final String accountNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bankName")
    @NotNull
    private final String bankName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("selected")
    private final boolean selected;

    public e(String mandateId, String accountNumberFormat, String accountNumber, String bankName, boolean z) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(accountNumberFormat, "accountNumberFormat");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        this.mandateId = mandateId;
        this.accountNumberFormat = accountNumberFormat;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.selected = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccountNumberFormat() {
        return this.accountNumberFormat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMandateId() {
        return this.mandateId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.mandateId, eVar.mandateId) && Intrinsics.f(this.accountNumberFormat, eVar.accountNumberFormat) && Intrinsics.f(this.accountNumber, eVar.accountNumber) && Intrinsics.f(this.bankName, eVar.bankName) && this.selected == eVar.selected;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.selected) + p.a.c(p.a.c(p.a.c(this.mandateId.hashCode() * 31, 31, this.accountNumberFormat), 31, this.accountNumber), 31, this.bankName);
    }
}
