package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Ll8a/m0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "b", "Ljava/lang/String;", "getDescription", "description", "c", "getDecodedQrCodeId", "decodedQrCodeId", "d", "getPaymentDate", "paymentDate", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("decodedQrCodeId")
    @NotNull
    private final String decodedQrCodeId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentDate")
    private final String paymentDate;

    public m0(String str, String decodedQrCodeId, String str2, jo3.a amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(decodedQrCodeId, "decodedQrCodeId");
        this.amount = amount;
        this.description = str;
        this.decodedQrCodeId = decodedQrCodeId;
        this.paymentDate = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.amount, m0Var.amount) && Intrinsics.f(this.description, m0Var.description) && Intrinsics.f(this.decodedQrCodeId, m0Var.decodedQrCodeId) && Intrinsics.f(this.paymentDate, m0Var.paymentDate);
    }

    public final int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        String str = this.description;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.decodedQrCodeId);
        String str2 = this.paymentDate;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
