package ewa;

import a2f.j;
import amh.p;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.check_topup.api.data.SDKScanResult;
import com.revolut.feature.check_topup.impl.R$string;
import com.revolut.feature.check_topup.impl.ui_kompot.screen.scan.dialog.CheckTopUpScanDialogHelperImpl;
import com.revolut.feature.credit.application.plugins.api.models.delayed_credit_check.DelayedCreditCheckResponse;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.retail.savings.impl.challenge.presentation.pause_challenge.PauseChallengeScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import do3.n;
import e94.g;
import efm.d0;
import efm.r;
import ewh.s;
import ewh.v;
import f33.h;
import f5g.k;
import ff4.b0;
import fg8.i0;
import fg8.l0;
import fg8.q;
import fhi.m;
import flf.t;
import fm5.l;
import fmf.m0;
import fmf.n0;
import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nii.g0;
import nii.y0;
import nii.z;
import skm.k0;
import te0.w;
import u04.b;
import vkm.j2;
import vkm.z1;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f130116w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f130116w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((e) this.f130116w, continuation, 0);
            case 1:
                return new d((v) this.f130116w, continuation, 1);
            case 2:
                return new d((com.revolut.feature.select.payment.impl.ui.flow.a) this.f130116w, continuation, 2);
            case 3:
                return new d((f0e.d) this.f130116w, continuation, 3);
            case 4:
                return new d((f0f.a) this.f130116w, continuation, 4);
            case 5:
                return new d((com.revolut.feature.freelancer.impl.ui.profile.website.flow.d) this.f130116w, continuation, 5);
            case 6:
                return new d((h) this.f130116w, continuation, 6);
            case 7:
                return new d((f34.a) this.f130116w, continuation, 7);
            case 8:
                return new d((k) this.f130116w, continuation, 8);
            case 9:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a) this.f130116w, continuation, 9);
            case 10:
                return new d((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) this.f130116w, continuation, 10);
            case 11:
                return new d((fb.f) this.f130116w, continuation, 11);
            case 12:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.a) this.f130116w, continuation, 12);
            case 13:
                return new d((b0) this.f130116w, continuation, 13);
            case 14:
                return new d((fg3.i) this.f130116w, continuation, 14);
            case 15:
                return new d((q) this.f130116w, continuation, 15);
            case 16:
                return new d((l0) this.f130116w, continuation, 16);
            case 17:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c) this.f130116w, continuation, 17);
            case 18:
                return new d((m) this.f130116w, continuation, 18);
            case 19:
                return new d((com.revolut.feature.apm.wero.impl.ui.p2m.registration.a) this.f130116w, continuation, 19);
            case 20:
                return new d((com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) this.f130116w, continuation, 20);
            case 21:
                return new d((fi8.k) this.f130116w, continuation, 21);
            case 22:
                return new d((com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) this.f130116w, continuation, 22);
            case 23:
                return new d((PauseChallengeScreen) this.f130116w, continuation, 23);
            case 24:
                return new d((fkb.f) this.f130116w, continuation, 24);
            case 25:
                return new d((fkl.h) this.f130116w, continuation, 25);
            case 26:
                return new d((t) this.f130116w, continuation, 26);
            case 27:
                return new d((l) this.f130116w, continuation, 27);
            case 28:
                return new d((n0) this.f130116w, continuation, 28);
            default:
                return new d((eo0.b) this.f130116w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objB;
        Object ccRetailStatus;
        Object objC;
        Object objB2;
        Object objQ;
        Object objX;
        Object objA;
        int i = this.u;
        int i2 = 5;
        int i3 = 2;
        int i5 = 12;
        int i6 = 4;
        int i21 = 21;
        int i22 = 14;
        int i32 = 3;
        int i33 = 0;
        ru3.a aVar = null;
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
        Object obj3 = this.f130116w;
        int i43 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    mk0.a aVar3 = ((e) obj3).f130119c;
                    e.Companion.getClass();
                    tk0.b bVar = new tk0.b("HAS_BOUND_REFERRER");
                    Boolean bool = Boolean.TRUE;
                    this.v = 1;
                    if (aVar3.e(bVar, bool, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    v vVar = (v) obj3;
                    s sVar = new s(vVar, null);
                    this.v = 1;
                    if (vVar.p2(this, sVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    com.revolut.feature.select.payment.impl.ui.flow.a aVar6 = (com.revolut.feature.select.payment.impl.ui.flow.a) obj3;
                    g gVar = new g(aVar6, objArr == true ? 1 : 0, 10);
                    this.v = 1;
                    if (aVar6.p2(this, gVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                f0e.d dVar = (f0e.d) obj3;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    d0 d0VarF = dVar.f131110q.f(false);
                    this.v = 1;
                    objB = nim.a.b(d0VarF, this);
                    if (objB == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                dVar.H2(dVar.f131112s, new j((n) objB, i2));
                return Unit.f186387a;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    z1 z1Var = ((f0f.a) obj3).f131119a;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.profile.website.flow.d dVar2 = (com.revolut.feature.freelancer.impl.ui.profile.website.flow.d) obj3;
                    com.revolut.feature.freelancer.impl.ui.profile.website.flow.c cVar = new com.revolut.feature.freelancer.impl.ui.profile.website.flow.c(dVar2, null);
                    this.v = 1;
                    if (dVar2.p2(this, cVar) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    h hVar = (h) obj3;
                    g gVar2 = new g(hVar, objArr2 == true ? 1 : 0, i22);
                    this.v = 1;
                    if (u0.b0(hVar.X(), "DELIVERY_METHODS_NEXT_BUTTON_TAG", gVar2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = ((f34.a) obj3).f131910a;
                    this.v = 1;
                    ccRetailStatus = creditPluginsService.getCcRetailStatus(this);
                    if (ccRetailStatus == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    ccRetailStatus = obj2;
                }
                u04.b bVar2 = (u04.b) ccRetailStatus;
                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                String status = bVar2.getStatus();
                ru3.a[] aVarArrValues = ru3.a.values();
                int length = aVarArrValues.length;
                while (true) {
                    if (i33 < length) {
                        ru3.a aVar12 = aVarArrValues[i33];
                        if (a0.z(aVar12.name(), status, true)) {
                            aVar = aVar12;
                        } else {
                            i33++;
                        }
                    }
                }
                if (aVar == null) {
                    aVar = ru3.a.APPLICATION_REJECTED;
                }
                int i102 = u04.a.f276053a[aVar.ordinal()];
                if (i102 != 1) {
                    if (i102 == 2) {
                        return DelayedCreditCheckResponse.Offer.f66450a;
                    }
                    if (i102 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String fallbackPostActivation = bVar2.getFallbackPostActivation();
                    if (fallbackPostActivation != null) {
                        return new DelayedCreditCheckResponse.Rejected(fallbackPostActivation);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                Integer maximumAttemptsNumber = bVar2.getMaximumAttemptsNumber();
                if (maximumAttemptsNumber == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iIntValue = maximumAttemptsNumber.intValue();
                Integer attemptDelay = bVar2.getAttemptDelay();
                if (attemptDelay == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iIntValue2 = attemptDelay.intValue();
                String image = bVar2.getImage();
                String title = bVar2.getTitle();
                if (title == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String description = bVar2.getDescription();
                if (description == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String primaryButtonTitle = bVar2.getPrimaryButtonTitle();
                if (primaryButtonTitle == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                b.a timeoutPrompt = bVar2.getTimeoutPrompt();
                if (timeoutPrompt == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                DelayedCreditCheckResponse.TimeoutPrompt timeoutPrompt2 = new DelayedCreditCheckResponse.TimeoutPrompt(timeoutPrompt.getTitle(), timeoutPrompt.getDescription(), boh.f.v(timeoutPrompt.getActionFooter()));
                String fallbackPostActivation2 = bVar2.getFallbackPostActivation();
                if (fallbackPostActivation2 != null) {
                    return new DelayedCreditCheckResponse.InProgress(iIntValue, iIntValue2, image, title, description, primaryButtonTitle, timeoutPrompt2, fallbackPostActivation2);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    b4g.j jVar = ((k) obj3).o;
                    this.v = 1;
                    x4l.c cVar2 = jVar.d;
                    Object obj4 = Unit.f186387a;
                    Object objD = cVar2.d(obj4, true, this);
                    if (objD == aVar13) {
                        obj4 = objD;
                    }
                    if (obj4 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a aVar15 = (com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a) obj3;
                    g gVar3 = new g(aVar15, objArr3 == true ? 1 : 0, 15);
                    this.v = 1;
                    if (aVar15.p2(this, gVar3) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b bVar3 = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) obj3;
                    if (bVar3.f86362r == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r10.q qVar = bVar3.f86364t;
                    this.v = 1;
                    Object objEmit = ((z1) qVar.d).emit(Boolean.FALSE, this);
                    if (objEmit != aVar16) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fb.f fVar = (fb.f) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    fVar.f133421r.getClass();
                    Flow flowX1 = fVar.X1(new y0(null, new z(new TextLocalisedClause(R.string.user_details_screen_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                    this.v = 1;
                    if (vkm.q.x(flowX1, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                oki.h.D2(fVar.u);
                return Unit.f186387a;
            case 12:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.a aVar19 = (com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.a) obj3;
                g gVar4 = new g(aVar19, objArr4 == true ? 1 : 0, 17);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar19.k, "revertApplication", gVar4, this);
                return objB3 == aVar18 ? aVar18 : objB3;
            case 13:
                b0 b0Var = (b0) obj3;
                j60.a aVar20 = b0Var.f134711s;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    r rVarT = aVar20.t();
                    this.v = 1;
                    objC = nim.a.c(rVarT, this);
                    if (objC == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objC = obj2;
                }
                if (((rp0.a0) objC).f256040a) {
                    j60.a.v(aVar20, false, null, 3);
                } else {
                    b0Var.C2(ff4.n.f134732a);
                }
                return Unit.f186387a;
            case 14:
                fg3.i iVar = (fg3.i) obj3;
                y yVar = iVar.f134893q;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    zf3.a aVar23 = iVar.o;
                    dj0.d amount = ((fg3.a) ((j2) yVar.f22677a).getValue()).f134884a;
                    SDKScanResult result = ((fg3.a) ((j2) yVar.f22677a).getValue()).f134885b;
                    aVar23.getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(result, "result");
                    bg3.a aVar24 = aVar23.f321857a;
                    aVar24.getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(result, "result");
                    ufm.i iVar2 = new ufm.i(new ufm.c(new a09.r(aVar24, result, 7), i3), new bce.e(new b4d.c(aVar24, i5, amount, result), 23), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                    ufm.n nVarI0 = w.i0(iVar2);
                    this.v = 1;
                    objB2 = nim.a.b(nVarI0, this);
                    if (objB2 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB2 = obj2;
                }
                ((CheckTopUpScanDialogHelperImpl) iVar.f134892p).getClass();
                return yji.l.a1(iVar, iVar.X1(new y0("PENDING_DIALOG_ID", new g0(new TextLocalisedClause(R$string.topup_check_dialog_pending_title, null, null, 14), new TextLocalisedClause(R$string.topup_check_dialog_pending_description, null, null, 14), null, null, null, null, CheckTopUpScanDialogHelperImpl.DialogConfiguration.PendingDialog.f65774a, null, false, null, false, null, 16316), false, 4)), null, null, new f9d.c(iVar, (String) objB2, (Continuation) null), 3);
            case 15:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                try {
                    if (i110 == 0) {
                        o.b(obj2);
                        om4.d0 d0Var = ((q) obj3).f134986a;
                        this.v = 1;
                        x4l.c cVar3 = ((zb8.b) d0Var.f226551b).d;
                        Object obj5 = Unit.f186387a;
                        Object objD2 = cVar3.d(obj5, true, this);
                        if (objD2 != aVar25) {
                            objD2 = obj5;
                        }
                        if (objD2 == aVar25) {
                            obj5 = objD2;
                        }
                        if (obj5 == aVar25) {
                            return aVar25;
                        }
                    } else {
                        if (i110 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    Unit unit2 = Unit.f186387a;
                    break;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                try {
                    if (i111 == 0) {
                        o.b(obj2);
                        rul.e eVar = ((l0) obj3).f134946b;
                        this.v = 1;
                        x4l.c cVar4 = ((xg8.j) ((xg8.a) eVar.f257630b)).f;
                        Object obj6 = Unit.f186387a;
                        Object objD3 = cVar4.d(obj6, true, this);
                        if (objD3 != aVar26) {
                            objD3 = obj6;
                        }
                        if (objD3 == aVar26) {
                            obj6 = objD3;
                        }
                        if (obj6 == aVar26) {
                            return aVar26;
                        }
                    } else {
                        if (i111 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    Unit unit3 = Unit.f186387a;
                    break;
                } catch (Exception e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c cVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c) obj3;
                fh4.s sVar2 = new fh4.s(cVar5, objArr5 == true ? 1 : 0, i43);
                this.v = 1;
                Object objB4 = pu7.a.B(cVar5.k, "confirm", sVar2, this);
                return objB4 == aVar27 ? aVar27 : objB4;
            case 18:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    m mVar = (m) obj3;
                    g gVar5 = new g(mVar, objArr6 == true ? 1 : 0, 18);
                    this.v = 1;
                    if (mVar.p2(this, gVar5) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.apm.wero.impl.ui.p2m.registration.a aVar29 = (com.revolut.feature.apm.wero.impl.ui.p2m.registration.a) obj3;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    ku1.v vVar2 = new ku1.v(i21);
                    g gVar6 = new g(aVar29, objArr7 == true ? 1 : 0, 19);
                    this.v = 1;
                    objQ = n14.k.Q(aVar29, null, null, vVar2, gVar6, this, 2);
                    if (objQ == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objQ = obj2;
                }
                nii.e eVar2 = (nii.e) objQ;
                if (eVar2 instanceof nii.d) {
                    aVar29.C2(fi2.e.f135287a);
                } else {
                    if (!(eVar2 instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar29.C2(fi2.d.f135286a);
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar31 = (com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) obj3;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    jhi.b bVarG = mo3.a.g(ybl.l.d(aVar31.u), null, new i0(i5), 1);
                    this.v = 1;
                    objX = vkm.q.x(bVarG, this);
                    if (objX == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objX = obj2;
                }
                aVar31.H2(aVar31.f74919y, new p(((TradingLegalEntityInformation) objX).f105106a, i32));
                return Unit.f186387a;
            case 21:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                try {
                    if (i116 == 0) {
                        o.b(obj2);
                        prl.e eVar3 = ((fi8.k) obj3).f135354q;
                        this.v = 1;
                        if (eVar3.r(this) == aVar33) {
                            return aVar33;
                        }
                    } else {
                        if (i116 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e5, h0Var3);
                    return null;
                }
            case 22:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(2750L, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a aVar35 = (com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) obj3;
                aVar35.H2(aVar35.u, new fj5.e(i6));
                aVar35.I2();
                return Unit.f186387a;
            case 23:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    o.b(obj2);
                    fkb.f fVar2 = (fkb.f) ((PauseChallengeScreen) obj3).O.getValue();
                    this.v = 1;
                    fVar2.getClass();
                    fVar2.l2(new d(fVar2, objArr8 == true ? 1 : 0, 24), new yi5.b(26));
                    if (Unit.f186387a == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    o.b(obj2);
                    fkb.f fVar3 = (fkb.f) obj3;
                    g gVar7 = new g(fVar3, objArr9 == true ? 1 : 0, 20);
                    this.v = 1;
                    if (u0.b0(fVar3.X(), "CHALLENGE_PAUSE_NOW_BUTTON_TAG", gVar7, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fkl.h hVar2 = (fkl.h) obj3;
                ue0.c cVar6 = hVar2.f135869c;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    o.b(obj2);
                    Class cls = Boolean.TYPE;
                    Object objK = j6.a.k(cls, cVar6, "LOGOUT_REQUIRED");
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.f(objK, bool2)) {
                        return Unit.f186387a;
                    }
                    com.revolut.data.database.models.openbanking.d.D(cls, cVar6, "LOGOUT_REQUIRED", bool2);
                    z1 z1Var2 = hVar2.d;
                    Unit unit4 = Unit.f186387a;
                    this.v = 1;
                    if (z1Var2.emit(unit4, this) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    o.b(obj2);
                    t tVar = (t) obj3;
                    g gVar8 = new g(tVar, objArr10 == true ? 1 : 0, i21);
                    this.v = 1;
                    if (u0.b0(tVar.q2(), "DIRECT_DEBIT_RETRY_ACTION_TAG_" + tVar.f135983r.f206252a.f185494j, gVar8, this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                l lVar = (l) obj3;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    o.b(obj2);
                    ow5.b bVar4 = lVar.f136031r;
                    this.v = 1;
                    objA = bVar4.a(this);
                    if (objA == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objA = obj2;
                }
                lVar.H2(lVar.f136032s, new cmc.a(((Boolean) objA).booleanValue(), 28));
                return Unit.f186387a;
            case 28:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 != 0) {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                n0 n0Var = (n0) obj3;
                m0 m0Var = new m0(n0Var, objArr11 == true ? 1 : 0, i43);
                this.v = 1;
                Object objB5 = pu7.a.B(n0Var.k, "CLICK_TASK_ID", m0Var, this);
                return objB5 == aVar41 ? aVar41 : objB5;
            default:
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i124 = this.v;
                if (i124 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (((eo0.b) obj3).a(this) == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i124 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
