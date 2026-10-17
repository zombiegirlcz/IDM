package osk;

import cli.y;
import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.cash_topup.api.declaration.CashTopUpReportIssueDestination;
import com.revolut.feature.credit.application.plugins.api.models.WaitingListPromptContent;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.help.impl.network.CreditHelpService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationService;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandsResponse;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferenceOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferencesResponse;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationUpdateBrandsRequest;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationUpdatePreferencesRequest;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.store.core.api.model.StoreProductOption;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreenContract$InputData;
import dx4.a1;
import dx4.y0;
import ft3.g1;
import ft3.h1;
import ft3.j1;
import hxb.a0;
import hxb.b0;
import ii4.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import l14.a;
import le.u1;
import m1c.x;
import p24.v;
import q90.l1;
import skm.k0;
import tsk.t;
import vkm.j2;
import vkm.z1;
import xzg.n0;
import zh9.u0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f229349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f229350x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f229349w = obj2;
        this.f229350x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((n) this.f229349w, (ruk.h) this.f229350x, continuation, 0);
            case 1:
                return new m((com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a) this.f229349w, (String) this.f229350x, continuation, 1);
            case 2:
                return new m((com.revolut.trading.orders.ui.invest.placement.target_price.b) this.f229349w, (oul.r) this.f229350x, continuation, 2);
            case 3:
                return new m((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) this.f229349w, (String) this.f229350x, continuation, 3);
            case 4:
                return new m((com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) this.f229349w, (StoreProductOption) this.f229350x, continuation, 4);
            case 5:
                m mVar = new m((com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) this.f229350x, continuation, 5);
                mVar.f229349w = obj2;
                return mVar;
            case 6:
                m mVar2 = new m((Data) this.f229350x, continuation, 6);
                mVar2.f229349w = obj2;
                return mVar2;
            case 7:
                m mVar3 = new m((nx.b) this.f229350x, continuation, 7);
                mVar3.f229349w = obj2;
                return mVar3;
            case 8:
                return new m((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) this.f229349w, (dw5.b) this.f229350x, continuation, 8);
            case 9:
                return new m((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) this.f229349w, (g6) this.f229350x, continuation, 9);
            case 10:
                return new m((oxb.f) this.f229349w, (RevPointsPersonalisationUpdateBrandsRequest) this.f229350x, continuation, 10);
            case 11:
                return new m((oxb.f) this.f229349w, (RevPointsPersonalisationUpdatePreferencesRequest) this.f229350x, continuation, 11);
            case 12:
                return new m((com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) this.f229349w, (oy6.f) this.f229350x, continuation, 12);
            case 13:
                return new m((oyl.b) this.f229350x, continuation, 13);
            case 14:
                return new m((p15.b) this.f229349w, (j1) this.f229350x, continuation, 14);
            case 15:
                return new m((p15.b) this.f229349w, (String) this.f229350x, continuation, 15);
            case 16:
                return new m((v) this.f229349w, (j1) this.f229350x, continuation, 16);
            case 17:
                return new m((p34.a) this.f229349w, (h1) this.f229350x, continuation, 17);
            case 18:
                m mVar4 = new m((com.revolut.feature.store.impl.ui.root.b) this.f229350x, continuation, 18);
                mVar4.f229349w = obj2;
                return mVar4;
            case 19:
                return new m((com.revolut.chat.ui.chat_profile.profile_screen.b) this.f229349w, (p50.k) this.f229350x, continuation, 19);
            case 20:
                return new m((p54.m) this.f229349w, (CreditApplicationPluginFlowContract$Configuration) this.f229350x, continuation, 20);
            case 21:
                return new m((it3.d) this.f229349w, (p54.m) this.f229350x, continuation, 21);
            case 22:
                return new m((com.revolut.feature.apm.iris.impl.ui.settings.a) this.f229349w, (Alias) this.f229350x, continuation, 22);
            case 23:
                return new m((com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) this.f229349w, (String) this.f229350x, continuation, 23);
            case 24:
                return new m((lg0.b) this.f229349w, (String) this.f229350x, continuation, 24);
            case 25:
                return new m((com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c) this.f229349w, (String) this.f229350x, continuation, 25);
            case 26:
                return new m((com.revolut.feature.junior.isa.impl.ui.jisa_details.a) this.f229349w, (bj0.b) this.f229350x, continuation, 26);
            case 27:
                return new m((pb3.b) this.f229349w, (jf0.c) this.f229350x, continuation, 27);
            case 28:
                return new m((File) this.f229349w, (cuc.c) this.f229350x, continuation, 28);
            default:
                return new m((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) this.f229349w, (String) this.f229350x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v10, types: [m1c.x] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objB;
        lx.a aVar;
        Throwable th10;
        Throwable th11;
        n0 filter;
        Object financialDifficultyContent;
        Object resumeApplicationState;
        Object waitingListPromptContent;
        Object loanSelectionConfiguration;
        a1 a1VarA;
        Object objC;
        Object objB2;
        Object objB3;
        Object objInvoke;
        int i = this.u;
        Object obj3 = null;
        hs3.v vVar = null;
        l15.c cVar = null;
        lx.a aVar2 = null;
        Object obj4 = this.f229350x;
        int i2 = 1;
        switch (i) {
            case 0:
                n nVar = (n) this.f229349w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarE = ((ael.k) nVar.f229355q).e(nVar.f229351l.f229345a);
                    this.v = 1;
                    objB = nim.a.b(iVarE, this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                nel.n nVar2 = (nel.n) objB;
                Intrinsics.h(nVar2);
                return nVar.A2(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AnalystDetailsDestination(new AnalystDetailsScreenContract$InputData(nVar2, ((c) ((j2) nVar.f229356r.f22677a).getValue()).f229341a, (ruk.h) obj4)), false, (Integer) null, 0, 61))));
            case 1:
                com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a aVar4 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a) this.f229349w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    nel.n nVar3 = (nel.n) ((otk.f) ((j2) aVar4.v.f22677a).getValue()).f229727c.getContent();
                    if (nVar3 == null) {
                        return null;
                    }
                    l1d.a aVar6 = aVar4.f103846t;
                    y1d.b.Companion.getClass();
                    FavouritesAssetTypeKey favouritesAssetTypeKey = y1d.a.e;
                    AssetIdWithSymbol assetIdWithSymbol = new AssetIdWithSymbol(nVar3.f214596b, nVar3.e);
                    xi0.b bVar = nVar3.i;
                    this.v = 1;
                    if (aVar6.b3((String) obj4, favouritesAssetTypeKey, assetIdWithSymbol, bVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar2 = (com.revolut.trading.orders.ui.invest.placement.target_price.b) this.f229349w;
                mcg.j jVar = new mcg.j((oul.r) obj4, bVar2, xVar, 5);
                this.v = 1;
                Object objB4 = pu7.a.B(bVar2.k, "on_validation_error_click", jVar, this);
                return objB4 == aVar7 ? aVar7 : objB4;
            case 3:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar9 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) this.f229349w).f76108p, (String) obj4, aVar9, null, this, 4);
                return objX1 == aVar8 ? aVar8 : objX1;
            case 4:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) this.f229349w;
                    com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.c cVar2 = new com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.c(dVar, (StoreProductOption) obj4, null);
                    this.v = 1;
                    if (u0.b0(dVar.X(), "PURCHASE_BUTTON_TAG", cVar2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar2 = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) obj4;
                y yVar = dVar2.f83612y;
                Data data = (Data) this.f229349w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    Object content = data.getContent();
                    ovb.g gVar = content instanceof ovb.g ? (ovb.g) content : null;
                    x xVar = gVar != null ? gVar.f230018a : null;
                    com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b bVar3 = ((ovb.e) ((j2) yVar.f22677a).getValue()).f230014b;
                    ovb.g gVar2 = bVar3 instanceof ovb.g ? (ovb.g) bVar3 : null;
                    xVar = gVar2 != null ? gVar2.f230018a : 0;
                    if (xVar != 0 && xVar != null && !xVar.f201472c.equals(xVar.f201472c)) {
                        i4b.f fVar = dVar2.f83606q;
                        String str = dVar2.o.f83596a;
                        this.f229349w = data;
                        this.v = 1;
                        if (fVar.l(str, this) == aVar11) {
                            return aVar11;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar2.H2(yVar, new oph.k(data, 23));
                return Unit.f186387a;
            case 6:
                FlowCollector flowCollector = (FlowCollector) this.f229349w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.f229349w = null;
                    this.v = 1;
                    if (flowCollector.emit((Data) obj4, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                lx.a aVar13 = (lx.a) this.f229349w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    od0.a aVar15 = od0.a.f224253a;
                    if (od0.a.i()) {
                        aVar = aVar13;
                        Unit unit = Unit.f186387a;
                        mra.d.l(aVar, null);
                        return Unit.f186387a;
                    }
                    z1 z1Var = ((nx.b) obj4).f220039b;
                    dx.p pVar = new dx.p(new CameraKitException("BarcodeSuccessDetector mustn't be used outside of UI test environment", (Throwable) null, 6), f0.f322471a);
                    this.f229349w = null;
                    this.v = 2;
                    if (z1Var.emit(pVar, this) == aVar14) {
                        return aVar14;
                    }
                    return Unit.f186387a;
                }
                if (i43 != 1) {
                    if (i43 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return Unit.f186387a;
                }
                try {
                    yhm.o.b(obj2);
                    aVar = null;
                    try {
                        Unit unit2 = Unit.f186387a;
                        mra.d.l(aVar, null);
                        return Unit.f186387a;
                    } catch (Throwable th12) {
                        th10 = th12;
                        aVar2 = aVar;
                        th11 = th10;
                        try {
                            throw th11;
                        } catch (Throwable th13) {
                            mra.d.l(aVar2, th11);
                            throw th13;
                        }
                    }
                } catch (Throwable th14) {
                    th10 = th14;
                    th11 = th10;
                    throw th11;
                }
            case 8:
                my5.d dVar3 = ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) this.f229349w).f71568r;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarB = dVar3.b(((dw5.b) obj4).f120335a);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i59 != 1) {
                        if (i59 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                efm.b bVarA = dVar3.a();
                this.v = 2;
                if (nim.a.a(bVarA, this) == aVar16) {
                    return aVar16;
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    b9k.f fVar2 = ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) this.f229349w).v;
                    String selectedTabId = ((g6) obj4).f54199a;
                    w0h.d assetType = w0h.d.CRYPTO;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
                    Intrinsics.checkNotNullParameter(assetType, "assetType");
                    if (Intrinsics.f(selectedTabId, "top_movers.tab_top_losers")) {
                        filter = n0.LOSERS;
                    } else {
                        if (!Intrinsics.f(selectedTabId, "top_movers.tab_top_gainers")) {
                            throw new IllegalArgumentException(j6.a.q("Either top_movers.tab_top_losers or top_movers.tab_top_gainers Tab can be selected. Actual TabId: ", selectedTabId));
                        }
                        filter = n0.GAINERS;
                    }
                    Intrinsics.checkNotNullParameter(assetType, "assetType");
                    Intrinsics.checkNotNullParameter(filter, "filter");
                    pfm.r rVarU = ((t) fVar2.f13817b).u(b9k.f.D(assetType), filter);
                    this.v = 1;
                    if (nim.a.a(rVarU, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                RevPointsPersonalisationUpdateBrandsRequest revPointsPersonalisationUpdateBrandsRequest = (RevPointsPersonalisationUpdateBrandsRequest) obj4;
                List list = revPointsPersonalisationUpdateBrandsRequest.f84033a;
                oxb.f fVar3 = (oxb.f) this.f229349w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    RevPointsPersonalisationService revPointsPersonalisationService = fVar3.f230761a;
                    Intrinsics.checkNotNullParameter(revPointsPersonalisationUpdateBrandsRequest, "<this>");
                    a0 a0Var = new a0(list);
                    this.v = 1;
                    if (revPointsPersonalisationService.updateBrands(a0Var, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i74 != 1) {
                        if (i74 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                RevPointsPersonalisationBrandsResponse revPointsPersonalisationBrandsResponse = (RevPointsPersonalisationBrandsResponse) fVar3.f230763c.get("PERSONALISATION_BRANDS_MEM_KEY");
                if (revPointsPersonalisationBrandsResponse == null) {
                    vxb.n nVar4 = (vxb.n) j6.a.k(vxb.n.class, fVar3.f230762b, "PERSONALISATION_BRANDS_STORAGE_KEY");
                    RevPointsPersonalisationBrandsResponse revPointsPersonalisationBrandsResponseW = nVar4 != null ? ksj.b.w(nVar4) : null;
                    if (revPointsPersonalisationBrandsResponseW == null) {
                        return Unit.f186387a;
                    }
                    revPointsPersonalisationBrandsResponse = revPointsPersonalisationBrandsResponseW;
                }
                x4l.c cVar3 = fVar3.e;
                Unit unit3 = Unit.f186387a;
                ArrayList<RevPointsPersonalisationBrandOption> arrayList = revPointsPersonalisationBrandsResponse.f84015b;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (RevPointsPersonalisationBrandOption revPointsPersonalisationBrandOption : arrayList) {
                    arrayList2.add(RevPointsPersonalisationBrandOption.a(revPointsPersonalisationBrandOption, list.contains(revPointsPersonalisationBrandOption.f84011a)));
                }
                RevPointsPersonalisationBrandsResponse revPointsPersonalisationBrandsResponseA = RevPointsPersonalisationBrandsResponse.a(revPointsPersonalisationBrandsResponse, arrayList2);
                this.v = 2;
                if (cVar3.f(unit3, revPointsPersonalisationBrandsResponseA, this) == aVar18) {
                    return aVar18;
                }
                return Unit.f186387a;
            case 11:
                RevPointsPersonalisationUpdatePreferencesRequest revPointsPersonalisationUpdatePreferencesRequest = (RevPointsPersonalisationUpdatePreferencesRequest) obj4;
                List list2 = revPointsPersonalisationUpdatePreferencesRequest.f84034a;
                oxb.f fVar4 = (oxb.f) this.f229349w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    RevPointsPersonalisationService revPointsPersonalisationService2 = fVar4.f230761a;
                    Intrinsics.checkNotNullParameter(revPointsPersonalisationUpdatePreferencesRequest, "<this>");
                    b0 b0Var = new b0(list2);
                    this.v = 1;
                    if (revPointsPersonalisationService2.updatePreferences(b0Var, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i92 != 1) {
                        if (i92 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                RevPointsPersonalisationPreferencesResponse revPointsPersonalisationPreferencesResponse = (RevPointsPersonalisationPreferencesResponse) fVar4.f230763c.get("PERSONALISATION_PREFERENCES_MEM_KEY");
                if (revPointsPersonalisationPreferencesResponse == null) {
                    vxb.p pVar2 = (vxb.p) j6.a.k(vxb.p.class, fVar4.f230762b, "PERSONALISATION_PREFERENCES_STORAGE_KEY");
                    RevPointsPersonalisationPreferencesResponse revPointsPersonalisationPreferencesResponseX = pVar2 != null ? ksj.b.x(pVar2) : null;
                    if (revPointsPersonalisationPreferencesResponseX == null) {
                        return Unit.f186387a;
                    }
                    revPointsPersonalisationPreferencesResponse = revPointsPersonalisationPreferencesResponseX;
                }
                x4l.c cVar4 = fVar4.d;
                Unit unit4 = Unit.f186387a;
                ArrayList<RevPointsPersonalisationPreferenceOption> arrayList3 = revPointsPersonalisationPreferencesResponse.f84020b;
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                for (RevPointsPersonalisationPreferenceOption revPointsPersonalisationPreferenceOption : arrayList3) {
                    arrayList4.add(RevPointsPersonalisationPreferenceOption.a(revPointsPersonalisationPreferenceOption, list2.contains(revPointsPersonalisationPreferenceOption.f84016a)));
                }
                RevPointsPersonalisationPreferencesResponse revPointsPersonalisationPreferencesResponseA = RevPointsPersonalisationPreferencesResponse.a(revPointsPersonalisationPreferencesResponse, arrayList4);
                this.v = 2;
                if (cVar4.f(unit4, revPointsPersonalisationPreferencesResponseA, this) == aVar19) {
                    return aVar19;
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar21 = (com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) this.f229349w;
                oy6.p pVar3 = new oy6.p(aVar21, (oy6.f) obj4, (Continuation) null);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar21.k, "update_invoice_settings", pVar3, this);
                return objB5 == aVar20 ? aVar20 : objB5;
            case 13:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                try {
                } catch (Throwable th15) {
                    jyl.g gVar3 = ((oyl.b) obj4).f231055g;
                    this.f229349w = th15;
                    this.v = 2;
                    if (gVar3.a(this) != aVar22) {
                        throw th15;
                    }
                }
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.a(this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th16 = (Throwable) this.f229349w;
                        yhm.o.b(obj2);
                        throw th16;
                    }
                    yhm.o.b(obj2);
                }
                throw new KotlinNothingValueException();
            case 14:
                Object iVar = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    CreditHelpService creditHelpService = ((p15.b) this.f229349w).f231873a;
                    String strI = g1.i((j1) obj4);
                    this.v = 1;
                    financialDifficultyContent = creditHelpService.getFinancialDifficultyContent(strI, this);
                    if (financialDifficultyContent != iVar) {
                    }
                    return iVar;
                }
                if (i100 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                financialDifficultyContent = obj2;
                o15.c cVar5 = (o15.c) financialDifficultyContent;
                Intrinsics.checkNotNullParameter(cVar5, "<this>");
                String title = cVar5.getTitle();
                o15.a contactSection = cVar5.getContactSection();
                Intrinsics.checkNotNullParameter(contactSection, "<this>");
                l15.a aVar23 = new l15.a(contactSection.getTitle(), contactSection.getDescription(), contactSection.getButton());
                o15.b debtAdvice = cVar5.getDebtAdvice();
                if (debtAdvice != null) {
                    Intrinsics.checkNotNullParameter(debtAdvice, "<this>");
                    cVar = new l15.c(debtAdvice.getTitle(), debtAdvice.getDescription());
                }
                iVar = new l15.i(title, aVar23, cVar, cVar5.getButton());
                return iVar;
            case 15:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    resumeApplicationState = ((p15.b) this.f229349w).f231873a.getResumeApplicationState((String) obj4, this);
                    if (resumeApplicationState == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    resumeApplicationState = obj2;
                }
                n15.d dVar4 = (n15.d) resumeApplicationState;
                Object obj5 = n15.e.f211245a;
                Intrinsics.checkNotNullParameter(dVar4, "<this>");
                String title2 = dVar4.getTitle();
                String str2 = title2 == null ? "" : title2;
                String infoTitle = dVar4.getInfoTitle();
                String str3 = infoTitle == null ? "" : infoTitle;
                String infoDescription = dVar4.getInfoDescription();
                String str4 = infoDescription == null ? "" : infoDescription;
                boolean zJ = pd.b.j(dVar4.getIsTerminated());
                String buttonText = dVar4.getButtonText();
                String buttonAction = dVar4.getButtonAction();
                return new l15.k(str2, str3, str4, zJ, buttonText, buttonAction != null ? (l15.j) u1.v(buttonAction, n15.e.f211245a) : null);
            case 16:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = ((v) this.f229349w).f232067a;
                    String strI2 = g1.i((j1) obj4);
                    this.v = 1;
                    waitingListPromptContent = creditPluginsService.getWaitingListPromptContent(strI2, this);
                    if (waitingListPromptContent == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    waitingListPromptContent = obj2;
                }
                f24.m mVar = (f24.m) waitingListPromptContent;
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                return new WaitingListPromptContent(mVar.getIllustration(), mVar.getTitle(), mVar.getSubtitle(), mVar.getButtonTitle());
            case 17:
                p34.a aVar26 = (p34.a) this.f229349w;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService2 = aVar26.f232598a;
                    String str5 = ((h1) obj4).f137835a;
                    this.v = 1;
                    loanSelectionConfiguration = creditPluginsService2.getLoanSelectionConfiguration(str5, this);
                    if (loanSelectionConfiguration == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    loanSelectionConfiguration = obj2;
                }
                l14.a dto = (l14.a) loanSelectionConfiguration;
                l14.b bVar4 = aVar26.f232600c;
                Intrinsics.checkNotNullParameter(dto, "dto");
                String title3 = dto.getTitle();
                List<a.C1085a> loans = dto.getLoans();
                ArrayList arrayList5 = new ArrayList(w.t(loans, 10));
                for (a.C1085a c1085a : loans) {
                    String id10 = c1085a.getId();
                    String icon = c1085a.getIcon();
                    if (icon != null) {
                        a1.Companion.getClass();
                        a1VarA = y0.a(icon);
                    } else {
                        a1VarA = null;
                    }
                    arrayList5.add(new vy3.a(id10, a1VarA, c1085a.getTitle(), c1085a.getDescription(), c1085a.getValue(), c1085a.getValueDescription()));
                }
                return new vy3.b(title3, arrayList5);
            case 18:
                CoroutineScope coroutineScope = (CoroutineScope) this.f229349w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.store.impl.ui.root.b bVar5 = (com.revolut.feature.store.impl.ui.root.b) obj4;
                    com.revolut.feature.store.impl.ui.root.a aVar29 = new com.revolut.feature.store.impl.ui.root.a(coroutineScope, bVar5, null);
                    this.f229349w = null;
                    this.v = 1;
                    if (bVar5.p2(this, aVar29) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.chat.ui.chat_profile.profile_screen.b) this.f229349w).f51135s.h((p50.k) obj4, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xq3.j jVar2 = ((p54.m) this.f229349w).f233013m;
                String str6 = ((CreditApplicationPluginFlowContract$Configuration) obj4).f66892b;
                this.v = 1;
                Object objF = jVar2.f(str6, this);
                return objF == aVar31 ? aVar31 : objF;
            case 21:
                it3.d dVar5 = (it3.d) this.f229349w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                try {
                    if (i107 == 0) {
                        yhm.o.b(obj2);
                        hs3.v vVar2 = dVar5.e;
                        if (!(vVar2 instanceof hs3.u1)) {
                            List list3 = dVar5.f;
                            if (list3 != null) {
                                Iterator it8 = list3.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        Object next = it8.next();
                                        if (next instanceof hs3.u1) {
                                            obj3 = next;
                                        }
                                    }
                                }
                                vVar = (hs3.v) obj3;
                            }
                        } else {
                            if (vVar2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.SpinnerMetadata");
                            }
                            vVar = (hs3.u1) vVar2;
                        }
                        if (((hs3.u1) vVar) == null) {
                            return dVar5;
                        }
                        ii4.o oVar = ((p54.m) obj4).o;
                        this.v = 1;
                        objC = ((z) oVar).c(dVar5, this);
                        if (objC == aVar32) {
                            return aVar32;
                        }
                    } else {
                        if (i107 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objC = obj2;
                    }
                    return (it3.d) objC;
                } catch (Exception unused) {
                    return dVar5;
                }
            case 22:
                com.revolut.feature.apm.iris.impl.ui.settings.a aVar33 = (com.revolut.feature.apm.iris.impl.ui.settings.a) this.f229349w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    p62.m mVar2 = new p62.m(aVar33, (Alias) obj4, xVar, i2);
                    this.v = 1;
                    objB2 = pu7.a.B(aVar33.k, "DEREGISTER_TASK_ID", mVar2, this);
                    if (objB2 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                aVar33.J2((zz1.e) objB2);
                return Unit.f186387a;
            case 23:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar36 = lg0.a.IGNORE;
                this.v = 1;
                Object objX12 = lg0.b.x1(((com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) this.f229349w).f91372p, (String) obj4, aVar36, null, this, 4);
                return objX12 == aVar35 ? aVar35 : objX12;
            case 24:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar38 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX13 = lg0.b.x1((lg0.b) this.f229349w, (String) obj4, aVar38, null, this, 4);
                return objX13 == aVar37 ? aVar37 : objX13;
            case 25:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c) this.f229349w;
                pa4.g gVar4 = new pa4.g(cVar6, (String) obj4, xVar, i2);
                this.v = 1;
                Object objP2 = cVar6.p2(this, gVar4);
                return objP2 == aVar39 ? aVar39 : objP2;
            case 26:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar41 = (com.revolut.feature.junior.isa.impl.ui.jisa_details.a) this.f229349w;
                ol8.e eVar = new ol8.e(aVar41, (bj0.b) obj4, xVar, 17);
                this.v = 1;
                Object objP22 = aVar41.p2(this, eVar);
                return objP22 == aVar40 ? aVar40 : objP22;
            case 27:
                pb3.b bVar6 = (pb3.b) this.f229349w;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objB3 = bVar6.b((jf0.c) obj4, this);
                    if (objB3 == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB3 = obj2;
                }
                CashTopUpReportIssueDestination cashTopUpReportIssueDestination = (CashTopUpReportIssueDestination) objB3;
                FeatureCommand featureCommandC = cashTopUpReportIssueDestination != null ? vhi.c.c(cashTopUpReportIssueDestination, yhi.b.SOLID, null, false, 12) : null;
                if (featureCommandC != null) {
                    bVar6.f234629c.c(featureCommandC);
                }
                return Boolean.TRUE;
            case 28:
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    okhttp3.c cVarB0 = hx7.i.b0((File) this.f229349w);
                    this.v = 1;
                    objInvoke = ((cuc.c) obj4).invoke(cVarB0, this);
                    if (objInvoke == aVar43) {
                        return aVar43;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objInvoke = obj2;
                }
                return ((l1) objInvoke).getId();
            default:
                String str7 = (String) obj4;
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) this.f229349w;
                fim.a aVar44 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ol8.e eVar2 = new ol8.e(dVar6, str7, xVar, 18);
                this.v = 1;
                Object objB6 = pu7.a.B(dVar6.k, "remove document " + str7, eVar2, this);
                return objB6 == aVar44 ? aVar44 : objB6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f229350x = obj2;
    }
}
