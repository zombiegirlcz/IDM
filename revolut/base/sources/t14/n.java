package t14;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0004¨\u0006!"}, d2 = {"Lt14/n;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "getCreditsSelected", "()Ljava/util/List;", "creditsSelected", "", "b", "Ljava/lang/Long;", "getAmountRequested", "()Ljava/lang/Long;", "amountRequested", "c", "getDurationRequested", "durationRequested", "", "d", "Ljava/lang/Integer;", "getRepaymentDayRequested", "()Ljava/lang/Integer;", "repaymentDayRequested", "e", "Ljava/lang/String;", "getRepaymentType", "repaymentType", "f", "getInsuranceOptionRequested", "insuranceOptionRequested", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditsSelected")
    @NotNull
    private final List<String> creditsSelected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountRequested")
    private final Long amountRequested;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("durationRequested")
    private final Long durationRequested;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("repaymentDayRequested")
    private final Integer repaymentDayRequested;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("repaymentType")
    private final String repaymentType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("insuranceOptionRequested")
    private final String insuranceOptionRequested;

    public n(List creditsSelected, Long l2, Long l3, Integer num, String str, String str2) {
        Intrinsics.checkNotNullParameter(creditsSelected, "creditsSelected");
        this.creditsSelected = creditsSelected;
        this.amountRequested = l2;
        this.durationRequested = l3;
        this.repaymentDayRequested = num;
        this.repaymentType = str;
        this.insuranceOptionRequested = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.creditsSelected, nVar.creditsSelected) && Intrinsics.f(this.amountRequested, nVar.amountRequested) && Intrinsics.f(this.durationRequested, nVar.durationRequested) && Intrinsics.f(this.repaymentDayRequested, nVar.repaymentDayRequested) && Intrinsics.f(this.repaymentType, nVar.repaymentType) && Intrinsics.f(this.insuranceOptionRequested, nVar.insuranceOptionRequested);
    }

    public final int hashCode() {
        int iHashCode = this.creditsSelected.hashCode() * 31;
        Long l2 = this.amountRequested;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.durationRequested;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.repaymentDayRequested;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.repaymentType;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.insuranceOptionRequested;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }
}
