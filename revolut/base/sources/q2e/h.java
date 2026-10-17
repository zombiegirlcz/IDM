package q2e;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.models.RevPoints;
import ip0.v7;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t3e.b;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f241584c;
    public final Data d;
    public final RevPoints e;
    public final VoucherProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f241585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f241586h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f241587j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f241588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b.a f241589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tvb.c f241590n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Instant f241591p;

    public h(List pagerItems, String selectedPagerItemId, Data megaOffer, Data revPointsPill, RevPoints revPointsBalance, VoucherProduct voucherProduct, Data voucherProductGroupDetails, boolean z, boolean z3, boolean z4, boolean z6, Data campaigns, b.a termsConfig, tvb.c termsRegion, boolean z11, Instant instant) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        Intrinsics.checkNotNullParameter(revPointsBalance, "revPointsBalance");
        Intrinsics.checkNotNullParameter(voucherProductGroupDetails, "voucherProductGroupDetails");
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        Intrinsics.checkNotNullParameter(termsConfig, "termsConfig");
        Intrinsics.checkNotNullParameter(termsRegion, "termsRegion");
        this.f241582a = pagerItems;
        this.f241583b = selectedPagerItemId;
        this.f241584c = megaOffer;
        this.d = revPointsPill;
        this.e = revPointsBalance;
        this.f = voucherProduct;
        this.f241585g = voucherProductGroupDetails;
        this.f241586h = z;
        this.i = z3;
        this.f241587j = z4;
        this.k = z6;
        this.f241588l = campaigns;
        this.f241589m = termsConfig;
        this.f241590n = termsRegion;
        this.o = z11;
        this.f241591p = instant;
    }

    public static h a(h hVar, aim.e eVar, String str, Data data, Data data2, RevPoints revPoints, VoucherProduct voucherProduct, Data data3, boolean z, boolean z3, boolean z4, boolean z6, Data data4, b.a aVar, tvb.c cVar, Instant instant, int i) {
        List pagerItems = (i & 1) != 0 ? hVar.f241582a : eVar;
        String selectedPagerItemId = (i & 2) != 0 ? hVar.f241583b : str;
        Data megaOffer = (i & 4) != 0 ? hVar.f241584c : data;
        Data revPointsPill = (i & 8) != 0 ? hVar.d : data2;
        RevPoints revPointsBalance = (i & 16) != 0 ? hVar.e : revPoints;
        VoucherProduct voucherProduct2 = (i & 32) != 0 ? hVar.f : voucherProduct;
        Data voucherProductGroupDetails = (i & 64) != 0 ? hVar.f241585g : data3;
        boolean z11 = (i & 128) != 0 ? hVar.f241586h : z;
        boolean z12 = (i & 256) != 0 ? hVar.i : z3;
        boolean z29 = (i & 512) != 0 ? hVar.f241587j : z4;
        boolean z31 = (i & 1024) != 0 ? hVar.k : z6;
        Data campaigns = (i & 2048) != 0 ? hVar.f241588l : data4;
        b.a termsConfig = (i & 4096) != 0 ? hVar.f241589m : aVar;
        tvb.c termsRegion = (i & 8192) != 0 ? hVar.f241590n : cVar;
        VoucherProduct voucherProduct3 = voucherProduct2;
        boolean z41 = (i & 16384) != 0 ? hVar.o : true;
        Instant instant2 = (i & 32768) != 0 ? hVar.f241591p : instant;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        Intrinsics.checkNotNullParameter(revPointsBalance, "revPointsBalance");
        Intrinsics.checkNotNullParameter(voucherProductGroupDetails, "voucherProductGroupDetails");
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        Intrinsics.checkNotNullParameter(termsConfig, "termsConfig");
        Intrinsics.checkNotNullParameter(termsRegion, "termsRegion");
        return new h(pagerItems, selectedPagerItemId, megaOffer, revPointsPill, revPointsBalance, voucherProduct3, voucherProductGroupDetails, z11, z12, z29, z31, campaigns, termsConfig, termsRegion, z41, instant2);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f241582a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f241582a, hVar.f241582a) && Intrinsics.f(this.f241583b, hVar.f241583b) && Intrinsics.f(this.f241584c, hVar.f241584c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f241585g, hVar.f241585g) && this.f241586h == hVar.f241586h && this.i == hVar.i && this.f241587j == hVar.f241587j && this.k == hVar.k && Intrinsics.f(this.f241588l, hVar.f241588l) && Intrinsics.f(this.f241589m, hVar.f241589m) && this.f241590n == hVar.f241590n && this.o == hVar.o && Intrinsics.f(this.f241591p, hVar.f241591p);
    }

    public final int hashCode() {
        int iC = v7.c(kii.e.c(this.d, kii.e.c(this.f241584c, p.a.c(this.f241582a.hashCode() * 31, 31, this.f241583b), 31), 31), 31, this.e.f83960a);
        VoucherProduct voucherProduct = this.f;
        int iC2 = j6.a.c((this.f241590n.hashCode() + ((this.f241589m.hashCode() + kii.e.c(this.f241588l, j6.a.c(j6.a.c(j6.a.c(j6.a.c(kii.e.c(this.f241585g, (iC + (voucherProduct == null ? 0 : voucherProduct.hashCode())) * 31, 31), 31, this.f241586h), 31, this.i), 31, this.f241587j), 31, this.k), 31)) * 31)) * 31, 31, this.o);
        Instant instant = this.f241591p;
        return iC2 + (instant != null ? instant.hashCode() : 0);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f241583b;
    }
}
