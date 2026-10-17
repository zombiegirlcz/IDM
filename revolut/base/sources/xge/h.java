package xge;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlow;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreen;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.confirmation.PetPlanConfirmPurchaseActivity;
import com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlow;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlow;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.RevPointsGiftCardPurchaseScreen;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlow;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions.ReviewClosureConditionsBottomSheetController;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreen;
import com.youTransactor.uCube.rpc.Constants;
import io.fotoapparat.view.CameraView;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import ql7.j1;
import vkm.c2;
import vkm.d2;
import xnd.t0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f305724b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f305723a = i;
        this.f305724b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v122, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterable<rfe.f> iterableB;
        r rVar;
        Flow flowA;
        vkm.y yVarE;
        fbm.d dVarI;
        Set setB;
        int i = this.f305723a;
        int i2 = 14;
        int i3 = 3;
        int i5 = 4;
        Continuation continuation = null;
        final int i6 = 0;
        final int i21 = 1;
        Object obj2 = this.f305724b;
        switch (i) {
            case 0:
                j jVar = (j) obj2;
                u uVar = jVar.f305729c;
                rfe.k kVar = uVar.f305747b;
                boolean zEquals = kVar.equals(rfe.c.f253761a);
                rfe.g gVar = rfe.g.f253767a;
                if (zEquals) {
                    iterableB = uVar.b(gVar, zhm.h0.f322473a);
                } else if (kVar instanceof rfe.d) {
                    rfe.d dVar = (rfe.d) kVar;
                    iterableB = uVar.b(new rfe.h(dVar.f253762a), dVar.f253763b);
                } else {
                    if (!(kVar instanceof rfe.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iterableB = ((rfe.e) kVar).f253764a;
                }
                ArrayList arrayList = new ArrayList();
                for (rfe.f fVar : iterableB) {
                    Map map = uVar.f305746a;
                    pie.a aVar = fVar.f253765a;
                    pfe.h hVar = (pfe.h) map.get(aVar);
                    if (hVar == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("No ProductSpacesDataSource registered for " + aVar);
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        yVarE = null;
                    } else {
                        rfe.j jVar2 = fVar.f253766b;
                        if (Intrinsics.f(jVar2, gVar)) {
                            flowA = hVar.a();
                        } else {
                            if (jVar2 instanceof rfe.i) {
                                rVar = new r(hVar.a(), uVar, jVar2, 0);
                            } else {
                                if (!(jVar2 instanceof rfe.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                rVar = new r(hVar.a(), uVar, jVar2, i21);
                            }
                            flowA = rVar;
                        }
                        zhm.f0 f0Var = zhm.f0.f322471a;
                        b.Companion companion = kotlin.time.b.INSTANCE;
                        yVarE = rd0.e.e(zi0.c.M(flowA, f0Var, kotlin.time.c.h(1000L, pkm.e.MILLISECONDS), aVar.getId()), zhm.h0.f322473a, new x18.c(i3, 11, continuation));
                    }
                    if (yVarE != null) {
                        arrayList.add(yVarE);
                    }
                    i21 = 1;
                }
                Flow flowQ = vkm.q.q(new uf0.b((Flow[]) zhm.d0.d1(arrayList).toArray(new Flow[0]), 14));
                CoroutineScope coroutineScope = jVar.f305727a;
                d2.Companion.getClass();
                return vkm.q.M(flowQ, coroutineScope, c2.f290009c, 1);
            case 1:
                ((xka.z) obj2).u.getClass();
                return Boolean.TRUE;
            case 2:
                return ((xl0.b) obj2).f306896b.d();
            case 3:
                return Boolean.valueOf(((jte.d) ((t0) obj2).f307453c).c(AnalyticsFeatureApi$Toggles.BudgetRevamp.f87391c));
            case 4:
                return (xne.a) ((ine.b) ((CollectTaxResidencyFlow) obj2).P.getValue()).d.get();
            case 5:
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar2 = (com.revolut.sso.impl.ui.passcode.change_flow.a) obj2;
                if (aVar2.o.f106014a) {
                    oki.h.D2(aVar2.f106599w);
                } else {
                    aVar2.C2(ejl.a.f126912a);
                }
                return Unit.f186387a;
            case 6:
                return Boolean.valueOf(jh.d.h(((asi.d) obj2).a()));
            case 7:
                ((oii.b) obj2).invoke();
                return Unit.f186387a;
            case 8:
                ((oa2.b) obj2).invoke();
                return Unit.f186387a;
            case 9:
                ScheduleTransferScreen.Companion aVar3 = ScheduleTransferScreen.INSTANCE;
                return (xpf.b) ((lpf.g) ((ScheduleTransferScreen) obj2).Y.getValue()).f199029h.get();
            case 10:
                KProperty[] kPropertyArr = TelematicsDeviceUnpluggedScreen.f75679b0;
                return (xq7.e) ((j1) ((TelematicsDeviceUnpluggedScreen) obj2).X.getValue()).f247345c.get();
            case 11:
                final xu.d dVar2 = (xu.d) obj2;
                Context context = dVar2.f308839a;
                CameraView cameraView = dVar2.f308840b;
                uam.j jVar3 = uam.j.CenterCrop;
                cv.c cVar = dVar2.f308841c;
                int i22 = xu.c.f308838a[cVar.f109212a.ordinal()];
                if (i22 == 1) {
                    dVarI = cp5.d.i();
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarI = new fbm.d(lam.b.f193471b, 1);
                }
                return new iam.e(context, cameraView, dVarI, jVar3, new nam.b((Function1) null, (Function1) null, new fbm.d(Integer.valueOf(cVar.d), 1), (Function1) null, new Function1() { // from class: xu.a
                    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Object next;
                        switch (i6) {
                            case 0:
                                zam.a fotoappparatFrame = (zam.a) obj3;
                                Intrinsics.checkNotNullParameter(fotoappparatFrame, "fotoappparatFrame");
                                ?? r06 = dVar2.d;
                                byte[] bArr = fotoappparatFrame.f320747b;
                                uam.i iVar = fotoappparatFrame.f320746a;
                                r06.invoke(new e(bArr, new bv.c(iVar.f278698a, iVar.f278699b), fotoappparatFrame.f320748c));
                                return Unit.f186387a;
                            default:
                                CameraView cameraView2 = dVar2.f308840b;
                                Iterable CameraConfiguration = (Iterable) obj3;
                                Intrinsics.checkNotNullParameter(CameraConfiguration, "$this$CameraConfiguration");
                                Iterator it8 = CameraConfiguration.iterator();
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (it8.hasNext()) {
                                        DisplayMetrics displayMetrics = new DisplayMetrics();
                                        cameraView2.getDisplay().getRealMetrics(displayMetrics);
                                        int iAbs = Math.abs((displayMetrics.widthPixels * displayMetrics.heightPixels) - ((uam.i) next).a());
                                        do {
                                            Object next2 = it8.next();
                                            DisplayMetrics displayMetrics2 = new DisplayMetrics();
                                            cameraView2.getDisplay().getRealMetrics(displayMetrics2);
                                            int iAbs2 = Math.abs((displayMetrics2.widthPixels * displayMetrics2.heightPixels) - ((uam.i) next2).a());
                                            if (iAbs > iAbs2) {
                                                next = next2;
                                                iAbs = iAbs2;
                                            }
                                        } while (it8.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                return (uam.i) next;
                        }
                    }
                }, (Function1) null, (Function1) null, new xrl.a(22), new Function1() { // from class: xu.a
                    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Object next;
                        switch (i21) {
                            case 0:
                                zam.a fotoappparatFrame = (zam.a) obj3;
                                Intrinsics.checkNotNullParameter(fotoappparatFrame, "fotoappparatFrame");
                                ?? r06 = dVar2.d;
                                byte[] bArr = fotoappparatFrame.f320747b;
                                uam.i iVar = fotoappparatFrame.f320746a;
                                r06.invoke(new e(bArr, new bv.c(iVar.f278698a, iVar.f278699b), fotoappparatFrame.f320748c));
                                return Unit.f186387a;
                            default:
                                CameraView cameraView2 = dVar2.f308840b;
                                Iterable CameraConfiguration = (Iterable) obj3;
                                Intrinsics.checkNotNullParameter(CameraConfiguration, "$this$CameraConfiguration");
                                Iterator it8 = CameraConfiguration.iterator();
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (it8.hasNext()) {
                                        DisplayMetrics displayMetrics = new DisplayMetrics();
                                        cameraView2.getDisplay().getRealMetrics(displayMetrics);
                                        int iAbs = Math.abs((displayMetrics.widthPixels * displayMetrics.heightPixels) - ((uam.i) next).a());
                                        do {
                                            Object next2 = it8.next();
                                            DisplayMetrics displayMetrics2 = new DisplayMetrics();
                                            cameraView2.getDisplay().getRealMetrics(displayMetrics2);
                                            int iAbs2 = Math.abs((displayMetrics2.widthPixels * displayMetrics2.heightPixels) - ((uam.i) next2).a());
                                            if (iAbs > iAbs2) {
                                                next = next2;
                                                iAbs = iAbs2;
                                            }
                                        } while (it8.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                return (uam.i) next;
                        }
                    }
                }, Constants.TAG_EMV_NFC_CONFIG_VERSION), new xlb.o(1, dVar2.f308843h, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 11), new nd.k(i2), 132);
            case 12:
                int i32 = ReviewClosureConditionsBottomSheetController.U;
                return new xug.q(((ztg.l) ((ReviewClosureConditionsBottomSheetController) obj2).T.getValue()).f325145a, new xug.s(), new xug.r());
            case 13:
                return (xw5.d) ((mw5.j) ((CryptoCommodityBuyCollectionFlow) obj2).S.getValue()).i.get();
            case 14:
                int i33 = RevPointsGiftCardPurchaseScreen.V;
                return (xwb.f) ((iwb.a) ((RevPointsGiftCardPurchaseScreen) obj2).T.getValue()).d.get();
            case 15:
                com.revolut.feature.staking.impl.unstake.v2.a aVar4 = (com.revolut.feature.staking.impl.unstake.v2.a) obj2;
                aVar4.f88169y.onNext(aVar4.o.f88083c);
                return Unit.f186387a;
            case 16:
                return (xy8.a) ((qy8.b) ((DocumentScanFlow) obj2).P.getValue()).e.get();
            case 17:
                return (xz2.a) ((tz2.k) ((ChangePinFlow) obj2).P.getValue()).d.get();
            case 18:
                PetPlanConfirmPurchaseActivity petPlanConfirmPurchaseActivity = (PetPlanConfirmPurchaseActivity) obj2;
                int i43 = PetPlanConfirmPurchaseActivity.z0;
                return new z4l.j(7, zhm.v.k(new ListSubheaderDelegate(), new ListCellDelegate(), petPlanConfirmPurchaseActivity.f76362w0, (RowDelegate) petPlanConfirmPurchaseActivity.u0.getValue(), (TextDelegate) petPlanConfirmPurchaseActivity.f76361v0.getValue()), false);
            case 19:
                xzk.g gVar2 = (xzk.g) obj2;
                kye.e eVar = gVar2.f310045c;
                return pd.b.r(((hyk.l) eVar.f190729b).e.f(Unit.f186387a, true), new lu5.o(eVar, 19)).distinctUntilChanged().doOnNext(new xy7.j(13, new xzk.f(gVar2, i5))).replay(1).e();
            case 20:
                return DefaultEncoderProfilesProvider.supportedSizes_delegate$lambda$0((DefaultEncoderProfilesProvider) obj2);
            case 21:
                try {
                    String path = URI.create(((y0g.a) obj2).f310211a.f195039a).getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    return kotlin.text.d0.n0(path, new String[]{"/"}, 0, 6);
                } catch (Exception e) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                    return zhm.f0.f322471a;
                }
            case 22:
                lk0.g gVar3 = (lk0.g) ((y2e.m) obj2).f310651c.f();
                if (gVar3 != null) {
                    rfm.u uVarG = efm.k.g(gVar3);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar2 = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar2, "empty(...)");
                return hVar2;
            case 23:
                KProperty[] kPropertyArr2 = NewZealandTransferNoteScreen.c0;
                return (y2k.h) ((p2k.m) ((NewZealandTransferNoteScreen) obj2).Y.getValue()).d.get();
            case 24:
                return (y4a.a) ((s3a.i) ((RecipientSelectionFlow) obj2).P.getValue()).f259521b.get();
            case 25:
                KProperty[] kPropertyArr3 = BirthCityScreen.f67177b0;
                return (y54.j) ((dw3.y) ((BirthCityScreen) obj2).X.getValue()).f120187h.get();
            case 26:
                return (y73.a) ((z73.c) ((CardsListFlow) obj2).P.getValue()).d.get();
            case 27:
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar5 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) obj2;
                aVar5.D.f194072c = false;
                aVar5.H2(aVar5.H, new y66.p(15));
                return Unit.f186387a;
            case 28:
                ybl.a aVar6 = (ybl.a) ((y8h.b) obj2).f311657a.get(cfl.p.OPTIONS);
                return (aVar6 == null || (setB = aVar6.b()) == null) ? zhm.h0.f322473a : setB;
            default:
                od0.h hVar3 = od0.i.Companion;
                Integer numValueOf = Integer.valueOf(((y8j.d) ((y8j.f) obj2).f311666m).f311663a);
                hVar3.getClass();
                return od0.h.a(numValueOf);
        }
    }
}
