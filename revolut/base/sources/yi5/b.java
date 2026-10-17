package yi5;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.api.model.AtmLocation;
import com.revolut.feature.atm.api.model.SurchargeFreeState;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountsBalance;
import efm.r;
import ip0.bf0;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mid.d0;
import mid.n;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314240a;

    public /* synthetic */ b(int i) {
        this.f314240a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        ShopsAuction.Offer offer;
        ZonedDateTime zonedDateTime;
        Address address;
        String str;
        od0.i iVarA;
        switch (this.f314240a) {
            case 0:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter((yi8.b) obj2, "$this$update");
                break;
            case 2:
                yi8.b it9 = (yi8.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 3:
                xc8.c cVar = (xc8.c) ((xc8.g) obj2).f304108b.get(v6d.a.PAYMENT_LINKS);
                boolean z = false;
                if (cVar != null && cVar.b()) {
                    z = true;
                }
                break;
            case 4:
                yic.e update = (yic.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            case 5:
                yic.e it10 = (yic.e) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) it10.f314277a.getContent();
                if (rentAndBillsLinkedPayments != null) {
                }
                break;
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                break;
            case 7:
                yid.i domainState = (yid.i) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                n nVar = (n) domainState.f314308a.getContent();
                if (nVar != null && (list = nVar.d) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it11 = list.iterator();
                    while (it11.hasNext()) {
                        ShopsContext shopsContextA = ((d0) it11.next()).f205692b.a();
                        ShopsAuction shopsAuction = shopsContextA instanceof ShopsAuction ? (ShopsAuction) shopsContextA : null;
                        Instant instant = (shopsAuction == null || (offer = shopsAuction.f87010a) == null || (zonedDateTime = offer.f87016b) == null) ? null : zonedDateTime.toInstant();
                        if (instant != null) {
                            arrayList.add(instant);
                        }
                    }
                    break;
                }
                break;
            case 8:
                SurchargeFreeState it12 = (SurchargeFreeState) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                break;
            case 9:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                break;
            case 10:
                yoj.a aVar = (yoj.a) obj2;
                break;
            case 11:
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                r rVarJust = r.just(zi0.c.O(it14));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                break;
            case 12:
                od0.i locationOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(locationOptional, "locationOptional");
                AtmLocation atmLocation = (AtmLocation) locationOptional.g();
                if (atmLocation == null) {
                }
                break;
            case 13:
                Data profile = (Data) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                od0.h hVar = od0.i.Companion;
                do3.n nVar2 = (do3.n) profile.getContent();
                String country = (nVar2 == null || (address = nVar2.k) == null) ? null : address.getCountry();
                hVar.getClass();
                break;
            case 14:
                x39.a it15 = (x39.a) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                break;
            case 15:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar = (od0.i) pair.f186385a;
                String str2 = (String) pair.f186386b;
                boolean zEquals = false;
                if (iVar.d() && (str = (String) iVar.f224257a) != null) {
                    zEquals = str.equals(str2);
                }
                break;
            case 16:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                break;
            case 17:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list2 = (List) pair2.f186385a;
                AtmLocation atmLocation2 = (AtmLocation) ((od0.i) pair2.f186386b).g();
                if (atmLocation2 != null) {
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                    Iterator it16 = list3.iterator();
                    while (it16.hasNext()) {
                        arrayList2.add(yj2.f.a((Atm) it16.next(), atmLocation2));
                    }
                }
                break;
            case 18:
                LocationDomain location = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(location, "location");
                double d = location.f78066a;
                double d5 = location.f78067b;
                od0.h hVar2 = od0.i.Companion;
                AtmLocation atmLocation3 = new AtmLocation(d, d5);
                hVar2.getClass();
                break;
            case 19:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                co3.a aVar2 = (co3.a) data.getContent();
                Double dValueOf = aVar2 != null ? Double.valueOf(aVar2.f25486a) : null;
                co3.a aVar3 = (co3.a) data.getContent();
                Double dValueOf2 = aVar3 != null ? Double.valueOf(aVar3.f25487b) : null;
                if (dValueOf == null || dValueOf2 == null) {
                    od0.i.Companion.getClass();
                    iVarA = od0.i.f224256b;
                } else {
                    od0.h hVar3 = od0.i.Companion;
                    AtmLocation atmLocation4 = new AtmLocation(dValueOf.doubleValue(), dValueOf2.doubleValue());
                    hVar3.getClass();
                    iVarA = od0.h.a(atmLocation4);
                }
                AtmLocation atmLocation5 = (AtmLocation) iVarA.g();
                if (atmLocation5 == null) {
                    atmLocation5 = yj2.l.e;
                }
                od0.i.Companion.getClass();
                break;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listK = v.k(new bf0("GENDER_LOADING_LIST_ID_0"), new bf0("GENDER_LOADING_LIST_ID_1"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                break;
            case 21:
                wel.e it17 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                ArrayList arrayList3 = it17.e;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (obj3 instanceof kel.b) {
                        arrayList4.add(obj3);
                    }
                }
                break;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 23:
                WealthAccountsBalance portfolioBalance = (WealthAccountsBalance) obj2;
                Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
                break;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                break;
        }
        return Boolean.FALSE;
    }

    public /* synthetic */ b(yj2.l lVar, int i) {
        this.f314240a = i;
    }
}
