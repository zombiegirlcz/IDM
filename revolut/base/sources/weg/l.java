package weg;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewScore;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestsReviews;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyRatings;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.tracking.v3.HotelsSearchContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ List u;
    public final /* synthetic */ int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f296786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, int i, m mVar, Continuation continuation) {
        super(2, continuation);
        this.u = list;
        this.v = i;
        this.f296786w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, this.v, this.f296786w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pricing pricing;
        dj0.d dVarK;
        xi0.b bVar;
        String str;
        RevPoints revPoints;
        HotelsPropertyGuestsReviews hotelsPropertyGuestsReviews;
        dj0.d dVarJ;
        dj0.d dVarK2;
        HotelsPropertyGuestsReviews hotelsPropertyGuestsReviews2;
        List list;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List listV0 = d0.V0(this.u, Math.min(this.v + 1, 50));
        ArrayList<HotelsProperty> arrayList = new ArrayList();
        Iterator it8 = listV0.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            koi.j jVar = (koi.j) it8.next();
            qv0.p pVar = jVar instanceof qv0.p ? (qv0.p) jVar : null;
            Object f53623w = pVar != null ? pVar.getF55862c() : null;
            HotelsProperty hotelsProperty = f53623w instanceof HotelsProperty ? (HotelsProperty) f53623w : null;
            if (hotelsProperty != null) {
                arrayList.add(hotelsProperty);
            }
        }
        HotelsProperty hotelsProperty2 = (HotelsProperty) d0.d0(arrayList);
        if (hotelsProperty2 == null || (pricing = hotelsProperty2.i) == null || (dVarK = boh.f.k(pricing)) == null || (bVar = dVarK.f115083b) == null || (str = bVar.f306286a) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (HotelsProperty hotelsProperty3 : arrayList) {
            HotelsPropertyRatings hotelsPropertyRatings = hotelsProperty3.f97984g;
            Pricing pricing2 = hotelsProperty3.i;
            HotelsPropertyGuestReviewScore hotelsPropertyGuestReviewScoreA = (hotelsPropertyRatings == null || (hotelsPropertyGuestsReviews2 = hotelsPropertyRatings.f98045b) == null || (list = hotelsPropertyGuestsReviews2.f98034b) == null) ? null : h9g.e.a(list);
            long j2 = (pricing2 == null || (dVarK2 = boh.f.k(pricing2)) == null) ? 0L : dVarK2.f115082a;
            long j3 = (pricing2 == null || (dVarJ = h9g.m.j(pricing2)) == null) ? j2 : dVarJ.f115082a;
            String str2 = hotelsProperty3.f97981a;
            double d = hotelsPropertyGuestReviewScoreA != null ? hotelsPropertyGuestReviewScoreA.f98026b : 0.0d;
            HotelsPropertyRatings hotelsPropertyRatings2 = hotelsProperty3.f97984g;
            arrayList2.add(new xeg.d(str2, j2, j3, d, (hotelsPropertyRatings2 == null || (hotelsPropertyGuestsReviews = hotelsPropertyRatings2.f98045b) == null) ? 0 : hotelsPropertyGuestsReviews.f98033a, (pricing2 == null || (revPoints = pricing2.f98069g) == null) ? 0.0d : revPoints.J()));
        }
        String strC = this.f296786w.f296787a.c(new qlm.e(xeg.d.Companion.serializer()), d0.d1(arrayList2));
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        HotelsSearchContext.a aVarNewBuilder = HotelsSearchContext.newBuilder();
        aVarNewBuilder.c();
        ((HotelsSearchContext) aVarNewBuilder.f49761b).setCurrency(str);
        aVarNewBuilder.c();
        ((HotelsSearchContext) aVarNewBuilder.f49761b).setProperties(strC);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }
}
