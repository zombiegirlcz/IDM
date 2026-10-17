package c84;

import android.content.Intent;
import android.net.Uri;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$Step;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import com.revolut.retail.feature.marketnews.api.delegate.WealthTopStoriesContract$TopStoriesOverviewParcel;
import com.revolut.retail.feature.marketnews.api.delegate.WealthTopStoriesContract$TopStoriesParcel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22109c = 0;
    public final Object d;

    public w(z controllerModel) {
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.d = controllerModel;
    }

    @Override // yji.d
    public boolean I() {
        switch (this.f22109c) {
            case 6:
                return ((ntf.r) this.d).I2();
            case 7:
                ((com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b) ((rg4.s) this.d)).C2(rg4.p.f254030a);
                return true;
            case 8:
            case 9:
            default:
                return super.I();
            case 10:
                com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar = (com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c) ((wic.b) this.d);
                yki.i iVar = cVar.u;
                if (!(((RentAndBillsFlowContract$Step) iVar.d()) instanceof RentAndBillsFlowContract$Step.SelectPayment) || iVar.c()) {
                    return false;
                }
                oki.h.t2(cVar, cVar.u, RentAndBillsFlowContract$Step.Home.f84960a, false, null, false, 12);
                return true;
        }
    }

    @Override // yji.d
    public void M() {
        int i = this.f22109c;
        int i2 = 28;
        int i3 = 27;
        int i5 = 29;
        int i6 = 9;
        final int i21 = 2;
        Object obj2 = this.d;
        int i22 = 7;
        final int i32 = 1;
        final int i33 = 0;
        switch (i) {
            case 1:
                final cle.n nVar = (cle.n) ((cle.i) obj2);
                TabInvestController tabInvestController = (TabInvestController) nVar.f24986a;
                efm.r rVarFilter = tabInvestController.X.f51699c.filter(new bjg.d(16, new bjg.c(26)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                efm.r rVarMerge = efm.r.merge(rVarFilter, tabInvestController.Y.f52940c);
                Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
                efm.r rVarC = te0.w.D(te0.w.a0(rVarMerge, new cjj.j(9)), new Function1() { // from class: cle.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i33) {
                            case 0:
                                vke.c it8 = (vke.c) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return nVar.f24987b.b3(it8);
                            default:
                                e eVar = (e) obj3;
                                boolean z = eVar instanceof c;
                                n nVar2 = nVar;
                                if (z || (eVar instanceof d)) {
                                    return nVar2.f24987b.b3(eVar.a());
                                }
                                if (!(eVar instanceof b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                a aVar = nVar2.f24988c;
                                vke.c cVar = ((b) eVar).f24978a;
                                String id10 = cVar.f289918a;
                                vke.d type = cVar.d;
                                aVar.getClass();
                                Intrinsics.checkNotNullParameter(id10, "id");
                                Intrinsics.checkNotNullParameter(type, "type");
                                uke.b bVar = aVar.f24977a;
                                bVar.getClass();
                                Intrinsics.checkNotNullParameter(id10, "id");
                                Intrinsics.checkNotNullParameter(type, "type");
                                pke.d dVar = bVar.f280732a;
                                dVar.getClass();
                                Intrinsics.checkNotNullParameter(id10, "id");
                                Intrinsics.checkNotNullParameter(type, "type");
                                r rVarG0 = w.g0(dVar.f237011a.closeBanner(id10));
                                Intrinsics.checkNotNullParameter(type, "type");
                                pfm.a aVarE = rVarG0.e(mo3.a.n(dVar.d.f(type, true)).ignoreElements());
                                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                                return aVarE;
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC), null, 7);
                TabInvestController tabInvestController2 = (TabInvestController) nVar.f24986a;
                efm.r rVarFilter2 = tabInvestController2.X.e.filter(new bjg.d(15, new bjg.c(25)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
                efm.r rVarA0 = te0.w.a0(rVarFilter2, new cjj.j(10));
                cle.m mVar = cle.m.f;
                efm.r rVarMerge2 = efm.r.merge(rVarA0.map(new cie.b(4)), te0.w.a0(tabInvestController2.Y.d.f121375b, new cjj.j(11)));
                Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
                efm.r rVarC2 = te0.w.D(rVarMerge2, new Function1() { // from class: cle.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i32) {
                            case 0:
                                vke.c it8 = (vke.c) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return nVar.f24987b.b3(it8);
                            default:
                                e eVar = (e) obj3;
                                boolean z = eVar instanceof c;
                                n nVar2 = nVar;
                                if (z || (eVar instanceof d)) {
                                    return nVar2.f24987b.b3(eVar.a());
                                }
                                if (!(eVar instanceof b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                a aVar = nVar2.f24988c;
                                vke.c cVar = ((b) eVar).f24978a;
                                String id10 = cVar.f289918a;
                                vke.d type = cVar.d;
                                aVar.getClass();
                                Intrinsics.checkNotNullParameter(id10, "id");
                                Intrinsics.checkNotNullParameter(type, "type");
                                uke.b bVar = aVar.f24977a;
                                bVar.getClass();
                                Intrinsics.checkNotNullParameter(id10, "id");
                                Intrinsics.checkNotNullParameter(type, "type");
                                pke.d dVar = bVar.f280732a;
                                dVar.getClass();
                                Intrinsics.checkNotNullParameter(id10, "id");
                                Intrinsics.checkNotNullParameter(type, "type");
                                r rVarG0 = w.g0(dVar.f237011a.closeBanner(id10));
                                Intrinsics.checkNotNullParameter(type, "type");
                                pfm.a aVarE = rVarG0.e(mo3.a.n(dVar.d.f(type, true)).ignoreElements());
                                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                                return aVarE;
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC2, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC2), null, 7);
                break;
            case 2:
                dv5.o oVar = (dv5.o) ((pt5.s) obj2);
                efm.r map = oVar.f118051a.h0().filter(new dkk.a0(new ds4.b(15), i5)).doOnNext(new dv5.n(new dv5.m(oVar, i32), i33)).map(new dv5.n(new ds4.b(16), i32));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                yji.d.H(this, rd0.e.b(map), null, 7);
                pt5.r rVar = oVar.f118051a;
                efm.r rVarMerge3 = efm.r.merge(rVar.T(), rVar.S(), rVar.i0(), rVar.U());
                Intrinsics.checkNotNullExpressionValue(rVarMerge3, "merge(...)");
                efm.r rVarC3 = te0.w.D(te0.w.a0(rVarMerge3, new ds4.b(17)), new dv5.m(oVar, i21)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC3, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC3), null, 7);
                efm.r rVarC4 = te0.w.D(te0.w.a0(oVar.f118051a.j1(), new ds4.b(14)), new dv5.m(oVar, i33)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC4, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC4), null, 7);
                break;
            case 3:
                h8b.o oVar2 = (h8b.o) obj2;
                h8b.i iVar = oVar2.f149986a;
                efm.r rVarC5 = iVar.b().f52707c.map(new h8b.m(new h8b.l(5), 5)).mergeWith(iVar.f().d.f121375b.map(new h8b.m(new h8b.l(6), 6))).filter(new h8b.m(new h8b.l(8), i22)).switchMapCompletable(new h8b.m(new h8b.n(oVar2, 1), 8)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC5, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC5), null, 7);
                ihm.f fVar = iVar.e().d;
                efm.r rVarHide = iVar.c().f.hide();
                Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                efm.r rVarC6 = efm.r.merge(fVar, rVarHide).filter(new h0l.g(new h8b.l(i32), i5)).filter(new h8b.m(new h8b.l(i21), i33)).switchMapCompletable(new h8b.m(new h8b.n(oVar2, 0), i21)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC6, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC6), null, 7);
                int i43 = 9;
                efm.r rVarFilter3 = iVar.f().d.f121375b.filter(new h8b.m(new h8b.l(i43), i43));
                Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
                int i59 = 0;
                int i66 = 1;
                efm.r rVarC7 = te0.w.a0(rVarFilter3, new h8b.l(10)).switchMapCompletable(new h8b.m(new gwc.h(i66, oVar2.f149987b, h8b.f.class, "openAssetDetails", "openAssetDetails(Ljava/lang/String;)Lio/reactivex/Completable;", i59, 11), 10)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC7, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC7), null, 7);
                efm.r rVarFilter4 = iVar.f().d.f121375b.filter(new h0l.g(new h5i.b(i5), 27));
                Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
                efm.r rVarC8 = te0.w.a0(rVarFilter4, new h8b.l(i33)).switchMapCompletable(new h0l.g(new gwc.h(i66, oVar2.f149987b, h8b.f.class, "openBrowser", "openBrowser(Ljava/lang/String;)Lio/reactivex/Completable;", i59, 13), 28)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC8, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC8), null, 7);
                efm.r rVarFilter5 = iVar.g().f53572c.f121375b.filter(new h8b.m(new h5i.b(27), i32));
                Intrinsics.checkNotNullExpressionValue(rVarFilter5, "filter(...)");
                efm.r rVarC9 = te0.w.a0(rVarFilter5, new h8b.l(i22)).switchMapCompletable(new h8b.m(new gwc.h(i66, oVar2.f149987b, h8b.f.class, "openAssetDetails", "openAssetDetails(Ljava/lang/String;)Lio/reactivex/Completable;", i59, 12), 11)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC9, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC9), null, 7);
                efm.r rVarFilter6 = iVar.g().d.f121375b.filter(new h8b.m(new h8b.l(13), 14));
                Intrinsics.checkNotNullExpressionValue(rVarFilter6, "filter(...)");
                efm.r rVarC10 = te0.w.a0(rVarFilter6, new h5i.b(28)).switchMapCompletable(new h0l.g(new gwc.h(i66, oVar2.f149987b, h8b.f.class, "openBrowser", "openBrowser(Ljava/lang/String;)Lio/reactivex/Completable;", i59, 15), 26)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC10, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC10), null, 7);
                efm.r rVarFilter7 = iVar.d().e.filter(new h8b.m(new h8b.l(11), 12));
                Intrinsics.checkNotNullExpressionValue(rVarFilter7, "filter(...)");
                efm.r rVarC11 = te0.w.a0(rVarFilter7, new h8b.l(12)).switchMapCompletable(new h8b.m(new gwc.h(i66, oVar2.f149988c, h8b.h.class, "displayEventDescription", "displayEventDescription(Lcom/revolut/shared/feature/wealth/models/corporate_events/AssetEvent;)Lio/reactivex/Completable;", i59, 14), 13)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC11, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC11), null, 7);
                int i74 = 3;
                efm.r rVarFilter8 = iVar.d().e.filter(new h8b.m(new h8b.l(i74), i74));
                Intrinsics.checkNotNullExpressionValue(rVarFilter8, "filter(...)");
                efm.r rVarC12 = te0.w.a0(rVarFilter8, new h8b.l(4)).switchMapCompletable(new h8b.m(new gwc.h(1, oVar2.f149987b, h8b.f.class, "openBrowser", "openBrowser(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 16), 4)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC12, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC12), null, 7);
                break;
            case 4:
                itk.i iVar2 = (itk.i) obj2;
                k7i.i iVar3 = iVar2.f168424a;
                efm.r map2 = te0.w.a0(((ListSubheaderDelegate) iVar3.f182069b).f52707c, new isd.a(17)).doOnNext(new ir9.a(new itk.h(iVar2, 0), 23)).map(new ir9.a(new isd.a(18), 24));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                yji.d.H(this, rd0.e.b(map2), null, 7);
                efm.r map3 = te0.w.a0(((RowDelegate) iVar3.f182070c).f53218h, new isd.a(19)).doOnNext(new ir9.a(new itk.h(iVar2, 1), 25)).map(new ir9.a(new isd.a(20), 26));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                yji.d.H(this, rd0.e.b(map3), null, 7);
                break;
            case 5:
                final k9h.g gVar = (k9h.g) ((k0h.h) obj2);
                final int i92 = 3;
                efm.r rVarC13 = te0.w.D(te0.w.a0(gVar.f182341a.u0(), new k9h.d(4)), new Function1() { // from class: k9h.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i92) {
                            case 0:
                                return gVar.f182342b.Z2();
                            case 1:
                                k0h.e it8 = (k0h.e) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return gVar.f182342b.d3(it8.f180047a);
                            case 2:
                                return gVar.f182342b.e3();
                            default:
                                k0h.d it9 = (k0h.d) obj3;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                return gVar.f182342b.c3(it9.f180046a);
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC13, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC13), null, 7);
                efm.r rVarC14 = te0.w.D(te0.w.a0(gVar.f182341a.u0(), new k9h.d(i21)), new Function1() { // from class: k9h.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i32) {
                            case 0:
                                return gVar.f182342b.Z2();
                            case 1:
                                k0h.e it8 = (k0h.e) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return gVar.f182342b.d3(it8.f180047a);
                            case 2:
                                return gVar.f182342b.e3();
                            default:
                                k0h.d it9 = (k0h.d) obj3;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                return gVar.f182342b.c3(it9.f180046a);
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC14, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC14), null, 7);
                efm.r rVarFilter9 = ((IndexOverviewScreen) gVar.f182341a).R.d.filter(new k64.a(11, new k9h.d(3)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter9, "filter(...)");
                efm.r rVarC15 = te0.w.D(rVarFilter9, new Function1() { // from class: k9h.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i21) {
                            case 0:
                                return gVar.f182342b.Z2();
                            case 1:
                                k0h.e it8 = (k0h.e) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return gVar.f182342b.d3(it8.f180047a);
                            case 2:
                                return gVar.f182342b.e3();
                            default:
                                k0h.d it9 = (k0h.d) obj3;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                return gVar.f182342b.c3(it9.f180046a);
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC15, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC15), null, 7);
                efm.r rVarFilter10 = ((IndexOverviewScreen) gVar.f182341a).S.d.f121375b.filter(new k64.a(10, new k9h.d(i32)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter10, "filter(...)");
                efm.r rVarC16 = te0.w.D(rVarFilter10, new Function1() { // from class: k9h.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i33) {
                            case 0:
                                return gVar.f182342b.Z2();
                            case 1:
                                k0h.e it8 = (k0h.e) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return gVar.f182342b.d3(it8.f180047a);
                            case 2:
                                return gVar.f182342b.e3();
                            default:
                                k0h.d it9 = (k0h.d) obj3;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                return gVar.f182342b.c3(it9.f180046a);
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC16, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC16), null, 7);
                break;
            case 9:
                v0l.e eVar = (v0l.e) obj2;
                efm.r rVarC17 = te0.w.D(((TabInvestController) eVar.f284928a).W.f51589c.f121375b, new uu9.b(eVar, 24)).C();
                Intrinsics.checkNotNullExpressionValue(rVarC17, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC17), null, 7);
                break;
            case 11:
                final v0k.h hVar = (v0k.h) ((qzj.g) obj2);
                CommodityAssetDetailsScreen commodityAssetDetailsScreen = (CommodityAssetDetailsScreen) hVar.f284923a;
                efm.r rVarMerge4 = efm.r.merge(commodityAssetDetailsScreen.W.p(), commodityAssetDetailsScreen.X.d);
                Intrinsics.checkNotNullExpressionValue(rVarMerge4, "merge(...)");
                efm.r rVarC18 = te0.w.D(te0.w.a0(rVarMerge4, new v0k.g(i33)), new Function1() { // from class: v0k.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i21) {
                            case 0:
                                WealthTopStoriesContract$TopStoriesOverviewParcel it8 = (WealthTopStoriesContract$TopStoriesOverviewParcel) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return hVar.f284924b.Z2(it8.f101794a, it8.f101795b);
                            case 1:
                                WealthTopStoriesContract$TopStoriesOverviewParcel it9 = (WealthTopStoriesContract$TopStoriesOverviewParcel) obj3;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                return hVar.f284924b.d3(it9.f101794a);
                            default:
                                WealthTopStoriesContract$TopStoriesParcel it10 = (WealthTopStoriesContract$TopStoriesParcel) obj3;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                return hVar.f284924b.c3(it10.f101796a);
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC18, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC18), null, 7);
                efm.r rVarC19 = te0.w.D(te0.w.a0(((CommodityAssetDetailsScreen) hVar.f284923a).R.f52707c, new uyh.t(i3)), new Function1() { // from class: v0k.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i33) {
                            case 0:
                                WealthTopStoriesContract$TopStoriesOverviewParcel it8 = (WealthTopStoriesContract$TopStoriesOverviewParcel) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return hVar.f284924b.Z2(it8.f101794a, it8.f101795b);
                            case 1:
                                WealthTopStoriesContract$TopStoriesOverviewParcel it9 = (WealthTopStoriesContract$TopStoriesOverviewParcel) obj3;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                return hVar.f284924b.d3(it9.f101794a);
                            default:
                                WealthTopStoriesContract$TopStoriesParcel it10 = (WealthTopStoriesContract$TopStoriesParcel) obj3;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                return hVar.f284924b.c3(it10.f101796a);
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC19, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC19), null, 7);
                efm.r rVarFilter11 = ((CommodityAssetDetailsScreen) hVar.f284923a).R.d.filter(new uz7.f(i6, new uyh.t(i2)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter11, "filter(...)");
                efm.r rVarC20 = te0.w.D(te0.w.a0(rVarFilter11, new uyh.t(i5)), new Function1() { // from class: v0k.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i32) {
                            case 0:
                                WealthTopStoriesContract$TopStoriesOverviewParcel it8 = (WealthTopStoriesContract$TopStoriesOverviewParcel) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return hVar.f284924b.Z2(it8.f101794a, it8.f101795b);
                            case 1:
                                WealthTopStoriesContract$TopStoriesOverviewParcel it9 = (WealthTopStoriesContract$TopStoriesOverviewParcel) obj3;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                return hVar.f284924b.d3(it9.f101794a);
                            default:
                                WealthTopStoriesContract$TopStoriesParcel it10 = (WealthTopStoriesContract$TopStoriesParcel) obj3;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                return hVar.f284924b.c3(it10.f101796a);
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC20, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC20), null, 7);
                break;
            case 12:
                ((en.c) obj2).onResume();
                break;
        }
    }

    @Override // yji.d
    public void N() {
        switch (this.f22109c) {
            case 12:
                ((en.c) this.d).onPause();
                break;
        }
    }

    @Override // yji.d
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        List<String> queryParameters;
        String str;
        switch (this.f22109c) {
            case 0:
                z zVar = (z) this.d;
                if (zVar.f22115n.getF67770a().f66896j && i == 999) {
                    if (i2 == 100) {
                        zVar.f22113l.b3();
                        break;
                    } else if (i2 == 200) {
                        zVar.T2(new y(zVar, intent, null, 0), new yi5.b(27));
                        break;
                    }
                }
                break;
            case 8:
                if (i == 1999) {
                    tnl.g gVar = (tnl.g) ((tnl.e) this.d);
                    Object aVar = tnl.b.f272468a;
                    if (i2 == -1) {
                        okl.d dVar = gVar.f272472n;
                        if (dVar != null) {
                            if (intent != null && (data = intent.getData()) != null && (queryParameters = data.getQueryParameters("challengeId")) != null && (str = (String) d0.M0(queryParameters)) != null) {
                                if (kotlin.text.d0.W(str)) {
                                    str = null;
                                }
                                if (str != null) {
                                    aVar = new tnl.a(str);
                                }
                            }
                            dVar.invoke(aVar);
                        }
                    } else if (i2 == 0) {
                        okl.d dVar2 = gVar.f272472n;
                        if (dVar2 != null) {
                            dVar2.invoke(tnl.c.f272469a);
                        }
                    } else {
                        okl.d dVar3 = gVar.f272472n;
                        if (dVar3 != null) {
                            dVar3.invoke(aVar);
                        }
                    }
                }
                break;
        }
    }

    public w(cle.i viewDelegate) {
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.d = viewDelegate;
    }

    public w(en.c navigationDelegate) {
        Intrinsics.checkNotNullParameter(navigationDelegate, "navigationDelegate");
        this.d = navigationDelegate;
    }

    public w(h8b.o viewDelegate) {
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.d = viewDelegate;
    }

    public w(itk.i viewDelegate) {
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.d = viewDelegate;
    }

    public w(k0h.h viewDelegate) {
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.d = viewDelegate;
    }

    public w(ntf.r screenModel) {
        Intrinsics.checkNotNullParameter(screenModel, "screenModel");
        this.d = screenModel;
    }

    public w(pt5.s viewDelegate) {
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.d = viewDelegate;
    }

    public w(qzj.g viewDelegate) {
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.d = viewDelegate;
    }

    public w(rg4.s screenModel) {
        Intrinsics.checkNotNullParameter(screenModel, "screenModel");
        this.d = screenModel;
    }

    public w(tnl.e modelExtension) {
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.d = modelExtension;
    }

    public w(v0l.e viewDelegate) {
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.d = viewDelegate;
    }

    public w(wic.b flowModel) {
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        this.d = flowModel;
    }
}
