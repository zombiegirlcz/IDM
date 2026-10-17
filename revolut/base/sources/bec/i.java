package bec;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f14784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f14785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PayWithAnyFundingOptions f14786c;
    public final PaymentMethod d;
    public final PaymentMethod e;
    public final u6c.t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f14787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f14788h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w6c.f f14789j;
    public final List k;

    public i(Data paymentMethodData, Set collapsedPocketGroups, PayWithAnyFundingOptions fundingOptions, PaymentMethod paymentMethod, PaymentMethod paymentMethod2, u6c.t product, Long l2, xi0.b bVar, boolean z, w6c.f payWithAnyListMode, List disclaimerItems) {
        Intrinsics.checkNotNullParameter(paymentMethodData, "paymentMethodData");
        Intrinsics.checkNotNullParameter(collapsedPocketGroups, "collapsedPocketGroups");
        Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(payWithAnyListMode, "payWithAnyListMode");
        Intrinsics.checkNotNullParameter(disclaimerItems, "disclaimerItems");
        this.f14784a = paymentMethodData;
        this.f14785b = collapsedPocketGroups;
        this.f14786c = fundingOptions;
        this.d = paymentMethod;
        this.e = paymentMethod2;
        this.f = product;
        this.f14787g = l2;
        this.f14788h = bVar;
        this.i = z;
        this.f14789j = payWithAnyListMode;
        this.k = disclaimerItems;
    }

    public static i a(i iVar, Data data, LinkedHashSet linkedHashSet, PaymentMethod paymentMethod, List list, int i) {
        Data paymentMethodData = (i & 1) != 0 ? iVar.f14784a : data;
        Set collapsedPocketGroups = (i & 2) != 0 ? iVar.f14785b : linkedHashSet;
        PayWithAnyFundingOptions fundingOptions = iVar.f14786c;
        PaymentMethod paymentMethod2 = iVar.d;
        PaymentMethod paymentMethod3 = (i & 16) != 0 ? iVar.e : paymentMethod;
        u6c.t product = iVar.f;
        Long l2 = iVar.f14787g;
        xi0.b bVar = iVar.f14788h;
        boolean z = (i & 256) != 0 ? iVar.i : true;
        iVar.getClass();
        w6c.f payWithAnyListMode = iVar.f14789j;
        List disclaimerItems = (i & 2048) != 0 ? iVar.k : list;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(paymentMethodData, "paymentMethodData");
        Intrinsics.checkNotNullParameter(collapsedPocketGroups, "collapsedPocketGroups");
        Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(payWithAnyListMode, "payWithAnyListMode");
        Intrinsics.checkNotNullParameter(disclaimerItems, "disclaimerItems");
        return new i(paymentMethodData, collapsedPocketGroups, fundingOptions, paymentMethod2, paymentMethod3, product, l2, bVar, z, payWithAnyListMode, disclaimerItems);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f14784a, iVar.f14784a) && Intrinsics.f(this.f14785b, iVar.f14785b) && Intrinsics.f(this.f14786c, iVar.f14786c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f && Intrinsics.f(this.f14787g, iVar.f14787g) && Intrinsics.f(this.f14788h, iVar.f14788h) && this.i == iVar.i && this.f14789j == iVar.f14789j && Intrinsics.f(this.k, iVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f14786c.hashCode() + p.a.f(this.f14784a.hashCode() * 31, 31, this.f14785b)) * 31;
        PaymentMethod paymentMethod = this.d;
        int iHashCode2 = (iHashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        PaymentMethod paymentMethod2 = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (paymentMethod2 == null ? 0 : paymentMethod2.hashCode())) * 31)) * 31;
        Long l2 = this.f14787g;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        xi0.b bVar = this.f14788h;
        return this.k.hashCode() + ((this.f14789j.hashCode() + j6.a.c(j6.a.c((iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.i), 31, false)) * 31);
    }
}
