package hud;

import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f155625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LegacyOrderQuoteParams f155626c;
    public final Data d;
    public final StakingPocket e;
    public final StakingProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io3.d f155627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final do3.n f155628h;
    public final sh5.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f155629j;
    public final Data k;

    public i(String requestId, dj0.d amount, LegacyOrderQuoteParams legacyOrderQuoteParams, Data data, StakingPocket stakingPocket, StakingProduct stakingProduct, io3.d dVar, do3.n nVar, sh5.c cVar, List footerDisclaimer, Data planUpsellBanner) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        Intrinsics.checkNotNullParameter(footerDisclaimer, "footerDisclaimer");
        Intrinsics.checkNotNullParameter(planUpsellBanner, "planUpsellBanner");
        this.f155624a = requestId;
        this.f155625b = amount;
        this.f155626c = legacyOrderQuoteParams;
        this.d = data;
        this.e = stakingPocket;
        this.f = stakingProduct;
        this.f155627g = dVar;
        this.f155628h = nVar;
        this.i = cVar;
        this.f155629j = footerDisclaimer;
        this.k = planUpsellBanner;
    }

    public static i a(i iVar, LegacyOrderQuoteParams legacyOrderQuoteParams, Data data, io3.d dVar, do3.n nVar, sh5.c cVar, List list, Data data2, int i) {
        String requestId = iVar.f155624a;
        dj0.d amount = iVar.f155625b;
        if ((i & 4) != 0) {
            legacyOrderQuoteParams = iVar.f155626c;
        }
        LegacyOrderQuoteParams legacyOrderQuoteParams2 = legacyOrderQuoteParams;
        if ((i & 8) != 0) {
            data = iVar.d;
        }
        Data data3 = data;
        StakingPocket stakingPocket = iVar.e;
        StakingProduct stakingProduct = iVar.f;
        io3.d dVar2 = (i & 64) != 0 ? iVar.f155627g : dVar;
        do3.n nVar2 = (i & 128) != 0 ? iVar.f155628h : nVar;
        sh5.c cVar2 = (i & 256) != 0 ? iVar.i : cVar;
        List footerDisclaimer = (i & 512) != 0 ? iVar.f155629j : list;
        Data planUpsellBanner = (i & 1024) != 0 ? iVar.k : data2;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        Intrinsics.checkNotNullParameter(footerDisclaimer, "footerDisclaimer");
        Intrinsics.checkNotNullParameter(planUpsellBanner, "planUpsellBanner");
        return new i(requestId, amount, legacyOrderQuoteParams2, data3, stakingPocket, stakingProduct, dVar2, nVar2, cVar2, footerDisclaimer, planUpsellBanner);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f155624a, iVar.f155624a) && Intrinsics.f(this.f155625b, iVar.f155625b) && Intrinsics.f(this.f155626c, iVar.f155626c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f155627g, iVar.f155627g) && Intrinsics.f(this.f155628h, iVar.f155628h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f155629j, iVar.f155629j) && Intrinsics.f(this.k, iVar.k);
    }

    public final int hashCode() {
        int iC = v7.c(this.f155624a.hashCode() * 31, 31, this.f155625b);
        LegacyOrderQuoteParams legacyOrderQuoteParams = this.f155626c;
        int iHashCode = (iC + (legacyOrderQuoteParams == null ? 0 : legacyOrderQuoteParams.hashCode())) * 31;
        Data data = this.d;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        StakingPocket stakingPocket = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31)) * 31;
        io3.d dVar = this.f155627g;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        do3.n nVar = this.f155628h;
        int iHashCode5 = (iHashCode4 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        sh5.c cVar = this.i;
        return this.k.hashCode() + p.a.d((iHashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f155629j);
    }
}
