package p4c;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f232880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f232881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f232882c;
    public final Data d;
    public final d3c.x e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f232883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f232884h;

    public k(long j2, Data fiscalProfileDetails, Data acquiringCpPricing, Data product, d3c.x xVar, Set expandedTechSpecItemIds, Data cardReaderPaymentFeatureStatus, Data recommendedProducts) {
        Intrinsics.checkNotNullParameter(fiscalProfileDetails, "fiscalProfileDetails");
        Intrinsics.checkNotNullParameter(acquiringCpPricing, "acquiringCpPricing");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(expandedTechSpecItemIds, "expandedTechSpecItemIds");
        Intrinsics.checkNotNullParameter(cardReaderPaymentFeatureStatus, "cardReaderPaymentFeatureStatus");
        Intrinsics.checkNotNullParameter(recommendedProducts, "recommendedProducts");
        this.f232880a = j2;
        this.f232881b = fiscalProfileDetails;
        this.f232882c = acquiringCpPricing;
        this.d = product;
        this.e = xVar;
        this.f = expandedTechSpecItemIds;
        this.f232883g = cardReaderPaymentFeatureStatus;
        this.f232884h = recommendedProducts;
    }

    public static k a(k kVar, long j2, Data data, Data data2, Data data3, d3c.x xVar, LinkedHashSet linkedHashSet, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            j2 = kVar.f232880a;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            data = kVar.f232881b;
        }
        Data fiscalProfileDetails = data;
        if ((i & 4) != 0) {
            data2 = kVar.f232882c;
        }
        Data acquiringCpPricing = data2;
        if ((i & 8) != 0) {
            data3 = kVar.d;
        }
        Data product = data3;
        d3c.x xVar2 = (i & 16) != 0 ? kVar.e : xVar;
        Set expandedTechSpecItemIds = (i & 32) != 0 ? kVar.f : linkedHashSet;
        Data cardReaderPaymentFeatureStatus = (i & 64) != 0 ? kVar.f232883g : data4;
        Data recommendedProducts = (i & 128) != 0 ? kVar.f232884h : data5;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(fiscalProfileDetails, "fiscalProfileDetails");
        Intrinsics.checkNotNullParameter(acquiringCpPricing, "acquiringCpPricing");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(expandedTechSpecItemIds, "expandedTechSpecItemIds");
        Intrinsics.checkNotNullParameter(cardReaderPaymentFeatureStatus, "cardReaderPaymentFeatureStatus");
        Intrinsics.checkNotNullParameter(recommendedProducts, "recommendedProducts");
        return new k(j3, fiscalProfileDetails, acquiringCpPricing, product, xVar2, expandedTechSpecItemIds, cardReaderPaymentFeatureStatus, recommendedProducts);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f232880a == kVar.f232880a && Intrinsics.f(this.f232881b, kVar.f232881b) && Intrinsics.f(this.f232882c, kVar.f232882c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f232883g, kVar.f232883g) && Intrinsics.f(this.f232884h, kVar.f232884h);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, kii.e.c(this.f232882c, kii.e.c(this.f232881b, Long.hashCode(this.f232880a) * 31, 31), 31), 31);
        d3c.x xVar = this.e;
        return this.f232884h.hashCode() + kii.e.c(this.f232883g, p.a.f((iC + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.f), 31);
    }
}
