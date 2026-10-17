package e7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001a\u0010)\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Le7c/o0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getOrderToken", "orderToken", "", "b", "J", "getAmount", "()J", "amount", "c", "getCurrency", "currency", "d", "getProduct", "product", "e", "getCheckedAt", "checkedAt", "", "f", "Ljava/util/List;", "getChecks", "()Ljava/util/List;", "checks", "g", "getPocketId", "pocketId", "h", "getSavePaymentFor", "savePaymentFor", "", "i", "Z", "getBnpl", "()Z", "bnpl", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderToken")
    private final String orderToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("product")
    @NotNull
    private final String product;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("checkedAt")
    private final String checkedAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("checks")
    private final List<String> checks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("saveFor")
    private final String savePaymentFor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("bnpl")
    private final boolean bnpl;

    public o0(String str, long j2, String currency, String product, String str2, List list, String str3, String str4, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(product, "product");
        this.orderToken = str;
        this.amount = j2;
        this.currency = currency;
        this.product = product;
        this.checkedAt = str2;
        this.checks = list;
        this.pocketId = str3;
        this.savePaymentFor = str4;
        this.bnpl = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.orderToken, o0Var.orderToken) && this.amount == o0Var.amount && Intrinsics.f(this.currency, o0Var.currency) && Intrinsics.f(this.product, o0Var.product) && Intrinsics.f(this.checkedAt, o0Var.checkedAt) && Intrinsics.f(this.checks, o0Var.checks) && Intrinsics.f(this.pocketId, o0Var.pocketId) && Intrinsics.f(this.savePaymentFor, o0Var.savePaymentFor) && this.bnpl == o0Var.bnpl;
    }

    public final int hashCode() {
        String str = this.orderToken;
        int iC = p.a.c(p.a.c(a0.d.c((str == null ? 0 : str.hashCode()) * 31, 31, this.amount), 31, this.currency), 31, this.product);
        String str2 = this.checkedAt;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.checks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.pocketId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.savePaymentFor;
        return Boolean.hashCode(this.bnpl) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
