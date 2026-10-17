package com.revolut.feature.wealth.impl.data.network.collections;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o7h.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\"\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u001d\u0010\u0013R$\u0010!\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b \u0010\u0013R\"\u0010#\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\"\u0010\u0013R\"\u0010%\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b$\u0010\u0013R$\u0010+\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010'\u001a\u0004\b\u0018\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/collections/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "setCurrencies", "(Ljava/util/List;)V", "currencies", "Ljo3/a;", "b", "Ljo3/a;", "g", "()Ljo3/a;", "setTotalAmount", "(Ljo3/a;)V", "totalAmount", "i", "setTotalFee", "totalFee", "d", "h", "setTotalAmountAfterFee", "totalAmountAfterFee", "e", "setAmountPerCurrency", "amountPerCurrency", "f", "setAmountPerCurrencyBeforeFee", "amountPerCurrencyBeforeFee", "setLowerLimitPerCurrency", "lowerLimitPerCurrency", "setLowerLimitTotal", "lowerLimitTotal", "Lo7h/j;", "Lo7h/j;", "()Lo7h/j;", "setFee", "(Lo7h/j;)V", "fee", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

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
    @lg.b("amountWithFeePerCurrency")
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
    private j fee;

    /* JADX INFO: renamed from: com.revolut.feature.wealth.impl.data.network.collections.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/collections/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "requestId", "", "b", "Ljava/util/List;", "currencies", "Ljo3/a;", "c", "Ljo3/a;", "amountPerCurrency", "d", "totalAmount", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0583a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("requestId")
        private final String requestId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currencies")
        @NotNull
        private final List<String> currencies;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("amountPerCurrency")
        private final jo3.a amountPerCurrency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("totalAmount")
        private final jo3.a totalAmount;

        public C0583a(String str, ArrayList currencies, jo3.a aVar, jo3.a aVar2) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.requestId = str;
            this.currencies = currencies;
            this.amountPerCurrency = aVar;
            this.totalAmount = aVar2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0583a)) {
                return false;
            }
            C0583a c0583a = (C0583a) obj2;
            return Intrinsics.f(this.requestId, c0583a.requestId) && Intrinsics.f(this.currencies, c0583a.currencies) && Intrinsics.f(this.amountPerCurrency, c0583a.amountPerCurrency) && Intrinsics.f(this.totalAmount, c0583a.totalAmount);
        }

        public final int hashCode() {
            String str = this.requestId;
            int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.currencies);
            jo3.a aVar = this.amountPerCurrency;
            int iHashCode = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo3.a aVar2 = this.totalAmount;
            return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }
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
    public final j getFee() {
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
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.currencies, aVar.currencies) && Intrinsics.f(this.totalAmount, aVar.totalAmount) && Intrinsics.f(this.totalFee, aVar.totalFee) && Intrinsics.f(this.totalAmountAfterFee, aVar.totalAmountAfterFee) && Intrinsics.f(this.amountPerCurrency, aVar.amountPerCurrency) && Intrinsics.f(this.amountPerCurrencyBeforeFee, aVar.amountPerCurrencyBeforeFee) && Intrinsics.f(this.lowerLimitPerCurrency, aVar.lowerLimitPerCurrency) && Intrinsics.f(this.lowerLimitTotal, aVar.lowerLimitTotal) && Intrinsics.f(this.fee, aVar.fee);
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
        j jVar = this.fee;
        return iJ2 + (jVar != null ? jVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getTotalFee() {
        return this.totalFee;
    }
}
