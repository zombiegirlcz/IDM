package xw9;

import androidx.camera.camera2.pipe.core.ProcessingQueue;
import androidx.camera.camera2.pipe.core.PruningProcessingQueue;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.promo.api.invitation.models.ChatInvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.EmptyChatInvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.InvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.RecipientData;
import com.revolut.feature.referrals.promo.api.invitation.models.ReferralsInvitationModel;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsController;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$InputData;
import com.revolut.feature.selfserve.entity.config.shared.flow.EntityConfigFlowContract$Step;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.a;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionActionToDo;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.feature.selfserve.sot.impl.ui.flow.DocumentUpload;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.AirportLoungesPassActivityScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.extended_hours.ExtendedHoursBackendFlowContract$Configuration;
import czc.v;
import do3.n;
import eyc.o;
import g48.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import lk0.h;
import mwg.l;
import oki.h;
import okl.m;
import rd0.e;
import sef.j;
import sgm.e3;
import svi.y0;
import svi.z0;
import te0.w;
import vkm.j2;
import wvg.r1;
import wx9.d;
import xx1.f;
import xx1.g;
import xx9.r;
import xy7.p;
import xya.t;
import yrb.x;
import zhm.d0;
import zhm.f0;
import zz9.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f309337b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f309336a = i;
        this.f309337b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        z0 z0Var;
        SubmissionActionToDo submissionActionToDo;
        DocumentType documentType;
        Object next;
        int i = this.f309336a;
        String str = "";
        int i2 = 13;
        int i3 = 1;
        ?? r112 = 0;
        r112 = 0;
        Object obj3 = this.f309337b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                h.D2(((com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.b) obj3).f79648q);
                return Boolean.TRUE;
            case 1:
                ((f) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM iris_contacts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identityType");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new g(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), f.k(sQLiteStatementPrepare.getText(columnIndexOrThrow8)), f.j(sQLiteStatementPrepare.getText(columnIndexOrThrow9))));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) ((u0a.a) obj3).f276162b;
                arrayList2.clear();
                List list = (List) ((Data) obj2).getContent();
                arrayList2.addAll(list != null ? list : f0.f322471a);
                return Unit.f186387a;
            case 3:
                r rVar = (r) obj3;
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                efm.r rVarA = rVar.f309452g.a(-1L);
                efm.r rVarC = rVar.f.c(-1L);
                efm.r rVarB = rVar.f309451c.b(-1L);
                efm.r rVarA2 = rVar.d.a(-1L);
                efm.r rVarG = rVar.f309453h.g(-1L);
                d dVar = rVar.e;
                String currentUserId = user.f116408a;
                Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
                efm.r rVarW = nim.a.w(e.c(((r0) dVar.f300794b.f207713b).i(false), kotlin.coroutines.g.f186406a), new hwf.b(22));
                efm.r map = dVar.f300795c.a().map(new wx9.b(new r1(20), i3));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                efm.r rVarDistinctUntilChanged = w.l(rVarW, map).map(new wx9.b(new r1(21), 2)).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                efm.r rVarG2 = m70.a.g(mo3.a.n(mif.a.h(rVarA, rVarC, rVarB, rVarA2, rVarG, pd.b.r(rVarDistinctUntilChanged, new wwa.a(dVar, currentUserId, 4)))), null, new xx9.e(i2), 1);
                int i5 = 24;
                return rVarG2.map(new xx9.d(23, new xpe.c(user, rVar, i5))).filter(new xx9.d(i5, new xx9.f(6)));
            case 4:
                RecipientData recipientData = (RecipientData) obj2;
                Intrinsics.checkNotNullParameter(recipientData, "recipientData");
                sxa.f fVar = (sxa.f) DBUtil.performBlocking(((xxa.d) obj3).f309462b.f266387a, true, false, new j(xxa.d.a(recipientData), 12));
                if (fVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                sxa.b bVar = fVar.f266391b;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                EmptyChatInvitationPromo emptyChatInvitationPromo = new EmptyChatInvitationPromo(bVar.f266382a, bVar.f266383b, bVar.f266384c, bVar.d, bVar.e);
                sxa.a aVar = fVar.f266392c;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                ChatInvitationPromo chatInvitationPromo = new ChatInvitationPromo(aVar.f266379a, aVar.f266380b, aVar.f266381c, aVar.d, aVar.e);
                sxa.c cVar = fVar.d;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                InvitationPromo invitationPromo = new InvitationPromo(cVar.f266385a, cVar.f266386b);
                sxa.c cVar2 = fVar.e;
                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                InvitationPromo invitationPromo2 = new InvitationPromo(cVar2.f266385a, cVar2.f266386b);
                sxa.c cVar3 = fVar.f;
                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                return new ReferralsInvitationModel(emptyChatInvitationPromo, chatInvitationPromo, invitationPromo, invitationPromo2, new InvitationPromo(cVar3.f266385a, cVar3.f266386b));
            case 5:
                com.revolut.feature.selfserve.entity.config.shared.flow.a aVar2 = (com.revolut.feature.selfserve.entity.config.shared.flow.a) obj3;
                com.revolut.feature.selfserve.entity.config.shared.ui.home.a result = (com.revolut.feature.selfserve.entity.config.shared.ui.home.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof a.C0539a) {
                    h.D2(aVar2.f85829p);
                } else if (result instanceof o) {
                    aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((o) result).f130665a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                } else {
                    if (!(result instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(aVar2, aVar2.f85829p, EntityConfigFlowContract$Step.Help.f85827a, true, null, false, 12);
                }
                return Unit.f186387a;
            case 6:
                return new wxg.n(((mwg.e) obj3).f209452c, d0.P0(zhm.w.u((List) obj2), new xxg.h()));
            case 7:
                return new wxg.n(((mwg.a) obj3).f209436c, d0.P0((List) obj2, new xxg.j()));
            case 8:
                return new wxg.n(((l) obj3).f209476c, d0.P0((List) obj2, new xxg.l()));
            case 9:
                xxh.e eVar = (xxh.e) obj3;
                dii.g it8 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8, dii.f.f115069a)) {
                    xxh.c cVar4 = new xxh.c(eVar, null);
                    eVar.getClass();
                    eVar.V2(new xnl.f(eVar, cVar4, r112, 17), new yi5.b(29));
                }
                return Unit.f186387a;
            case 10:
                KProperty[] kPropertyArr = AirportLoungesPassActivityScreen.U;
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a aVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a) ((AirportLoungesPassActivityScreen) obj3).e3();
                j2 j2Var = aVar3.f99117q;
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                y yVar = aVar3.f99118r;
                List list2 = (List) ((xxi.e) ((j2) yVar.f22677a).getValue()).f309536a.getContent();
                String str2 = (list2 == null || (z0Var = (z0) d0.o0(list2)) == null) ? null : z0Var.f266021b;
                Map map2 = ((xxi.e) ((j2) yVar.f22677a).getValue()).f309538c;
                if (!Intrinsics.f(str2, ((y0) j2Var.getValue()).f266015a) || !Intrinsics.f(map2, ((y0) j2Var.getValue()).f266016b)) {
                    j2Var.g(null, new y0(str2, map2));
                }
                return Unit.f186387a;
            case 11:
                zxi.f output = (zxi.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                ((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a) obj3).I2(output.f326342a);
                return Unit.f186387a;
            case 12:
                return m.w(null, null, null, 7, ((p) ((xy7.o) obj3).f309645n).f309646a);
            case 13:
                AllReferralsController.Companion aVar4 = AllReferralsController.INSTANCE;
                com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b bVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b) ((AllReferralsController) obj3).R2();
                if (bVar2.v) {
                    bVar2.l2(new xya.g(bVar2, r112, i3), new yi5.b(26));
                }
                return Unit.f186387a;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                AllReferralsScreenContract$InputData allReferralsScreenContract$InputData = ((t) obj3).f309695a;
                return tya.c.c(allReferralsScreenContract$InputData.f81921b, allReferralsScreenContract$InputData.f81922c);
            case 15:
                SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                bzc.n nVar = (bzc.n) ((bzc.o) obj3);
                String str3 = nVar.f19964a;
                SubmissionEvidence submissionEvidence = nVar.f19965b;
                xyc.e eVar2 = nVar.f19966c;
                if (submissionEvidence != null && (submissionActionToDo = submissionEvidence.i) != null) {
                    r112 = submissionActionToDo.f85878a;
                }
                return SotFlowContract$FlowState.a(update, false, str3, null, null, null, null, null, null, null, null, submissionEvidence, r112 == 0 ? "" : r112, eVar2, false, 9213);
            case 16:
                IncomeSource incomeSource = (IncomeSource) obj3;
                SotFlowContract$FlowState update2 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                List list3 = incomeSource.e;
                List list4 = list3.size() == 1 ? (List) d0.b0(list3) : null;
                DocumentType documentType2 = list3.size() == 1 ? (DocumentType) d0.d0((List) d0.b0(list3)) : null;
                if (Intrinsics.f(incomeSource.f85873a, "OTHER_TRANSACTION")) {
                    str = update2.f85914g;
                } else {
                    m70.a.c(t0.f186434a);
                }
                return SotFlowContract$FlowState.a(update2, false, null, incomeSource, list4, documentType2, null, str, null, null, null, null, null, null, false, 16291);
            case 17:
                SotFlowContract$FlowState update3 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return SotFlowContract$FlowState.a(update3, false, null, null, null, null, null, null, null, null, ((tyc.f) ((tyc.h) obj3)).f275544a, null, null, null, false, 15871);
            case 18:
                uyc.p pVar = (uyc.p) obj3;
                SotFlowContract$FlowState update4 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                List list5 = update4.f;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list5) {
                    String str4 = ((DocumentUpload) obj4).f85909a.f85859a;
                    DocumentUpload documentUpload = (DocumentUpload) d0.d0(((uyc.n) pVar).f284144a);
                    if (!Intrinsics.f(str4, (documentUpload == null || (documentType = documentUpload.f85909a) == null) ? null : documentType.f85859a)) {
                        arrayList3.add(obj4);
                    }
                }
                uyc.n nVar2 = (uyc.n) pVar;
                return SotFlowContract$FlowState.a(update4, false, null, null, null, null, d0.E0(nVar2.f284144a, arrayList3), null, null, null, null, null, nVar2.f284145b, null, false, 14303);
            case 19:
                SotFlowContract$FlowState update5 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return SotFlowContract$FlowState.a(update5, false, null, null, null, ((czc.t) ((v) obj3)).f110218a, null, null, null, null, null, null, null, null, true, 8175);
            case 20:
                SotFlowContract$FlowState update6 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return SotFlowContract$FlowState.a(update6, false, null, null, null, null, null, null, null, null, null, (SubmissionEvidence) obj3, null, null, false, 15359);
            case 21:
                xyh.t tVar = (xyh.t) obj3;
                tVar.V2(new xv4.o(tVar, (xyh.d) obj2, (Continuation) null), new yi5.b(29));
                return Unit.f186387a;
            case 22:
                ExtendedHoursBackendFlowContract$Configuration configuration = (ExtendedHoursBackendFlowContract$Configuration) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                kge.d dVar2 = (kge.d) ((b1e.a) obj3).f11796b;
                String portfolioId = configuration.f104153a;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                hyk.a aVar5 = (hyk.a) dVar2.f183974b;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                return prk.o.l(aVar5.f156883c.f(portfolioId, true), null, null, 3, "firstOrError(...)");
            case 23:
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.c cVar5 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.c) obj3;
                u output2 = (u) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar5.C2(output2);
                return Unit.f186387a;
            case 24:
                return ProcessingQueue.channel$lambda$0((ProcessingQueue) obj3, obj2);
            case 25:
                return PruningProcessingQueue.channel$lambda$0((PruningProcessingQueue) obj3, obj2);
            case 26:
                return y0b.f.a((y0b.f) obj2, null, null, (g0b.c) obj3, false, 47);
            case 27:
                return y0b.f.a((y0b.f) obj2, null, (x) obj3, null, false, 55);
            case 28:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                ((y0i.e) obj3).f310218b.c(command);
                return Boolean.TRUE;
            default:
                e3 e3Var = (e3) obj3;
                List scopedSymbols = (List) obj2;
                Intrinsics.checkNotNullParameter(scopedSymbols, "scopedSymbols");
                if (scopedSymbols.isEmpty()) {
                    return zi0.c.j(f0.f322471a);
                }
                e3Var.getClass();
                Set set = (Set) e3Var.f262807c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : scopedSymbols) {
                    rzj.d dVar3 = ((rzj.b) obj5).f258690a;
                    Object arrayList4 = linkedHashMap.get(dVar3);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(dVar3, arrayList4);
                    }
                    ((List) arrayList4).add(obj5);
                }
                ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList5.add(new Pair(entry.getKey(), entry.getValue()));
                }
                Map mapT = zhm.r0.t(arrayList5);
                ArrayList arrayList6 = new ArrayList();
                for (Map.Entry entry2 : mapT.entrySet()) {
                    rzj.d dVar4 = (rzj.d) entry2.getKey();
                    List list6 = (List) entry2.getValue();
                    Set set2 = set;
                    Iterator it9 = set2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (((c1k.c) next).b(dVar4)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    c1k.c cVar6 = (c1k.c) next;
                    if (cVar6 == null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.b(rd0.c.WARNING, "TrendPreviewDelegatePresentationModel", "Missing providers! Cannot find a provider for " + dVar4 + ". " + d0.k0(set2, null, null, null, 0, null, 63) + " available.", null, null, 16);
                        cVar6 = null;
                    }
                    efm.r rVarA3 = cVar6 != null ? cVar6.a(list6) : null;
                    if (rVarA3 != null) {
                        arrayList6.add(rVarA3);
                    }
                }
                Intrinsics.checkNotNullParameter(arrayList6, "<this>");
                return nim.a.w(nim.a.w(mif.a.l(arrayList6), new y07.m(8)), new x5f.m(scopedSymbols, i2));
        }
    }
}
