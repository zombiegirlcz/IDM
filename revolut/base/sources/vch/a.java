package vch;

import amd.j;
import amd.x;
import android.os.Handler;
import android.os.Looper;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import aw0.o9;
import az0.r1;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.internal.views.BottomSwipeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.currency_picker.LitePosCurrencyPickerFlow;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlow;
import com.revolut.feature.payments.groups.impl.ui_chat.trusted.GroupChatTrustedScreen;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.TroubleshooterFlow;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreen;
import com.revolut.feature.widgets.impl.ui.screen.catalgoue.WidgetCatalogueScreen;
import com.revolut.retail.common.ui.R$string;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import io3.g;
import io3.k;
import io3.l;
import ip0.w40;
import ix0.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;
import vkm.d2;
import vkm.h2;
import vpd.z0;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f287697b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f287696a = i;
        this.f287697b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v121, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f287696a;
        int i2 = 14;
        Continuation continuation = null;
        final int i3 = 0;
        final int i5 = 1;
        Object obj2 = this.f287697b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = WithdrawScreen.f95647h0;
                return new CenteredAmountDelegate(new v48.d((WithdrawScreen) obj2, 12));
            case 1:
                return (vd1.b) ((ld1.k) ((LitePosCurrencyPickerFlow) obj2).P.getValue()).f193954c.get();
            case 2:
                Integer num = (Integer) skm.e0.E(kotlin.coroutines.g.f186406a, new ve9.d((com.revolut.feature.passcode_reminder.impl.ui.flow.b) obj2, continuation, i5));
                return num != null ? new PinCodeView.Mode.Placeholder(num.intValue()) : PinCodeView.Mode.Dynamic.f59608a;
            case 3:
                g48.r0 r0Var = ((vea.g0) obj2).f288195b;
                n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return rd0.e.c(r0Var.e(kotlin.collections.d.y0(elements), w4l.h.f294642c), kotlin.coroutines.g.f186406a).distinctUntilChanged().replay(1, 100L, TimeUnit.MILLISECONDS).e();
            case 4:
                return rd0.e.c(((vea.s0) obj2).f288238b.i(false), kotlin.coroutines.g.f186406a).distinctUntilChanged().replay(1, 100L, TimeUnit.MILLISECONDS).e();
            case 5:
                return (vff.a) ((off.c) ((TroubleshooterFlow) obj2).P.getValue()).d.get();
            case 6:
                return te0.w.g(((vfg.k) obj2).f288626c.f());
            case 7:
                return te0.w.g(((vfg.o) obj2).f288631c.f());
            case 8:
                return d8l.d.a((vg4.d) obj2, new vea.b(i2));
            case 9:
                vh2.n nVar = (vh2.n) obj2;
                yji.l.a1(nVar, nVar.X1(new mii.i("COPIED_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, 28)), null, null, null, 7);
                return Unit.f186387a;
            case 10:
                BillsRoutingFlow billsRoutingFlow = (BillsRoutingFlow) obj2;
                return czi.c.d(0, 6, null, billsRoutingFlow, (vh9.a) ((lf9.c) billsRoutingFlow.K.getValue()).f194687b.get());
            case 11:
                com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a) obj2;
                aVar.l2(new uxe.l(aVar, continuation, 22), new yi5.b(26));
                return Unit.f186387a;
            case 12:
                KProperty[] kPropertyArr2 = InvestDocumentsDetailsScreen.c0;
                return (vkh.j) ((mkh.i) ((InvestDocumentsDetailsScreen) obj2).W.getValue()).i.get();
            case 13:
                vl0.c cVar = (vl0.c) obj2;
                FingerprintManagerCompat fingerprintManagerCompat = (FingerprintManagerCompat) cVar.f290165b.f282889b;
                wl0.o oVar = cVar.a() == 0 ? (fingerprintManagerCompat.isHardwareDetected() && fingerprintManagerCompat.hasEnrolledFingerprints()) ? wl0.o.FINGERPRINT : wl0.o.FACE_UNLOCK : wl0.o.NONE;
                skm.e0.C(cVar.f290166c, null, null, new r1(cVar, continuation, 18), 3);
                return oVar;
            case 14:
                new Handler(Looper.getMainLooper()).post(new t70.x((com.revolut.feature.apm.bills.boleto.impl.finder.flow.a) obj2, 20));
                return Unit.f186387a;
            case 15:
                vp0.k kVar = (vp0.k) obj2;
                kVar.e = true;
                Lazy lazy = h1.f169241a;
                h1.f(kVar.f291035a);
                return Unit.f186387a;
            case 16:
                KProperty[] kPropertyArr3 = ClaimsDetailsScreen.c0;
                return (vp7.k) ((ql7.r) ((ClaimsDetailsScreen) obj2).X.getValue()).i.get();
            case 17:
                return Boolean.valueOf(((jte.d) ((z0) obj2).f291200c).c(AnalyticsFeatureApi$Toggles.IncomeSorterTransferDestination.f87396c));
            case 18:
                ((nu0.i) obj2).setSubtitlesShowingState(nu0.h.ACTIVE);
                return Unit.f186387a;
            case 19:
                ((vq0.e) obj2).f291289l = false;
                return Unit.f186387a;
            case 20:
                oki.h.D2(((com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.b) obj2).f69204s);
                return Unit.f186387a;
            case 21:
                KProperty[] kPropertyArr4 = DeviceDeliveryScreen.c0;
                return (vq7.h) ((ql7.y) ((DeviceDeliveryScreen) obj2).Z.getValue()).f247532j.get();
            case 22:
                yki.i iVar = ((com.revolut.feature.credit.card.impl.ui.instalment.create.b) obj2).f69348x;
                if (iVar.d() == null) {
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
            case 23:
                vrl.l0 l0Var = (vrl.l0) obj2;
                vkm.d dVarB = rd0.e.b(osg.b.g(l0Var.f291650c, w4l.i.f294643c, io3.l.CURRENT, io3.k.ACTIVE, io3.i.INTERNAL, null, null, null, 112));
                CoroutineScope coroutineScope = l0Var.f291653j;
                d2.Companion.getClass();
                return vkm.q.M(dVarB, coroutineScope, new h2(5000L, 0L), 1);
            case 24:
                return Boolean.valueOf(((jte.d) ((vrl.s0) obj2).f291676a).c(TradingOrdersApi$Toggles.TradingOrderKeyboardSuggestions.f106797c));
            case 25:
                KProperty[] kPropertyArr5 = GroupChatTrustedScreen.f79393b0;
                return (vs9.l) ((kr9.d) ((GroupChatTrustedScreen) obj2).Y.getValue()).f188715c.get();
            case 26:
                final vsd.c cVar2 = (vsd.c) obj2;
                wsg.n nVar2 = cVar2.f291766b;
                final int i6 = 2;
                return rd0.e.b(nim.a.w(pd.b.r(kli.a.i(nim.a.w(osg.b.e(nVar2, false, null, null, io3.i.EXTERNAL, null, null, null, LDSFile.EF_DG4_TAG), new Function1() { // from class: vsd.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        amd.b bVar;
                        amd.e eVar;
                        List list;
                        Object obj4;
                        switch (i6) {
                            case 0:
                                r rVar = (r) obj3;
                                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                List list2 = (List) rVar.f314201a;
                                xi0.b bVar2 = (xi0.b) rVar.f314202b;
                                return nim.a.w(cVar2.f291766b.O(list2, false, bVar2), new c9h.a(bVar2, (List) rVar.f314203c, 7));
                            case 1:
                                r rVar2 = (r) obj3;
                                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                List pocketBalances = (List) rVar2.f314201a;
                                xi0.b bVar3 = (xi0.b) rVar2.f314202b;
                                List externalInstitutions = (List) rVar2.f314203c;
                                dj0.d dVarX = yoj.b.x(pocketBalances, bVar3);
                                c cVar3 = cVar2;
                                f fVar = cVar3.f291765a;
                                int[] iArr = b.f291763a;
                                int i21 = iArr[fVar.ordinal()];
                                if (i21 == 1) {
                                    bVar = amd.b.LINKED;
                                } else {
                                    if (i21 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar = amd.b.LINKED_CREDIT_CARDS;
                                }
                                int i22 = iArr[fVar.ordinal()];
                                if (i22 == 1) {
                                    eVar = amd.e.LINKED_ACCOUNT;
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar = amd.e.LINKED_CREDIT_CARDS;
                                }
                                e eVar2 = cVar3.f291767c;
                                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                                Intrinsics.checkNotNullParameter(externalInstitutions, "externalInstitutions");
                                List listP0 = d0.P0(pocketBalances, new d());
                                ArrayList arrayList = new ArrayList(w.t(listP0, 10));
                                Iterator it8 = listP0.iterator();
                                while (it8.hasNext()) {
                                    io3.d dVar = ((g) it8.next()).f163163a;
                                    String str = dVar.f163154p;
                                    String str2 = dVar.f163147c;
                                    if (str == null) {
                                        str = "";
                                    }
                                    TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                    long j2 = dVar.i;
                                    xi0.b.Companion.getClass();
                                    MoneyClause moneyClause = new MoneyClause(new dj0.d(j2, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                    Image imageB = ((di6.a) eVar2.f291768a).b(dVar.f163156r);
                                    if (imageB == null) {
                                        imageB = new CountryImage(str2, (Integer) null, (ez0.e) null, 14);
                                    }
                                    Image image = imageB;
                                    Iterator it9 = externalInstitutions.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            Object next = it9.next();
                                            list = externalInstitutions;
                                            if (Intrinsics.f(((ExternalInstitution) next).f66107a, dVar.o)) {
                                                obj4 = next;
                                            } else {
                                                externalInstitutions = list;
                                            }
                                        } else {
                                            list = externalInstitutions;
                                            obj4 = null;
                                        }
                                    }
                                    arrayList.add(new amd.f(textClause, null, moneyClause, null, image, null, new x(dVar, (ExternalInstitution) obj4), 160));
                                    externalInstitutions = list;
                                }
                                return new j(bVar, u.c(new amd.d(eVar, arrayList, f0.f322471a, dVarX)), null, false, null, 28);
                            default:
                                List pockets = (List) obj3;
                                Intrinsics.checkNotNullParameter(pockets, "pockets");
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj5 : pockets) {
                                    io3.d dVar2 = (io3.d) obj5;
                                    f fVar2 = cVar2.f291765a;
                                    xi0.a aVar2 = xi0.b.Companion;
                                    String str3 = dVar2.f163147c;
                                    long j3 = dVar2.i;
                                    l lVar = dVar2.e;
                                    k kVar2 = dVar2.f;
                                    if (h30.l.D(aVar2, str3)) {
                                        int i32 = b.f291763a[fVar2.ordinal()];
                                        if (i32 != 1) {
                                            if (i32 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (kVar2 == k.ACTIVE) {
                                                int i33 = b.f291764b[lVar.ordinal()];
                                                if (i33 != 1) {
                                                    if (i33 == 3) {
                                                        arrayList2.add(obj5);
                                                    }
                                                } else if (j3 < 0) {
                                                    arrayList2.add(obj5);
                                                }
                                            }
                                        } else if (kVar2 == k.ACTIVE || kVar2 == k.INACTIVE) {
                                            int i43 = b.f291764b[lVar.ordinal()];
                                            if (i43 != 1) {
                                                if (i43 == 2) {
                                                    arrayList2.add(obj5);
                                                }
                                            } else if (j3 >= 0) {
                                                arrayList2.add(obj5);
                                            }
                                        }
                                    }
                                }
                                return arrayList2;
                        }
                    }
                }), osg.b.d(nVar2), ((xg6.j) cVar2.d).i(w4l.j.f294644c, oe6.b.f224551a)), new Function1() { // from class: vsd.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        amd.b bVar;
                        amd.e eVar;
                        List list;
                        Object obj4;
                        switch (i3) {
                            case 0:
                                r rVar = (r) obj3;
                                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                List list2 = (List) rVar.f314201a;
                                xi0.b bVar2 = (xi0.b) rVar.f314202b;
                                return nim.a.w(cVar2.f291766b.O(list2, false, bVar2), new c9h.a(bVar2, (List) rVar.f314203c, 7));
                            case 1:
                                r rVar2 = (r) obj3;
                                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                List pocketBalances = (List) rVar2.f314201a;
                                xi0.b bVar3 = (xi0.b) rVar2.f314202b;
                                List externalInstitutions = (List) rVar2.f314203c;
                                dj0.d dVarX = yoj.b.x(pocketBalances, bVar3);
                                c cVar3 = cVar2;
                                f fVar = cVar3.f291765a;
                                int[] iArr = b.f291763a;
                                int i21 = iArr[fVar.ordinal()];
                                if (i21 == 1) {
                                    bVar = amd.b.LINKED;
                                } else {
                                    if (i21 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar = amd.b.LINKED_CREDIT_CARDS;
                                }
                                int i22 = iArr[fVar.ordinal()];
                                if (i22 == 1) {
                                    eVar = amd.e.LINKED_ACCOUNT;
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar = amd.e.LINKED_CREDIT_CARDS;
                                }
                                e eVar2 = cVar3.f291767c;
                                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                                Intrinsics.checkNotNullParameter(externalInstitutions, "externalInstitutions");
                                List listP0 = d0.P0(pocketBalances, new d());
                                ArrayList arrayList = new ArrayList(w.t(listP0, 10));
                                Iterator it8 = listP0.iterator();
                                while (it8.hasNext()) {
                                    io3.d dVar = ((g) it8.next()).f163163a;
                                    String str = dVar.f163154p;
                                    String str2 = dVar.f163147c;
                                    if (str == null) {
                                        str = "";
                                    }
                                    TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                    long j2 = dVar.i;
                                    xi0.b.Companion.getClass();
                                    MoneyClause moneyClause = new MoneyClause(new dj0.d(j2, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                    Image imageB = ((di6.a) eVar2.f291768a).b(dVar.f163156r);
                                    if (imageB == null) {
                                        imageB = new CountryImage(str2, (Integer) null, (ez0.e) null, 14);
                                    }
                                    Image image = imageB;
                                    Iterator it9 = externalInstitutions.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            Object next = it9.next();
                                            list = externalInstitutions;
                                            if (Intrinsics.f(((ExternalInstitution) next).f66107a, dVar.o)) {
                                                obj4 = next;
                                            } else {
                                                externalInstitutions = list;
                                            }
                                        } else {
                                            list = externalInstitutions;
                                            obj4 = null;
                                        }
                                    }
                                    arrayList.add(new amd.f(textClause, null, moneyClause, null, image, null, new x(dVar, (ExternalInstitution) obj4), 160));
                                    externalInstitutions = list;
                                }
                                return new j(bVar, u.c(new amd.d(eVar, arrayList, f0.f322471a, dVarX)), null, false, null, 28);
                            default:
                                List pockets = (List) obj3;
                                Intrinsics.checkNotNullParameter(pockets, "pockets");
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj5 : pockets) {
                                    io3.d dVar2 = (io3.d) obj5;
                                    f fVar2 = cVar2.f291765a;
                                    xi0.a aVar2 = xi0.b.Companion;
                                    String str3 = dVar2.f163147c;
                                    long j3 = dVar2.i;
                                    l lVar = dVar2.e;
                                    k kVar2 = dVar2.f;
                                    if (h30.l.D(aVar2, str3)) {
                                        int i32 = b.f291763a[fVar2.ordinal()];
                                        if (i32 != 1) {
                                            if (i32 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (kVar2 == k.ACTIVE) {
                                                int i33 = b.f291764b[lVar.ordinal()];
                                                if (i33 != 1) {
                                                    if (i33 == 3) {
                                                        arrayList2.add(obj5);
                                                    }
                                                } else if (j3 < 0) {
                                                    arrayList2.add(obj5);
                                                }
                                            }
                                        } else if (kVar2 == k.ACTIVE || kVar2 == k.INACTIVE) {
                                            int i43 = b.f291764b[lVar.ordinal()];
                                            if (i43 != 1) {
                                                if (i43 == 2) {
                                                    arrayList2.add(obj5);
                                                }
                                            } else if (j3 >= 0) {
                                                arrayList2.add(obj5);
                                            }
                                        }
                                    }
                                }
                                return arrayList2;
                        }
                    }
                }), new Function1() { // from class: vsd.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        amd.b bVar;
                        amd.e eVar;
                        List list;
                        Object obj4;
                        switch (i5) {
                            case 0:
                                r rVar = (r) obj3;
                                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                List list2 = (List) rVar.f314201a;
                                xi0.b bVar2 = (xi0.b) rVar.f314202b;
                                return nim.a.w(cVar2.f291766b.O(list2, false, bVar2), new c9h.a(bVar2, (List) rVar.f314203c, 7));
                            case 1:
                                r rVar2 = (r) obj3;
                                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                List pocketBalances = (List) rVar2.f314201a;
                                xi0.b bVar3 = (xi0.b) rVar2.f314202b;
                                List externalInstitutions = (List) rVar2.f314203c;
                                dj0.d dVarX = yoj.b.x(pocketBalances, bVar3);
                                c cVar3 = cVar2;
                                f fVar = cVar3.f291765a;
                                int[] iArr = b.f291763a;
                                int i21 = iArr[fVar.ordinal()];
                                if (i21 == 1) {
                                    bVar = amd.b.LINKED;
                                } else {
                                    if (i21 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar = amd.b.LINKED_CREDIT_CARDS;
                                }
                                int i22 = iArr[fVar.ordinal()];
                                if (i22 == 1) {
                                    eVar = amd.e.LINKED_ACCOUNT;
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar = amd.e.LINKED_CREDIT_CARDS;
                                }
                                e eVar2 = cVar3.f291767c;
                                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                                Intrinsics.checkNotNullParameter(externalInstitutions, "externalInstitutions");
                                List listP0 = d0.P0(pocketBalances, new d());
                                ArrayList arrayList = new ArrayList(w.t(listP0, 10));
                                Iterator it8 = listP0.iterator();
                                while (it8.hasNext()) {
                                    io3.d dVar = ((g) it8.next()).f163163a;
                                    String str = dVar.f163154p;
                                    String str2 = dVar.f163147c;
                                    if (str == null) {
                                        str = "";
                                    }
                                    TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                    long j2 = dVar.i;
                                    xi0.b.Companion.getClass();
                                    MoneyClause moneyClause = new MoneyClause(new dj0.d(j2, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                                    Image imageB = ((di6.a) eVar2.f291768a).b(dVar.f163156r);
                                    if (imageB == null) {
                                        imageB = new CountryImage(str2, (Integer) null, (ez0.e) null, 14);
                                    }
                                    Image image = imageB;
                                    Iterator it9 = externalInstitutions.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            Object next = it9.next();
                                            list = externalInstitutions;
                                            if (Intrinsics.f(((ExternalInstitution) next).f66107a, dVar.o)) {
                                                obj4 = next;
                                            } else {
                                                externalInstitutions = list;
                                            }
                                        } else {
                                            list = externalInstitutions;
                                            obj4 = null;
                                        }
                                    }
                                    arrayList.add(new amd.f(textClause, null, moneyClause, null, image, null, new x(dVar, (ExternalInstitution) obj4), 160));
                                    externalInstitutions = list;
                                }
                                return new j(bVar, u.c(new amd.d(eVar, arrayList, f0.f322471a, dVarX)), null, false, null, 28);
                            default:
                                List pockets = (List) obj3;
                                Intrinsics.checkNotNullParameter(pockets, "pockets");
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj5 : pockets) {
                                    io3.d dVar2 = (io3.d) obj5;
                                    f fVar2 = cVar2.f291765a;
                                    xi0.a aVar2 = xi0.b.Companion;
                                    String str3 = dVar2.f163147c;
                                    long j3 = dVar2.i;
                                    l lVar = dVar2.e;
                                    k kVar2 = dVar2.f;
                                    if (h30.l.D(aVar2, str3)) {
                                        int i32 = b.f291763a[fVar2.ordinal()];
                                        if (i32 != 1) {
                                            if (i32 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (kVar2 == k.ACTIVE) {
                                                int i33 = b.f291764b[lVar.ordinal()];
                                                if (i33 != 1) {
                                                    if (i33 == 3) {
                                                        arrayList2.add(obj5);
                                                    }
                                                } else if (j3 < 0) {
                                                    arrayList2.add(obj5);
                                                }
                                            }
                                        } else if (kVar2 == k.ACTIVE || kVar2 == k.INACTIVE) {
                                            int i43 = b.f291764b[lVar.ordinal()];
                                            if (i43 != 1) {
                                                if (i43 == 2) {
                                                    arrayList2.add(obj5);
                                                }
                                            } else if (j3 >= 0) {
                                                arrayList2.add(obj5);
                                            }
                                        }
                                    }
                                }
                                return arrayList2;
                        }
                    }
                }));
            case 27:
                TicketDetails ticketDetails = (TicketDetails) obj2;
                SectionContent.ProgressionSteps progressionSteps = ticketDetails.f90449c;
                int size = progressionSteps != null ? progressionSteps.f64180c.size() : 0;
                ArrayList arrayList = new ArrayList(size);
                while (i3 < size) {
                    arrayList.add(new w40(com.google.android.gms.internal.mlkit_vision_face.a.k(i3, ticketDetails.f90447a, "_STEP_")));
                    i3++;
                }
                return arrayList;
            case 28:
                KProperty[] kPropertyArr6 = WidgetCatalogueScreen.f96382a0;
                qsh.f fVar = (qsh.f) ((WidgetCatalogueScreen) obj2).W.getValue();
                switch (fVar.f248854a) {
                    case 0:
                        qsh.b bVar = (qsh.b) fVar.f248856c;
                        return new vsh.m(bVar.d.f(), (ish.a) bVar.f248844h.get(), (ish.b) bVar.f248843g.get(), fVar.f248855b, new vsh.c());
                    default:
                        ush.b bVar2 = (ush.b) fVar.f248856c;
                        return new vsh.m(bVar2.f282926c.f(), (ish.a) bVar2.f282928h.get(), (ish.b) bVar2.f282927g.get(), fVar.f248855b, new vsh.c());
                }
            default:
                int i21 = vt0.h.A;
                BottomSwipeView bottomSwipeView = (BottomSwipeView) ((vt0.h) obj2).findViewById(R$id.lightPromptFullScreenContent_swipeIndicator);
                bottomSwipeView.setIcon(new ResourceImage(R$drawable.uikit_icn_24_navigation_swipe, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                return bottomSwipeView;
        }
    }
}
