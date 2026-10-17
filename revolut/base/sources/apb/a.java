package apb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;
import ncd.j;
import xme.e;
import xob.m;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f8133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f8134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f8135c;
    public final String d;
    public final e e;

    public a(j displayRate, SavingsProductData productData, m nextInterestPayment, String str, e taxExemptionAvailability) {
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        Intrinsics.checkNotNullParameter(productData, "productData");
        Intrinsics.checkNotNullParameter(nextInterestPayment, "nextInterestPayment");
        Intrinsics.checkNotNullParameter(taxExemptionAvailability, "taxExemptionAvailability");
        this.f8133a = displayRate;
        this.f8134b = productData;
        this.f8135c = nextInterestPayment;
        this.d = str;
        this.e = taxExemptionAvailability;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f8133a, aVar.f8133a) && Intrinsics.f(this.f8134b, aVar.f8134b) && Intrinsics.f(this.f8135c, aVar.f8135c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f8135c.hashCode() + ((this.f8134b.hashCode() + (this.f8133a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
