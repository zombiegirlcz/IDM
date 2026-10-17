package jzh;

import com.revolut.data.model.Data;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoOrderDraft f179847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f179848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sh5.c f179849c;
    public final Data d;
    public final Data e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f179850g;

    public r(CryptoOrderDraft draft, s domainStateData, sh5.c cVar, Data autoStakingData, Data userCountryCode, List banners, List footerDisclaimer) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(domainStateData, "domainStateData");
        Intrinsics.checkNotNullParameter(autoStakingData, "autoStakingData");
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        Intrinsics.checkNotNullParameter(banners, "banners");
        Intrinsics.checkNotNullParameter(footerDisclaimer, "footerDisclaimer");
        this.f179847a = draft;
        this.f179848b = domainStateData;
        this.f179849c = cVar;
        this.d = autoStakingData;
        this.e = userCountryCode;
        this.f = banners;
        this.f179850g = footerDisclaimer;
    }

    public static r a(r rVar, CryptoOrderDraft cryptoOrderDraft, s sVar, sh5.c cVar, Data data, Data data2, List list, List list2, int i) {
        if ((i & 1) != 0) {
            cryptoOrderDraft = rVar.f179847a;
        }
        CryptoOrderDraft draft = cryptoOrderDraft;
        if ((i & 2) != 0) {
            sVar = rVar.f179848b;
        }
        s domainStateData = sVar;
        if ((i & 4) != 0) {
            cVar = rVar.f179849c;
        }
        sh5.c cVar2 = cVar;
        if ((i & 8) != 0) {
            data = rVar.d;
        }
        Data autoStakingData = data;
        if ((i & 16) != 0) {
            data2 = rVar.e;
        }
        Data userCountryCode = data2;
        if ((i & 32) != 0) {
            list = rVar.f;
        }
        List banners = list;
        if ((i & 64) != 0) {
            list2 = rVar.f179850g;
        }
        List footerDisclaimer = list2;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(domainStateData, "domainStateData");
        Intrinsics.checkNotNullParameter(autoStakingData, "autoStakingData");
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        Intrinsics.checkNotNullParameter(banners, "banners");
        Intrinsics.checkNotNullParameter(footerDisclaimer, "footerDisclaimer");
        return new r(draft, domainStateData, cVar2, autoStakingData, userCountryCode, banners, footerDisclaimer);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f179847a, rVar.f179847a) && Intrinsics.f(this.f179848b, rVar.f179848b) && Intrinsics.f(this.f179849c, rVar.f179849c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f179850g, rVar.f179850g);
    }

    public final int hashCode() {
        int iHashCode = (this.f179848b.hashCode() + (this.f179847a.hashCode() * 31)) * 31;
        sh5.c cVar = this.f179849c;
        return this.f179850g.hashCode() + p.a.d(kii.e.c(this.e, kii.e.c(this.d, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31), 31, this.f);
    }
}
