package l8a;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001b"}, d2 = {"Ll8a/u0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "paymentMethodDetailsType", "Ll8a/q0;", "b", "Ll8a/q0;", "()Ll8a/q0;", "creditor", "Ll8a/r0;", "c", "Ll8a/r0;", "()Ll8a/r0;", "debtor", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "additionalInformation", "e", "documentDescription", "documentNumber", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethodDetailsType")
    private final String paymentMethodDetailsType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditor")
    private final q0 creditor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtor")
    private final r0 debtor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("additionalInformation")
    private final List<String> additionalInformation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("documentDescription")
    private final String documentDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("documentNumber")
    private final String documentNumber;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalInformation() {
        return this.additionalInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q0 getCreditor() {
        return this.creditor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r0 getDebtor() {
        return this.debtor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.paymentMethodDetailsType, u0Var.paymentMethodDetailsType) && Intrinsics.f(this.creditor, u0Var.creditor) && Intrinsics.f(this.debtor, u0Var.debtor) && Intrinsics.f(this.additionalInformation, u0Var.additionalInformation) && Intrinsics.f(this.documentDescription, u0Var.documentDescription) && Intrinsics.f(this.documentNumber, u0Var.documentNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPaymentMethodDetailsType() {
        return this.paymentMethodDetailsType;
    }

    public final int hashCode() {
        String str = this.paymentMethodDetailsType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        q0 q0Var = this.creditor;
        int iHashCode2 = (iHashCode + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        r0 r0Var = this.debtor;
        int iHashCode3 = (iHashCode2 + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
        List<String> list = this.additionalInformation;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.documentDescription;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentNumber;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
