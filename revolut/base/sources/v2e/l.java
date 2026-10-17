package v2e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.models.RevPoints;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f285714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VoucherProduct f285715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f285716c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f285717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f285718h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f285719j;
    public final Clause k;

    public l() {
        this(null, 2047);
    }

    public static l a(l lVar, u uVar, VoucherProduct voucherProduct, RevPoints revPoints, boolean z, boolean z3, boolean z4, boolean z6, Data data, Data data2, Data data3, Clause clause, int i) {
        if ((i & 1) != 0) {
            uVar = lVar.f285714a;
        }
        u uVar2 = uVar;
        if ((i & 2) != 0) {
            voucherProduct = lVar.f285715b;
        }
        VoucherProduct voucherProduct2 = voucherProduct;
        if ((i & 4) != 0) {
            revPoints = lVar.f285716c;
        }
        RevPoints revPointsBalance = revPoints;
        boolean z11 = (i & 8) != 0 ? lVar.d : z;
        boolean z12 = (i & 16) != 0 ? lVar.e : z3;
        boolean z29 = (i & 32) != 0 ? lVar.f : z4;
        boolean z31 = (i & 64) != 0 ? lVar.f285717g : z6;
        Data userVouchers = (i & 128) != 0 ? lVar.f285718h : data;
        Data megaOffer = (i & 256) != 0 ? lVar.i : data2;
        Data campaigns = (i & 512) != 0 ? lVar.f285719j : data3;
        Clause clause2 = (i & 1024) != 0 ? lVar.k : clause;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(revPointsBalance, "revPointsBalance");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        return new l(uVar2, voucherProduct2, revPointsBalance, z11, z12, z29, z31, userVouchers, megaOffer, campaigns, clause2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f285714a, lVar.f285714a) && Intrinsics.f(this.f285715b, lVar.f285715b) && Intrinsics.f(this.f285716c, lVar.f285716c) && this.d == lVar.d && this.e == lVar.e && this.f == lVar.f && this.f285717g == lVar.f285717g && Intrinsics.f(this.f285718h, lVar.f285718h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f285719j, lVar.f285719j) && Intrinsics.f(this.k, lVar.k);
    }

    public final int hashCode() {
        u uVar = this.f285714a;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        VoucherProduct voucherProduct = this.f285715b;
        int iC = kii.e.c(this.f285719j, kii.e.c(this.i, kii.e.c(this.f285718h, j6.a.c(j6.a.c(j6.a.c(j6.a.c(v7.c((iHashCode + (voucherProduct == null ? 0 : voucherProduct.hashCode())) * 31, 31, this.f285716c.f83960a), 31, this.d), 31, this.e), 31, this.f), 31, this.f285717g), 31), 31), 31);
        Clause clause = this.k;
        return iC + (clause != null ? clause.hashCode() : 0);
    }

    public l(u uVar, VoucherProduct voucherProduct, RevPoints revPointsBalance, boolean z, boolean z3, boolean z4, boolean z6, Data userVouchers, Data megaOffer, Data campaigns, Clause clause) {
        Intrinsics.checkNotNullParameter(revPointsBalance, "revPointsBalance");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        this.f285714a = uVar;
        this.f285715b = voucherProduct;
        this.f285716c = revPointsBalance;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f285717g = z6;
        this.f285718h = userVouchers;
        this.i = megaOffer;
        this.f285719j = campaigns;
        this.k = clause;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Data data, int i) {
        this(null, null, RevPoints.Companion.a(0L), false, false, false, false, new Data(null, null, false, 7, null), (i & 256) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), null);
        RevPoints.INSTANCE.getClass();
    }
}
