package kfj;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkfj/h4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSubscriptionId", "subscriptionId", "b", "getPhoneNumberId", "phoneNumberId", "", "c", "Z", "getUseRevPointsForRecurring", "()Z", "useRevPointsForRecurring", "Ljo3/a;", "d", "Ljo3/a;", "getPaymentAmount", "()Ljo3/a;", "paymentAmount", "e", "getPocketId", "pocketId", "f", "getPocketCurrency", "pocketCurrency", "Llfj/x;", "g", "Llfj/x;", "getTerms", "()Llfj/x;", "terms", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptionId")
    @NotNull
    private final String subscriptionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("phoneNumberId")
    private final String phoneNumberId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("useRevPointsForRecurring")
    private final boolean useRevPointsForRecurring;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentAmount")
    @NotNull
    private final jo3.a paymentAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pocketCurrency")
    private final String pocketCurrency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final lfj.x terms;

    public h4(String subscriptionId, String str, boolean z, jo3.a paymentAmount, String str2, String str3, lfj.x xVar) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        this.subscriptionId = subscriptionId;
        this.phoneNumberId = str;
        this.useRevPointsForRecurring = z;
        this.paymentAmount = paymentAmount;
        this.pocketId = str2;
        this.pocketCurrency = str3;
        this.terms = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj2;
        return Intrinsics.f(this.subscriptionId, h4Var.subscriptionId) && Intrinsics.f(this.phoneNumberId, h4Var.phoneNumberId) && this.useRevPointsForRecurring == h4Var.useRevPointsForRecurring && Intrinsics.f(this.paymentAmount, h4Var.paymentAmount) && Intrinsics.f(this.pocketId, h4Var.pocketId) && Intrinsics.f(this.pocketCurrency, h4Var.pocketCurrency) && Intrinsics.f(this.terms, h4Var.terms);
    }

    public final int hashCode() {
        int iHashCode = this.subscriptionId.hashCode() * 31;
        String str = this.phoneNumberId;
        int iJ = v7.j(this.paymentAmount, j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.useRevPointsForRecurring), 31);
        String str2 = this.pocketId;
        int iHashCode2 = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pocketCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        lfj.x xVar = this.terms;
        return iHashCode3 + (xVar != null ? xVar.hashCode() : 0);
    }
}
