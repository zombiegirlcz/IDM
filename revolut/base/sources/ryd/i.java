package ryd;

import aii.e0;
import android.content.Context;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.ui.text.input.EditCommand;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedAccountCouldNotBeLinkedOrCreated;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.statements.api.models.ProductItemStatementPeriod;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.ManagedPortfoliosDetailsFlowControllerContract$Step;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto.asset_details.common.api.model.CryptoAssetStats;
import com.revolut.revolut.feature_fourthline_impl.R;
import i6f.v;
import java.math.BigInteger;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kx7.y0;
import lk0.h;
import nii.z;
import ryj.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zw7.c0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f258345b;

    public /* synthetic */ i(StatementProductType statementProductType, w wVar) {
        this.f258344a = 0;
        this.f258345b = statementProductType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f258344a;
        int i2 = 26;
        int i3 = 17;
        int i5 = 5;
        boolean z = true;
        boolean z3 = true;
        int i6 = 4;
        boolean z4 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Continuation continuation = null;
        Object obj3 = this.f258345b;
        switch (i) {
            case 0:
                StatementProductType statementProductType = (StatementProductType) obj3;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList<io3.d> arrayList = new ArrayList();
                for (Object obj4 : pockets) {
                    io3.d dVar = (io3.d) obj4;
                    xi0.b bVarL = z92.f.l(dVar);
                    if (statementProductType == StatementProductType.COMMODITIES ? cp5.d.y(bVarL) : cp5.d.A(bVarL)) {
                        io3.k[] elements = {io3.k.ACTIVE, io3.k.INACTIVE, io3.k.DELISTED};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        if (kotlin.collections.d.y0(elements).contains(dVar.f)) {
                            arrayList.add(obj4);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (io3.d dVar2 : arrayList) {
                    arrayList2.add(new ProductItemStatementPeriod(dVar2.f163147c, dVar2.f163150j, null));
                }
                return new Pair(statementProductType, d0.i1(arrayList2));
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((y) obj3).f258426a;
            case 2:
                efm.i it8 = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.p(new j(new rsl.p(it8, (b1e.a) obj3, i3), 6));
            case 3:
                c0 petType = (c0) obj2;
                Intrinsics.checkNotNullParameter(petType, "petType");
                fx7.f fVar = ((rz7.a) obj3).f258516c;
                Intrinsics.checkNotNullParameter(petType, "petType");
                return m70.a.g(((y0) fVar.f138760a).b(petType, false), null, new l(11), 1);
            case 4:
                return TorchControl.updateTorchStrengthLevelAsync$lambda$0((TorchControl) obj3, (Throwable) obj2);
            case 5:
                return UseCaseManager.resumeDeferredComponentCreation$lambda$0$0((CameraGraph) obj3, (CameraGraph.Config) obj2);
            case 6:
                return UseCaseManager.defaultCameraGraphFactory$lambda$0((UseCaseManager) obj3, (CameraGraph.Config) obj2);
            case 7:
                RevPointsTransaction it9 = (RevPointsTransaction) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((s0c.e) obj3).f258933r.a(zhm.u.c(it9));
            case 8:
                return RecordingInputConnection.performHandwritingGesture$lambda$0((RecordingInputConnection) obj3, (EditCommand) obj2);
            case 9:
                com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar = (com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) obj3;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                yji.l.a1(eVar, eVar.X1(new nii.y0("CANCELLATION_DIALOG_ID", new z(new TextLocalisedClause(R$string.experiences_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new s1g.j(eVar, continuation, objArr == true ? 1 : 0), 3);
                return Boolean.TRUE;
            case 10:
                DeFiAssetDetails details = (DeFiAssetDetails) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                ((s26.a) obj3).getClass();
                return new CryptoAssetStats(details.f71668g, CryptoAssetStats.MarketCapRank.Undefined.f99945a, details.f71669h, details.i, details.f71670j);
            case 11:
                s29.b bVar = (s29.b) obj3;
                v19.a availability = (v19.a) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                MainScreenTab mainScreenTab = availability == v19.a.NOT_AVAILABLE ? null : ibb.c.e;
                if (mainScreenTab != null) {
                    bVar.f259273a.c(jbb.a.a(mainScreenTab, null, null, null, 14));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                KProperty[] kPropertyArr = TravelExperiencesOptionsV2Screen.i0;
                s2g.w wVar = (s2g.w) ((TravelExperiencesOptionsV2Screen) obj3).T2();
                wVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                wVar.f259337y.onNext(event);
                return Unit.f186387a;
            case 13:
                s2g.j updateState = (s2g.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return s2g.j.a(updateState, null, null, null, null, (TravelExperienceOptionSelectionV2) obj3, false, 47);
            case 14:
                s2g.j updateState2 = (s2g.j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return s2g.j.a(updateState2, null, null, null, null, (TravelExperienceOptionSelectionV2.OptionWithTimes) obj3, false, 47);
            case 15:
                s2g.j updateState3 = (s2g.j) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return s2g.j.a(updateState3, f0.f322471a, null, null, new pyf.d(((q3g.e) obj3).f241967a), null, false, 52);
            case 16:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return ((s2i.j) obj3).f259364b.a(command);
            case 17:
                com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a aVar = (com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a) obj3;
                t2k.e outputData = (t2k.e) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof t2k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.l2(new s09.c(aVar, ((t2k.d) outputData).f267589a, continuation, i6), new yi5.b(i2));
                oki.h.D2(aVar.f102009r);
                return Unit.f186387a;
            case 18:
                com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a) obj3;
                g12.q outputData2 = (g12.q) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof g12.p) {
                    g12.m mVar = ((g12.p) outputData2).f139527a;
                    s32.i iVar = mVar instanceof s32.i ? (s32.i) mVar : null;
                    if (iVar == null) {
                        yji.l.a1(aVar2, aVar2.X1(new nii.y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_qr_label_error, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new s1k.b(aVar2, continuation, i6), 3);
                    } else {
                        aVar2.C2(new g12.i(iVar.f259404a));
                    }
                } else {
                    if (!(outputData2 instanceof g12.o) && !(outputData2 instanceof g12.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ali.b bVar2 = aVar2.f62376r;
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    bVar2.f6270b.k(ali.j.f6279a);
                }
                return Unit.f186387a;
            case 19:
                s33.b params = (s33.b) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (d13.a) ((s33.e) obj3).f259413b.get(params.toString());
            case 20:
                DefiCurrency defiCurrency = ((DeFiAssetDetails) obj2).f71665a;
                ((k18.c) obj3).getClass();
                String str = defiCurrency.f71671a;
                BigInteger ZERO = BigInteger.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                int i21 = defiCurrency.d;
                Instant EPOCH = Instant.EPOCH;
                Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
                Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
                m70.a.c(t0.f186434a);
                return new DeFiBalance(str, ZERO, i21, null, EPOCH, EPOCH, "", defiCurrency.f71673c);
            case 21:
                s38.n nVar = (s38.n) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                nVar.getClass();
                nVar.L2(new nii.y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 5));
                return Boolean.TRUE;
            case 22:
                s3d.k kVar = (s3d.k) obj3;
                aii.u destination = (aii.u) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (kVar.e) {
                    destination = new e0(destination, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), false, 4);
                }
                return kVar.c(destination);
            case 23:
                s44.g gVar = (s44.g) obj3;
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new s44.m(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_title, zhm.u.c(gVar.f259754a), null, 12), s44.q.a(gVar.f259755b), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_continue, null, null, 14), (List) getDefaultLoadingItems.invoke(), false);
            case 24:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr2 = CollectionScreen.Y;
                Intrinsics.checkNotNullParameter(context, "context");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(context, 2, 12);
                screenGridLayoutManager.setSpanSizeLookup(new s4f.c((CollectionScreen) obj3, screenGridLayoutManager));
                return screenGridLayoutManager;
            case 25:
                s56.o update = (s56.o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return s56.o.a(update, ((nqi.a) obj3).f218468b, null, null, null, null, null, null, null, null, null, 2045);
            case 26:
                return s56.o.a((s56.o) obj2, null, null, (s56.s) obj3, null, null, null, null, null, null, null, 2039);
            case 27:
                s6b.m mVar2 = (s6b.m) obj3;
                cli.y yVar = mVar2.f260210r;
                Throwable t2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(t2, "t");
                if (t2 instanceof CobrandedAccountCouldNotBeLinkedOrCreated) {
                    mVar2.H2(yVar, new s65.r(z ? 1 : 0));
                    mVar2.H2(yVar, new rk.b(z4, i5));
                } else {
                    mVar2.H2(yVar, new rk.b(objArr2 == true ? 1 : 0, i5));
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 28:
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a aVar3 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a) obj3;
                i6f.v it10 = (i6f.v) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (Intrinsics.f(it10, v.b.f158986a)) {
                    oki.h.D2(aVar3.f91317q);
                } else if (Intrinsics.f(it10, v.c.f158987a)) {
                    oki.h.t2(aVar3, aVar3.f91317q, ManagedPortfoliosDetailsFlowControllerContract$Step.TopHoldings.f91315a, true, null, false, 12);
                } else if (it10 instanceof i6f.u) {
                    aVar3.l2(new s09.c(aVar3, it10, continuation, i3), new yi5.b(i2));
                } else if (Intrinsics.f(it10, v.a.f158985a)) {
                    oki.h.t2(aVar3, aVar3.f91317q, ManagedPortfoliosDetailsFlowControllerContract$Step.ExploreInsights.f91312a, true, null, false, 12);
                } else {
                    if (!(it10 instanceof i6f.w)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar3, aVar3.f91317q, new ManagedPortfoliosDetailsFlowControllerContract$Step.StrategyReport(((i6f.w) it10).f158988a), true, null, false, 12);
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (DerivativesBalance) ((s76.b) obj3).f260524b.get("DERIVATIVES_BALANCES_CACHE_KEY");
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f258344a = i;
        this.f258345b = obj2;
    }

    public /* synthetic */ i(s44.q qVar, s44.g gVar) {
        this.f258344a = 23;
        this.f258345b = gVar;
    }
}
