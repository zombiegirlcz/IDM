package cq6;

import auc.c1;
import bg2.s;
import cli.y;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.retail.salary_account.impl.work_email.data.WorkEmailService;
import com.revolut.feature.security_hub.impl.network.LinkedWalletsService;
import com.revolut.feature.security_hub.impl.network.SecurityHubService;
import com.revolut.feature.vaults.impl.network.SavingsService;
import com.revolut.retail.common.ui.R$string;
import cuc.z;
import dca.r;
import efm.d0;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import rp0.k1;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vkm.z1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f108013w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f108013w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((l) this.f108013w, continuation, 0);
            case 1:
                return new k((crg.h) this.f108013w, continuation, 1);
            case 2:
                return new k((cu2.c) this.f108013w, continuation, 2);
            case 3:
                return new k((cuc.d) this.f108013w, continuation, 3);
            case 4:
                return new k((z) this.f108013w, continuation, 4);
            case 5:
                return new k((cwa.j) this.f108013w, continuation, 5);
            case 6:
                return new k((cx3.a) this.f108013w, continuation, 6);
            case 7:
                return new k((cy5.i) this.f108013w, continuation, 7);
            case 8:
                return new k((d22.g) this.f108013w, continuation, 8);
            case 9:
                return new k((d6b.b) this.f108013w, continuation, 9);
            case 10:
                return new k((com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) this.f108013w, continuation, 10);
            case 11:
                return new k((com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) this.f108013w, continuation, 11);
            case 12:
                return new k((daa.m) this.f108013w, continuation, 12);
            case 13:
                return new k((db4.i) this.f108013w, continuation, 13);
            case 14:
                return new k((r) this.f108013w, continuation, 14);
            case 15:
                return new k((com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.b) this.f108013w, continuation, 15);
            case 16:
                return new k((df4.g) this.f108013w, continuation, 16);
            case 17:
                return new k((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a) this.f108013w, continuation, 17);
            case 18:
                return new k((com.revolut.feature.pay_bills_taxes.impl.ui_payment.a) this.f108013w, continuation, 18);
            case 19:
                return new k((dhi.i) this.f108013w, continuation, 19);
            case 20:
                return new k((zjh.f) this.f108013w, continuation, 20);
            case 21:
                return new k((dj8.c) this.f108013w, continuation, 21);
            case 22:
                return new k((com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d) this.f108013w, continuation, 22);
            case 23:
                return new k((com.revolut.feature.contacts.impl.ui.contact.screen.details.a) this.f108013w, continuation, 23);
            case 24:
                return new k((dn8.f) this.f108013w, continuation, 24);
            case 25:
                return new k((dpd.k) this.f108013w, continuation, 25);
            case 26:
                return new k((com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a) this.f108013w, continuation, 26);
            case 27:
                return new k((com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a) this.f108013w, continuation, 27);
            case 28:
                return new k((dqg.e) this.f108013w, continuation, 28);
            default:
                return new k((ds2.i) this.f108013w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objV;
        Object wealthProtectionStatus;
        Object objB;
        Object objB0;
        Object workEmailVerification;
        Object identityDocumentIsOnVerification;
        int i = this.u;
        int i2 = 2;
        int i3 = 10;
        int i5 = 4;
        int i6 = 0;
        int i21 = 7;
        int i22 = 12;
        int i32 = 9;
        int i33 = 14;
        Continuation continuation = null;
        Object obj3 = this.f108013w;
        int i43 = 1;
        switch (i) {
            case 0:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    l lVar = (l) obj3;
                    c cVar = lVar.f108016n;
                    xi0.b bVar = lVar.f108018q;
                    this.v = 1;
                    cVar.getClass();
                    ck7.j jVar = new ck7.j(cVar, bVar, continuation, i22);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, jVar, this);
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj4) {
                        return obj4;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                crg.h hVar = (crg.h) obj3;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    a3b.h hVar2 = new a3b.h(hVar, i3);
                    an1.d dVar = new an1.d(hVar, i32);
                    cpb.j jVar2 = new cpb.j(hVar, continuation, i43);
                    this.v = 1;
                    objV = n14.k.V(hVar, null, hVar2, dVar, jVar2, this, 1);
                    if (objV == aVar) {
                        return aVar;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objV = obj2;
                }
                if (((nii.h) objV) instanceof nii.g) {
                    hVar.v2(new crg.f(((crg.e) hVar.t2()).f108381a.f94741a));
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    cu2.c cVar2 = (cu2.c) obj3;
                    j2 j2Var = cVar2.f108801b;
                    Object objH = z9h.n.h(Boolean.TYPE, cVar2.f108800a, "KEY_CALL_DETECTION", Boolean.TRUE);
                    this.v = 1;
                    j2Var.setValue(objH);
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    LinkedWalletsService linkedWalletsService = ((cuc.d) obj3).f108947a;
                    this.v = 1;
                    if (linkedWalletsService.acknowledgeNew(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    SecurityHubService securityHubService = ((z) obj3).f108984c;
                    this.v = 1;
                    wealthProtectionStatus = securityHubService.getWealthProtectionStatus(this);
                    if (wealthProtectionStatus == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    wealthProtectionStatus = obj2;
                }
                return Boolean.valueOf(((c1) wealthProtectionStatus).getEnabled());
            case 5:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                mh7.c cVar3 = ((cwa.j) obj3).e;
                this.v = 1;
                Object objX = q.x(new t0(q.Q(cVar3.d, new li2.f(continuation, cVar3, 29)), 1), this);
                return objX == aVar5 ? aVar5 : objX;
            case 6:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                cx3.a aVar7 = (cx3.a) obj3;
                ow3.e eVar = (ow3.e) aVar7.f109893c;
                String str = ((CreditApplicationPluginFlowContract$Configuration) ((qv3.a) aVar7.d).n0().get()).f66892b;
                this.v = 1;
                q24.c cVar4 = eVar.f230300a;
                cVar4.getClass();
                q24.a aVar8 = new q24.a(cVar4, str, continuation, i2);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, aVar8, this);
                return objJ2 == aVar6 ? aVar6 : objJ2;
            case 7:
                cy5.i iVar = (cy5.i) obj3;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    d0 d0VarC = ((gi5.d) iVar.f110058s).c(null);
                    this.v = 1;
                    objB = nim.a.b(d0VarC, this);
                    if (objB == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                sh5.c cVar5 = (sh5.c) objB;
                if (cVar5.f263437c) {
                    iVar.H2(iVar.f110059t, new bke.o(cVar5, i2));
                }
                return Unit.f186387a;
            case 8:
                d22.g gVar = (d22.g) obj3;
                y yVar = gVar.f110707p;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                try {
                } catch (Exception e) {
                    gVar.H2(yVar, new d22.f(i6, e));
                }
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    if (obj2 != null) {
                        throw new ClassCastException();
                    }
                    gVar.H2(yVar, new d0m.a(27));
                    return Unit.f186387a;
                }
                o.b(obj2);
                f22.a aVar11 = gVar.o;
                String str2 = ((d22.d) ((j2) yVar.f22677a).getValue()).f110702a;
                this.v = 1;
                aVar11.getClass();
                Intrinsics.checkNotNullParameter("An operation is not implemented: Implement data layer (https://revolut.atlassian.net/browse/DRBL-2555)", "message");
                throw new NotImplementedError("An operation is not implemented: Implement data layer (https://revolut.atlassian.net/browse/DRBL-2555)");
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objA = ((d6b.b) obj3).a("ihg", this);
                return objA == aVar12 ? aVar12 : objA;
            case 10:
                com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a aVar13 = (com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    cpb.j jVar3 = new cpb.j(aVar13, continuation, 3);
                    this.v = 1;
                    objB0 = u0.b0(aVar13.X(), "SUBMIT_BUTTON_TAG", jVar3, this);
                    if (objB0 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB0 = obj2;
                }
                List list = (List) objB0;
                if (list == null) {
                    return null;
                }
                List list2 = list;
                if (list2.isEmpty()) {
                    list2 = null;
                }
                List list3 = list2;
                if (list3 == null) {
                    return null;
                }
                aVar13.C2(new d6g.i(list3));
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) obj3;
                    a54.g gVar2 = new a54.g(bVar2, continuation, i22);
                    this.v = 1;
                    if (bVar2.p2(this, gVar2) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    daa.m mVar = (daa.m) obj3;
                    cpb.j jVar4 = new cpb.j(mVar, continuation, i21);
                    this.v = 1;
                    if (u0.b0(mVar.X(), "LOADING_BUTTON_TAG", jVar4, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    db4.i iVar2 = (db4.i) obj3;
                    a54.g gVar3 = new a54.g(iVar2, continuation, 13);
                    this.v = 1;
                    if (iVar2.p2(this, gVar3) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    z1 z1Var = ((r) obj3).f112846x;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.b bVar3 = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.b) obj3;
                    cpb.j jVar5 = new cpb.j(bVar3, continuation, i32);
                    this.v = 1;
                    if (bVar3.p2(this, jVar5) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    df4.g gVar4 = (df4.g) obj3;
                    cpb.j jVar6 = new cpb.j(gVar4, continuation, i3);
                    this.v = 1;
                    if (gVar4.p2(this, jVar6) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar22 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a) obj3;
                dh4.o oVar = new dh4.o(aVar22, continuation, i43);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar22.k, "confirm", oVar, this);
                return objB2 == aVar21 ? aVar21 : objB2;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar24 = (com.revolut.feature.pay_bills_taxes.impl.ui_payment.a) obj3;
                dh9.e eVar2 = new dh9.e(aVar24, null);
                this.v = 1;
                Object objP2 = aVar24.p2(this, eVar2);
                return objP2 == aVar23 ? aVar23 : objP2;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    dhi.i iVar3 = (dhi.i) obj3;
                    s sVar = new s(iVar3, continuation, i43);
                    this.v = 1;
                    if (iVar3.p2(this, sVar) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    WorkEmailService workEmailService = (WorkEmailService) ((zjh.f) obj3).f322835b;
                    this.v = 1;
                    workEmailVerification = workEmailService.getWorkEmailVerification(this);
                    if (workEmailVerification == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    workEmailVerification = obj2;
                }
                return ((fib.k) workEmailVerification).f135374a;
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    dj8.c cVar6 = (dj8.c) obj3;
                    cpb.j jVar7 = new cpb.j(cVar6, continuation, i22);
                    this.v = 1;
                    if (u0.b0(cVar6.X(), "LOADING_TAG_PRIMARY_BUTTON", jVar7, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a aVar28 = ((com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d) obj3).o;
                    this.v = 1;
                    lf6.j jVar8 = (lf6.j) ((com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b) aVar28).f72410a;
                    jVar8.getClass();
                    kze.h hVar3 = new kze.h(jVar8, continuation, i32);
                    p0 p0Var3 = p0.f264001a;
                    Object objJ3 = e0.J(elm.f.f127540b, hVar3, this);
                    if (objJ3 != obj5) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 != obj5) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar30 = (com.revolut.feature.contacts.impl.ui.contact.screen.details.a) obj3;
                dm3.s sVar2 = new dm3.s(aVar30, null);
                this.v = 1;
                Object objP22 = aVar30.p2(this, sVar2);
                return objP22 == aVar29 ? aVar29 : objP22;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                dn8.f fVar = (dn8.f) obj3;
                dg4.c cVar7 = new dg4.c(fVar, continuation, i5);
                this.v = 1;
                Object objC0 = u0.c0(fVar, "SECOND_BUTTON_LOADING_TAG", cVar7, this);
                return objC0 == aVar31 ? aVar31 : objC0;
            case 25:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                Flow flowL2 = ((dpd.k) obj3).L2(new y0("ERROR_DIALOG_ID", new nii.z(new TextLocalisedClause(R$string.common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4));
                this.v = 1;
                Object objX2 = q.x(flowL2, this);
                return objX2 == aVar32 ? aVar32 : objX2;
            case 26:
                com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a aVar33 = (com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a) obj3;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    o.b(obj2);
                    dpl.e eVar3 = new dpl.e(aVar33, null);
                    this.v = 1;
                    if (aVar33.p2(this, eVar3) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                ((k1) aVar33.f106720q).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "ACCESS_REVOKED_SUCCESSFULLY", new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_connected_apps_revoke_success, null, null, 14), null, null, null, 60));
                oki.h.D2(aVar33.f106721r);
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a aVar36 = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a) obj3;
                    dg4.c cVar8 = new dg4.c(aVar36, continuation, i21);
                    this.v = 1;
                    if (aVar36.p2(this, cVar8) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    o.b(obj2);
                    SavingsService savingsService = ((dqg.e) obj3).f116981a;
                    this.v = 1;
                    identityDocumentIsOnVerification = savingsService.getIdentityDocumentIsOnVerification(this);
                    if (identityDocumentIsOnVerification == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    identityDocumentIsOnVerification = obj2;
                }
                return Boolean.valueOf(!((bqg.a) identityDocumentIsOnVerification).getIsResolved());
            default:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 != 0) {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ds2.i iVar4 = (ds2.i) obj3;
                cpb.j jVar9 = new cpb.j(iVar4, continuation, i33);
                this.v = 1;
                Object objP23 = iVar4.p2(this, jVar9);
                return objP23 == aVar38 ? aVar38 : objP23;
        }
    }
}
