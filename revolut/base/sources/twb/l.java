package twb;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.giftcards.impl.ui.model.GiftCardPreview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f274986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f274987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f274988c;
    public final VoucherProduct d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tvb.d f274989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GiftCardPreview f274990h;

    public l() {
        this(null, 255);
    }

    public static l a(l lVar, Data data, Data data2, Data data3, VoucherProduct voucherProduct, boolean z, boolean z3, tvb.d dVar, int i) {
        if ((i & 1) != 0) {
            data = lVar.f274986a;
        }
        Data voucherProductGroupDetailsContent = data;
        if ((i & 2) != 0) {
            data2 = lVar.f274987b;
        }
        Data lastPricingPlanToUpdate = data2;
        if ((i & 4) != 0) {
            data3 = lVar.f274988c;
        }
        Data shopsCampaignOfferData = data3;
        if ((i & 8) != 0) {
            voucherProduct = lVar.d;
        }
        VoucherProduct voucherProduct2 = voucherProduct;
        if ((i & 16) != 0) {
            z = lVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z3 = lVar.f;
        }
        boolean z6 = z3;
        tvb.d dVar2 = (i & 64) != 0 ? lVar.f274989g : dVar;
        GiftCardPreview giftCardPreview = lVar.f274990h;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(voucherProductGroupDetailsContent, "voucherProductGroupDetailsContent");
        Intrinsics.checkNotNullParameter(lastPricingPlanToUpdate, "lastPricingPlanToUpdate");
        Intrinsics.checkNotNullParameter(shopsCampaignOfferData, "shopsCampaignOfferData");
        return new l(voucherProductGroupDetailsContent, lastPricingPlanToUpdate, shopsCampaignOfferData, voucherProduct2, z4, z6, dVar2, giftCardPreview);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f274986a, lVar.f274986a) && Intrinsics.f(this.f274987b, lVar.f274987b) && Intrinsics.f(this.f274988c, lVar.f274988c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && this.f == lVar.f && this.f274989g == lVar.f274989g && Intrinsics.f(this.f274990h, lVar.f274990h);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f274988c, kii.e.c(this.f274987b, this.f274986a.hashCode() * 31, 31), 31);
        VoucherProduct voucherProduct = this.d;
        int iC2 = j6.a.c(j6.a.c((iC + (voucherProduct == null ? 0 : voucherProduct.hashCode())) * 31, 31, this.e), 31, this.f);
        tvb.d dVar = this.f274989g;
        int iHashCode = (iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        GiftCardPreview giftCardPreview = this.f274990h;
        return iHashCode + (giftCardPreview != null ? giftCardPreview.hashCode() : 0);
    }

    public l(Data voucherProductGroupDetailsContent, Data lastPricingPlanToUpdate, Data shopsCampaignOfferData, VoucherProduct voucherProduct, boolean z, boolean z3, tvb.d dVar, GiftCardPreview giftCardPreview) {
        Intrinsics.checkNotNullParameter(voucherProductGroupDetailsContent, "voucherProductGroupDetailsContent");
        Intrinsics.checkNotNullParameter(lastPricingPlanToUpdate, "lastPricingPlanToUpdate");
        Intrinsics.checkNotNullParameter(shopsCampaignOfferData, "shopsCampaignOfferData");
        this.f274986a = voucherProductGroupDetailsContent;
        this.f274987b = lastPricingPlanToUpdate;
        this.f274988c = shopsCampaignOfferData;
        this.d = voucherProduct;
        this.e = z;
        this.f = z3;
        this.f274989g = dVar;
        this.f274990h = giftCardPreview;
    }

    public /* synthetic */ l(GiftCardPreview giftCardPreview, int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, false, false, null, (i & 128) != 0 ? null : giftCardPreview);
    }
}
