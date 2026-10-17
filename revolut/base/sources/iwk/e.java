package iwk;

import a08.g0;
import afl.q;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stats.DetailedStatsScreen;
import com.revolut.retail.wealth.resources.R$string;
import efm.r;
import ip0.yc0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import rp0.t;
import rp0.y;
import te0.s;
import te0.w;
import xo8.u;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends pri.c implements l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StatsSection f169182h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f169183j;
    public final xrk.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dtk.a f169184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hsk.d f169185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final opi.d f169186n;

    public e(StatsSection section, a headerMapper, g statsMapper, xrk.h presentationModel, dtk.a customStatsMapper, hsk.d router, opi.d expandableDialogView) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(statsMapper, "statsMapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(customStatsMapper, "customStatsMapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        this.f169182h = section;
        this.i = headerMapper;
        this.f169183j = statsMapper;
        this.k = presentationModel;
        this.f169184l = customStatsMapper;
        this.f169185m = router;
        this.f169186n = expandableDialogView;
    }

    public final List N(List list, k kVar) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        return d0.E0(list, this.i.a(kVar));
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        m view = (m) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        DetailedStatsScreen detailedStatsScreen = (DetailedStatsScreen) view;
        r rVarFilter = detailedStatsScreen.f0.d.filter(new ivb.i(new yc0(1, this, e.class, "canHandle", "canHandle(Lcom/revolut/core/ui_kit/items/ParcelItem;)Z", 0, 1), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        final int i = 0;
        r0 r0VarD = w.D(w.a0(rVarFilter, new b(0)), new Function1(this) { // from class: iwk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f169180b;

            {
                this.f169180b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Pair pair;
                switch (i) {
                    case 0:
                        k it8 = (k) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        hsk.d dVar = this.f169180b.f169185m;
                        StatsSection section = it8.D();
                        i iVar = it8 instanceof i ? (i) it8 : null;
                        q qVar = iVar != null ? iVar.f169192b : null;
                        xrk.j jVar = (xrk.j) dVar;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(section, "section");
                        xrk.h hVar = jVar.f308369b;
                        efm.d0 d0VarFirstOrError = ((xrk.k) hVar.f308363b).w0().c(s.f270018a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        u uVar = new u(23, new xrk.b(hVar, 2));
                        d0VarFirstOrError.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarFirstOrError, uVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        pfm.a aVar2 = new pfm.a(iVar2, new u(26, new wtl.f(section, 27, qVar, jVar)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                        return ue0.e.v(aVar2);
                    default:
                        AssetStatsId assetStatsId = (AssetStatsId) obj2;
                        Intrinsics.checkNotNullParameter(assetStatsId, "it");
                        e eVar = this.f169180b;
                        eVar.f169184l.getClass();
                        Intrinsics.checkNotNullParameter(assetStatsId, "statId");
                        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
                        y yVar = null;
                        if (assetStatsId instanceof AssetStatsId.Etf) {
                            switch (zvk.c.f325713b[((AssetStatsId.Etf) assetStatsId).ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                    pair = null;
                                    break;
                                case 15:
                                    pair = new Pair(Integer.valueOf(R$string.wealth_details_section_stats_risk_rating_sri), Integer.valueOf(R$string.wealth_details_section_stats_risk_rating_sri_description));
                                    break;
                                case 16:
                                    pair = new Pair(Integer.valueOf(R$string.wealth_details_section_stats_risk_rating_srri), Integer.valueOf(R$string.wealth_details_section_stats_risk_rating_srri_description));
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            if (pair != null) {
                                yVar = new y(f0.f322471a, new t(new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), new TextLocalisedClause(((Number) pair.f186386b).intValue(), null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, "ETF_INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832);
                            }
                        } else if (!(assetStatsId instanceof AssetStatsId.Stocks) && !(assetStatsId instanceof AssetStatsId.Bonds)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (yVar != null) {
                            ((opi.b) eVar.f169186n).Z(yVar);
                        }
                        return Unit.f186387a;
                }
            }
        });
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new g0(22, new i2i.d0(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a08.f0(19, function1K), new ea9.c(27, d.f169181a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        final int i2 = 1;
        r rVarA0 = w.a0(detailedStatsScreen.g0.d, new b(1));
        Function1 function1 = new Function1(this) { // from class: iwk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f169180b;

            {
                this.f169180b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Pair pair;
                switch (i2) {
                    case 0:
                        k it8 = (k) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        hsk.d dVar = this.f169180b.f169185m;
                        StatsSection section = it8.D();
                        i iVar = it8 instanceof i ? (i) it8 : null;
                        q qVar = iVar != null ? iVar.f169192b : null;
                        xrk.j jVar = (xrk.j) dVar;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(section, "section");
                        xrk.h hVar = jVar.f308369b;
                        efm.d0 d0VarFirstOrError = ((xrk.k) hVar.f308363b).w0().c(s.f270018a).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        u uVar = new u(23, new xrk.b(hVar, 2));
                        d0VarFirstOrError.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarFirstOrError, uVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        pfm.a aVar22 = new pfm.a(iVar2, new u(26, new wtl.f(section, 27, qVar, jVar)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar22, "flatMapCompletable(...)");
                        return ue0.e.v(aVar22);
                    default:
                        AssetStatsId assetStatsId = (AssetStatsId) obj2;
                        Intrinsics.checkNotNullParameter(assetStatsId, "it");
                        e eVar = this.f169180b;
                        eVar.f169184l.getClass();
                        Intrinsics.checkNotNullParameter(assetStatsId, "statId");
                        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
                        y yVar = null;
                        if (assetStatsId instanceof AssetStatsId.Etf) {
                            switch (zvk.c.f325713b[((AssetStatsId.Etf) assetStatsId).ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                    pair = null;
                                    break;
                                case 15:
                                    pair = new Pair(Integer.valueOf(R$string.wealth_details_section_stats_risk_rating_sri), Integer.valueOf(R$string.wealth_details_section_stats_risk_rating_sri_description));
                                    break;
                                case 16:
                                    pair = new Pair(Integer.valueOf(R$string.wealth_details_section_stats_risk_rating_srri), Integer.valueOf(R$string.wealth_details_section_stats_risk_rating_srri_description));
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            if (pair != null) {
                                yVar = new y(f0.f322471a, new t(new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), new TextLocalisedClause(((Number) pair.f186386b).intValue(), null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, "ETF_INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832);
                            }
                        } else if (!(assetStatsId instanceof AssetStatsId.Stocks) && !(assetStatsId instanceof AssetStatsId.Bonds)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (yVar != null) {
                            ((opi.b) eVar.f169186n).Z(yVar);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1K2 = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarA0.onErrorResumeNext(new g0(22, new i2i.d0(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.f0(19, function1), new a08.f0(19, function1K2), new ea9.c(27, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
