package ew1;

import a83.c0;
import a83.d0;
import a83.p0;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import aw0.o9;
import cam.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.breb.impl.ui.more.BrebMoreScreen;
import com.revolut.feature.card_add_to_googlepay.impl.AddToGooglePayViewController;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaController;
import com.revolut.feature.referrals.code.data.api.ReferrerDetails;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.ManagedPortfolioDetailsActionsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.models.ManagedPortfolioDetailsActionParcel;
import com.revolut.feature.travel.flights.impl.ui.screen.bookings.TravelFlightsBookingsScreen;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveController;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.SelectFreeStocksScreen;
import ew2.b0;
import ew2.i0;
import ew2.j0;
import ewh.v;
import ewh.x;
import eyc.p;
import f1c.t;
import ip0.x10;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import m1c.l0;
import nii.h0;
import nii.u1;
import nii.y0;
import wim.z;
import zhm.u;
import zhm.w;
import zhm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f129986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f129986w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((BrebMoreScreen) this.f129986w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((AddToGooglePayViewController) this.f129986w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((com.revolut.feature.card_add_to_googlepay.impl.a) this.f129986w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((com.revolut.feature.credit.card.impl.ui.statement_financing.details.a) this.f129986w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                return new d((ewa.e) this.v, (String) this.f129986w, continuation, 4);
            case 5:
                return new d((ewa.e) this.v, (ReferrerDetails) this.f129986w, continuation, 5);
            case 6:
                d dVar5 = new d((AutoInvestMoveController) this.f129986w, continuation, 6);
                dVar5.v = obj2;
                return dVar5;
            case 7:
                d dVar6 = new d((ResetCardScaController) this.f129986w, continuation, 7);
                dVar6.v = obj2;
                return dVar6;
            case 8:
                d dVar7 = new d((ex2.l) this.f129986w, continuation, 8);
                dVar7.v = obj2;
                return dVar7;
            case 9:
                d dVar8 = new d((exe.l) this.f129986w, continuation, 9);
                dVar8.v = obj2;
                return dVar8;
            case 10:
                d dVar9 = new d((aah.g) this.f129986w, continuation, 10);
                dVar9.v = obj2;
                return dVar9;
            case 11:
                d dVar10 = new d((EntityHomeScreen) this.f129986w, continuation, 11);
                dVar10.v = obj2;
                return dVar10;
            case 12:
                d dVar11 = new d((com.revolut.feature.selfserve.entity.config.shared.ui.home.b) this.f129986w, continuation, 12);
                dVar11.v = obj2;
                return dVar11;
            case 13:
                d dVar12 = new d((RevPointsChallengesHomeScreen) this.f129986w, continuation, 13);
                dVar12.v = obj2;
                return dVar12;
            case 14:
                d dVar13 = new d((com.revolut.feature.rev_points.impl.ui.challenges.home.b) this.f129986w, continuation, 14);
                dVar13.v = obj2;
                return dVar13;
            case 15:
                return new d((com.revolut.feature.rev_points.impl.ui.challenges.home.b) this.v, (l0) this.f129986w, continuation, 15);
            case 16:
                d dVar14 = new d((com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) this.f129986w, continuation, 16);
                dVar14.v = obj2;
                return dVar14;
            case 17:
                d dVar15 = new d((SelectFreeStocksScreen) this.f129986w, continuation, 17);
                dVar15.v = obj2;
                return dVar15;
            case 18:
                d dVar16 = new d((f0e.d) this.f129986w, continuation, 18);
                dVar16.v = obj2;
                return dVar16;
            case 19:
                return new d((zjh.f) this.v, (wd6.e) this.f129986w, continuation, 19);
            case 20:
                d dVar17 = new d((t) this.f129986w, continuation, 20);
                dVar17.v = obj2;
                return dVar17;
            case 21:
                d dVar18 = new d((com.revolut.feature.wealth.asset.selection.impl.ui.flow.a) this.f129986w, continuation, 21);
                dVar18.v = obj2;
                return dVar18;
            case 22:
                d dVar19 = new d((cnh.f) this.f129986w, continuation, 22);
                dVar19.v = obj2;
                return dVar19;
            case 23:
                d dVar20 = new d((TravelFlightsBookingsScreen) this.f129986w, continuation, 23);
                dVar20.v = obj2;
                return dVar20;
            case 24:
                d dVar21 = new d((f5g.k) this.f129986w, continuation, 24);
                dVar21.v = obj2;
                return dVar21;
            case 25:
                d dVar22 = new d((f5h.c) this.f129986w, continuation, 25);
                dVar22.v = obj2;
                return dVar22;
            case 26:
                d dVar23 = new d((f6f.d) this.f129986w, continuation, 26);
                dVar23.v = obj2;
                return dVar23;
            case 27:
                return new d((f7a.e) this.v, (Bitmap) this.f129986w, continuation, 27);
            case 28:
                d dVar24 = new d((ManagedPortfolioDetailsActionsScreen) this.f129986w, continuation, 28);
                dVar24.v = obj2;
                return dVar24;
            default:
                d dVar25 = new d((f96.i) this.f129986w, continuation, 29);
                dVar25.v = obj2;
                return dVar25;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((i0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((j0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((ex2.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((fo3.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((ey5.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((g6f.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((ManagedPortfolioDetailsActionParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ContentResolver contentResolver;
        Uri uriInsert;
        Unit unit;
        int i = this.u;
        int i2 = 25;
        int i3 = 20;
        int i5 = 2;
        int i6 = 14;
        int i21 = 1;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj4 = this.f129986w;
        switch (i) {
            case 0:
                x10 model = (x10) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar = (j) ((BrebMoreScreen) obj4).S.getValue();
                Intrinsics.h(model);
                m mVar = (m) jVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f167082b.f58316a, "EXTEND_BLOCKING_PERIOD_ID")) {
                    mVar.l2(new q(R$string.bre_b_area_more_reactivate_key_extend_freeze_period_toast_title, i5, mVar, objArr == true ? 1 : 0), new eif.c(1, mVar, m.class, "handleGenericOperationError", "handleGenericOperationError(Ljava/lang/Throwable;)Z", 0, 21));
                }
                return Unit.f186387a;
            case 1:
                i0 i0Var = (i0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.card_add_to_googlepay.impl.a) ((b0) ((AddToGooglePayViewController) obj4).O.getValue())).L2(i0Var);
                return Unit.f186387a;
            case 2:
                j0 j0Var = (j0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_add_to_googlepay.impl.a aVar4 = (com.revolut.feature.card_add_to_googlepay.impl.a) obj4;
                aVar4.H2(aVar4.H, new eq4.c(aVar4, j0Var, 26));
                return Unit.f186387a;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement_financing.details.a aVar6 = (com.revolut.feature.credit.card.impl.ui.statement_financing.details.a) obj4;
                aVar6.H2(aVar6.f69759w, new epd.m(data, 19));
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z9h.n.l(String.class, ((ewa.e) this.v).f130118b, "REFERRAL_CODE_KEY", (String) obj4);
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((ewa.e) this.v).f130118b;
                ReferrerDetails referrerDetails = (ReferrerDetails) obj4;
                Intrinsics.checkNotNullParameter(referrerDetails, "<this>");
                cVar.G(new ewa.f(referrerDetails.f81678b, referrerDetails.f81677a), "REFERRER_DETAILS_KEY", z.d(o0.b(ewa.f.class)));
                return Unit.f186387a;
            case 6:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ewh.i iVar = (ewh.i) ((AutoInvestMoveController) obj4).P.getValue();
                Intrinsics.h(clickData);
                v vVar = (v) iVar;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj5 = clickData.d;
                if (obj5 instanceof ewh.h) {
                    vVar.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(((ewh.h) obj5).f130270a, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
                }
                return Unit.f186387a;
            case 7:
                String str = (String) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "IGNORE_MENU_ITEM_ID")) {
                    ((ex2.l) ((ResetCardScaController) obj4).d()).B2();
                }
                return Unit.f186387a;
            case 8:
                ex2.f fVar = (ex2.f) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ex2.l lVar = (ex2.l) obj4;
                lVar.H2(lVar.f130351s, new eu7.c(fVar, 17));
                return Unit.f186387a;
            case 9:
                fo3.c cVar2 = (fo3.c) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(((exe.l) obj4).f130417n.a(cVar2.f136805h, w4l.h.f294642c), new x(9));
            case 10:
                ey5.b bVar = (ey5.b) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (bVar == null) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ey5.d) ((aah.g) obj4).e).f3();
                return Unit.f186387a;
            case 11:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE3 = ((EntityHomeScreen) obj4).d();
                Intrinsics.h(clickData2);
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar2 = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) pVarE3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                bVar2.I2(clickData2.d);
                return Unit.f186387a;
            case 12:
                Data data2 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar3 = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) obj4;
                bVar3.H2(bVar3.f85856w, new epd.m(data2, 22));
                return Unit.f186387a;
            case 13:
                String tabId = (String) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ezb.h hVarE3 = ((RevPointsChallengesHomeScreen) obj4).d();
                Intrinsics.h(tabId);
                com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar4 = (com.revolut.feature.rev_points.impl.ui.challenges.home.b) hVarE3;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                bVar4.H2(bVar4.v, new e2j.i(tabId, i2));
                return Unit.f186387a;
            case 14:
                Data data3 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar5 = (com.revolut.feature.rev_points.impl.ui.challenges.home.b) obj4;
                bVar5.H2(bVar5.v, new epd.m(data3, 23));
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar6 = (com.revolut.feature.rev_points.impl.ui.challenges.home.b) this.v;
                l0 challenge = (l0) obj4;
                bVar6.f83785q.getClass();
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                return bVar6.X1(new y0("REV_POINTS_CHALLENGE_COMPLETED_DIALOG_ID", new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenge_v3_success_title, u.c(new TextClause(challenge.k, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenge_v3_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, h0.CONFETTI, (ResourceImage) null, 3068), false, 4));
            case 16:
                Pair pair = (Pair) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar7 = (com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) obj4;
                bVar7.H2(bVar7.v, new p0((Data) pair.f186386b, (Data) pair.f186385a, 16));
                return Unit.f186387a;
            case 17:
                List list = (List) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(list);
                List list2 = list;
                ArrayList stocks = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    stocks.add((nel.n) ((SpinnerPickerItemDelegateModel) it8.next()).d);
                }
                com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar8 = (com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) ((SelectFreeStocksScreen) obj4).R2();
                bVar8.getClass();
                Intrinsics.checkNotNullParameter(stocks, "stocks");
                bVar8.H2(bVar8.v, new c0(i3, stocks));
                return Unit.f186387a;
            case 18:
                Data data4 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0e.d dVar = (f0e.d) obj4;
                dVar.H2(dVar.f131112s, new epd.m(data4, 24));
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((xe0.e) ((zjh.f) this.v).f322835b).T2(((wd6.e) obj4).name(), String.class);
            case 20:
                Data data5 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) obj4;
                tVar.H2(tVar.f131255s, new epd.m(data5, i2));
                return Unit.f186387a;
            case 21:
                Set set = (Set) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.asset.selection.impl.ui.flow.a aVar25 = (com.revolut.feature.wealth.asset.selection.impl.ui.flow.a) obj4;
                int i22 = f2h.j.f131793a[aVar25.o.f95390b.ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar25.H2(aVar25.f95399r, new d0(i3, set));
                } else if (!set.isEmpty()) {
                    Iterator it9 = ((Iterable) aVar25.f95397p.f122098c.f290128a.getValue()).iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next = it9.next();
                            if (Intrinsics.f(((y1h.c) next).getId(), zhm.d0.a0(set))) {
                                obj3 = next;
                            }
                        }
                    }
                    aVar25.C2(new y1h.d(z0.h((y1h.c) obj3)));
                }
                return Unit.f186387a;
            case 22:
                e60.l lVar2 = (e60.l) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar2 instanceof e60.m) {
                    cnh.f fVar2 = (cnh.f) obj4;
                    fVar2.T2(new f5a.a(fVar2, ((e60.m) lVar2).b(), objArr2 == true ? 1 : 0, i21), new yi5.b(27));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Unsupported result: ".concat(lVar2.getClass().getSimpleName()));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 23:
                String bookingId = (String) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f5g.i iVar2 = (f5g.i) ((TravelFlightsBookingsScreen) obj4).P.getValue();
                Intrinsics.h(bookingId);
                f5g.k kVar = (f5g.k) iVar2;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                kVar.C2(new f5g.g(bookingId));
                return Unit.f186387a;
            case 24:
                Data data6 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f5g.k kVar2 = (f5g.k) obj4;
                kVar2.H2(kVar2.f132321p, new epd.m(data6, 28));
                return Unit.f186387a;
            case 25:
                xi0.b bVar9 = (xi0.b) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f5h.c cVar3 = (f5h.c) obj4;
                List list3 = (List) p.a.j(j5h.a.class, KTypeProjection.INSTANCE, List.class, cVar3.d, j6.a.q("commodity_additional_services_", bVar9.f306286a));
                if (list3 != null) {
                    return cVar3.f132327b.q(list3);
                }
                return null;
            case 26:
                g6f.a aVar30 = (g6f.a) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f6f.d dVar2 = (f6f.d) obj4;
                dVar2.H2(dVar2.f132423p, new f0m.c(aVar30, i6));
                return Unit.f186387a;
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", "rev_paynow_qr_code.jpg");
                contentValues.put("mime_type", "image/jpeg");
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                Intrinsics.checkNotNullExpressionValue(contentUri, "getContentUri(...)");
                try {
                    contentResolver = ((f7a.e) this.v).f132587b.getContentResolver();
                    uriInsert = contentResolver.insert(contentUri, contentValues);
                } catch (Exception e) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                }
                if (uriInsert != null) {
                    Bitmap bitmap = (Bitmap) obj4;
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream)) {
                                throw new RuntimeException("Failed to save bitmap.");
                            }
                            Unit unit2 = Unit.f186387a;
                            outputStreamOpenOutputStream.close();
                            unit = Unit.f186387a;
                        } finally {
                        }
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        return Unit.f186387a;
                    }
                }
                throw new RuntimeException("MediaStore returned a null URI");
            case 28:
                ManagedPortfolioDetailsActionParcel parcel = (ManagedPortfolioDetailsActionParcel) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f7f.f fVar3 = (f7f.f) ((ManagedPortfolioDetailsActionsScreen) obj4).N.getValue();
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                fVar3.C2(new f7f.d(parcel.f91350a));
                return Unit.f186387a;
            default:
                Data data7 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f96.i iVar3 = (f96.i) obj4;
                iVar3.H2(iVar3.f132845s, new epd.m(data7, 29));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f129986w = obj2;
    }
}
