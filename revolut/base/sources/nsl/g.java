package nsl;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewardItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewards;
import jsl.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f218913b;

    public /* synthetic */ g(Data data, int i) {
        this.f218912a = i;
        this.f218913b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CobrandedCardsAvailableRewardItem cobrandedCardsAvailableRewardItem;
        switch (this.f218912a) {
            case 0:
                return w.a((w) obj2, null, null, null, null, false, null, this.f218913b, 63);
            case 1:
                return w.a((w) obj2, null, null, this.f218913b, null, false, null, null, 123);
            case 2:
                ((nt4.d) obj2).getClass();
                Data limitHistory = this.f218913b;
                Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                return new nt4.d(limitHistory);
            case 3:
                Data data = this.f218913b;
                Intrinsics.h(data);
                return nuc.h.a((nuc.h) obj2, data, null, null, null, 30);
            case 4:
                return nv4.i.a((nv4.i) obj2, null, null, this.f218913b, null, 27);
            case 5:
                ((nv6.l) obj2).getClass();
                Data cashbackDetailsData = this.f218913b;
                Intrinsics.checkNotNullParameter(cashbackDetailsData, "cashbackDetailsData");
                return new nv6.l(cashbackDetailsData);
            case 6:
                ((nv7.g) obj2).getClass();
                Data layout = this.f218913b;
                Intrinsics.checkNotNullParameter(layout, "layout");
                return new nv7.g(layout);
            case 7:
                return nvk.k.a((nvk.k) obj2, null, null, null, null, null, null, null, this.f218913b, CertificateBody.profileType);
            case 8:
                Data data2 = this.f218913b;
                Intrinsics.h(data2);
                return nvk.k.a((nvk.k) obj2, null, null, null, null, null, null, data2, null, 191);
            case 9:
                return nwc.g.a((nwc.g) obj2, null, null, (uib.a) this.f218913b.getContent(), null, 11);
            case 10:
                return nwc.g.a((nwc.g) obj2, null, null, null, this.f218913b, 7);
            case 11:
                return nwc.g.a((nwc.g) obj2, null, this.f218913b, null, null, 13);
            case 12:
                return nwf.e.a((nwf.e) obj2, null, null, this.f218913b, 3);
            case 13:
                return o17.k.a((o17.k) obj2, this.f218913b, null, 2);
            case 14:
                return o17.k.a((o17.k) obj2, null, this.f218913b, 1);
            case 15:
                return o23.w.a((o23.w) obj2, null, null, null, null, null, false, null, null, null, null, false, this.f218913b, 16383);
            case 16:
                return o27.l.a((o27.l) obj2, null, null, null, null, this.f218913b, null, 383);
            case 17:
                ((o2g.c) obj2).getClass();
                Data itinerary = this.f218913b;
                Intrinsics.checkNotNullParameter(itinerary, "itinerary");
                return new o2g.c(itinerary);
            case 18:
                ((o42.e) obj2).getClass();
                Data data3 = this.f218913b;
                Intrinsics.checkNotNullParameter(data3, "data");
                return new o42.e(data3);
            case 19:
                return o44.e.a((o44.e) obj2, null, this.f218913b, 1);
            case 20:
                ((o4b.c) obj2).getClass();
                return new o4b.c(this.f218913b);
            case 21:
                return o4h.e.a((o4h.e) obj2, this.f218913b, null, null, 6);
            case 22:
                return o4h.e.a((o4h.e) obj2, null, this.f218913b, null, 5);
            case 23:
                o5g.e eVar = (o5g.e) obj2;
                String bookingId = eVar.f222429a;
                int i = eVar.f222430b;
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                Data bookingDetails = this.f218913b;
                Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
                return new o5g.e(bookingDetails, bookingId, i);
            case 24:
                return o6f.a.a((o6f.a) obj2, null, null, this.f218913b, false, false, 59);
            case 25:
                String str = ((o7b.e) obj2).f222739b;
                Data availableRewardsData = this.f218913b;
                if (str == null) {
                    CobrandedCardsAvailableRewards cobrandedCardsAvailableRewards = (CobrandedCardsAvailableRewards) availableRewardsData.getContent();
                    str = (cobrandedCardsAvailableRewards == null || (cobrandedCardsAvailableRewardItem = (CobrandedCardsAvailableRewardItem) d0.d0(cobrandedCardsAvailableRewards.f82292c)) == null) ? null : cobrandedCardsAvailableRewardItem.f82289b;
                }
                Intrinsics.checkNotNullParameter(availableRewardsData, "availableRewardsData");
                return new o7b.e(availableRewardsData, str);
            case 26:
                return o7e.f.a((o7e.f) obj2, this.f218913b, null, 2);
            case 27:
                Data data4 = this.f218913b;
                Intrinsics.h(data4);
                return o7j.j.a((o7j.j) obj2, null, data4, null, 95);
            case 28:
                return o7j.j.a((o7j.j) obj2, null, null, this.f218913b, 63);
            default:
                return o87.b.a((o87.b) obj2, null, null, null, null, this.f218913b, 15);
        }
    }
}
