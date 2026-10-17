package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkfj/b2;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/z0;", "a", "Lkfj/z0;", "c", "()Lkfj/z0;", "phoneNumberFee", "b", "featuredPhoneNumberFee", "paymentAmount", "Lkfj/b1;", "d", "Lkfj/b1;", "()Lkfj/b1;", "updatedInvoice", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("phoneNumberFee")
    @NotNull
    private final z0 phoneNumberFee;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("featuredPhoneNumberFee")
    private final z0 featuredPhoneNumberFee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAmount")
    @NotNull
    private final z0 paymentAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("updatedInvoice")
    @NotNull
    private final b1 updatedInvoice;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z0 getFeaturedPhoneNumberFee() {
        return this.featuredPhoneNumberFee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final z0 getPaymentAmount() {
        return this.paymentAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final z0 getPhoneNumberFee() {
        return this.phoneNumberFee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b1 getUpdatedInvoice() {
        return this.updatedInvoice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.phoneNumberFee, b2Var.phoneNumberFee) && Intrinsics.f(this.featuredPhoneNumberFee, b2Var.featuredPhoneNumberFee) && Intrinsics.f(this.paymentAmount, b2Var.paymentAmount) && Intrinsics.f(this.updatedInvoice, b2Var.updatedInvoice);
    }

    public final int hashCode() {
        int iHashCode = this.phoneNumberFee.hashCode() * 31;
        z0 z0Var = this.featuredPhoneNumberFee;
        return this.updatedInvoice.hashCode() + ((this.paymentAmount.hashCode() + ((iHashCode + (z0Var == null ? 0 : z0Var.hashCode())) * 31)) * 31);
    }
}
