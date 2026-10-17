package mt8;

import a82.s;
import com.revolut.feature.confirmation_code.data.OtpTask;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.feature.pay_with_smile.impl.data.network.BiometricPaymentsSettingsService;
import com.revolut.feature.staking.impl.service.consent.AutoStakingConsentService;
import com.revolut.retail.core.navigation.FeatureCommand;
import cul.l1;
import efm.d0;
import ft3.h1;
import gim.i;
import java.security.KeyPair;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kka.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nle.e;
import pl9.y;
import qfe.j;
import qie.f;
import skm.a2;
import skm.e0;
import skm.p0;
import t9f.n;
import vkm.j2;
import vkm.q;
import x0i.k;
import x0i.l;
import xge.g;
import xka.z;
import xyh.t;
import yhm.o;
import yuc.u;
import zb6.p;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f208762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f208763x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208763x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((d) this.f208763x, this.f208762w, continuation, 0);
            case 1:
                return new b((nbk.c) this.f208763x, this.f208762w, continuation, 1);
            case 2:
                return new b((e) this.f208763x, this.f208762w, continuation, 2);
            case 3:
                return new b((nqj.c) this.f208763x, this.f208762w, continuation, 3);
            case 4:
                b bVar = new b((com.revolut.feature.rev_points.impl.ui.opt_in.flow.a) this.f208763x, continuation, 4);
                bVar.f208762w = ((Boolean) obj2).booleanValue();
                return bVar;
            case 5:
                return new b((f) this.f208763x, this.f208762w, continuation, 5);
            case 6:
                return new b((kdh.b) this.f208763x, this.f208762w, continuation, 6);
            case 7:
                return new b((ql9.d) this.f208763x, this.f208762w, continuation, 7);
            case 8:
                return new b((com.revolut.feature.confirmation_code.ui.otp.a) this.f208763x, this.f208762w, continuation, 8);
            case 9:
                return new b((com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) this.f208763x, this.f208762w, continuation, 9);
            case 10:
                return new b((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f208763x, this.f208762w, continuation, 10);
            case 11:
                return new b((com.revolut.feature.topup_screen.impl.screens.card_details.b) this.f208763x, continuation, 11);
            case 12:
                return new b((wvd.b) this.f208763x, this.f208762w, continuation, 12);
            case 13:
                return new b((l) this.f208763x, this.f208762w, continuation, 13);
            case 14:
                return new b((xg7.i) this.f208763x, this.f208762w, continuation, 14);
            case 15:
                return new b((g) this.f208763x, this.f208762w, continuation, 15);
            case 16:
                return new b((z) this.f208763x, this.f208762w, continuation, 16);
            case 17:
                return new b((com.revolut.sso.impl.ui.passcode.change_flow.a) this.f208763x, this.f208762w, continuation, 17);
            case 18:
                return new b((com.revolut.feature.retail.savings.impl.ui.details.a) this.f208763x, this.f208762w, continuation, 18);
            case 19:
                b bVar2 = new b((t) this.f208763x, continuation, 19);
                bVar2.f208762w = ((Boolean) obj2).booleanValue();
                return bVar2;
            case 20:
                return new b((u) this.f208763x, this.f208762w, continuation, 20);
            case 21:
                return new b((com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.f208763x, this.f208762w, continuation, 21);
            default:
                return new b((com.revolut.feature.apm.aani.impl.ui.settings.a) this.f208763x, this.f208762w, continuation, 22);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 4:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                break;
            case 19:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                break;
        }
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        boolean z;
        int i = this.u;
        int i2 = 6;
        int i3 = 10;
        int i5 = 0;
        int i6 = 2;
        Continuation continuation = null;
        Object obj3 = this.f208763x;
        int i21 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                boolean z3 = this.f208762w;
                this.v = 1;
                Object objX = q.x(mo3.a.g(((qt8.l) ((qt8.d) ((d) obj3)).f249018a).e.c(Unit.f186387a, z3), null, new qsk.d(i6), 1), this);
                return objX == aVar ? aVar : objX;
            case 1:
                nbk.c cVar = (nbk.c) obj3;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    lbk.a aVar3 = cVar.f214090c;
                    boolean z4 = this.f208762w;
                    kbk.l lVar = kbk.l.DEFAULT;
                    this.v = 1;
                    obj2 = ((ubk.a) aVar3).b(z4, !z4, false, lVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                cVar.f214088a.c((FeatureCommand) obj2);
                return Boolean.TRUE;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                e eVar = (e) obj3;
                nle.d dVar = new nle.d(eVar, this.f208762w, continuation, i21);
                this.v = 1;
                Object objB = pu7.a.B(eVar.e, "updateBuyBlockTask", dVar, this);
                return objB == aVar4 ? aVar4 : objB;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    boolean z6 = this.f208762w;
                    this.v = 1;
                    if (nqj.c.a((nqj.c) obj3, z6, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.rev_points.impl.ui.opt_in.flow.a aVar6 = (com.revolut.feature.rev_points.impl.ui.opt_in.flow.a) obj3;
                boolean z11 = this.f208762w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    if (z11) {
                        this.f208762w = z11;
                        this.v = 1;
                        if (com.revolut.feature.rev_points.impl.ui.opt_in.flow.a.I2(aVar6, this) == aVar7) {
                            return aVar7;
                        }
                    } else {
                        aVar6.C2(new hub.b(null, true));
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    mk0.a aVar9 = ((f) obj3).f246700a;
                    f.Companion.getClass();
                    tk0.b bVar = new tk0.b("CREDIT_TAB_VISIBILITY");
                    Boolean boolValueOf = Boolean.valueOf(this.f208762w);
                    this.v = 1;
                    if (aVar9.e(bVar, boolValueOf, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                pl1.a aVar10 = (pl1.a) ((kdh.b) obj3).f182900c;
                Object cVar2 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = aVar10.i(this);
                    if (obj2 != cVar2) {
                    }
                    return cVar2;
                }
                if (i74 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                KeyPair key = (KeyPair) obj2;
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                kdh.b bVar2 = aVar10.f237243a;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                cVar2 = new rl1.c(((com.revolut.feature.apm.core.impl.crypto.o) bVar2.f182899b).c(key), new rl1.b(this.f208762w ? rl1.a.REVOLUT : rl1.a.EXTERNAL));
                return cVar2;
            case 7:
                ql9.d dVar2 = (ql9.d) obj3;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    BiometricPaymentsSettingsService biometricPaymentsSettingsService = dVar2.f247559a;
                    y yVar = new y(this.f208762w);
                    this.v = 1;
                    if (biometricPaymentsSettingsService.setEnabled(yVar, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        if (i92 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                re0.c cVar3 = dVar2.f247561c;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar3.b(unit, true, this) == aVar11) {
                    return aVar11;
                }
                return Unit.f186387a;
            case 8:
                com.revolut.feature.confirmation_code.ui.otp.a aVar12 = (com.revolut.feature.confirmation_code.ui.otp.a) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    nk3.a aVar14 = ((rk3.e) ((j2) aVar12.v.f22677a).getValue()).f;
                    a2 a2Var = aVar12.u;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    aVar12.u = aVar12.l2(new r83.g(aVar12, aVar14, continuation, 23), new rk3.l(aVar12, i5));
                    if (this.f208762w) {
                        rik.e eVar2 = new rik.e(aVar12, continuation, i6);
                        this.v = 1;
                        if (aVar12.p2(this, eVar2) == aVar13) {
                            return aVar13;
                        }
                    } else {
                        pk3.a aVar15 = aVar12.f65964p;
                        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = aVar12.o;
                        OtpTask otpTask = eSignOtpScreenContract$InputData.f65952b;
                        h1 h1Var = eSignOtpScreenContract$InputData.k;
                        this.v = 2;
                        if (aVar15.a(otpTask, h1Var, this) == aVar13) {
                            return aVar13;
                        }
                    }
                } else {
                    if (i96 != 1 && i96 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                a2 a2Var2 = aVar12.f65968t;
                if (a2Var2 != null) {
                    a2Var2.f(null);
                }
                aVar12.f65968t = yji.l.a1(aVar12, ta6.a.H(120000L, 1000L, TimeUnit.MILLISECONDS), null, null, new s(aVar12, continuation, i3), 3);
                return Unit.f186387a;
            case 9:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar17 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) obj3;
                ks.g gVar = new ks.g(this.f208762w, aVar17, null);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar17.k, "update_entries_amount", gVar, this);
                return objB2 == aVar16 ? aVar16 : objB2;
            case 10:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    com.revolut.feature_crypto_order_flow.impl.exchange.d dVar3 = (com.revolut.feature_crypto_order_flow.impl.exchange.d) obj3;
                    n nVar = new n(dVar3, this.f208762w, 9);
                    this.v = 1;
                    Set set = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
                    if (dVar3.T2(this, nVar) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                com.revolut.feature.topup_screen.impl.screens.card_details.b bVar3 = (com.revolut.feature.topup_screen.impl.screens.card_details.b) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    boolean zG = ((o8b.c) bVar3.z).g();
                    d0 d0VarA = ((ang.b) bVar3.A).a();
                    this.f208762w = zG;
                    this.v = 1;
                    Object objB3 = nim.a.b(d0VarA, this);
                    if (objB3 == aVar19) {
                        return aVar19;
                    }
                    z = zG;
                    obj2 = objB3;
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.f208762w;
                    o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                bVar3.H2(bVar3.G, new a82.n(z, l71.f.e((l71.d) obj2), 11));
                return Unit.f186387a;
            case 12:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    AutoStakingConsentService autoStakingConsentService = ((wvd.b) obj3).f300314c;
                    jwd.c cVar4 = new jwd.c(this.f208762w);
                    this.v = 1;
                    if (autoStakingConsentService.updateGlobalConsent(cVar4, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    mk0.a aVar22 = ((l) obj3).f301649a;
                    k kVar = l.Companion;
                    tk0.b bVar4 = new tk0.b("BUY_TAKE_PROFIT_STOP_LOSS_ENABLED");
                    Boolean boolValueOf2 = Boolean.valueOf(this.f208762w);
                    this.v = 1;
                    if (aVar22.e(bVar4, boolValueOf2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    xg7.i iVar = (xg7.i) obj3;
                    l1 l1Var = new l1(5, continuation, iVar, this.f208762w);
                    this.v = 1;
                    if (u0.b0(iVar.X(), "LOTTERY_ENROLLMENT_BUTTON_LOADING_TAG", l1Var, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    wkm.l lVarB = ((g) obj3).b(this.f208762w ? sfe.a.RELOAD : sfe.a.CACHE_ONLY, j.f245295a);
                    this.v = 1;
                    if (q.x(lVarB, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    kka.a aVar26 = ((z) obj3).f306654p;
                    yja.b bVar5 = this.f208762w ? yja.b.NOT_FOUND : yja.b.CLOSE_CLICK;
                    this.v = 1;
                    if (((h) aVar26).h(bVar5, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    boolean z12 = this.f208762w;
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.passcode.change_flow.a.I2((com.revolut.sso.impl.ui.passcode.change_flow.a) obj3, z12, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.retail.savings.impl.ui.details.a aVar29 = (com.revolut.feature.retail.savings.impl.ui.details.a) obj3;
                l1 l1Var2 = new l1(i2, continuation, aVar29, this.f208762w);
                this.v = 1;
                Object objP2 = aVar29.p2(this, l1Var2);
                return objP2 == aVar28 ? aVar28 : objP2;
            case 19:
                t tVar = (t) obj3;
                boolean z29 = this.f208762w;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    l lVar2 = tVar.f309743p;
                    this.f208762w = z29;
                    this.v = 1;
                    lVar2.getClass();
                    b bVar6 = new b(lVar2, z29, continuation, 13);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, bVar6, this);
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj4) {
                        return obj4;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar4 = (com.revolut.feature_crypto_order_flow.impl.exchange.d) tVar.f309741m;
                dVar4.getClass();
                dVar4.n2(new b(dVar4, z29, continuation, i3), new whi.b(i2));
                return Unit.f186387a;
            case 20:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                u uVar = (u) obj3;
                yuc.q qVar = new yuc.q(uVar, this.f208762w, continuation, i5);
                this.v = 1;
                Object objP22 = uVar.p2(this, qVar);
                return objP22 == aVar30 ? aVar30 : objP22;
            case 21:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar32 = (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) obj3;
                p pVar = new p(aVar32, this.f208762w, continuation, i21);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar32.k, "donate", pVar, this);
                return objB4 == aVar31 ? aVar31 : objB4;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.apm.aani.impl.ui.settings.a aVar34 = (com.revolut.feature.apm.aani.impl.ui.settings.a) obj3;
                l1 l1Var3 = new l1(7, continuation, aVar34, this.f208762w);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar34.k, "defaultReceiverUpdate", l1Var3, this);
                return objB5 == aVar33 ? aVar33 : objB5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208763x = obj2;
        this.f208762w = z;
    }
}
