package ya6;

import androidx.room.util.DBUtil;
import ba6.l0;
import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import com.revolut.feature.donations.api.model.quote.DonationQuoteResponse;
import com.revolut.feature.donations.impl.network.service.DonationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wf0.r0;
import ya6.u;

/* JADX INFO: loaded from: classes13.dex */
public final class z implements q {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rj0.a f311987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DonationsService f311988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja6.f f311989c;
    public final ne0.d d;
    public final ne0.n e;
    public final ne0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xe0.e f311990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f311991h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f311992j;
    public final x4l.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f311993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qe0.o f311994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f311995n;

    public z(rj0.a networkFeatureTogglesProvider, DonationsService service, ja6.f dao, ne0.d memoryCache, ne0.n timeBasedMemoryCache, ne0.n quoteLimitedCache, xe0.e storage, CoroutineScope appCoroutineScope, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(networkFeatureTogglesProvider, "networkFeatureTogglesProvider");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(timeBasedMemoryCache, "timeBasedMemoryCache");
        Intrinsics.checkNotNullParameter(quoteLimitedCache, "quoteLimitedCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f311987a = networkFeatureTogglesProvider;
        this.f311988b = service;
        this.f311989c = dao;
        this.d = memoryCache;
        this.e = timeBasedMemoryCache;
        this.f = quoteLimitedCache;
        this.f311990g = storage;
        this.f311991h = appCoroutineScope;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i2 = i;
                z zVar = this.f311980b;
                switch (i2) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 5;
        final int i3 = 6;
        this.i = new w4l.f(function2, new s(this, i2), new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i22 = i2;
                z zVar = this.f311980b;
                switch (i22) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        }, new s(this, 6), new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i22 = i3;
                z zVar = this.f311980b;
                switch (i22) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 7;
        Function2 function22 = new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i22 = i5;
                z zVar = this.f311980b;
                switch (i22) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        };
        s sVar = new s(this, i5);
        final int i6 = 8;
        final int i21 = 9;
        this.f311992j = new w4l.f(function22, sVar, new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i22 = i6;
                z zVar = this.f311980b;
                switch (i22) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        }, new s(this, 8), new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i22 = i21;
                z zVar = this.f311980b;
                switch (i22) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        final int i22 = 1;
        this.k = new x4l.c(new y5b.b0(this, continuation, 4), new s(this, 0), new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i222 = i22;
                z zVar = this.f311980b;
                switch (i222) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        }, new r0(14), new y(0));
        final int i32 = 2;
        x4l.c cVar = new x4l.c(new y5b.b0(this, continuation, 3), new s(this, 1), new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i222 = i32;
                z zVar = this.f311980b;
                switch (i222) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        }, new r0(13), new uyd.e0(29));
        this.f311993l = cVar;
        this.f311994m = do3.q.f(cVar, appCoroutineScope);
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new s(this, 2));
        final int i33 = 3;
        s sVar2 = new s(this, i33);
        Function2 function23 = new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i222 = i33;
                z zVar = this.f311980b;
                switch (i222) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        };
        final int i43 = 4;
        this.f311995n = new w4l.f(bVarK0, sVar2, function23, new s(this, i43), new Function2(this) { // from class: ya6.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f311980b;

            {
                this.f311980b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                int i222 = i43;
                z zVar = this.f311980b;
                switch (i222) {
                    case 0:
                        DonationsService donationsService = zVar.f311988b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u params = (u) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof u.a) {
                            efm.d0<List<va6.g>> charities = donationsService.getCharities();
                            x xVar = x.f;
                            x2l.a aVar = new x2l.a(18, false);
                            charities.getClass();
                            ufm.i iVar = new ufm.i(charities, aVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        if (!(params instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<va6.g> charityDetails = donationsService.getCharityDetails(((v) params).f311984a);
                        f fVar = new f(new y99.x(15), 5);
                        charityDetails.getClass();
                        ufm.i iVar2 = new ufm.i(charityDetails, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        w params2 = (w) obj2;
                        l0 suggestedPointsAmounts = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(suggestedPointsAmounts, "suggestedPointsAmounts");
                        zVar.e.f(params2.a(), suggestedPointsAmounts);
                        return Unit.f186387a;
                    case 2:
                        DonationQuoteRequest params3 = (DonationQuoteRequest) obj2;
                        DonationQuoteResponse donationQuote = (DonationQuoteResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(donationQuote, "donationQuote");
                        zVar.f.f(params3.a(), donationQuote);
                        return Unit.f186387a;
                    case 3:
                        ba6.h charitiesOverview = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
                        zVar.d.f("charities_overview_cache_key", charitiesOverview);
                        return Unit.f186387a;
                    case 4:
                        ba6.h charitiesOverview2 = (ba6.h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "charitiesOverview");
                        xe0.e eVar = zVar.f311990g;
                        Intrinsics.checkNotNullParameter(charitiesOverview2, "<this>");
                        eVar.G(new la6.d(hx7.a.A(charitiesOverview2.f13934a), charitiesOverview2.f13935b), "STORAGE_KEY_CHARITIES_OVERVIEW", wim.z.d(o0.b(la6.d.class)));
                        return Unit.f186387a;
                    case 5:
                        ne0.d dVar = zVar.d;
                        u params4 = (u) obj2;
                        List charities2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(charities2, "charities");
                        if (params4 instanceof u.a) {
                            dVar.f("charities_cache_key", charities2);
                        } else {
                            if (!(params4 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list = (List) dVar.get("charities_cache_key");
                            Object obj4 = null;
                            if (list != null) {
                                List<ba6.l> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (ba6.l lVar : list2) {
                                    Iterator it8 = charities2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next = it8.next();
                                            if (Intrinsics.f(lVar.f13938a, ((ba6.l) next).f13938a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    ba6.l lVar2 = (ba6.l) next;
                                    if (lVar2 != null) {
                                        lVar = lVar2;
                                    }
                                    arrayList.add(lVar);
                                }
                                dVar.f("charities_cache_key", arrayList);
                            } else {
                                Iterator it9 = charities2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        Object next2 = it9.next();
                                        if (Intrinsics.f(((ba6.l) next2).f13938a, ((v) params4).f311984a)) {
                                            obj4 = next2;
                                        }
                                    }
                                }
                                ba6.l lVar3 = (ba6.l) obj4;
                                if (lVar3 != null) {
                                    dVar.f("single_charity_" + lVar3.f13938a, lVar3);
                                }
                            }
                        }
                        return Unit.f186387a;
                    case 6:
                        ja6.f fVar2 = zVar.f311989c;
                        u params5 = (u) obj2;
                        List<ba6.l> charities3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(charities3, "charities");
                        if (!(params5 instanceof u.a)) {
                            if (!(params5 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            for (ba6.l lVar4 : charities3) {
                                if (Intrinsics.f(lVar4.f13938a, ((v) params5).f311984a)) {
                                    la6.h hVarU = ta6.a.U(lVar4);
                                    fVar2.getClass();
                                    DBUtil.performBlocking(fVar2.f172454a, false, true, new j4h.m(fVar2, hVarU, 21));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        List list3 = charities3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ta6.a.U((ba6.l) it10.next()));
                        }
                        DBUtil.performBlocking(fVar2.f172454a, false, true, new ja6.c(fVar2, arrayList2, 2));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        efm.d0<List<va6.k>> suggestions = zVar.f311988b.getSuggestions(iIntValue);
                        f fVar3 = new f(new y99.x(14), 4);
                        suggestions.getClass();
                        ufm.i iVar3 = new ufm.i(suggestions, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        ((Integer) obj2).getClass();
                        Map suggestions2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        zVar.d.f("suggestions_cache_key", suggestions2);
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        Map suggestions3 = (Map) obj3;
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        zVar.f311990g.G(suggestions3, "STORAGE_KEY_SUGGESTIONS", wim.z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.c(List.class, KTypeProjection.Companion.a(o0.b(Long.TYPE)))))));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final efm.r a(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return nim.a.w(this.i.f(new v(id10), z), new y9d.c(id10, 3));
    }
}
