package kob;

import android.os.Bundle;
import bo8.w;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.internal.views.quiz.QuizView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.delivery_address.DeliveryAddressScreen;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreen;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$InputData;
import com.revolut.feature.apm.upi.impl.flow.model.ScreenConfiguration;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.crypto.gift.asset.api.CryptoGiftAssetApi$Toggles$CryptoGiftAsset;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.type_selection.DirectDepositTypeSelectionSheet;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreen;
import com.revolut.feature.insurance_pet.impl.network.service.PetService;
import com.revolut.feature.kyc.impl.external.app.flow.ExternalAppKycProviderFlowContract$Step;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.PaymentsGroupsBillsSplitFlow;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreen;
import com.revolut.feature.subaccount.impl.ui.invite.screen.VaultInvitationConfirmationScreen;
import com.revolut.feature.support.api.SupportApi$Toggles$AskAiHelpCentreV3;
import com.revolut.feature.transfer.core.impl.ui.reason.flow.ReasonForTransferFlow;
import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreen;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.youTransactor.uCube.rpc.Constants;
import cu1.m;
import io3.l;
import ip0.a20;
import ip0.c20;
import ip0.y10;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import jx7.a;
import klf.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kp7.n;
import kr9.j;
import kv5.k;
import kv5.o;
import kw4.z;
import kx7.b0;
import kx7.h0;
import le.u1;
import mii.i;
import nk7.r;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import ql7.a1;
import vkm.c2;
import vkm.d2;
import vkm.q;
import vkm.t1;
import z0g.v;
import zhm.u;
import zsc.p;
import zw7.d1;
import zw7.e1;
import zw7.f1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f186279b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f186278a = i;
        this.f186279b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v126, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int[] iArr;
        int i;
        int i2 = this.f186278a;
        int i3 = 3;
        int i5 = 14;
        Continuation continuation = null;
        final int i6 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        char c2 = 1;
        char c3 = 1;
        char c5 = 1;
        char c6 = 1;
        char c7 = 1;
        char c16 = 1;
        char c26 = 1;
        char c28 = 1;
        Object obj2 = this.f186279b;
        switch (i2) {
            case 0:
                h hVar = (h) obj2;
                int i21 = R$string.vaults_search_category;
                d dVar = hVar.f186285a;
                f01.c cVar = hVar.d;
                int i22 = f.f186283a[dVar.ordinal()];
                if (i22 == 1) {
                    iArr = new int[]{i21};
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iArr = new int[]{i21, com.revolut.feature.retail.savings.api.R$string.savings_common_product_name, com.revolut.feature.retail.savings.api.R$string.savings_account_type_joint};
                }
                atc.d dVar2 = new atc.d(cVar, iArr);
                p pVar = p.WORD_PREFIX;
                return new zsc.g(new zsc.h(new Pair(dVar2, pVar), new Pair(new c(), pVar)), new zsc.h(new Pair(new btc.a(cVar), pVar)));
            case 1:
                KProperty[] kPropertyArr = MotorPlanSelectorScreen.i0;
                return (n) ((a1) ((MotorPlanSelectorScreen) obj2).Y.getValue()).i.get();
            case 2:
                return (kqf.a) ((lpf.c) ((ReasonForTransferFlow) obj2).P.getValue()).d.get();
            case 3:
                return (kt9.a) ((j) ((PaymentsGroupsBillsSplitFlow) obj2).P.getValue()).f188752c.get();
            case 4:
                return QuizView.a((QuizView) obj2);
            case 5:
                KProperty[] kPropertyArr2 = BlikConfirmationScreen.f61666e0;
                return (ku1.n) ((m) ((BlikConfirmationScreen) obj2).Y.getValue()).f108765c.get();
            case 6:
                com.revolut.shared.feature.market_data.models.domain.models.a side = ((OrderQuote.Slippage.Available) obj2).f104776a;
                Intrinsics.checkNotNullParameter(side, "side");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_review_large_order_title, null, null, 14);
                int i32 = kul.g.f189855a[side.ordinal()];
                if (i32 == 1) {
                    i = com.revolut.trading.orders.R$string.wealth_trading_orders_review_large_order_banner_buy_description;
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.revolut.trading.orders.R$string.wealth_trading_orders_review_large_order_banner_sell_description;
                }
                return u.c(new sa("large-order-warning", (Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i, null, null, 14), (List) null, true, (c20) new a20(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246)), (y10) null, (Object) hul.m.f155745a, 72));
            case 7:
                k kVar = (k) obj2;
                t1 t1Var = kVar.e;
                return q.M(new w(yh5.b.e(t1Var, q.Q(t1Var, new a3(continuation, kVar, 10)), kVar.f), i3), kVar.f189968c, c2.a(d2.Companion, 500L, 2), 1);
            case 8:
                aim.e eVarB = u.b();
                eVarB.add(l.CURRENT);
                eVarB.add(l.BLOCKING);
                if (((jte.d) ((o) obj2).e).c(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c)) {
                    eVarB.add(l.LOCKED_GIFT);
                }
                return u.a(eVarB);
            case 9:
                com.revolut.feature.kyc.impl.external.app.flow.a aVar = (com.revolut.feature.kyc.impl.external.app.flow.a) obj2;
                aVar.C1(aVar.f77655p.b(aVar.o.f77653c));
                oki.h.t2(aVar, aVar.u, ExternalAppKycProviderFlowContract$Step.Prompt.f77654a, false, null, false, 12);
                return Unit.f186387a;
            case 10:
                return new yx4.m(0L, ((z) obj2).I2().f190224g.f115082a, null, null, 24);
            case 11:
                final kx7.f fVar = (kx7.f) obj2;
                final Object[] objArr12 = objArr2 == true ? 1 : 0;
                Function2 function2 = new Function2() { // from class: kx7.b
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = objArr12;
                        f fVar2 = fVar;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it8 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it8, "it");
                                efm.d0<List<ix7.l>> notifications = fVar2.f190454a.getNotifications();
                                e eVar = e.f;
                                joe.e eVar2 = new joe.e(16);
                                notifications.getClass();
                                ufm.i iVar = new ufm.i(notifications, eVar2, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                fVar2.f190456c.f("CACHE_KEY_NOTIFICATION", value);
                                break;
                            default:
                                List<zw7.f0> value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                ue0.c cVar2 = fVar2.f190455b;
                                Object obj5 = hx7.h.f156399a;
                                Intrinsics.checkNotNullParameter(value2, "<this>");
                                ArrayList arrayList = new ArrayList();
                                for (zw7.f0 f0Var : value2) {
                                    Intrinsics.checkNotNullParameter(f0Var, "<this>");
                                    String strH = u1.h(f0Var.f325779a, hx7.h.f156399a);
                                    gx7.j jVar = strH != null ? new gx7.j(strH, f0Var.f325780b, f0Var.f325781c) : null;
                                    if (jVar != null) {
                                        arrayList.add(jVar);
                                    }
                                }
                                cVar2.G(arrayList, "CACHE_KEY_NOTIFICATION", kii.e.o(gx7.j.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                final Object[] objArr13 = objArr == true ? 1 : 0;
                Function1 function1 = new Function1() { // from class: kx7.c
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i33 = objArr13;
                        f fVar2 = fVar;
                        Unit it8 = (Unit) obj3;
                        switch (i33) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return (List) fVar2.f190456c.get("CACHE_KEY_NOTIFICATION");
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                List<gx7.j> list = (List) fVar2.f190455b.T2("CACHE_KEY_NOTIFICATION", f.e);
                                if (list == null) {
                                    return null;
                                }
                                Object obj4 = hx7.h.f156399a;
                                Intrinsics.checkNotNullParameter(list, "<this>");
                                ArrayList arrayList = new ArrayList();
                                for (gx7.j jVar : list) {
                                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                                    zw7.e0 e0Var = (zw7.e0) u1.v(jVar.getCode(), hx7.h.f156399a);
                                    zw7.f0 f0Var = e0Var != null ? new zw7.f0(e0Var, jVar.getTitle(), jVar.getDescription()) : null;
                                    if (f0Var != null) {
                                        arrayList.add(f0Var);
                                    }
                                }
                                return arrayList;
                        }
                    }
                };
                final char c29 = c3 == true ? 1 : 0;
                Function2 function22 = new Function2() { // from class: kx7.b
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = c29;
                        f fVar2 = fVar;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it8 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it8, "it");
                                efm.d0<List<ix7.l>> notifications = fVar2.f190454a.getNotifications();
                                e eVar = e.f;
                                joe.e eVar2 = new joe.e(16);
                                notifications.getClass();
                                ufm.i iVar = new ufm.i(notifications, eVar2, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                fVar2.f190456c.f("CACHE_KEY_NOTIFICATION", value);
                                break;
                            default:
                                List<zw7.f0> value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                ue0.c cVar2 = fVar2.f190455b;
                                Object obj5 = hx7.h.f156399a;
                                Intrinsics.checkNotNullParameter(value2, "<this>");
                                ArrayList arrayList = new ArrayList();
                                for (zw7.f0 f0Var : value2) {
                                    Intrinsics.checkNotNullParameter(f0Var, "<this>");
                                    String strH = u1.h(f0Var.f325779a, hx7.h.f156399a);
                                    gx7.j jVar = strH != null ? new gx7.j(strH, f0Var.f325780b, f0Var.f325781c) : null;
                                    if (jVar != null) {
                                        arrayList.add(jVar);
                                    }
                                }
                                cVar2.G(arrayList, "CACHE_KEY_NOTIFICATION", kii.e.o(gx7.j.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                final char c33 = c2 == true ? 1 : 0;
                return new w4l.f(function2, function1, function22, new Function1() { // from class: kx7.c
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i33 = c33;
                        f fVar2 = fVar;
                        Unit it8 = (Unit) obj3;
                        switch (i33) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return (List) fVar2.f190456c.get("CACHE_KEY_NOTIFICATION");
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                List<gx7.j> list = (List) fVar2.f190455b.T2("CACHE_KEY_NOTIFICATION", f.e);
                                if (list == null) {
                                    return null;
                                }
                                Object obj4 = hx7.h.f156399a;
                                Intrinsics.checkNotNullParameter(list, "<this>");
                                ArrayList arrayList = new ArrayList();
                                for (gx7.j jVar : list) {
                                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                                    zw7.e0 e0Var = (zw7.e0) u1.v(jVar.getCode(), hx7.h.f156399a);
                                    zw7.f0 f0Var = e0Var != null ? new zw7.f0(e0Var, jVar.getTitle(), jVar.getDescription()) : null;
                                    if (f0Var != null) {
                                        arrayList.add(f0Var);
                                    }
                                }
                                return arrayList;
                        }
                    }
                }, new Function2() { // from class: kx7.b
                    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = i6;
                        f fVar2 = fVar;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it8 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it8, "it");
                                efm.d0<List<ix7.l>> notifications = fVar2.f190454a.getNotifications();
                                e eVar = e.f;
                                joe.e eVar2 = new joe.e(16);
                                notifications.getClass();
                                ufm.i iVar = new ufm.i(notifications, eVar2, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                fVar2.f190456c.f("CACHE_KEY_NOTIFICATION", value);
                                break;
                            default:
                                List<zw7.f0> value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                ue0.c cVar2 = fVar2.f190455b;
                                Object obj5 = hx7.h.f156399a;
                                Intrinsics.checkNotNullParameter(value2, "<this>");
                                ArrayList arrayList = new ArrayList();
                                for (zw7.f0 f0Var : value2) {
                                    Intrinsics.checkNotNullParameter(f0Var, "<this>");
                                    String strH = u1.h(f0Var.f325779a, hx7.h.f156399a);
                                    gx7.j jVar = strH != null ? new gx7.j(strH, f0Var.f325780b, f0Var.f325781c) : null;
                                    if (jVar != null) {
                                        arrayList.add(jVar);
                                    }
                                }
                                cVar2.G(arrayList, "CACHE_KEY_NOTIFICATION", kii.e.o(gx7.j.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
            case 12:
                final kx7.m mVar = (kx7.m) obj2;
                final Object[] objArr14 = objArr4 == true ? 1 : 0;
                Function2 function23 = new Function2() { // from class: kx7.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = objArr14;
                        m mVar2 = mVar;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                k param = (k) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(param, "param");
                                efm.d0<List<ix7.h>> policyDocumentsHistory = mVar2.f190471a.getPolicyDocumentsHistory(param.f190467a, param.f190468b);
                                l lVar = l.f;
                                joe.e eVar = new joe.e(17);
                                policyDocumentsHistory.getClass();
                                ufm.i iVar = new ufm.i(policyDocumentsHistory, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                k param2 = (k) obj3;
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter(param2, "param");
                                Intrinsics.checkNotNullParameter(value, "value");
                                mVar2.f190473c.f(m.a(param2), value);
                                break;
                            default:
                                k param3 = (k) obj3;
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter(param3, "param");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                mVar2.f190472b.G(hx7.d.c(value2), m.a(param3), kii.e.o(gx7.h.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                final Object[] objArr15 = objArr3 == true ? 1 : 0;
                Function1 function12 = new Function1() { // from class: kx7.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        k param = (k) obj3;
                        switch (objArr15) {
                            case 0:
                                Intrinsics.checkNotNullParameter(param, "param");
                                return (List) mVar.f190473c.get(m.a(param));
                            default:
                                Intrinsics.checkNotNullParameter(param, "param");
                                List list = (List) mVar.f190472b.T2(m.a(param), m.e);
                                if (list != null) {
                                    return hx7.d.b(list);
                                }
                                return null;
                        }
                    }
                };
                final char c39 = c6 == true ? 1 : 0;
                Function2 function24 = new Function2() { // from class: kx7.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = c39;
                        m mVar2 = mVar;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                k param = (k) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(param, "param");
                                efm.d0<List<ix7.h>> policyDocumentsHistory = mVar2.f190471a.getPolicyDocumentsHistory(param.f190467a, param.f190468b);
                                l lVar = l.f;
                                joe.e eVar = new joe.e(17);
                                policyDocumentsHistory.getClass();
                                ufm.i iVar = new ufm.i(policyDocumentsHistory, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                k param2 = (k) obj3;
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter(param2, "param");
                                Intrinsics.checkNotNullParameter(value, "value");
                                mVar2.f190473c.f(m.a(param2), value);
                                break;
                            default:
                                k param3 = (k) obj3;
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter(param3, "param");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                mVar2.f190472b.G(hx7.d.c(value2), m.a(param3), kii.e.o(gx7.h.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                final char c47 = c5 == true ? 1 : 0;
                return new w4l.f(function23, function12, function24, new Function1() { // from class: kx7.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        k param = (k) obj3;
                        switch (c47) {
                            case 0:
                                Intrinsics.checkNotNullParameter(param, "param");
                                return (List) mVar.f190473c.get(m.a(param));
                            default:
                                Intrinsics.checkNotNullParameter(param, "param");
                                List list = (List) mVar.f190472b.T2(m.a(param), m.e);
                                if (list != null) {
                                    return hx7.d.b(list);
                                }
                                return null;
                        }
                    }
                }, new Function2() { // from class: kx7.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = i6;
                        m mVar2 = mVar;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                k param = (k) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(param, "param");
                                efm.d0<List<ix7.h>> policyDocumentsHistory = mVar2.f190471a.getPolicyDocumentsHistory(param.f190467a, param.f190468b);
                                l lVar = l.f;
                                joe.e eVar = new joe.e(17);
                                policyDocumentsHistory.getClass();
                                ufm.i iVar = new ufm.i(policyDocumentsHistory, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                k param2 = (k) obj3;
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter(param2, "param");
                                Intrinsics.checkNotNullParameter(value, "value");
                                mVar2.f190473c.f(m.a(param2), value);
                                break;
                            default:
                                k param3 = (k) obj3;
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter(param3, "param");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                mVar2.f190472b.G(hx7.d.c(value2), m.a(param3), kii.e.o(gx7.h.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
            case 13:
                final b0 b0Var = (b0) obj2;
                final Object[] objArr16 = objArr6 == true ? 1 : 0;
                Function2 function25 = new Function2() { // from class: kx7.x
                    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = objArr16;
                        b0 b0Var2 = b0Var;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it8 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it8, "it");
                                efm.d0<List<ix7.a0>> activePromotions = b0Var2.f190447a.getActivePromotions();
                                a0 a0Var = a0.f;
                                joe.e eVar = new joe.e(22);
                                activePromotions.getClass();
                                ufm.i iVar = new ufm.i(activePromotions, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                b0Var2.f190449c.f("CACHE_KEY_ACTIVE_PROMOTION", value);
                                break;
                            default:
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                ue0.c cVar2 = b0Var2.f190448b;
                                Object obj5 = hx7.s.f156411a;
                                Intrinsics.checkNotNullParameter(value2, "<this>");
                                List<f1> list = value2;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (f1 f1Var : list) {
                                    Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                    String str = f1Var.f325782a;
                                    e1 e1Var = f1Var.f325783b;
                                    arrayList.add(new gx7.u(str, new gx7.d(e1Var.f325776a, u1.g(e1Var.f325777b, hx7.s.f156411a))));
                                }
                                cVar2.G(arrayList, "CACHE_KEY_ACTIVE_PROMOTION", kii.e.o(gx7.u.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                final Object[] objArr17 = objArr5 == true ? 1 : 0;
                Function1 function13 = new Function1() { // from class: kx7.y
                    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i33 = objArr17;
                        b0 b0Var2 = b0Var;
                        Unit it8 = (Unit) obj3;
                        switch (i33) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return (List) b0Var2.f190449c.get("CACHE_KEY_ACTIVE_PROMOTION");
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                ue0.c cVar2 = b0Var2.f190448b;
                                Type type = new TypeToken<List<? extends gx7.u>>() { // from class: com.revolut.feature.insurance_pet.impl.repository.PetPromotionRepositoryImpl$promotionsDelegate$2$4$1
                                }.getType();
                                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                List<gx7.u> list = (List) cVar2.T2("CACHE_KEY_ACTIVE_PROMOTION", type);
                                if (list == null) {
                                    return null;
                                }
                                Object obj4 = hx7.s.f156411a;
                                Intrinsics.checkNotNullParameter(list, "<this>");
                                ArrayList arrayList = new ArrayList();
                                for (gx7.u uVar : list) {
                                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                                    f1 f1Var = uVar.getLabel() != null ? new f1(uVar.getCampaign(), new e1(uVar.getLabel().getText(), (d1) u1.t(uVar.getLabel().getIcon(), d1.TAG, hx7.s.f156411a))) : null;
                                    if (f1Var != null) {
                                        arrayList.add(f1Var);
                                    }
                                }
                                return arrayList;
                        }
                    }
                };
                final char c56 = c16 == true ? 1 : 0;
                Function2 function26 = new Function2() { // from class: kx7.x
                    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = c56;
                        b0 b0Var2 = b0Var;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it8 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it8, "it");
                                efm.d0<List<ix7.a0>> activePromotions = b0Var2.f190447a.getActivePromotions();
                                a0 a0Var = a0.f;
                                joe.e eVar = new joe.e(22);
                                activePromotions.getClass();
                                ufm.i iVar = new ufm.i(activePromotions, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                b0Var2.f190449c.f("CACHE_KEY_ACTIVE_PROMOTION", value);
                                break;
                            default:
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                ue0.c cVar2 = b0Var2.f190448b;
                                Object obj5 = hx7.s.f156411a;
                                Intrinsics.checkNotNullParameter(value2, "<this>");
                                List<f1> list = value2;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (f1 f1Var : list) {
                                    Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                    String str = f1Var.f325782a;
                                    e1 e1Var = f1Var.f325783b;
                                    arrayList.add(new gx7.u(str, new gx7.d(e1Var.f325776a, u1.g(e1Var.f325777b, hx7.s.f156411a))));
                                }
                                cVar2.G(arrayList, "CACHE_KEY_ACTIVE_PROMOTION", kii.e.o(gx7.u.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                final char c57 = c7 == true ? 1 : 0;
                return new w4l.f(function25, function13, function26, new Function1() { // from class: kx7.y
                    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i33 = c57;
                        b0 b0Var2 = b0Var;
                        Unit it8 = (Unit) obj3;
                        switch (i33) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return (List) b0Var2.f190449c.get("CACHE_KEY_ACTIVE_PROMOTION");
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                ue0.c cVar2 = b0Var2.f190448b;
                                Type type = new TypeToken<List<? extends gx7.u>>() { // from class: com.revolut.feature.insurance_pet.impl.repository.PetPromotionRepositoryImpl$promotionsDelegate$2$4$1
                                }.getType();
                                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                List<gx7.u> list = (List) cVar2.T2("CACHE_KEY_ACTIVE_PROMOTION", type);
                                if (list == null) {
                                    return null;
                                }
                                Object obj4 = hx7.s.f156411a;
                                Intrinsics.checkNotNullParameter(list, "<this>");
                                ArrayList arrayList = new ArrayList();
                                for (gx7.u uVar : list) {
                                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                                    f1 f1Var = uVar.getLabel() != null ? new f1(uVar.getCampaign(), new e1(uVar.getLabel().getText(), (d1) u1.t(uVar.getLabel().getIcon(), d1.TAG, hx7.s.f156411a))) : null;
                                    if (f1Var != null) {
                                        arrayList.add(f1Var);
                                    }
                                }
                                return arrayList;
                        }
                    }
                }, new Function2() { // from class: kx7.x
                    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = i6;
                        b0 b0Var2 = b0Var;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it8 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it8, "it");
                                efm.d0<List<ix7.a0>> activePromotions = b0Var2.f190447a.getActivePromotions();
                                a0 a0Var = a0.f;
                                joe.e eVar = new joe.e(22);
                                activePromotions.getClass();
                                ufm.i iVar = new ufm.i(activePromotions, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                b0Var2.f190449c.f("CACHE_KEY_ACTIVE_PROMOTION", value);
                                break;
                            default:
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                ue0.c cVar2 = b0Var2.f190448b;
                                Object obj5 = hx7.s.f156411a;
                                Intrinsics.checkNotNullParameter(value2, "<this>");
                                List<f1> list = value2;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (f1 f1Var : list) {
                                    Intrinsics.checkNotNullParameter(f1Var, "<this>");
                                    String str = f1Var.f325782a;
                                    e1 e1Var = f1Var.f325783b;
                                    arrayList.add(new gx7.u(str, new gx7.d(e1Var.f325776a, u1.g(e1Var.f325777b, hx7.s.f156411a))));
                                }
                                cVar2.G(arrayList, "CACHE_KEY_ACTIVE_PROMOTION", kii.e.o(gx7.u.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
            case 14:
                final h0 h0Var = (h0) obj2;
                final Object[] objArr18 = objArr7 == true ? 1 : 0;
                Function2 function27 = new Function2() { // from class: kx7.d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = objArr18;
                        h0 h0Var2 = h0Var;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                f0 params = (f0) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                PetService petService = h0Var2.f190461a;
                                String str = params.f190457a;
                                String strU = wp5.y.u(h0Var2.f190463c, "toString(...)");
                                zw7.p pVar2 = params.f190458b;
                                String str2 = pVar2.f325823a;
                                String strA = pVar2.f325824b.a();
                                String strA2 = pVar2.f325825c.a();
                                String strA3 = pVar2.d.a();
                                String str3 = pVar2.e;
                                String strK = ce9.m.K(pVar2.f);
                                Intrinsics.checkNotNullExpressionValue(strK, "toISO8601Format(...)");
                                efm.d0<ix7.i> petEditQuotes = petService.getPetEditQuotes(str, new a.C1021a(strU, str2, strA, strA2, strA3, str3, strK, pVar2.f325826g, mo3.a.p(pVar2.f325827h)));
                                g0 g0Var = g0.f;
                                joe.e eVar = new joe.e(23);
                                petEditQuotes.getClass();
                                ufm.i iVar = new ufm.i(petEditQuotes, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                return iVar;
                            default:
                                f0 params2 = (f0) obj3;
                                zw7.r value = (zw7.r) obj4;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(value, "value");
                                h0Var2.f190462b.f("CACHE_KEY_PET_EDIT_QUOTES_" + params2.f190457a, value);
                                return Unit.f186387a;
                        }
                    }
                };
                kv7.g gVar = new kv7.g(h0Var, i5);
                final char c74 = c26 == true ? 1 : 0;
                return new w4l.f(function27, gVar, new Function2() { // from class: kx7.d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = c74;
                        h0 h0Var2 = h0Var;
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                f0 params = (f0) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                PetService petService = h0Var2.f190461a;
                                String str = params.f190457a;
                                String strU = wp5.y.u(h0Var2.f190463c, "toString(...)");
                                zw7.p pVar2 = params.f190458b;
                                String str2 = pVar2.f325823a;
                                String strA = pVar2.f325824b.a();
                                String strA2 = pVar2.f325825c.a();
                                String strA3 = pVar2.d.a();
                                String str3 = pVar2.e;
                                String strK = ce9.m.K(pVar2.f);
                                Intrinsics.checkNotNullExpressionValue(strK, "toISO8601Format(...)");
                                efm.d0<ix7.i> petEditQuotes = petService.getPetEditQuotes(str, new a.C1021a(strU, str2, strA, strA2, strA3, str3, strK, pVar2.f325826g, mo3.a.p(pVar2.f325827h)));
                                g0 g0Var = g0.f;
                                joe.e eVar = new joe.e(23);
                                petEditQuotes.getClass();
                                ufm.i iVar = new ufm.i(petEditQuotes, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                return iVar;
                            default:
                                f0 params2 = (f0) obj3;
                                zw7.r value = (zw7.r) obj4;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(value, "value");
                                h0Var2.f190462b.f("CACHE_KEY_PET_EDIT_QUOTES_" + params2.f190457a, value);
                                return Unit.f186387a;
                        }
                    }
                }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            case 15:
                l1b.l lVar = (l1b.l) obj2;
                n80.e eVar = lVar.f191526b;
                String packageName = lVar.f191527c.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                Bundle bundle = eVar.a(packageName, 128).metaData;
                return Boolean.valueOf(bundle != null ? bundle.getBoolean("appsflyer_default_allow_analytics", true) : true);
            case 16:
                KProperty[] kPropertyArr3 = TravelExperiencesAdditionalInformationScreen.c0;
                v vVar = (v) ((TravelExperiencesAdditionalInformationScreen) obj2).Z.getValue();
                switch (vVar.f318460a) {
                    case 0:
                        return (l1g.f) vVar.d.get();
                    default:
                        return (l1g.f) vVar.d.get();
                }
            case 17:
                ((l7e.h) obj2).f192571a.b(new fc7.f(new mii.k("SUCCESS_COPY_SHOT_DIALOG_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, 28)));
                return Unit.f186387a;
            case 18:
                return Boolean.valueOf(((jte.d) ((l83.m) obj2).f192775b).c(CardsCoreApi$Toggles.CardReactivationRedesign.f65561c));
            case 19:
                KProperty[] kPropertyArr4 = VaultInvitationConfirmationScreen.c0;
                return (l8e.l) ((r6e.u) ((VaultInvitationConfirmationScreen) obj2).Y.getValue()).f251810g.get();
            case 20:
                int i33 = DirectDepositTypeSelectionSheet.U;
                return (l96.e) ((a96.g) ((DirectDepositTypeSelectionSheet) obj2).S.getValue()).f2353b.get();
            case 21:
                KProperty[] kPropertyArr5 = RequestCvvScreen.f84514b0;
                return (l9c.f) ((p7c.q) ((RequestCvvScreen) obj2).Z.getValue()).f233664c.get();
            case 22:
                com.revolut.core.backend_flow.impl.internal_flow.b bVar = (com.revolut.core.backend_flow.impl.internal_flow.b) obj2;
                if (com.revolut.core.backend_flow.impl.internal_flow.c.a(bVar.s())) {
                    bVar.B2();
                }
                return Unit.f186387a;
            case 23:
                KProperty[] kPropertyArr6 = DeliveryAddressScreen.f60603a0;
                qji.b bVarQ2 = ((DeliveryAddressScreen) obj2).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.delivery_address.di.DeliveryAddressScreenInjector");
                db1.b bVar2 = ((db1.c) bVarQ2).f112647a;
                db1.g gVar2 = new db1.g();
                gVar2.f112659a = e4m.b.b(new db1.f(bVar2, gVar2, c28 == true ? 1 : 0, objArr10 == true ? 1 : 0));
                gVar2.f112660b = e4m.b.b(new db1.f(bVar2, gVar2, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0));
                return gVar2;
            case 24:
                ((com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) obj2).X1(new i("COPY_ORDER_DETAILS_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_copied_to_clipboard, null, null, 14), null, null, 28));
                return Unit.f186387a;
            case 25:
                return ((jte.d) ((lde.n) obj2).f194089a).c(SupportApi$Toggles$AskAiHelpCentreV3.f89336c) ? k7d.a.AiV3 : k7d.a.AiV2;
            case 26:
                KProperty[] kPropertyArr7 = PriceTargetsDetailsScreen.f100155b0;
                return (ldj.f) ((fdj.c) ((PriceTargetsDetailsScreen) obj2).W.getValue()).o.get();
            case 27:
                com.revolut.feature.apm.upi.impl.flow.b bVar3 = (com.revolut.feature.apm.upi.impl.flow.b) obj2;
                ag2.a aVar2 = bVar3.f62978s;
                UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = bVar3.o;
                qua.p pVar2 = upiTransferFlowContract$InputData.f62962j;
                m1l.a scheduleMode = upiTransferFlowContract$InputData.k;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
                if (pVar2 == null) {
                    return new ScreenConfiguration(scheduleMode == m1l.a.SCHEDULE_REQUIRED, ISO781611.SMT_TAG);
                }
                List list = pVar2.Z;
                if (list == null) {
                    return new ScreenConfiguration(objArr11 == true ? 1 : 0, CertificateBody.profileType);
                }
                boolean zContains = list.contains(fva.a.CHANGE_DATE);
                boolean zContains2 = list.contains(fva.a.CHANGE_RECURRENCY);
                boolean zContains3 = list.contains(fva.a.CHANGE_FREQUENCY);
                return new ScreenConfiguration(true, zContains || zContains2 || zContains3, list.contains(fva.a.CHANGE_AMOUNT), list.contains(fva.a.CHANGE_POCKET_ID), zContains3, zContains, zContains2);
            case 28:
                return Boolean.valueOf(((jte.d) ((lhi.e) obj2).d).c(CardsCoreApi$Toggles.ShouldUpdateOnCardFreeze.f65571c));
            default:
                return (lj7.a) ((r) ((CFACInsuranceFlow) obj2).P.getValue()).d.get();
        }
    }

    public /* synthetic */ a(kul.d dVar, OrderQuote.Slippage.Available available) {
        this.f186278a = 6;
        this.f186279b = available;
    }
}
