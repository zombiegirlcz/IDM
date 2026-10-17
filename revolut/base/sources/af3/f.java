package af3;

import androidx.camera.core.Camera;
import c42.l;
import cli.y;
import cmc.h;
import com.google.common.util.concurrent.ListenableFuture;
import com.revolut.data.model.Data;
import com.revolut.feature.category_boost.impl.ui.flow.CategoryBoostFlowContract$Step;
import com.revolut.feature.referrals.code.data.api.AddReferrerButtonToggle;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import com.revolut.feature.security_hub.api.models.DigitizedCards;
import com.revolut.feature.security_hub.api.models.DigitizedCardsFlags;
import com.revolut.feature.security_hub.impl.network.LinkedWalletsService;
import com.revolut.feature.security_hub.impl.ui.flow.m;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import cul.l1;
import cwa.j;
import eac.n;
import ejd.k;
import et6.k1;
import gim.i;
import grl.r2;
import hl6.w;
import iuj.z;
import j17.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mjf.c0;
import mjf.k0;
import r10.q;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f3858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3859x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 12;
        this.f3859x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((com.revolut.feature.category_boost.impl.ui.flow.b) this.f3859x, this.f3858w, continuation, 0);
            case 1:
                return new f((Camera) this.f3859x, this.f3858w, continuation, 1);
            case 2:
                return new f(this.f3858w, (l) this.f3859x, continuation, 2);
            case 3:
                return new f((com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) this.f3859x, this.f3858w, continuation, 3);
            case 4:
                return new f((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) this.f3859x, this.f3858w, continuation, 4);
            case 5:
                return new f((com.revolut.feature.pay_with_smile.impl.ui.settings.a) this.f3859x, this.f3858w, continuation, 5);
            case 6:
                return new f((h) this.f3859x, this.f3858w, continuation, 6);
            case 7:
                return new f((cu2.c) this.f3859x, this.f3858w, continuation, 7);
            case 8:
                return new f((cuc.d) this.f3859x, this.f3858w, continuation, 8);
            case 9:
                return new f((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f3859x, this.f3858w, continuation, 9);
            case 10:
                return new f((j) this.f3859x, this.f3858w, continuation, 10);
            case 11:
                return new f((d2c.j) this.f3859x, this.f3858w, continuation, 11);
            case 12:
                f fVar = new f((com.revolut.feature.revolutpay.management.impl.ui.management.home.a) this.f3859x, continuation);
                fVar.f3858w = ((Boolean) obj2).booleanValue();
                return fVar;
            case 13:
                return new f((k) this.f3859x, this.f3858w, continuation, 13);
            case 14:
                return new f((com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a) this.f3859x, this.f3858w, continuation, 14);
            case 15:
                return new f((com.revolut.feature.card.verification.impl.flow.card_penny_topup.b) this.f3859x, this.f3858w, continuation, 15);
            case 16:
                return new f((com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f3859x, this.f3858w, continuation, 16);
            case 17:
                return new f((gq.i) this.f3859x, this.f3858w, continuation, 17);
            case 18:
                return new f((com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b) this.f3859x, this.f3858w, continuation, 18);
            case 19:
                return new f((m) this.f3859x, this.f3858w, continuation, 19);
            case 20:
                return new f((ip4.l) this.f3859x, this.f3858w, continuation, 20);
            case 21:
                return new f((g) this.f3859x, this.f3858w, continuation, 21);
            case 22:
                return new f((com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b) this.f3859x, this.f3858w, continuation, 22);
            case 23:
                return new f(this.f3858w, (edk.e) this.f3859x, continuation, 23);
            case 24:
                return new f((jl6.l) this.f3859x, this.f3858w, continuation, 24);
            case 25:
                return new f((dbi.c) this.f3859x, this.f3858w, continuation, 25);
            case 26:
                return new f((l0f.g) this.f3859x, this.f3858w, continuation, 26);
            case 27:
                return new f(this.f3858w, (lf6.j) this.f3859x, continuation, 27);
            case 28:
                return new f((li5.f) this.f3859x, this.f3858w, continuation, 28);
            default:
                return new f((k0) this.f3859x, this.f3858w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 12:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                break;
        }
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v122, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objS2;
        int i = this.u;
        Class cls = Boolean.TYPE;
        int i2 = 3;
        int i3 = 2;
        int i5 = 0;
        Continuation continuation = null;
        boolean z = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z6 = true;
        boolean z11 = true;
        switch (i) {
            case 0:
                com.revolut.feature.category_boost.impl.ui.flow.b bVar = (com.revolut.feature.category_boost.impl.ui.flow.b) this.f3859x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    com.revolut.feature.category_boost.impl.ui.flow.a aVar2 = new com.revolut.feature.category_boost.impl.ui.flow.a(this.f3858w, bVar, null);
                    this.v = 1;
                    obj2 = bVar.p2(this, aVar2);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                oki.h.s2(bVar.f65763r, (CategoryBoostFlowContract$Step) obj2, false, TransitionAnimation.NONE.f98393a, true);
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ListenableFuture<Void> listenableFutureEnableTorch = ((Camera) this.f3859x).getCameraControl().enableTorch(this.f3858w);
                Intrinsics.checkNotNullExpressionValue(listenableFutureEnableTorch, "enableTorch(...)");
                this.v = 1;
                Object objC = c6d.b.c(listenableFutureEnableTorch, this);
                return objC == aVar3 ? aVar3 : objC;
            case 2:
                l lVar = (l) this.f3859x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    if (this.f3858w) {
                        lVar.H2(lVar.f20992t, new c42.j(i5));
                        n02.b bVar2 = (n02.b) lVar.u.getValue();
                        if (bVar2 != null) {
                            lx1.d dVar = lVar.f20991s;
                            this.v = 1;
                            if (((fy1.o) dVar).g(bVar2, this) == aVar4) {
                                return aVar4;
                            }
                        }
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar = (com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) this.f3859x;
                    boolean z12 = this.f3858w;
                    this.v = 1;
                    if (z12) {
                        objS2 = fVar.S2(this);
                        if (objS2 != aVar5) {
                            objS2 = Unit.f186387a;
                        }
                    } else {
                        fVar.T2();
                        objS2 = Unit.f186387a;
                    }
                    if (objS2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) this.f3859x;
                    if (cVar.f86339t == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q qVar = cVar.f86340w;
                    boolean z29 = this.f3858w;
                    this.v = 1;
                    Object objEmit = ((z1) qVar.d).emit(Boolean.valueOf(z29), this);
                    if (objEmit != aVar6) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar8 = (com.revolut.feature.pay_with_smile.impl.ui.settings.a) this.f3859x;
                cm9.m mVar = new cm9.m(aVar8, this.f3858w, continuation, z ? 1 : 0);
                this.v = 1;
                Object objB = pu7.a.B(aVar8.k, "enable", mVar, this);
                return objB == aVar7 ? aVar7 : objB;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                fmc.j jVar = ((h) this.f3859x).i;
                boolean z31 = this.f3858w;
                this.v = 1;
                Object objA = jVar.a(z31, this);
                return objA == aVar9 ? aVar9 : objA;
            case 7:
                boolean z41 = this.f3858w;
                cu2.c cVar2 = (cu2.c) this.f3859x;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    com.revolut.data.database.models.openbanking.d.D(cls, cVar2.f108800a, "KEY_CALL_DETECTION", Boolean.valueOf(z41));
                    j2 j2Var = cVar2.f108801b;
                    Boolean boolValueOf = Boolean.valueOf(z41);
                    this.v = 1;
                    j2Var.getClass();
                    j2Var.g(null, boolValueOf);
                    if (Unit.f186387a == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                boolean z49 = this.f3858w;
                cuc.d dVar2 = (cuc.d) this.f3859x;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    LinkedWalletsService linkedWalletsService = dVar2.f108947a;
                    auc.b key = auc.b.ADD_NEW_CARDS_TO_C2P;
                    Intrinsics.checkNotNullParameter(key, "key");
                    auc.c cVar3 = new auc.c(key.a(), String.valueOf(z49));
                    this.v = 1;
                    if (linkedWalletsService.updateSettings(cVar3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i74 != 1) {
                        if (i74 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                DigitizedCards digitizedCards = (DigitizedCards) dVar2.f108949c.get("LINKED_WALLETS_KEY");
                if (digitizedCards != null) {
                    DigitizedCardsFlags digitizedCardsFlags = digitizedCards.f85406c;
                    Boolean boolValueOf2 = Boolean.valueOf(z49);
                    digitizedCardsFlags.getClass();
                    DigitizedCardsFlags flags = new DigitizedCardsFlags(boolValueOf2);
                    List digitizedCards2 = digitizedCards.f85404a;
                    List pendingEnrollments = digitizedCards.f85405b;
                    Intrinsics.checkNotNullParameter(digitizedCards2, "digitizedCards");
                    Intrinsics.checkNotNullParameter(pendingEnrollments, "pendingEnrollments");
                    Intrinsics.checkNotNullParameter(flags, "flags");
                    DigitizedCards digitizedCards3 = new DigitizedCards(digitizedCards2, pendingEnrollments, flags);
                    x4l.c cVar4 = dVar2.e;
                    Unit unit = Unit.f186387a;
                    this.v = 2;
                    if (cVar4.f(unit, digitizedCards3, this) == aVar11) {
                        return aVar11;
                    }
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f3859x;
                l1 l1Var = new l1(i5, continuation, eVar, this.f3858w);
                this.v = 1;
                Object objB2 = pu7.a.B(eVar.k, "on_extended_hours_switcher_click", l1Var, this);
                return objB2 == aVar12 ? aVar12 : objB2;
            case 10:
                j jVar2 = (j) this.f3859x;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    if (((jte.d) jVar2.d).c(AddReferrerButtonToggle.f81676c)) {
                        ewa.a aVar14 = jVar2.f109596a;
                        this.v = 1;
                        ewa.e eVar2 = (ewa.e) aVar14;
                        eVar2.getClass();
                        ewa.c cVar5 = new ewa.c(eVar2, null, 3);
                        p0 p0Var = p0.f264001a;
                        obj2 = e0.J(elm.f.f127540b, cVar5, this);
                        if (obj2 == aVar13) {
                            return aVar13;
                        }
                    }
                    return zi0.c.P(Boolean.valueOf(z), false, null, 3);
                }
                if (i96 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                boolean z54 = !((Boolean) obj2).booleanValue() && this.f3858w;
                return zi0.c.P(Boolean.valueOf(z54), false, null, 3);
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d2c.j jVar3 = (d2c.j) this.f3859x;
                d2c.i iVar = new d2c.i(jVar3, this.f3858w, null);
                this.v = 1;
                Object objB3 = pu7.a.B(jVar3.k, "SPARE_CHANGE_REQUEST_TASK", iVar, this);
                return objB3 == aVar15 ? aVar15 : objB3;
            case 12:
                com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar16 = (com.revolut.feature.revolutpay.management.impl.ui.management.home.a) this.f3859x;
                boolean z74 = this.f3858w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    if (!z74) {
                        return new go.g(new Data(n.f124172a, null, false, 6, null), 2);
                    }
                    q qVar2 = aVar16.f84596w;
                    this.f3858w = z74;
                    this.v = 1;
                    obj2 = z9h.n.h(cls, ((y9c.b) qVar2.d).f311830a, "EARN_REV_POINTS_WIDGET_DISMISSED", Boolean.FALSE);
                    if (obj2 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return rd0.e.b(nim.a.w(((nyb.o) aVar16.f84594s).f(false), new cmc.a(((Boolean) obj2).booleanValue(), 17)));
            case 13:
                k kVar = (k) this.f3859x;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    toa.a aVar19 = kVar.f126864q;
                    soa.c cVar6 = soa.c.PERSONALIZED_THIRD_PARTY;
                    boolean z83 = this.f3858w;
                    efm.b bVarA = aVar19.a(new soa.b(cVar6, z83, z83));
                    this.v = 1;
                    if (nim.a.a(bVarA, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                k.y2(kVar);
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar21 = (com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a) this.f3859x;
                fb6.q qVar3 = new fb6.q(aVar21, this.f3858w, continuation, z3 ? 1 : 0);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar21.k, "donate", qVar3, this);
                return objB4 == aVar20 ? aVar20 : objB4;
            case 15:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.card.verification.impl.flow.card_penny_topup.b bVar3 = (com.revolut.feature.card.verification.impl.flow.card_penny_topup.b) this.f3859x;
                l1 l1Var2 = new l1(i3, continuation, bVar3, this.f3858w);
                this.v = 1;
                Object objB5 = pu7.a.B(bVar3.k, "verifyCard", l1Var2, this);
                return objB5 == aVar22 ? aVar22 : objB5;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar24 = (com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f3859x;
                bw6.k kVar2 = new bw6.k(aVar24, this.f3858w, (Continuation) null);
                this.v = 1;
                g64.d dVar3 = com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.Companion;
                Object objB6 = pu7.a.B(aVar24.k, "Issue virtual card", kVar2, this);
                return objB6 == aVar23 ? aVar23 : objB6;
            case 17:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    gq.b bVar4 = (gq.b) ((gq.i) this.f3859x).f145487j.get("AccountWidget");
                    if (bVar4 == null) {
                        return null;
                    }
                    gq.i iVar2 = (gq.i) this.f3859x;
                    boolean z89 = this.f3858w;
                    this.v = 1;
                    if (gq.i.a(iVar2, bVar4, z89, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b bVar5 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.b) this.f3859x;
                w wVar = new w(bVar5, this.f3858w, continuation, z4 ? 1 : 0);
                this.v = 1;
                Object objB7 = pu7.a.B(bVar5.k, "TOGGLE_JOINT_AUTHORISATION_NOTIFICATIONS", wVar, this);
                return objB7 == aVar26 ? aVar26 : objB7;
            case 19:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m mVar2 = (m) this.f3859x;
                com.revolut.feature.security_hub.impl.ui.flow.k kVar3 = new com.revolut.feature.security_hub.impl.ui.flow.k(mVar2, this.f3858w, null);
                this.v = 1;
                Object objB8 = pu7.a.B(mVar2.k, "OpenStreetMode", kVar3, this);
                return objB8 == aVar27 ? aVar27 : objB8;
            case 20:
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
                ip4.l lVar2 = (ip4.l) this.f3859x;
                l1 l1Var3 = new l1(i2, continuation, lVar2, this.f3858w);
                this.v = 1;
                Object objP2 = lVar2.p2(this, l1Var3);
                return objP2 == aVar28 ? aVar28 : objP2;
            case 21:
                g gVar = (g) this.f3859x;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    gr6.j jVar4 = gVar.f170135p;
                    boolean z96 = this.f3858w;
                    this.v = 1;
                    obj2 = ((k1) jVar4).a(z96, this);
                    if (obj2 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Upsell upsell = (Upsell) obj2;
                gVar.x2(new z(upsell != null ? zi0.c.P(upsell, false, null, 3) : zi0.c.O(new NullPointerException("Upsell is null.")), 20));
                return Unit.f186387a;
            case 22:
                com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b bVar6 = (com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b) this.f3859x;
                y yVar = bVar6.f65200r;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    bVar6.H2(yVar, new g7b.q(this.f3858w, 28));
                    this.v = 1;
                    if (skm.k0.b(1000L, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar6.H2(yVar, new j1.e(19));
                return Unit.f186387a;
            case 23:
                edk.e eVar3 = (edk.e) this.f3859x;
                sri.m mVar3 = eVar3.f125037b;
                h95.a aVar31 = (h95.a) eVar3.f125038c;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    if (this.f3858w) {
                        this.v = 1;
                        obj2 = ((n95.d) aVar31).a(this);
                        if (obj2 == aVar32) {
                            return aVar32;
                        }
                        mVar3.c((NaviCommand) obj2);
                    } else {
                        w4l.i iVar3 = w4l.i.f294643c;
                        r2 r2Var = r2.DEEPLINK;
                        this.v = 2;
                        obj2 = ((n95.d) aVar31).b(iVar3, r2Var, this);
                        if (obj2 == aVar32) {
                            return aVar32;
                        }
                        mVar3.c((NaviCommand) obj2);
                    }
                } else if (i111 == 1) {
                    o.b(obj2);
                    mVar3.c((NaviCommand) obj2);
                } else {
                    if (i111 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    mVar3.c((NaviCommand) obj2);
                }
                return Boolean.TRUE;
            case 24:
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
                jl6.l lVar3 = (jl6.l) this.f3859x;
                jl6.k kVar4 = new jl6.k(lVar3, this.f3858w, continuation, z6 ? 1 : 0);
                this.v = 1;
                Object objB9 = pu7.a.B(lVar3.k, "TOGGLE_JOINT_DATA_SHARING", kVar4, this);
                return objB9 == aVar33 ? aVar33 : objB9;
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                jma.f fVar2 = (jma.f) ((dbi.c) this.f3859x).f112756b;
                boolean z100 = this.f3858w;
                this.v = 1;
                Object objA2 = fVar2.a(z100, this);
                return objA2 == aVar34 ? aVar34 : objA2;
            case 26:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l0f.g gVar2 = (l0f.g) this.f3859x;
                ks.g gVar3 = new ks.g(z11 ? 1 : 0, continuation, gVar2, this.f3858w);
                this.v = 1;
                Object objB10 = pu7.a.B(gVar2.k, "MCY_EXCHANGE_RATE", gVar3, this);
                return objB10 == aVar35 ? aVar35 : objB10;
            case 27:
                lf6.j jVar5 = (lf6.j) this.f3859x;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    if (this.f3858w) {
                        x4l.c cVar7 = jVar5.e;
                        Unit unit2 = Unit.f186387a;
                        this.v = 1;
                        if (cVar7.d(unit2, true, this) == aVar36) {
                            return aVar36;
                        }
                    } else {
                        x4l.c cVar8 = jVar5.d;
                        Unit unit3 = Unit.f186387a;
                        this.v = 2;
                        if (cVar8.d(unit3, true, this) == aVar36) {
                            return aVar36;
                        }
                    }
                } else {
                    if (i115 != 1 && i115 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    mk0.a aVar38 = ((li5.f) this.f3859x).f195418a;
                    li5.e eVar4 = li5.f.Companion;
                    tk0.b bVar7 = new tk0.b("CRYPTO_TAB_VISIBILITY");
                    Boolean boolValueOf3 = Boolean.valueOf(this.f3858w);
                    this.v = 1;
                    if (aVar38.e(bVar7, boolValueOf3, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    k0 k0Var = (k0) this.f3859x;
                    boolean z101 = this.f3858w;
                    this.v = 1;
                    c0 c0Var = k0.Companion;
                    mjf.e0 e0Var = new mjf.e0(k0Var, z101, null);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, e0Var, this);
                    Object obj3 = objJ;
                    if (objJ != aVar39) {
                        obj3 = Unit.f186387a;
                    }
                    if (obj3 == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3859x = obj2;
        this.f3858w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(boolean z, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3858w = z;
        this.f3859x = obj2;
    }
}
