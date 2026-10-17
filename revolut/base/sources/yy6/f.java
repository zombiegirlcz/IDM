package yy6;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.d2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreen;
import com.revolut.feature.giro.impl.ui.GiroFlowContract$Step;
import com.revolut.feature.giro.impl.ui.review.domain.SelectedPocket;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10Screen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto.disclaimer.impl.retail_revolut_x_difference.RetailRevolutXDifferenceScreen;
import com.revolut.retail.feature.payments.money_request.impl.R$string;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsNewScreen;
import java.time.LocalDate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import nii.k1;
import nii.l1;
import nii.n1;
import te0.w;
import tof.a3;
import vkm.j2;
import wim.z;
import yui.v;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f317845w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f317845w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f((InvoiceTemplateDetailsScreen) this.f317845w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f((com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) this.f317845w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f((com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a) this.f317845w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f((RevPointsTrophyRoomHighlightsSharingScreen) this.f317845w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            case 4:
                return new f((z10.e) this.v, (p20.b) this.f317845w, continuation, 4);
            case 5:
                f fVar5 = new f((TaxHubAssessmentScreen) this.f317845w, continuation, 5);
                fVar5.v = obj2;
                return fVar5;
            case 6:
                f fVar6 = new f((com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) this.f317845w, continuation, 6);
                fVar6.v = obj2;
                return fVar6;
            case 7:
                f fVar7 = new f((z2a.k) this.f317845w, continuation, 7);
                fVar7.v = obj2;
                return fVar7;
            case 8:
                f fVar8 = new f((ApmRecipientDetailsNewScreen) this.f317845w, continuation, 8);
                fVar8.v = obj2;
                return fVar8;
            case 9:
                return new f((z3f.d) this.v, (e4f.c) this.f317845w, continuation, 9);
            case 10:
                f fVar9 = new f((z4e.i) this.f317845w, continuation, 10);
                fVar9.v = obj2;
                return fVar9;
            case 11:
                f fVar10 = new f((com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f317845w, continuation, 11);
                fVar10.v = obj2;
                return fVar10;
            case 12:
                f fVar11 = new f((DefiTradeScreen) this.f317845w, continuation, 12);
                fVar11.v = obj2;
                return fVar11;
            case 13:
                return new f((com.revolut.feature.giro.impl.ui.a) this.v, (b77.i) this.f317845w, continuation, 13);
            case 14:
                f fVar12 = new f((MoneyRequestDetailsNewScreen) this.f317845w, continuation, 14);
                fVar12.v = obj2;
                return fVar12;
            case 15:
                return new f((com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) this.v, (String) this.f317845w, continuation, 15);
            case 16:
                f fVar13 = new f((z8b.j) this.f317845w, continuation, 16);
                fVar13.v = obj2;
                return fVar13;
            case 17:
                f fVar14 = new f((AllCardsScreen) this.f317845w, continuation, 17);
                fVar14.v = obj2;
                return fVar14;
            case 18:
                f fVar15 = new f((z8d.j) this.f317845w, continuation, 18);
                fVar15.v = obj2;
                return fVar15;
            case 19:
                f fVar16 = new f((RetailRevolutXDifferenceScreen) this.f317845w, continuation, 19);
                fVar16.v = obj2;
                return fVar16;
            case 20:
                f fVar17 = new f((za8.k) this.f317845w, continuation, 20);
                fVar17.v = obj2;
                return fVar17;
            case 21:
                f fVar18 = new f((TravelHotelsBookingAmendmentDatesPickerScreen) this.f317845w, continuation, 21);
                fVar18.v = obj2;
                return fVar18;
            case 22:
                f fVar19 = new f((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) this.f317845w, continuation, 22);
                fVar19.v = obj2;
                return fVar19;
            case 23:
                f fVar20 = new f((zah.g) this.f317845w, continuation, 23);
                fVar20.v = obj2;
                return fVar20;
            case 24:
                f fVar21 = new f((zaj.l) this.f317845w, continuation, 24);
                fVar21.v = obj2;
                return fVar21;
            case 25:
                f fVar22 = new f((com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a) this.f317845w, continuation, 25);
                fVar22.v = obj2;
                return fVar22;
            case 26:
                f fVar23 = new f((com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) this.f317845w, continuation, 26);
                fVar23.v = obj2;
                return fVar23;
            case 27:
                return new f((com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d) this.v, (com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.a) this.f317845w, continuation, 27);
            case 28:
                f fVar24 = new f((zdc.i) this.f317845w, continuation, 28);
                fVar24.v = obj2;
                return fVar24;
            default:
                f fVar25 = new f((AddAssetRev10Screen) this.f317845w, continuation, 29);
                fVar25.v = obj2;
                return fVar25;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((vf0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((d2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create((ra3.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((wk5.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ogd.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = 7;
        int i2 = 14;
        int i3 = 23;
        int i5 = 6;
        int i6 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.u) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = ((InvoiceTemplateDetailsScreen) this.f317845w).d();
                Intrinsics.h(listId);
                com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) nVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("MENU_ITEM_ID_DELETE_TEMPLATE") && (str = ((l) ((j2) cVar.f73959s.f22677a).getValue()).f317848c.f73948a) != null) {
                    cVar.n2(new yv1.k(cVar, str, objArr == true ? 1 : 0, i5), new whi.b(i5));
                }
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) this.f317845w;
                cVar2.H2(cVar2.f73959s, new yvk.n(data, i));
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a aVar4 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a) this.f317845w;
                aVar4.H2(aVar4.f99155r, new yvk.n(data2, 8));
                return Unit.f186387a;
            case 3:
                koi.j item = (koi.j) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z0c.e eVar = (z0c.e) ((RevPointsTrophyRoomHighlightsSharingScreen) this.f317845w).P.getValue();
                Intrinsics.h(item);
                z0c.i iVar = (z0c.i) eVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                BigTileDelegate.Model model = item instanceof BigTileDelegate.Model ? (BigTileDelegate.Model) item : null;
                Object obj3 = model != null ? model.f51742s : null;
                z0c.j jVar = obj3 instanceof z0c.j ? (z0c.j) obj3 : null;
                if (jVar != null) {
                    iVar.H2(iVar.f318210p, new yuc.p(jVar, 26));
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String text = ((z10.e) this.v).f318711b.k((p20.b) this.f317845w);
                kmm.h hVar = ((z10.e) this.v).d;
                if (hVar != null) {
                    Intrinsics.h(text);
                    Intrinsics.checkNotNullParameter(text, "text");
                    mmm.m.Companion.getClass();
                    mmm.m mVarC = mmm.l.c(text);
                    synchronized (hVar) {
                        if (!hVar.v && !hVar.f185932s) {
                            long j2 = hVar.f185931r;
                            byte[] bArr = mVarC.f207285a;
                            if (((long) bArr.length) + j2 > 16777216) {
                                hVar.b(1001, null);
                            } else {
                                hVar.f185931r = j2 + ((long) bArr.length);
                                hVar.f185930q.add(new kmm.f(1, mVarC));
                                hVar.f();
                            }
                        }
                    }
                    break;
                }
                return Unit.f186387a;
            case 5:
                String str2 = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z27.l lVarE3 = ((TaxHubAssessmentScreen) this.f317845w).d();
                Intrinsics.h(str2);
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) lVarE3).J2(str2);
                return Unit.f186387a;
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f fVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) this.f317845w;
                fVar.H2(fVar.v, new yvk.n(data3, 13));
                return Unit.f186387a;
            case 7:
                Data data4 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z2a.k kVar = (z2a.k) this.f317845w;
                kVar.H2(kVar.f319049q, new yvk.n(data4, i2));
                return Unit.f186387a;
            case 8:
                a3 transaction = (a3) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z32.c cVarD3 = ((ApmRecipientDetailsNewScreen) this.f317845w).d();
                Intrinsics.h(transaction);
                com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar11 = (com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) cVarD3;
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                aVar11.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(transaction), null, null, null, 126))));
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z3f.d) this.v).f319260a.G((e4f.c) this.f317845w, "TRADING_TRANSACTIONS_SYNC_STATE", z.d(o0.b(e4f.c.class)));
                return Unit.f186387a;
            case 10:
                Data data5 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z4e.i iVar2 = (z4e.i) this.f317845w;
                iVar2.X2(iVar2.f319382n, new yvk.n(data5, 15));
                return Unit.f186387a;
            case 11:
                vf0.g gVar = (vf0.g) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data6 = (Data) gVar.f288428a;
                Data data7 = (Data) gVar.f288429b;
                Data data8 = (Data) gVar.f288430c;
                Data data9 = (Data) gVar.d;
                Data data10 = (Data) gVar.e;
                od0.i iVar3 = (od0.i) gVar.f;
                od0.i iVar4 = (od0.i) gVar.f288431g;
                od0.i iVar5 = (od0.i) gVar.f288432h;
                com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar15 = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f317845w;
                aVar15.H2(aVar15.B, new aqd.f(data6, data7, data8, data9, data10, iVar3, iVar4, iVar5));
                return Unit.f186387a;
            case 12:
                String query = (String) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z66.c cVarE3 = ((DefiTradeScreen) this.f317845w).R2();
                Intrinsics.h(query);
                com.revolut.feature.defi.trade.impl.ui.trade.a aVar17 = (com.revolut.feature.defi.trade.impl.ui.trade.a) cVarE3;
                aVar17.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                aVar17.H2(aVar17.f71892x, new v(query, i));
                return Unit.f186387a;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.giro.impl.ui.a aVar19 = (com.revolut.feature.giro.impl.ui.a) this.v;
                rea.m mVar = aVar19.f74538q;
                xi0.b bVar = aVar19.f74539r;
                String ccy = bVar.f306286a;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(ccy, "ccy");
                wsg.n nVar = mVar.f253579b;
                xi0.a aVar20 = xi0.b.Companion;
                aVar20.getClass();
                io3.d dVarB = osg.b.b(nVar, xi0.a.a(ccy), io3.l.CURRENT, io3.i.INTERNAL, io3.j.PERSONAL, 4);
                if (dVarB == null) {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("No pocket for currency ", bVar.f306286a));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    oki.h.D2(aVar19.f74540s);
                } else {
                    String str3 = dVarB.f163145a;
                    String str4 = dVarB.f163147c;
                    aVar20.getClass();
                    oki.h.t2(aVar19, aVar19.f74540s, new GiroFlowContract$Step.Review(((b77.i) this.f317845w).f12925a, new SelectedPocket(str3, xi0.a.a(str4))), true, null, false, 12);
                }
                return Unit.f186387a;
            case 14:
                d2 d2Var = (d2) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z6k.g gVarE3 = ((MoneyRequestDetailsNewScreen) this.f317845w).R2();
                Intrinsics.h(d2Var);
                ((com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) gVarE3).K2(d2Var);
                return Unit.f186387a;
            case 15:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b bVar2 = (com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) this.v;
                c70.a.b(bVar2.f102156q, null, (String) this.f317845w, false, 5);
                r70.c.b(bVar2.f102157r, 3);
                return bVar2.X1(w.a("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.payment_link_request_toast_copied_to_clipboard, null, null, 14), null, null, null, null, 124));
            case 16:
                Data data11 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z8b.j jVar2 = (z8b.j) this.f317845w;
                jVar2.H2(jVar2.f320064q, new yvk.n(data11, 19));
                return Unit.f186387a;
            case 17:
                String itemId = (String) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z8d.j jVar3 = (z8d.j) ((AllCardsScreen) this.f317845w).f86308a0.getValue();
                Intrinsics.h(itemId);
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DONE_BUTTON_ITEM_ID")) {
                    jVar3.v2(z8d.e.f320073a);
                }
                return Unit.f186387a;
            case 18:
                ra3.b bVar3 = (ra3.b) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z8d.j jVar4 = (z8d.j) this.f317845w;
                jVar4.x2(new z1.c(bVar3, jVar4, i3));
                return Unit.f186387a;
            case 19:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z9j.e eVar2 = (z9j.e) ((RetailRevolutXDifferenceScreen) this.f317845w).O.getValue();
                Intrinsics.h(clickData);
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                eVar2.n2(new yv1.k(eVar2, clickData.f275445a, objArr2 == true ? 1 : 0, 24), new whi.b(i5));
                return Unit.f186387a;
            case 20:
                Data data12 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                za8.k kVar2 = (za8.k) this.f317845w;
                kVar2.H2(kVar2.f320584s, new yvk.n(data12, 20));
                return Unit.f186387a;
            case 21:
                LocalDate date = (LocalDate) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zag.j jVar5 = (zag.j) ((TravelHotelsBookingAmendmentDatesPickerScreen) this.f317845w).O.getValue();
                Intrinsics.h(date);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a aVar29 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) jVar5;
                aVar29.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                aVar29.H2(aVar29.u, new t5g.h(aVar29, date, 12));
                return Unit.f186387a;
            case 22:
                Data data13 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a aVar31 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) this.f317845w;
                aVar31.H2(aVar31.u, new yvk.n(data13, 21));
                return Unit.f186387a;
            case 23:
                Data data14 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zah.g gVar2 = (zah.g) this.f317845w;
                gVar2.H2(gVar2.f320717s, new yvk.n(data14, 22));
                return Unit.f186387a;
            case 24:
                Data data15 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zaj.l lVar = (zaj.l) this.f317845w;
                lVar.H2(lVar.f320734r, new yvk.n(data15, i3));
                return Unit.f186387a;
            case 25:
                n1 n1Var = (n1) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
                    com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a aVar35 = (com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a) this.f317845w;
                    com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a aVar36 = (com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a) this.f317845w;
                    aVar35.l2(new zb9.f(aVar36, null, 1), new zab.s(1, aVar36, com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 11));
                }
                return Unit.f186387a;
            case 26:
                wk5.a blockchain = (wk5.a) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bcj.l lVar2 = (bcj.l) ((com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) this.f317845w).z;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                lVar2.X2(lVar2.o, new bcj.i(blockchain, i6));
                return Unit.f186387a;
            case 27:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d.J2((com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d) this.v, (com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.a) this.f317845w);
                return Unit.f186387a;
            case 28:
                Data data16 = (Data) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zdc.i iVar6 = (zdc.i) this.f317845w;
                iVar6.H2(iVar6.f321451r, new z8g.q(data16, iVar6, 29));
                return Unit.f186387a;
            default:
                ogd.e item2 = (ogd.e) this.v;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                AddAssetRev10Screen addAssetRev10Screen = (AddAssetRev10Screen) this.f317845w;
                AddAssetRev10Screen.Companion aVar41 = AddAssetRev10Screen.INSTANCE;
                qji.c cVarZ2 = addAssetRev10Screen.z2();
                if (!(cVarZ2 instanceof zfd.g)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Intrinsics.h(item2);
                Intrinsics.checkNotNullParameter(item2, "item");
                ((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) ((WatchlistAddAssetFlow) ((zfd.g) cVarZ2)).R2()).I2(new hhd.k(item2));
                Unit unit = Unit.f186387a;
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317845w = obj2;
    }
}
