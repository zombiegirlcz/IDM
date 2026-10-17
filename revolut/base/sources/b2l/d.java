package b2l;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.feature.travel_status.api.TravelStatusApi$Toggles$TravelStatus;
import com.revolut.retail.feature.travel_status.api.navigation.TravelStatusEntryDestination;
import com.revolut.retail.feature.travel_status.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import o97.e0;
import o97.g0;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import rd0.e;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;
import zsc.f;
import zsc.h;
import zsc.l;
import zsc.m;
import zsc.p;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements z87.d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugc.a f11964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f11965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f11966c;
    public final r d;

    public d(ugc.a travelStatusOverviewInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(travelStatusOverviewInteractor, "travelStatusOverviewInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f11964a = travelStatusOverviewInteractor;
        this.f11965b = featureToggleInteractor;
        this.f11966c = new h(new Pair(new b(), p.WORD_PREFIX));
        this.d = r.TRAVEL_STATUS_PARTNERS;
    }

    public static final List m(d dVar, ArrayList arrayList, f fVar) {
        r rVar = dVar.d;
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (fVar.a((a2l.f) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return f0.f322471a;
        }
        List<a2l.f> listV0 = d0.V0(arrayList2, 3);
        ArrayList arrayList3 = new ArrayList(w.t(listV0, 10));
        for (a2l.f fVar2 : listV0) {
            arrayList3.add(new RowDelegate.Model(j6.a.q("TRAVEL_STATUS_PARTNER_ITEM_ID_", fVar2.f897a), new RowDelegate.Model.MainImage.Image40(new UrlImage(fVar2.d, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 62), new TextClause(fVar2.f898b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new y(rVar, fVar2, null, 60), new AnalyticsContext(o97.h.a(rVar, fVar2.f897a)), 0, 0, 0, 0, 524287992));
        }
        g0 g0Var = new g0(new TextLocalisedClause(R$string.travel_status_search_block_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_see_all, null, null, 14), "TRAVEL_STATUS_SEARCH_LIST_ID", new y(rVar, null, null, 62));
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        return v.k(g0Var, new e0(arrayList3));
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f11965b.a(TravelStatusApi$Toggles$TravelStatus.f104290c)) {
            efm.r rVarJust = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        m.Companion.getClass();
        f fVar = new f(this.f11966c, l.a(searchQuery));
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        u1l.b bVar = (u1l.b) this.f11964a.f279998b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return e.c(new ahd.y(bVar.d.b(Unit.f186387a, loadingStrategy), this, fVar, 4), g.f186406a);
    }

    @Override // z87.f
    public final r h() {
        return this.d;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        if (Intrinsics.f(str, "TRAVEL_STATUS_SEARCH_LIST_ID")) {
            return new o97.d(new TravelStatusEntryDestination(null));
        }
        Object obj2 = yVar.f223136b;
        return obj2 instanceof a2l.f ? new o97.d(new TravelStatusEntryDestination(((a2l.f) obj2).f897a)) : o97.e.f223096a;
    }
}
