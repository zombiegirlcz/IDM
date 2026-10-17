package y6h;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\"\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u001d\u0010\u0013R$\u0010!\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b \u0010\u0013R\"\u0010#\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\"\u0010\u0013R\"\u0010%\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b$\u0010\u0013R$\u0010+\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010'\u001a\u0004\b\u0018\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Ly6h/j;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "setCurrencies", "(Ljava/util/List;)V", "currencies", "Ljo3/a;", "b", "Ljo3/a;", "g", "()Ljo3/a;", "setTotalAmount", "(Ljo3/a;)V", "totalAmount", "i", "setTotalFee", "totalFee", "d", "h", "setTotalAmountAfterFee", "totalAmountAfterFee", "e", "setAmountPerCurrency", "amountPerCurrency", "f", "setAmountPerCurrencyBeforeFee", "amountPerCurrencyBeforeFee", "setLowerLimitPerCurrency", "lowerLimitPerCurrency", "setLowerLimitTotal", "lowerLimitTotal", "Ly6h/i;", "Ly6h/i;", "()Ly6h/i;", "setFee", "(Ly6h/i;)V", "fee", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencies")
    @NotNull
    private List<String> currencies;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAmount")
    @NotNull
    private jo3.a totalAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalFee")
    @NotNull
    private jo3.a totalFee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalAmountAfterFee")
    @NotNull
    private jo3.a totalAmountAfterFee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amountPerCurrency")
    @NotNull
    private jo3.a amountPerCurrency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amountPerCurrencyBeforeFee")
    private jo3.a amountPerCurrencyBeforeFee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("lowerLimitPerCurrency")
    @NotNull
    private jo3.a lowerLimitPerCurrency;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("lowerLimitTotal")
    @NotNull
    private jo3.a lowerLimitTotal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("fee")
    private i fee;

    public j(ArrayList currencies, jo3.a totalAmount, jo3.a totalFee, jo3.a totalAmountAfterFee, jo3.a amountPerCurrency, jo3.a aVar, jo3.a lowerLimitPerCurrency, jo3.a lowerLimitTotal, i iVar) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(totalFee, "totalFee");
        Intrinsics.checkNotNullParameter(totalAmountAfterFee, "totalAmountAfterFee");
        Intrinsics.checkNotNullParameter(amountPerCurrency, "amountPerCurrency");
        Intrinsics.checkNotNullParameter(lowerLimitPerCurrency, "lowerLimitPerCurrency");
        Intrinsics.checkNotNullParameter(lowerLimitTotal, "lowerLimitTotal");
        this.currencies = currencies;
        this.totalAmount = totalAmount;
        this.totalFee = totalFee;
        this.totalAmountAfterFee = totalAmountAfterFee;
        this.amountPerCurrency = amountPerCurrency;
        this.amountPerCurrencyBeforeFee = aVar;
        this.lowerLimitPerCurrency = lowerLimitPerCurrency;
        this.lowerLimitTotal = lowerLimitTotal;
        this.fee = iVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmountPerCurrency() {
        return this.amountPerCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getAmountPerCurrencyBeforeFee() {
        return this.amountPerCurrencyBeforeFee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getCurrencies() {
        return this.currencies;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getLowerLimitPerCurrency() {
        return this.lowerLimitPerCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.currencies, jVar.currencies) && Intrinsics.f(this.totalAmount, jVar.totalAmount) && Intrinsics.f(this.totalFee, jVar.totalFee) && Intrinsics.f(this.totalAmountAfterFee, jVar.totalAmountAfterFee) && Intrinsics.f(this.amountPerCurrency, jVar.amountPerCurrency) && Intrinsics.f(this.amountPerCurrencyBeforeFee, jVar.amountPerCurrencyBeforeFee) && Intrinsics.f(this.lowerLimitPerCurrency, jVar.lowerLimitPerCurrency) && Intrinsics.f(this.lowerLimitTotal, jVar.lowerLimitTotal) && Intrinsics.f(this.fee, jVar.fee);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getLowerLimitTotal() {
        return this.lowerLimitTotal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getTotalAmountAfterFee() {
        return this.totalAmountAfterFee;
    }

    public final int hashCode() {
        int iJ = v7.j(this.amountPerCurrency, v7.j(this.totalAmountAfterFee, v7.j(this.totalFee, v7.j(this.totalAmount, this.currencies.hashCode() * 31, 31), 31), 31), 31);
        jo3.a aVar = this.amountPerCurrencyBeforeFee;
        int iJ2 = v7.j(this.lowerLimitTotal, v7.j(this.lowerLimitPerCurrency, (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31);
        i iVar = this.fee;
        return iJ2 + (iVar != null ? iVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getTotalFee() {
        return this.totalFee;
    }
}
