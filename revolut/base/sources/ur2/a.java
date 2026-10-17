package ur2;

import aii.u;
import android.content.ComponentCallbacks2;
import androidx.compose.material.DrawerState;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreen;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details.LoanDirectDebitAccountDetailsRootFlow;
import com.revolut.feature.deeplink.impl.ui.external.ExternalDeeplinkRoutingActivity;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreen;
import com.revolut.feature.junior.accounts.impl.ui.junior_selection.JuniorSelectionScreen;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreen;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination;
import com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.TopLevelFaqScreen;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreen;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.workflow.engine.product_closures.modal.CloseProductScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.yes_no.YesNoQuestionScreen;
import com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import dw3.h8;
import elm.f;
import euh.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kl.t1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nyj.e;
import oki.h;
import r6e.q;
import r7d.x;
import rp0.k1;
import skm.p0;
import tsk.t;
import u45.o;
import ur7.d;
import us6.z0;
import uz.c0;
import uz.j;
import v17.m;
import v20.f0;
import v6l.e0;
import vb3.v;
import vc.s;
import vkm.j2;
import vkm.z1;
import zhm.w;
import zsc.g;
import zsc.p;
import zxb.k;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f282234b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f282233a = i;
        this.f282234b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v101, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v108, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v115, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f282233a;
        Object obj2 = this.f282234b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((c) obj2).d.d("security_hub.block_merchants", null) != bla.c.ENABLED);
            case 1:
                KProperty[] kPropertyArr = DocumentListScreen.c0;
                return (d) ((qr7.a) ((DocumentListScreen) obj2).Y.getValue()).f248659c.get();
            case 2:
                int i2 = CloseProductScreen.T;
                qth.b bVar = (qth.b) ((CloseProductScreen) obj2).R.getValue();
                return new uth.c(new uth.d(), bVar.f249119a, ((s41.a) bVar.f249120b.o).d());
            case 3:
                ((k1) ((com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a) obj2).f73710s).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "COPY_TO_CLIPBOARD_SHOT_ID", new TextLocalisedClause(R.string.common_copied_to_clipboard, null, null, 14), null, null, null, 60));
                return Unit.f186387a;
            case 4:
                int i3 = YesNoQuestionScreen.U;
                return (uuh.c) ((i) ((vuh.a) ((YesNoQuestionScreen) obj2).R.getValue())).d.get();
            case 5:
                yki.i iVar = ((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) obj2).f107026w;
                if (iVar.d() == null) {
                    h.D2(iVar);
                }
                return Unit.f186387a;
            case 6:
                f01.c cVar = ((uwl.d) obj2).f;
                atc.d dVarA = tz4.d.a(cVar, R$string.vaults_search_category);
                p pVar = p.WORD_PREFIX;
                return new g(new zsc.h(new Pair(dVarA, pVar), new Pair(new uwl.b(), pVar)), new zsc.h(new Pair(new btc.a(cVar), pVar)));
            case 7:
                KProperty[] kPropertyArr2 = ShareRewardsScreen.f101771b0;
                return (uyj.i) ((e) ((ShareRewardsScreen) obj2).Z.getValue()).f220907l.get();
            case 8:
                CameraKitView cameraKitView = (CameraKitView) obj2;
                j2 j2Var = cameraKitView.f;
                j2Var.g(null, new j(((j) j2Var.getValue()).f284526a, cameraKitView.k.getF50856a()));
                return Unit.f186387a;
            case 9:
                ((c0) obj2).f284497w.invalidate();
                return Unit.f186387a;
            case 10:
                int i5 = RevPointsExpiryDetailsScreen.U;
                return (uzb.a) ((k) ((RevPointsExpiryDetailsScreen) obj2).R.getValue()).f326187b.get();
            case 11:
                w06.b bVar2 = ((ExternalDeeplinkRoutingActivity) obj2).f71631t0;
                if (bVar2 == null) {
                    Intrinsics.r("component");
                    throw null;
                }
                q06.d dVarA2 = bVar2.f293643c.f293631b.a();
                s.j(dVarA2);
                return dVarA2;
            case 12:
                return Float.valueOf(DrawerState.anchoredDraggableState$lambda$1((DrawerState) obj2));
            case 13:
                KProperty[] kPropertyArr3 = FreelancerSalesFiltersScreen.f74135h0;
                return (m) ((z0) ((FreelancerSalesFiltersScreen) obj2).Y.getValue()).f282823g.get();
            case 14:
                int i6 = v1c.d.f285291a;
                Function0 function0 = ((RevPointsSpareChangeFullBannerGridControllerApi$Destination) ((u) obj2)).f84139c;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 15:
                z1 z1Var = ((q20.b) ((a40.b) obj2)).f;
                p0 p0Var = p0.f264001a;
                return rd0.e.c(z1Var, f.f127540b).share();
            case 16:
                return rd0.e.c(((z10.e) ((f0) obj2).e.f122164a).f318714h, kotlin.coroutines.g.f186406a).map(new uz7.f(16, new v0k.g(23))).distinctUntilChanged().replay(1).e();
            case 17:
                ((com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b) obj2).C2(v4g.h.f286080a);
                return Unit.f186387a;
            case 18:
                return (v55.a) ((o) ((LoanDirectDebitAccountDetailsRootFlow) obj2).P.getValue()).d.get();
            case 19:
                h.D2(((com.revolut.feature.defi.remittances.impl.ui.send.flow.a) obj2).f71850p);
                return Unit.f186387a;
            case 20:
                return Boolean.valueOf(((jte.d) ((v63.b) obj2).f286320a).c(CardsCoreApi$Toggles.PriorityDeliveryDateDisplaying.f65568c));
            case 21:
                return (v78.c) ((k78.h) ((JuniorSelectionScreen) obj2).N.getValue()).f181891g.get();
            case 22:
                KProperty[] kPropertyArr4 = SubaccountInfoPickerScreen.f89044d0;
                return (v7e.k) ((q) ((SubaccountInfoPickerScreen) obj2).X.getValue()).f251795c.get();
            case 23:
                KProperty[] kPropertyArr5 = DebtDetailsScreen.f67438b0;
                return (v84.e) ((h8) ((DebtDetailsScreen) obj2).W.getValue()).f118921h.get();
            case 24:
                KProperty[] kPropertyArr6 = TopLevelFaqScreen.f86303d0;
                return (v8d.j) ((x) ((TopLevelFaqScreen) obj2).Y.getValue()).e.get();
            case 25:
                v8g.h hVar = (v8g.h) obj2;
                return mra.d.c(hVar, new v8g.a(hVar.c3()), new hog.d(hVar, 9));
            case 26:
                ComponentCallbacks2 componentCallbacks2 = ((v99.c) obj2).f287007h;
                Intrinsics.i(componentCallbacks2, "null cannot be cast to non-null type com.revolut.retail.core.ui.viewdelegate.DelegatesView");
                kpi.c cVar2 = (kpi.c) ((nsi.a) componentCallbacks2).b(kpi.c.class);
                if (cVar2 != null) {
                    return cVar2;
                }
                throw new IllegalStateException("ActivityResultDelegate not found in activity delegates");
            case 27:
                Set set = ((v9f.p) obj2).f287040p.f91571b;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((TransferInInstrument) it8.next()).f91506a);
                }
                return arrayList;
            case 28:
                KProperty[] kPropertyArr7 = CashTopUpDetailsScreen.f65624b0;
                mb3.m mVar = (mb3.m) ((CashTopUpDetailsScreen) obj2).W.getValue();
                mb3.p pVar2 = mVar.f204086b;
                t1 t1VarB = pVar2.f204093c.b();
                CashTopUpDetailsScreenContract$InputData cashTopUpDetailsScreenContract$InputData = mVar.f204085a;
                mb3.p pVar3 = mVar.f204086b;
                ub3.g gVar = new ub3.g((ub3.m) pVar3.f204096j.get());
                ub3.h hVar2 = new ub3.h();
                ub3.j jVar = new ub3.j();
                ub3.g gVar2 = new ub3.g((ub3.m) pVar3.f204096j.get());
                ub3.h hVar3 = new ub3.h();
                ub3.j jVar2 = new ub3.j();
                ub3.i iVar2 = new ub3.i();
                l70.e eVar = pVar2.d;
                l80.e eVarH = eVar.h();
                s.j(eVarH);
                vb3.p pVar4 = new vb3.p(new ub3.e(gVar2, hVar3, jVar2, iVar2, eVarH));
                l80.e eVarH2 = eVar.h();
                s.j(eVarH2);
                return new vb3.s(t1VarB, cashTopUpDetailsScreenContract$InputData, new v(gVar, hVar2, jVar, pVar4, new vb3.b(eVarH2)));
            default:
                vb7.f fVar = (vb7.f) obj2;
                lfm.c cVar3 = fVar.e;
                int i21 = 2;
                efm.b bVarFlatMapCompletable = fVar.d.f14390a.flatMapCompletable(new e0(21, new vb7.b(fVar, i21)));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                t tVar = new t(new up5.s(new BreadcrumbException(), 25), (byte) 0);
                bVarFlatMapCompletable.getClass();
                pfm.a aVar = new pfm.a(bVarFlatMapCompletable, tVar, i21);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar.w(new o9h.d(22, vb7.e.f287440a), vb7.d.f287439a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                te0.w.j0(cVar3, hVarW);
                return Unit.f186387a;
        }
    }
}
