package v20;

import android.os.Parcelable;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.news.NewsItemDto;
import com.revolut.data.network.models.news.mapper.NewsDtoMapperKt;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.store.api.model.StoreGiftcardsOffer;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p20.b;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285546a;

    public /* synthetic */ s(int i) {
        this.f285546a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        v30.j jVarB;
        StoreMegaOffer.StoreRedeem storeRedeem;
        StoreGiftcardsOffer storeGiftcardsOffer;
        switch (this.f285546a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.P(zhm.d0.d0(it8), false, null, 3);
            case 1:
                List feeds = (List) obj2;
                Intrinsics.checkNotNullParameter(feeds, "feeds");
                Iterator it9 = feeds.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (((v30.y) next).c() == v30.c0.SUPPORT) {
                        }
                    } else {
                        next = null;
                    }
                }
                v30.y yVar = (v30.y) next;
                return Integer.valueOf((yVar == null || (jVarB = yVar.b()) == null) ? 0 : jVarB.s());
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Data(null, null, false, 7, null);
            case 3:
                v30.j it10 = (v30.j) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zi0.c.P(it10, false, null, 3);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Data(null, null, false, 7, null);
            case 5:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return zi0.c.P(zhm.d0.d0(it11), false, null, 3);
            case 6:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zi0.c.P(it12, false, null, 3);
            case 7:
                p20.b bVar = (p20.b) obj2;
                if ((bVar instanceof b.e) || (bVar instanceof b.i)) {
                    return Unit.f186387a;
                }
                return null;
            case 8:
                return Unit.f186387a;
            case 9:
                List news = (List) obj2;
                Intrinsics.checkNotNullParameter(news, "news");
                List list = news;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it13 = list.iterator();
                while (it13.hasNext()) {
                    arrayList.add(NewsDtoMapperKt.toDomainNewsItem((NewsItemDto) it13.next()));
                }
                return arrayList;
            case 10:
                NewsItemDto news2 = (NewsItemDto) obj2;
                Intrinsics.checkNotNullParameter(news2, "news");
                return zhm.u.c(NewsDtoMapperKt.toDomainNewsItem(news2));
            case 11:
                w61.a item = (w61.a) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return item.f295361a;
            case 12:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (w61.a) zhm.d0.d0(it14);
            case 13:
                w61.a item2 = (w61.a) obj2;
                Intrinsics.checkNotNullParameter(item2, "item");
                return item2.f295361a;
            case 14:
                List news3 = (List) obj2;
                Intrinsics.checkNotNullParameter(news3, "news");
                List list2 = news3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it15 = list2.iterator();
                while (it15.hasNext()) {
                    arrayList2.add(NewsDtoMapperKt.toDomainNewsItem((NewsItemDto) it15.next()));
                }
                return arrayList2;
            case 15:
                NewsItemDto news4 = (NewsItemDto) obj2;
                Intrinsics.checkNotNullParameter(news4, "news");
                return zhm.u.c(NewsDtoMapperKt.toDomainNewsItem(news4));
            case 16:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (w61.a) zhm.d0.d0(it16);
            case 17:
                Pair pair = (Pair) obj2;
                return new LoanKompotFeatureConfig.UpcomingInstalmentDetailsDestination((LoanDetails) pair.f186385a, (do3.n) pair.f186386b);
            case 18:
                q35.r rVar = (q35.r) obj2;
                if (rVar instanceof q35.m) {
                    return (q35.m) rVar;
                }
                return null;
            case 19:
                List terms = (List) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                return zhm.d0.P0(terms, new v29.b());
            case 20:
                v2e.l it17 = (v2e.l) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                StoreMegaOffer storeMegaOffer = (StoreMegaOffer) it17.i.getContent();
                if (storeMegaOffer != null) {
                    return storeMegaOffer.f88550g;
                }
                return null;
            case 21:
                v2e.l update = (v2e.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v2e.l.a(update, null, null, null, false, false, !update.f, false, null, null, null, null, YearClass.CLASS_2015);
            case 22:
                v2e.l update2 = (v2e.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return v2e.l.a(update2, null, null, null, false, false, false, !update2.f285717g, null, null, null, null, 1983);
            case 23:
                v2e.l it18 = (v2e.l) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                StoreMegaOffer storeMegaOffer2 = (StoreMegaOffer) it18.i.getContent();
                if (storeMegaOffer2 == null || (storeRedeem = storeMegaOffer2.f88550g) == null || (storeGiftcardsOffer = storeRedeem.f88558a) == null) {
                    return null;
                }
                return storeGiftcardsOffer.f88527a;
            case 24:
                v2e.l it19 = (v2e.l) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                StoreMegaOffer storeMegaOffer3 = (StoreMegaOffer) it19.i.getContent();
                if (storeMegaOffer3 != null) {
                    return storeMegaOffer3.f88550g;
                }
                return null;
            case 25:
                v2e.l it20 = (v2e.l) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.i;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new v2e.w(v2e.m0.d(), 2, 0);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it21 = intRangeO.iterator();
                while (it21.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("STORE_BRAND_DETAIL_YOUR_GIFT_CARDS_LOADING_", it21.nextInt()), false, 0, false, 30));
                }
                eVarB.addAll(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("STORE_BRAND_DETAIL_YOUR_GIFT_CARDS_SUBHEADER_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278), null, 0, 0, 126));
                return zhm.u.a(eVarB);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = zhm.u.b();
                for (int i = 0; i < 2; i++) {
                    eVarB2.add(nb0.b(pb0.Companion, a0.d.n("STORE_BRAND_DETAIL_REDEEM_EXCLUSIVES_LOADING_", i), false, 0, false, 30));
                }
                return zhm.u.a(eVarB2);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
        }
    }

    public /* synthetic */ s(v2e.m0 m0Var, int i) {
        this.f285546a = i;
    }
}
