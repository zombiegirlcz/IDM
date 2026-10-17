package qg7;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.impl.utils.WorkProgressUpdater;
import au0.p3;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.data.model.Data;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.product.onboarding.domain.models.DeclarationValue;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.a;
import com.revolut.feature.settings.preview.displayAmount.DisplayAmountToggleController;
import com.revolut.feature.settings.preview.displayAmount.DisplayAmountToggleControllerContract$InputData;
import com.revolut.feature.shared.order_initiation.impl.data.database.OrderInitiationPageDatabase;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$InputData;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pending_payments.impl.ui.PendingPaymentFlowContract$Step;
import h93.l0;
import ix0.i2;
import ix0.j2;
import ix0.n1;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import no.r1;
import okhttp3.Cache;
import skm.e0;
import ttl.a0;
import ulm.i1;
import ulm.j1;
import ulm.r0;
import ulm.v0;
import ulm.x0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f245677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f245678c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj2, int i, Object obj3, Object obj4) {
        this.f245676a = i;
        this.f245677b = obj2;
        this.f245678c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.time.LocalDate] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        CheckoutOrder checkoutOrder;
        pi3.d dVar;
        efm.b bVarW;
        List listA;
        i1 i1VarB;
        v0 v0VarG;
        int i = this.f245676a;
        int i2 = 13;
        int i3 = 8;
        int i5 = 4;
        int i6 = 2;
        int i21 = 0;
        Object obj2 = this.f245678c;
        Object obj3 = this.d;
        Object obj4 = this.f245677b;
        switch (i) {
            case 0:
                u uVar = (u) obj4;
                String str = (String) obj2;
                String str2 = (String) obj3;
                uVar.n2(new p(uVar, "rejectReward", str2, new m(uVar, str, null, i6), (Continuation) null), new j(uVar, str, str2, z ? 1 : 0));
                return Unit.f186387a;
            case 1:
                StakeController stakeController = (StakeController) obj4;
                StakingProduct stakingProduct = (StakingProduct) obj2;
                StakingPocket stakingPocket = (StakingPocket) obj3;
                KProperty[] kPropertyArr = StakeController.T;
                phm.a aVar = (phm.a) ue0.e.j(stakeController.m2()).a().get(qud.c.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", qud.c.class, " is not found"));
                }
                Object objB = aVar2.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.staking.impl.declaration.di.StakingApiComponent");
                return new qud.b(((qud.c) objB).f249379y, stakeController, new StakeControllerContract$InputData(stakingProduct, stakingPocket));
            case 2:
                cxe.l lVar = (cxe.l) obj4;
                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) obj2;
                SelectedMethod selectedMethod = (SelectedMethod) obj3;
                CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order = lVar.f109956j;
                CheckoutScreenContract$CheckoutContent$Order.Checkout checkout = checkoutScreenContract$CheckoutContent$Order instanceof CheckoutScreenContract$CheckoutContent$Order.Checkout ? (CheckoutScreenContract$CheckoutContent$Order.Checkout) checkoutScreenContract$CheckoutContent$Order : null;
                l0 l0Var = (checkout == null || (checkoutOrder = checkout.f90710a) == null || (dVar = checkoutOrder.d) == null) ? null : dVar.f236396n;
                dj0.d dVar2 = lVar.f109955h;
                xi0.b bVar = dVar2.f115083b;
                TopUpTarget topUpTargetB = kxe.a.b(lVar.i);
                CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order2 = lVar.f109956j;
                List list = lVar.k;
                CheckoutCardPlan checkoutCardPlan = lVar.f109957l;
                CheckoutFlowContract$InputData checkoutFlowContract$InputData = eVar.o;
                yte.n nVar = eVar.N;
                yki.a aVar3 = eVar.M;
                if (selectedMethod instanceof vye.b) {
                    CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData = ((vye.b) selectedMethod).e;
                    oki.h.t2(eVar, aVar3, cardDetailsScreenDescriptor$OutputData$CardData == null ? CheckoutFlowContract$Step.CardDetails.f90673a : new CheckoutFlowContract$Step.NewCardTopUp(new TopupWithNewCardFlowDescriptor$InputData(cardDetailsScreenDescriptor$OutputData$CardData.f90484a, cardDetailsScreenDescriptor$OutputData$CardData.f90485b, cardDetailsScreenDescriptor$OutputData$CardData.f90486c, dVar2, checkoutFlowContract$InputData.f90670c, cardDetailsScreenDescriptor$OutputData$CardData.d, (String) null, (Boolean) null, 416)), true, null, false, 12);
                } else if (selectedMethod instanceof vye.d) {
                    vye.c cVar = ((vye.d) selectedMethod).e;
                    int i22 = qwe.f.f249893b[cVar.ordinal()];
                    if (i22 == 1) {
                        oki.h.w2(aVar3, new CheckoutFlowContract$Step.GooglePayTopUp(new GooglePayFlowDescriptor$InputData(dVar2, topUpTargetB, null), checkoutScreenContract$CheckoutContent$Order2, list, checkoutCardPlan), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                    } else if (i22 == 2) {
                        oki.h.t2(eVar, aVar3, new CheckoutFlowContract$Step.IndiaUpiTopUp(dVar2, l0Var == l0.INDIA_GLOBAL, new TopUpMethodsContext(bVar.f306286a, nVar), null), true, null, false, 12);
                    } else if (i22 == 3) {
                        oki.h.t2(eVar, aVar3, new CheckoutFlowContract$Step.IndiaNetBankingTopUp(dVar2, l0Var == l0.INDIA_GLOBAL, new TopUpMethodsContext(bVar.f306286a, nVar), null), true, null, false, 12);
                    } else if (i22 != 4) {
                        IllegalStateException illegalStateException = new IllegalStateException("Selected method not supported for checkout type=" + cVar);
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        oki.h.w2(aVar3, new CheckoutFlowContract$Step.PayNowTopUp(dVar2), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                    }
                } else if (selectedMethod instanceof SelectedMethod.StoredMethod.Card) {
                    oki.h.t2(eVar, aVar3, new CheckoutFlowContract$Step.CardTopUp(new FacadeCardTopupFlowDescriptor$InputData(new CardTopUpType.RegularTopUp(dVar2), ((SelectedMethod.StoredMethod.Card) selectedMethod).f90903a, checkoutFlowContract$InputData.f90670c, null)), true, null, false, 12);
                } else if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.c) {
                    oki.h.t2(eVar, aVar3, new CheckoutFlowContract$Step.IndiaNetBankingTopUp(dVar2, l0Var == l0.INDIA_GLOBAL, new TopUpMethodsContext(bVar.f306286a, nVar), ((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.c) selectedMethod).f90915a), true, null, false, 12);
                } else if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.g) {
                    oki.h.t2(eVar, aVar3, new CheckoutFlowContract$Step.IndiaUpiTopUp(dVar2, l0Var == l0.INDIA_GLOBAL, new TopUpMethodsContext(bVar.f306286a, nVar), ((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.g) selectedMethod).f90929a), true, null, false, 12);
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Selected method not supported for checkout kind=".concat(selectedMethod.getClass().getSimpleName()));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
                return Unit.f186387a;
            case 3:
                return Room.databaseBuilder((Context) obj4, ChatDatabase.class, "revolut_chat_storage.sqlite").fallbackToDestructiveMigration().addMigrations(new t10.a(), new t10.b(), new t10.c(), new t10.d(), new t10.e(), new t10.f(), new t10.g(), new t10.h(), new t10.i()).openHelperFactory(new ce0.d(((bl0.g) ((de0.a) obj3)).a("revolut_chat_storage.sqlite", (String) obj2)));
            case 4:
                rtl.u uVar2 = (rtl.u) obj4;
                return mra.d.b(uVar2, new rtl.k(uVar2.o.f106831b, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), (rtl.q) obj2, (rtl.o) obj3, false, 8);
            case 5:
                txl.e nudge = (txl.e) obj2;
                r1 r1Var = (r1) ((rxl.b) obj4).d;
                Intrinsics.checkNotNullParameter(nudge, "nudge");
                lie.a aVar4 = (lie.a) nudge;
                r1Var.f217839g.put(new txl.a(aVar4.b()), Long.valueOf(r1Var.f.a()));
                e0.C(r1Var.e.c(), null, null, new com.revolut.analytics.tracking.v3.h(r1Var, aVar4, null), 3);
                ((sxl.b) obj3).j(nudge);
                return Unit.f186387a;
            case 6:
                sa6.i iVar = (sa6.i) obj4;
                return new lk0.d(new s42.f(iVar, 18), new rtl.y(iVar, 23), new s78.d(iVar, i2), (CharityTransactionsParams) obj2, new s8h.h(iVar, 21), new s8h.h(20), (wfm.j) obj3);
            case 7:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                com.revolut.feature.rev_points.impl.ui.c cVar2 = (com.revolut.feature.rev_points.impl.ui.c) obj3;
                d73.n nVar2 = ((RevPointsFlowContract$Step.OpenTransactionDetailsPager) ((RevPointsFlowContract$Step) obj4)).f83752h;
                if (nVar2 != null) {
                    String lastSelectedId = (String) ref$ObjectRef.f186409a;
                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar2 = (com.revolut.feature.travel.miles.impl.ui.flow.b) nVar2.f111798b;
                    Intrinsics.checkNotNullParameter(lastSelectedId, "lastSelectedId");
                    bVar2.f94210t.k(lastSelectedId);
                }
                cVar2.f83778s.k(a.C0530a.f83762a);
                cVar2.I2();
                return Unit.f186387a;
            case 8:
                tif.q qVar = (tif.q) obj4;
                List transactions = (List) obj2;
                mif.o oVar = qVar.f271519c;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                pfm.h hVar = new pfm.h(new la8.j(oVar, transactions, 15), i6);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                pfm.t tVarW = oVar.w(hVar);
                Intrinsics.checkNotNullExpressionValue(tVarW, "triggerUpdate(...)");
                return qVar.f(tVarW, (BreadcrumbException) obj3);
            case 9:
                tif.q qVar2 = (tif.q) obj4;
                ArrayList updates = (ArrayList) obj2;
                BreadcrumbException breadcrumbException = (BreadcrumbException) obj3;
                mif.o oVar2 = qVar2.f271519c;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(updates, "updates");
                if (updates.isEmpty()) {
                    bVarW = pfm.m.f235744a;
                } else {
                    pfm.h hVar2 = new pfm.h(new la8.j(oVar2, updates, i2), i6);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                    bVarW = oVar2.w(hVar2);
                }
                return qVar2.f(bVarW, breadcrumbException);
            case 10:
                ttl.x xVar = (ttl.x) obj4;
                a0 a0Var = (a0) obj2;
                ttl.q qVar3 = (ttl.q) obj3;
                ttl.o oVar3 = xVar.o;
                k4l.k type = oVar3.f274461b.getType();
                ttl.n nVar3 = oVar3.f274461b;
                ttl.h hVar3 = nVar3 instanceof ttl.h ? (ttl.h) nVar3 : null;
                return mra.d.b(xVar, new ttl.g(type, hVar3 != null ? hVar3.f274448a : 0, new Data(null, null, true, 3, null)), a0Var, qVar3, false, 8);
            case 11:
                return ((t17.o) ((u17.n) obj4).f276363a).c((cs6.f) d0.b0((List) obj2), (cs6.g) obj3).f267205a;
            case 12:
                List list2 = (List) obj3;
                String str3 = (String) obj2;
                imm.e eVar2 = ((ulm.t) obj4).f281137b;
                if (eVar2 != null && (listA = eVar2.a(str3, list2)) != null) {
                    list2 = listA;
                }
                List<Certificate> list3 = list2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                for (Certificate certificate : list3) {
                    Intrinsics.i(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 13:
                ((com.revolut.feature.product.onboarding.flow.a) obj4).J2((String) obj2, (DeclarationValue) obj3);
                return Unit.f186387a;
            case 14:
                ((vnl.p) obj4).V2(new vge.r((Ref$ObjectRef) obj2, (okl.d) obj3, localDate, 29), new yi5.b(29));
                return Unit.f186387a;
            case 15:
                String str4 = (String) obj2;
                ((vq0.m) obj4).f = str4;
                TextClause text = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                wq0.d dVar3 = (wq0.d) ((nu0.n) obj3);
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                dVar3.f299372a.setCaptions(text);
                return Unit.f186387a;
            case 16:
                w4d.j jVar = (w4d.j) obj2;
                DisplayAmountToggleControllerContract$InputData displayAmountToggleControllerContract$InputData = (DisplayAmountToggleControllerContract$InputData) obj3;
                KProperty[] kPropertyArr2 = DisplayAmountToggleController.S;
                phm.a aVar5 = (phm.a) ue0.e.j(((DisplayAmountToggleController) obj4).m2()).a().get(v4d.d.class);
                b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar6 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", v4d.d.class, " is not found"));
                }
                v4d.d dVar4 = ((v4d.d) aVar6.b()).f286032a;
                jVar.getClass();
                return new v4d.b(dVar4, jVar, displayAmountToggleControllerContract$InputData);
            case 17:
                ((w4l.f) obj4).a(((Data) obj2).getContent(), obj3, new ru0.d(19), new qza.q(27));
                return Unit.f186387a;
            case 18:
                wp0.e eVar3 = (wp0.e) obj2;
                o10.c cVar3 = (o10.c) obj3;
                vp0.h hVar4 = wp0.h.f299001a;
                ((n1) obj4).b();
                FloatingBottomBarView floatingBottomBarView = eVar3.e;
                NavBarWithContainerHeaderView navBarWithContainerHeaderView = eVar3.d;
                if (navBarWithContainerHeaderView != null && floatingBottomBarView != null) {
                    navBarWithContainerHeaderView.setVisibility(0);
                    navBarWithContainerHeaderView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    int iU = floatingBottomBarView.u();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new p3(eVar3, iU, i5));
                    valueAnimatorOfFloat.addListener(new vt0.f(eVar3, i5));
                    valueAnimatorOfFloat.setDuration(300L).start();
                }
                cVar3.invoke();
                return Unit.f186387a;
            case 19:
                Context context = ((z70.a) obj4).getContext();
                OrderInitiationPageDatabase.INSTANCE.getClass();
                return Room.databaseBuilder(context, OrderInitiationPageDatabase.class, "order_initiation_pages.sh").openHelperFactory(new ce0.d(((bl0.g) ((de0.a) obj3)).a("order_initiation_pages.sh", (String) obj2))).fallbackToDestructiveMigration();
            case 20:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                PendingPaymentFlowContract$Step.BottomDialog bottomDialog = (PendingPaymentFlowContract$Step.BottomDialog) obj2;
                com.revolut.retail.feature.pending_payments.impl.ui.a aVar7 = (com.revolut.retail.feature.pending_payments.impl.ui.a) obj3;
                if (!ref$BooleanRef.f186407a) {
                    ref$BooleanRef.f186407a = true;
                    ParcelableDestination parcelableDestination = bottomDialog.f102422a.e;
                    if (parcelableDestination != null) {
                        aVar7.C1(parcelableDestination);
                    }
                    aVar7.C2(bottomDialog.f102423b);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar4 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) obj4;
                eVar4.l2(new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.d((Ref$ObjectRef) obj2, eVar4, (SavingsOnboardingFlowContract$Step.Article) obj3, null), new yi5.b(26));
                return Unit.f186387a;
            case 22:
                ConcurrentHashMap concurrentHashMap = xz0.c.f309757c;
                Unit unit = Unit.f186387a;
                concurrentHashMap.put((String) obj2, unit);
                ((Function1) obj4).invoke((Drawable) obj3);
                return unit;
            case 23:
                return ((WorkProgressUpdater) obj4).lambda$updateProgress$0((UUID) obj2, (androidx.work.Data) obj3);
            case 24:
                PickerScreen pickerScreen = (PickerScreen) obj4;
                KProperty[] kPropertyArr3 = PickerScreen.m0;
                qji.b bVarQ2 = pickerScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.picker.legacy.di.PickerScreenInjector");
                return (z7a.b) ((z7a.a) ((z7a.c) bVarQ2).c().a0((PickerScreenContract$InputData) obj2).q((v7a.c) obj3).S(pickerScreen)).mo3800build();
            case 25:
                y7d.a0 a0Var2 = (y7d.a0) obj2;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj3;
                if (((Long) obj4).longValue() == a0Var2.f) {
                    a0Var2.d.invoke();
                    a0Var2.f = 0L;
                }
                a0Var2.dispatchRemoveFinished(viewHolder);
                return Unit.f186387a;
            case 26:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj4;
                com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.a aVar8 = (com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.a) obj2;
                yki.b bVar3 = (yki.b) obj3;
                if (!ref$BooleanRef2.f186407a) {
                    ref$BooleanRef2.f186407a = true;
                    ParcelableDestination parcelableDestination2 = aVar8.o.e;
                    if (parcelableDestination2 != null) {
                        aVar8.C1(parcelableDestination2);
                    }
                    oki.h.D2(bVar3);
                }
                return Unit.f186387a;
            case 27:
                String encodedPath = (String) obj2;
                j1 j1Var = (j1) obj4;
                Lazy lazy = ((yj0.h) obj3).f;
                try {
                    if (!kotlin.text.a0.H(encodedPath, "/", false)) {
                        encodedPath = "/".concat(encodedPath);
                    }
                    i1VarB = j1Var.b();
                    v0VarG = j1Var.f281095a.g();
                    Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
                } catch (Exception e) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var3);
                    Cache cache = (Cache) lazy.getValue();
                    if (cache != null) {
                        cache.evictAll();
                    }
                }
                if (!kotlin.text.a0.H(encodedPath, "/", false)) {
                    throw new IllegalArgumentException("unexpected encodedPath: ".concat(encodedPath).toString());
                }
                v0VarG.g(0, encodedPath.length(), encodedPath);
                x0 url2 = v0VarG.b();
                Intrinsics.checkNotNullParameter(url2, "url");
                i1VarB.f281089a = url2;
                j1 request = new j1(i1VarB);
                Cache cache2 = (Cache) lazy.getValue();
                if (cache2 != null) {
                    Intrinsics.checkNotNullParameter(cache2, "<this>");
                    Intrinsics.checkNotNullParameter(request, "request");
                    Object value = yj0.i.f314366a.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((Method) value).invoke(cache2, request);
                }
                return Unit.f186387a;
            case 28:
                imm.e eVar5 = ((ulm.t) obj4).f281137b;
                Intrinsics.h(eVar5);
                return eVar5.a(((ulm.a) obj3).f281058h.d, ((r0) obj2).a());
            default:
                as0.f fVar = (as0.f) obj4;
                ScreenContentRecyclerView recyclerView = (ScreenContentRecyclerView) obj3;
                y9d.c listItemMatcher = new y9d.c((String) obj2, 16);
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(listItemMatcher, "listItemMatcher");
                ValueAnimator valueAnimator = fVar.f8750c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                fVar.a();
                fVar.e = listItemMatcher;
                fVar.b(recyclerView);
                if (!fVar.f.isEmpty()) {
                    i2 i2Var = j2.Companion;
                    a4.a aVar9 = new a4.a(fVar, recyclerView, i3);
                    i2Var.getClass();
                    j2 j2VarA = i2.a(recyclerView, aVar9);
                    as0.d dVar5 = new as0.d(fVar, recyclerView, i21);
                    recyclerView.addOnAttachStateChangeListener(dVar5);
                    long j2 = fVar.d;
                    float f = j2;
                    float f4 = 1400.0f / f;
                    float f5 = 600.0f / f;
                    Keyframe keyframeOfInt = Keyframe.ofInt(BitmapDescriptorFactory.HUE_RED, 0);
                    int i32 = fVar.f8749b;
                    ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("alpha", keyframeOfInt, Keyframe.ofInt(f5, i32), Keyframe.ofInt(f4, i32), Keyframe.ofInt(1.0f, 0)));
                    fVar.f8750c = valueAnimatorOfPropertyValuesHolder;
                    valueAnimatorOfPropertyValuesHolder.setDuration(j2);
                    valueAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                    as0.e eVar6 = new as0.e(valueAnimatorOfPropertyValuesHolder, j2VarA, fVar, recyclerView, dVar5, j2VarA, recyclerView, dVar5, recyclerView);
                    valueAnimatorOfPropertyValuesHolder.addListener(eVar6);
                    valueAnimatorOfPropertyValuesHolder.addUpdateListener(eVar6);
                    valueAnimatorOfPropertyValuesHolder.start();
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ k(Object obj2, Object obj3, String str, int i) {
        this.f245676a = i;
        this.f245677b = obj2;
        this.d = obj3;
        this.f245678c = str;
    }

    public /* synthetic */ k(String str, Object obj2, Object obj3, int i) {
        this.f245676a = i;
        this.f245678c = str;
        this.f245677b = obj2;
        this.d = obj3;
    }
}
