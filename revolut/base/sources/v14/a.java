package v14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lv14/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "f", "secondDescription", "c", "e", "paymentName", "d", "footer", "buttonTitle", "insufficientFundsButtonTitle", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "payment", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondDescription")
    @NotNull
    private final String secondDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentName")
    @NotNull
    private final String paymentName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("buttonTitle")
    @NotNull
    private final String buttonTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("insufficientFundsButtonTitle")
    @NotNull
    private final String insufficientFundsButtonTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("payment")
    @NotNull
    private final jo3.a payment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInsufficientFundsButtonTitle() {
        return this.insufficientFundsButtonTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentName() {
        return this.paymentName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.secondDescription, aVar.secondDescription) && Intrinsics.f(this.paymentName, aVar.paymentName) && Intrinsics.f(this.footer, aVar.footer) && Intrinsics.f(this.buttonTitle, aVar.buttonTitle) && Intrinsics.f(this.insufficientFundsButtonTitle, aVar.insufficientFundsButtonTitle) && Intrinsics.f(this.payment, aVar.payment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSecondDescription() {
        return this.secondDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.secondDescription), 31, this.paymentName);
        String str = this.footer;
        return this.payment.hashCode() + p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonTitle), 31, this.insufficientFundsButtonTitle);
    }
}
