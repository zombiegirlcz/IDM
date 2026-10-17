package uye;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import dp4.y0;
import e0f.r1;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.o3;
import we6.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yki.l f284289c;
    public final /* synthetic */ TopupFlowContract$Step d;

    public /* synthetic */ j(TopupFlowContract$Step topupFlowContract$Step, com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, yki.l lVar) {
        this.f284287a = 2;
        this.d = topupFlowContract$Step;
        this.f284288b = iVar;
        this.f284289c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b bVar;
        int i = this.f284287a;
        yki.l lVar = this.f284289c;
        TopupFlowContract$Step topupFlowContract$Step = this.d;
        switch (i) {
            case 0:
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.f284288b;
                g gVar = iVar.o;
                u51.a aVar = iVar.v;
                com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h hVar = iVar.f90949s;
                c cVar = iVar.f90950t;
                hwe.k result = (hwe.k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof hwe.f) {
                    iVar.C1(((hwe.f) result).f156138a);
                } else if (result instanceof hwe.j) {
                    iVar.S2(((hwe.j) result).f156144a);
                } else if (result instanceof hwe.c) {
                    hwe.c cVar2 = (hwe.c) result;
                    String str = cVar2.f156134c;
                    TopupMethod.OtherMethod otherMethod = cVar2.f156132a;
                    ((r1) aVar).n(otherMethod, str, pw5.a.K(gVar.f284276b, gVar.f284275a));
                    cVar.a(new o3(hVar.c(otherMethod, cVar2.f156133b), str, false));
                } else if (result instanceof hwe.i) {
                    hwe.i iVar2 = (hwe.i) result;
                    String str2 = iVar2.f156143b;
                    TopupMethod topupMethod = iVar2.f156142a;
                    pte.a aVar2 = gVar.f284276b;
                    TopUpTarget topUpTarget = gVar.f284275a;
                    ((r1) aVar).n(topupMethod, str2, pw5.a.K(aVar2, topUpTarget));
                    SelectedMethod selectedMethodF = hVar.f(topupMethod);
                    if (selectedMethodF != null) {
                        cVar.a(new o3(selectedMethodF, str2, false));
                        if (((jte.d) iVar.f90947q).c(TopupApi$Toggles.PayByBank.f90470c)) {
                            TopupFlowContract$Step.SelectTopupMethod selectTopupMethod = (TopupFlowContract$Step.SelectTopupMethod) topupFlowContract$Step;
                            dj0.d dVar = selectTopupMethod.f90878c;
                            if (Intrinsics.f((dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a, str2)) {
                                Intrinsics.checkNotNullParameter(selectedMethodF, "<this>");
                                if ((selectedMethodF instanceof vye.d) && ((vye.d) selectedMethodF).e == vye.c.EASY_BANK_TRANSFER) {
                                    iVar.g3(new tw9.h(iVar, new kye.a0(selectedMethodF, selectTopupMethod.f90878c, topUpTarget, null), null, 23));
                                }
                            }
                        }
                    }
                } else if (result instanceof hwe.h) {
                    iVar.l2(new un8.j(iVar, result, null, 24), new yi5.b(26));
                } else if (result instanceof hwe.e) {
                    StartUpPocket startUpPocket = ((hwe.e) result).f156137a;
                    dj0.d dVar2 = ((TopupFlowContract$Step.SelectTopupMethod) topupFlowContract$Step).f90878c;
                    oki.h.t2(iVar, this.f284289c, new TopupFlowContract$Step.MoveMoney(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(StartUpPocket.FiatAccountsAll.f104847a, startUpPocket, dVar2 != null ? Long.valueOf(dVar2.f115082a) : null, k8l.a.ADD, 48), (Set) null, 4)), true, null, false, 12);
                } else if (result instanceof hwe.g) {
                    hwe.g gVar2 = (hwe.g) result;
                    cVar.a(new o3(iVar.T.h(gVar2.f156139a), gVar2.f156140b, true));
                } else {
                    if (!(result instanceof hwe.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data data = ((hwe.d) result).f156135a;
                    cVar.a(new o3(hVar.g(data, true), data.getD().f306286a, true));
                }
                return Unit.f186387a;
            case 1:
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.e) {
                    TopupFlowContract$Step.JapanEasyBankRelinkDialog japanEasyBankRelinkDialog = (TopupFlowContract$Step.JapanEasyBankRelinkDialog) topupFlowContract$Step;
                    oki.h.t2(this.f284288b, this.f284289c, new TopupFlowContract$Step.JapanEasyBankAuthorization(japanEasyBankRelinkDialog.f90856a, null, japanEasyBankRelinkDialog.f90857b, japanEasyBankRelinkDialog.f90858c, japanEasyBankRelinkDialog.d), false, null, false, 14);
                }
                return Unit.f186387a;
            case 2:
                ste.j result3 = (ste.j) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                CardTopUpType cardTopUpType = ((TopupFlowContract$Step.CardTopup) topupFlowContract$Step).f90832a.f90493a;
                CardTopUpType.RegularTopUp regularTopUp = cardTopUpType instanceof CardTopUpType.RegularTopUp ? (CardTopUpType.RegularTopUp) cardTopUpType : null;
                dj0.d dVar3 = regularTopUp != null ? regularTopUp.f90489a : null;
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar3 = this.f284288b;
                if (dVar3 == null) {
                    iVar3.l1().M0(new aii.i(new IllegalStateException("Expected RegularTopUp in card top-up result handling"), (aii.a) null, 6));
                    return Unit.f186387a;
                }
                if (result3 instanceof ste.g) {
                    Throwable th10 = ((ste.g) result3).f265562a;
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Exception during existing card top-up", null, th10, h0Var);
                    iVar3.R2(th10, dVar3.f115083b);
                } else if (result3 instanceof ste.h) {
                    iVar3.l2(new y0(iVar3, dVar3, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                } else {
                    if (!(result3 instanceof ste.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.b1(iVar3, iVar3.X1(((c1f.a) iVar3.J).e()), null, new r(iVar3, lVar, null, 0), 3);
                }
                return Unit.f186387a;
            case 3:
                we6.i result4 = (we6.i) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                boolean z = result4 instanceof we6.f;
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = this.f284288b;
                if (z) {
                    c cVar3 = iVar4.f90950t;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h hVar2 = iVar4.f90949s;
                    we6.f fVar = (we6.f) result4;
                    String institutionId = fVar.f296636a;
                    String institutionName = fVar.f296637b;
                    String str3 = fVar.f296638c;
                    io3.b bVar2 = fVar.d;
                    hVar2.getClass();
                    Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                    Intrinsics.checkNotNullParameter(institutionName, "institutionName");
                    cVar3.a(new o3(new vye.g(new TextClause(institutionName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(institutionName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((di6.a) hVar2.f90933a).c(bVar2), institutionId, institutionName, str3), ((TopupFlowContract$Step.PixSmartTransfer) topupFlowContract$Step).f90869a.f115083b.f306286a, true));
                } else if (result4 instanceof we6.g) {
                    iVar4.n2(new com.revolut.feature.topup_screen.impl.flows.topup.flow.e(topupFlowContract$Step, iVar4, null), new whi.b(6));
                } else {
                    if (!(result4 instanceof we6.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TopupFlowContract$Step.PixSmartTransfer pixSmartTransfer = (TopupFlowContract$Step.PixSmartTransfer) topupFlowContract$Step;
                    String str4 = pixSmartTransfer.f90869a.f115083b.f306286a;
                    g gVar3 = iVar4.o;
                    oki.h.t2(iVar4, this.f284289c, new TopupFlowContract$Step.SelectTopupMethod(pixSmartTransfer.f90869a, str4, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                }
                return Unit.f186387a;
            case 4:
                we6.d result5 = (we6.d) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                boolean zF = Intrinsics.f(result5, we6.b.f296628a);
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = this.f284288b;
                if (zF || Intrinsics.f(result5, we6.a.f296626a)) {
                    iVar5.n2(new com.revolut.feature.topup_screen.impl.flows.topup.flow.f(topupFlowContract$Step, iVar5, null), new whi.b(6));
                } else {
                    if (!Intrinsics.f(result5, we6.c.f296632a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TopupFlowContract$Step.PixSmartTransferMandateConfirmation pixSmartTransferMandateConfirmation = (TopupFlowContract$Step.PixSmartTransferMandateConfirmation) topupFlowContract$Step;
                    String str5 = pixSmartTransferMandateConfirmation.f90870a.f115083b.f306286a;
                    g gVar4 = iVar5.o;
                    oki.h.t2(iVar5, this.f284289c, new TopupFlowContract$Step.SelectTopupMethod(pixSmartTransferMandateConfirmation.f90870a, str5, pw5.a.K(gVar4.f284276b, gVar4.f284275a)), true, null, false, 12);
                }
                return Unit.f186387a;
            case 5:
                r0 result6 = (r0) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (result6 instanceof r0) {
                    TopupFlowContract$Step.CreateMandate createMandate = (TopupFlowContract$Step.CreateMandate) topupFlowContract$Step;
                    oki.h.t2(this.f284288b, this.f284289c, new TopupFlowContract$Step.StoredMethodTopUp(createMandate.f90842b, createMandate.f90843c), true, null, false, 12);
                }
                return Unit.f186387a;
            case 6:
                we6.m result7 = (we6.m) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                if (result7 instanceof we6.m) {
                    TopupFlowContract$Step.CreateMandate createMandate2 = (TopupFlowContract$Step.CreateMandate) topupFlowContract$Step;
                    oki.h.t2(this.f284288b, this.f284289c, new TopupFlowContract$Step.StoredMethodTopUp(createMandate2.f90842b, createMandate2.f90843c), true, null, false, 12);
                }
                return Unit.f186387a;
            default:
                ste.z result8 = (ste.z) obj2;
                Intrinsics.checkNotNullParameter(result8, "result");
                boolean z3 = result8 instanceof ste.w;
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = this.f284288b;
                TopupFlowContract$Step topupFlowContract$Step2 = this.d;
                if (z3) {
                    Throwable th11 = ((ste.w) result8).f265577a;
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Exception during new card top-up", null, th11, h0Var2);
                    iVar6.R2(th11, ((TopupFlowContract$Step.TopupWithNewCard) topupFlowContract$Step2).f90891b.f115083b);
                    Unit unit = Unit.f186387a;
                } else if (result8 instanceof ste.x) {
                    iVar6.l2(new uvf.b(iVar6, ((TopupFlowContract$Step.TopupWithNewCard) topupFlowContract$Step2).f90890a, topupFlowContract$Step2, (Continuation) null, 3), new yi5.b(26));
                } else {
                    if (!(result8 instanceof ste.y)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.b1(iVar6, iVar6.X1(((c1f.a) iVar6.J).e()), null, new r(iVar6, lVar, null, 1), 3);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ j(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, TopupFlowContract$Step topupFlowContract$Step, yki.l lVar, int i) {
        this.f284287a = i;
        this.f284288b = iVar;
        this.d = topupFlowContract$Step;
        this.f284289c = lVar;
    }

    public /* synthetic */ j(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, yki.l lVar, TopupFlowContract$Step topupFlowContract$Step, int i) {
        this.f284287a = i;
        this.f284288b = iVar;
        this.f284289c = lVar;
        this.d = topupFlowContract$Step;
    }
}
