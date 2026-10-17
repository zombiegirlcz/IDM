package a2g;

import a83.z0;
import ahe.w0;
import androidx.room.RoomDatabase;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.ui.flow.ChatFlowContract$InputData;
import com.revolut.chat.ui.flow.ChatFlowContract$Step;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.country.BirthCountryScreen;
import com.revolut.feature.crypto.exchange.fees.impl.ui.crypto_exchange_fees_dialog_controller.CryptoExchangeFeesDialogController;
import com.revolut.feature.insurance_car.impl.ui.flow.cancellation.CancellationFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.date.MtaDateSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.list.AdditionalDriverListScreen;
import com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.SplitBillsSummaryFlow;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection.CardsTroubleshooterSelectionScreen;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateController;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreen;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.thresholds_breakdown.RevPointsPocketThresholdsBreakdownScreen;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$Step;
import dw3.z;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ql7.r0;
import rp0.n0;
import rp0.p0;
import skm.d0;
import skm.e0;
import v30.c0;
import vkm.t0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f833b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f832a = i;
        this.f833b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v129, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v145, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v162, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FlowStep chat;
        List listC;
        TransitionAnimation transitionAnimation;
        int i = 12;
        Continuation continuation = null;
        int i2 = 0;
        int i3 = 1;
        switch (this.f832a) {
            case 0:
                TravelExperiencesDetailsScreen travelExperiencesDetailsScreen = (TravelExperiencesDetailsScreen) this.f833b;
                KProperty[] kPropertyArr = TravelExperiencesDetailsScreen.j0;
                return ((b2g.a) travelExperiencesDetailsScreen.f93058h0.getValue()).a();
            case 1:
                com.revolut.chat.ui.flow.e eVar = (com.revolut.chat.ui.flow.e) this.f833b;
                ChatFlowContract$InputData chatFlowContract$InputData = eVar.o;
                j30.c cVar = eVar.f51160q;
                ChatTarget chatTarget = chatFlowContract$InputData.f51149a;
                if (chatTarget instanceof ChatTarget.ChatList) {
                    chat = new ChatFlowContract$Step.ChatList((ChatTarget.ChatList) chatTarget);
                    listC = f0.f322471a;
                } else {
                    if (!(chatTarget instanceof ChatTarget.Messages)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChatTarget.Messages messages = (ChatTarget.Messages) chatTarget;
                    ChatFeed chatFeed = messages.f51049a;
                    j30.a aVarA = chatFeed instanceof ChatFeed.Assistant ? ((rf3.d) cVar).a() : null;
                    if (aVarA != null) {
                        q30.a aVar = eVar.f51159p;
                        c0 feedType = chatFeed.s0();
                        q30.h hVar = (q30.h) aVar;
                        hVar.getClass();
                        ConcurrentHashMap concurrentHashMap = hVar.i;
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        v30.p pVar = (v30.p) concurrentHashMap.get(feedType);
                        if (pVar == null) {
                            hVar.c();
                            pVar = (v30.p) concurrentHashMap.get(feedType);
                        }
                        if (pVar == null) {
                            pVar = ((rf3.d) hVar.f241759c).a() == j30.a.MANDATORY_STORIES ? v30.n.f285808a : v30.m.f285806a;
                        }
                        if ((pVar instanceof v30.n) || (pVar instanceof v30.o)) {
                            int i5 = a50.f.f1307a[aVarA.ordinal()];
                            if (i5 == 1) {
                                chat = new ChatFlowContract$Step.AirMandatoryIntroStories(messages);
                            } else if (i5 == 2) {
                                chat = new ChatFlowContract$Step.AirIntroStories(chatFeed.s0());
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                chat = new ChatFlowContract$Step.IntroVideo(chatFeed.s0());
                            }
                            if (aVarA == j30.a.MANDATORY_STORIES) {
                                listC = f0.f322471a;
                            } else {
                                ChatFlowContract$Step.Chat chat2 = new ChatFlowContract$Step.Chat(messages);
                                if (((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.AirIntroZoomDisabled.f50964c)) {
                                    transitionAnimation = TransitionAnimation.FADE.f98392a;
                                } else {
                                    Intrinsics.checkNotNullParameter(TransitionAnimation.INSTANCE, "<this>");
                                    transitionAnimation = new ZoomTransitionAnimation.Default(null, null, 62);
                                }
                                listC = u.c(new BackStackEntry(chat2, transitionAnimation));
                            }
                        } else {
                            if (!(pVar instanceof v30.m)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            chat = new ChatFlowContract$Step.Chat(messages);
                            listC = f0.f322471a;
                        }
                    } else {
                        chat = new ChatFlowContract$Step.Chat(messages);
                        listC = f0.f322471a;
                    }
                }
                return cp5.d.a(eVar, chat, listC, new a09.b(eVar, i));
            case 2:
                BirthCountryScreen birthCountryScreen = (BirthCountryScreen) this.f833b;
                KProperty[] kPropertyArr2 = BirthCountryScreen.f67181b0;
                return (a64.h) ((z) birthCountryScreen.X.getValue()).f120249h.get();
            case 3:
                return ((l80.f) ((a72.m) this.f833b).d).f().atOffset(ZoneOffset.UTC).minusYears(1L).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            case 4:
                ((com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) this.f833b).C2(a7g.s.f1897a);
                return Unit.f186387a;
            case 5:
                com.revolut.feature.apm.multibanco.impl.ui.home.area.b bVar = (com.revolut.feature.apm.multibanco.impl.ui.home.area.b) this.f833b;
                return yji.l.a1(bVar, vkm.q.Q(bVar.A.B(new a5g.h(29)), new a82.p(i3, bVar, continuation)), null, null, new a82.s(bVar, continuation, i2), 3);
            case 6:
                return Boolean.valueOf(((jte.d) ((z0) this.f833b).d).c(CardsCoreApi$Toggles.CardReactivationRedesign.f65561c));
            case 7:
                a92.i iVar = (a92.i) this.f833b;
                return yji.l.a1(iVar, vkm.q.Q(new t0(iVar.f2306q.B(new a82.l(18)), 1), new a92.h(continuation, iVar, i3)), null, null, new a82.s(iVar, continuation, i3), 3);
            case 8:
                CardsTroubleshooterSelectionScreen cardsTroubleshooterSelectionScreen = (CardsTroubleshooterSelectionScreen) this.f833b;
                KProperty[] kPropertyArr3 = CardsTroubleshooterSelectionScreen.f0;
                return (a9d.n) ((r7d.d) cardsTroubleshooterSelectionScreen.f86314d0.getValue()).f252106c.get();
            case 9:
                EditSubscriptionEndDateController editSubscriptionEndDateController = (EditSubscriptionEndDateController) this.f833b;
                int i6 = EditSubscriptionEndDateController.V;
                return (aae.h) ((i9e.m) editSubscriptionEndDateController.T.getValue()).f159698c.get();
            case 10:
                ((dqi.g) ((dqi.k) this.f833b)).N().scrollToPosition(0);
                return Unit.f186387a;
            case 11:
                ae7.i iVar2 = (ae7.i) this.f833b;
                return v.k(iVar2.i, iVar2.f3497j);
            case 12:
                RevPointsPocketThresholdsBreakdownScreen revPointsPocketThresholdsBreakdownScreen = (RevPointsPocketThresholdsBreakdownScreen) this.f833b;
                int i21 = RevPointsPocketThresholdsBreakdownScreen.T;
                return (aei.b) ((jdi.g) revPointsPocketThresholdsBreakdownScreen.Q.getValue()).f173097b.get();
            case 13:
                CryptoExchangeFeesDialogController cryptoExchangeFeesDialogController = (CryptoExchangeFeesDialogController) this.f833b;
                int i22 = CryptoExchangeFeesDialogController.T;
                return (ag5.c) ((tf5.h) cryptoExchangeFeesDialogController.Q.getValue()).f270248g.get();
            case 14:
                w0 w0Var = (w0) this.f833b;
                return e0.g(w0Var.f5040a, null, d0.LAZY, new a01.e(w0Var, continuation, 27), 1);
            case 15:
                ((agh.b) this.f833b).invoke();
                return Unit.f186387a;
            case 16:
                oki.h.D2(((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d) this.f833b).u);
                return Unit.f186387a;
            case 17:
                aji.a aVar2 = (aji.a) this.f833b;
                return new zii.h(aVar2, aVar2.u, aVar2.v);
            case 18:
                return (am7.a) ((ql7.i) ((CancellationFlow) this.f833b).Q.getValue()).e.get();
            case 19:
                Map map = ((ami.a) this.f833b).f6433a;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new zli.c((String) entry.getKey(), (phm.a) entry.getValue()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    String strA0 = kotlin.text.d0.A0('/', kotlin.text.d0.e0(((zli.c) obj2).f323281a, "app/"));
                    Object objO = linkedHashMap.get(strA0);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, strA0);
                    }
                    ((List) objO).add(obj2);
                }
                return linkedHashMap;
            case 20:
                cqi.h hVar2 = ((an.q) this.f833b).f6512j;
                efm.r map2 = ((cqi.j) hVar2).i.b().map(new ai0.j(new amf.i(4), i));
                cqi.j jVar = (cqi.j) hVar2;
                int i32 = 13;
                efm.r map3 = jVar.i.c().map(new ai0.j(new amf.i(5), i32));
                p0 p0Var = jVar.i;
                efm.r rVarD = p0Var.d();
                an.n nVar = an.n.f;
                efm.r map4 = rVarD.map(new a0.b(i32));
                efm.r rVarF = p0Var.f();
                an.o oVar = an.o.f;
                int i33 = 14;
                efm.r map5 = rVarF.map(new a0.b(i33));
                efm.r rVarE = p0Var.e();
                an.p pVar2 = an.p.f;
                efm.r map6 = rVarE.map(new a0.b(15));
                efm.r map7 = p0Var.f256147a.g().map(new rof.e(17, new n0(i3)));
                Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
                return efm.r.mergeArray(map2, map3, map4, map5, map6, map7.map(new ai0.j(new amf.i(6), i33)));
            case 21:
                return RoomDatabase.runInTransaction$lambda$10((Runnable) this.f833b);
            case 22:
                MtaDateSelectorScreen mtaDateSelectorScreen = (MtaDateSelectorScreen) this.f833b;
                KProperty[] kPropertyArr4 = MtaDateSelectorScreen.f75529a0;
                return (ao7.i) ((r0) mtaDateSelectorScreen.W.getValue()).i.get();
            case 23:
                return ((aoa.j) this.f833b).f7950a.v(w4l.h.f294642c).replay(1).e();
            case 24:
                voi.i iVar3 = (voi.i) this.f833b;
                a aVar3 = aoi.g.f7996a;
                return new aoi.e(new zjh.f(iVar3));
            case 25:
                AdditionalDriverListScreen additionalDriverListScreen = (AdditionalDriverListScreen) this.f833b;
                KProperty[] kPropertyArr5 = AdditionalDriverListScreen.c0;
                return (ap7.h) ((ql7.e) additionalDriverListScreen.Y.getValue()).i.get();
            case 26:
                ap7.l lVar = (ap7.l) this.f833b;
                lVar.f8115t = false;
                lVar.u2();
                return Unit.f186387a;
            case 27:
                com.revolut.sso.impl.ui.revolut_id.c cVar2 = (com.revolut.sso.impl.ui.revolut_id.c) this.f833b;
                oki.h.t2(cVar2, cVar2.v, RevolutIDFlowContract$Step.Documents.f106703a, true, null, false, 12);
                return Unit.f186387a;
            case 28:
                oki.h.D2(((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b) this.f833b).v);
                return Unit.f186387a;
            default:
                return (aq9.a) ((gp9.h) ((SplitBillsSummaryFlow) this.f833b).P.getValue()).f145379b.get();
        }
    }
}
