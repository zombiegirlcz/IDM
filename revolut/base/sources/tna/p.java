package tna;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.data.model.Data;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreen;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreen;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreen;
import com.revolut.feature.feedback.impl.ui.screen.one_click.OneClickFeedbackController;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreen;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreen;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlow;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreen;
import ip0.c90;
import ip0.um0;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import o0j.c;
import ttl.x;
import wim.z;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f272352w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f272352w = obj3;
    }

    private final Object b(Object obj2) {
        rwj.c cVarA;
        o0j.c cVar = (o0j.c) this.f272352w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        twj.f fVar = (twj.f) this.v;
        ne0.j jVar = fVar.f275038b;
        ue0.c cVar2 = fVar.f275039c;
        twj.f.Companion.getClass();
        Type type = twj.f.f275036j;
        Intrinsics.checkNotNullExpressionValue(type, "<get-USER_AUTH_ANSWERS_TYPE>(...)");
        rwj.c cVar3 = (rwj.c) cVar2.T2("answers", type);
        List<o0j.c> listA = twj.f.a(fVar, cVar3 != null ? qwj.a.a(cVar3) : f0.f322471a, cVar);
        List listA2 = twj.f.a(fVar, (List) jVar.get("ANSWERS_FOR_SUBMISSION_CACHE_KEY"), cVar);
        if (!(cVar instanceof o0j.l) && !(cVar instanceof c.k)) {
            Intrinsics.checkNotNullParameter(listA, "<this>");
            rwj.c cVar4 = new rwj.c(0);
            rwj.c cVarA2 = cVar4;
            for (o0j.c cVar5 : listA) {
                if (cVar5 instanceof o0j.d) {
                    o0j.d dVar = (o0j.d) cVar5;
                    cVarA2 = rwj.c.a(cVarA2, to3.a.b(dVar.f221230a), dVar.f221231b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4);
                } else {
                    if (cVar5 instanceof o0j.j) {
                        o0j.j jVar2 = (o0j.j) cVar5;
                        cVarA = rwj.c.a(cVarA2, null, null, jVar2.f221237a, jVar2.f221239c, jVar2.f221238b, null, null, null, null, jVar2.d, jVar2.e, jVar2.f, jVar2.f221240g, null, null, null, null, null, null, null, -7709);
                    } else if (cVar5 instanceof o0j.g) {
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, ((o0j.g) cVar5).f221234a.toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33);
                    } else if (cVar5 instanceof o0j.h) {
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, ((o0j.h) cVar5).f221235a, null, null, null, null, null, null, null, null, null, null, null, null, null, -65);
                    } else if (cVar5 instanceof o0j.n) {
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, ((o0j.n) cVar5).f221244a, null, null, null, null, null, null, null, null, null, null, null, null, -129);
                    } else if (cVar5 instanceof o0j.e) {
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, ((o0j.e) cVar5).f221232a, null, null, null, null, null, null, null, null, null, null, null, -257);
                    } else if (cVar5 instanceof o0j.k) {
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, ((o0j.k) cVar5).f221241a, null, null, null, null, null, null, -8193);
                    } else if (cVar5 instanceof c.m) {
                        c.m mVar = (c.m) cVar5;
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mVar.f221227a, mVar.f221228b, null, null, null, null, -49153);
                    } else if (cVar5 instanceof c.n) {
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073);
                    } else if (cVar5 instanceof c.a) {
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537);
                    } else if (cVar5 instanceof o0j.f) {
                        cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new rwj.a(((o0j.f) cVar5).f221233a), null, null, null, -262145);
                    } else if (!(cVar5 instanceof o0j.l) && !(cVar5 instanceof c.k)) {
                        if (cVar5 instanceof c.h) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289);
                        } else if (cVar5 instanceof c.e) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577);
                        } else if (cVar5 instanceof c.b) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153);
                        } else if (cVar5 instanceof c.j) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305);
                        } else if (cVar5 instanceof o0j.o) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((o0j.o) cVar5).f221245a, null, null, -8388609);
                        } else if (cVar5 instanceof o0j.m) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(((o0j.m) cVar5).f221243a), null, -16777217);
                        } else if (cVar5 instanceof o0j.i) {
                            o0j.i iVar = (o0j.i) cVar5;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            dj0.d dVar2 = iVar.f221236a;
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new rwj.b(dVar2.f115082a, dVar2.f115083b.f306286a), -33554433);
                        } else if (cVar5 instanceof c.g) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865);
                        } else if (cVar5 instanceof c.l) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729);
                        } else if (cVar5 instanceof c.f) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435457);
                        } else if (cVar5 instanceof c.C1228c) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870913);
                        } else if (cVar5 instanceof c.d) {
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825);
                        } else {
                            if (!(cVar5 instanceof c.i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVarA = rwj.c.a(cVarA2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE);
                        }
                    }
                    cVarA2 = cVarA;
                }
            }
            cVar2.G(cVarA2, "answers", z.d(o0.b(rwj.c.class)));
        }
        fVar.i.setValue(listA);
        jVar.f("ANSWERS_FOR_SUBMISSION_CACHE_KEY", listA2);
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p((r) this.f272352w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p((OneClickFeedbackController) this.f272352w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            case 2:
                p pVar3 = new p((BinaryQuestionsScreen) this.f272352w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
            case 3:
                p pVar4 = new p((ScreenerCollectionScreen) this.f272352w, continuation, 3);
                pVar4.v = obj2;
                return pVar4;
            case 4:
                p pVar5 = new p((tqc.e) this.f272352w, continuation, 4);
                pVar5.v = obj2;
                return pVar5;
            case 5:
                p pVar6 = new p((InstalmentConfirmationScreen) this.f272352w, continuation, 5);
                pVar6.v = obj2;
                return pVar6;
            case 6:
                p pVar7 = new p((com.revolut.feature.credit.card.impl.ui.instalment.confirmation.a) this.f272352w, continuation, 6);
                pVar7.v = obj2;
                return pVar7;
            case 7:
                p pVar8 = new p((tre.i) this.f272352w, continuation, 7);
                pVar8.v = obj2;
                return pVar8;
            case 8:
                p pVar9 = new p((tse.i) this.f272352w, continuation, 8);
                pVar9.v = obj2;
                return pVar9;
            case 9:
                p pVar10 = new p((CreditCardLimitHubManageScreen) this.f272352w, continuation, 9);
                pVar10.v = obj2;
                return pVar10;
            case 10:
                p pVar11 = new p((tt4.s) this.f272352w, continuation, 10);
                pVar11.v = obj2;
                return pVar11;
            case 11:
                p pVar12 = new p((x) this.f272352w, continuation, 11);
                pVar12.v = obj2;
                return pVar12;
            case 12:
                p pVar13 = new p((CardTerminateScreen) this.f272352w, continuation, 12);
                pVar13.v = obj2;
                return pVar13;
            case 13:
                p pVar14 = new p((tu2.h) this.f272352w, continuation, 13);
                pVar14.v = obj2;
                return pVar14;
            case 14:
                p pVar15 = new p((tuj.g) this.f272352w, continuation, 14);
                pVar15.v = obj2;
                return pVar15;
            case 15:
                p pVar16 = new p((tuk.n) this.f272352w, continuation, 15);
                pVar16.v = obj2;
                return pVar16;
            case 16:
                p pVar17 = new p((CreditCardStatementTransactionsScreen) this.f272352w, continuation, 16);
                pVar17.v = obj2;
                return pVar17;
            case 17:
                p pVar18 = new p((tv7.j) this.f272352w, continuation, 17);
                pVar18.v = obj2;
                return pVar18;
            case 18:
                p pVar19 = new p((com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a) this.f272352w, continuation, 18);
                pVar19.v = obj2;
                return pVar19;
            case 19:
                return new p((tw5.i) this.v, (String) this.f272352w, continuation, 19);
            case 20:
                p pVar20 = new p((InsuranceHomeScreen) this.f272352w, continuation, 20);
                pVar20.v = obj2;
                return pVar20;
            case 21:
                p pVar21 = new p((OnDemandFeatureInstallFlow) this.f272352w, continuation, 21);
                pVar21.v = obj2;
                return pVar21;
            case 22:
                p pVar22 = new p((com.revolut.feature.kyc.impl.ondemand.a) this.f272352w, continuation, 22);
                pVar22.v = obj2;
                return pVar22;
            case 23:
                return new p((tvb.d) this.v, (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) this.f272352w, continuation, 23);
            case 24:
                return new p((twj.f) this.v, (o0j.c) this.f272352w, continuation, 24);
            case 25:
                return new p((WallpaperAssetSwitcher) this.v, (NavBarWithContainerBackground) this.f272352w, continuation, 25);
            case 26:
                p pVar23 = new p((txg.i) this.f272352w, continuation, 26);
                pVar23.v = obj2;
                return pVar23;
            case 27:
                p pVar24 = new p((DirectDebitAccountSelectionScreen) this.f272352w, continuation, 27);
                pVar24.v = obj2;
                return pVar24;
            case 28:
                p pVar25 = new p((ty4.o) this.f272352w, continuation, 28);
                pVar25.v = obj2;
                return pVar25;
            default:
                p pVar26 = new p((ty8.p) this.f272352w, continuation, 29);
                pVar26.v = obj2;
                return pVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((c90) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((p) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((p) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((p) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((p) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((p) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((p) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((p) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((p) create((uh0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((p) create((xg0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((p) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0931  */
    /* JADX WARN: Type inference failed for: r0v172, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tna.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f272352w = obj2;
    }
}
