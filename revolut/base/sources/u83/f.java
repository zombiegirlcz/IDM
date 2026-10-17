package u83;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import dwi.b0;
import hwi.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import skm.q;
import skm.r;
import su4.n;
import te0.w;
import ukk.p;
import uo7.m;
import uwi.u;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f278100w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278100w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((g) this.f278100w, continuation, 0);
            case 1:
                return new f((com.revolut.feature.pix.impl.flow.b) this.f278100w, continuation, 1);
            case 2:
                return new f((u8d.g) this.f278100w, continuation, 2);
            case 3:
                return new f((com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) this.f278100w, continuation, 3);
            case 4:
                return new f((com.revolut.feature_retail_user_declarations.transaction_countries.flow.a) this.f278100w, continuation, 4);
            case 5:
                return new f((q) this.f278100w, continuation, 5);
            case 6:
                return new f((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b) this.f278100w, continuation, 6);
            case 7:
                return new f((ue7.e) this.f278100w, continuation, 7);
            case 8:
                return new f((ugb.f) this.f278100w, continuation, 8);
            case 9:
                return new f((com.revolut.feature.apm.wero.impl.ui.home.a) this.f278100w, continuation, 9);
            case 10:
                return new f((uic.d) this.f278100w, continuation, 10);
            case 11:
                return new f((p) this.f278100w, continuation, 11);
            case 12:
                return new f((com.revolut.feature.apm.aani.impl.ui.c) this.f278100w, continuation, 12);
            case 13:
                return new f((uli.b) this.f278100w, continuation, 13);
            case 14:
                return new f((com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b) this.f278100w, continuation, 14);
            case 15:
                return new f((com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a) this.f278100w, continuation, 15);
            case 16:
                return new f((NavBarWithToolbar) this.f278100w, continuation, 16);
            case 17:
                return new f((RecyclerView) this.f278100w, continuation, 17);
            case 18:
                return new f((m) this.f278100w, continuation, 18);
            case 19:
                return new f((up9.l) this.f278100w, continuation, 19);
            case 20:
                return new f((com.revolut.feature.tax_residency.impl.v2.ui.list.a) this.f278100w, continuation, 20);
            case 21:
                return new f((uq5.f) this.f278100w, continuation, 21);
            case 22:
                return new f((uq9.a) this.f278100w, continuation, 22);
            case 23:
                return new f((com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a) this.f278100w, continuation, 23);
            case 24:
                return new f((uth.c) this.f278100w, continuation, 24);
            case 25:
                return new f((uug.j) this.f278100w, continuation, 25);
            case 26:
                return new f((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) this.f278100w, continuation, 26);
            case 27:
                return new f((uw2.g) this.f278100w, continuation, 27);
            case 28:
                return new f((uwe.g) this.f278100w, continuation, 28);
            default:
                return new f((u) this.f278100w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objB;
        int i = this.u;
        int i2 = 10;
        int i3 = 2;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        Object obj3 = this.f278100w;
        int i5 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    g gVar = (g) obj3;
                    e eVar = new e(gVar, null);
                    this.v = 1;
                    if (gVar.p2(this, eVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    com.revolut.feature.pix.impl.flow.b bVar = (com.revolut.feature.pix.impl.flow.b) obj3;
                    n nVar = new n(bVar, z ? 1 : 0, 20);
                    this.v = 1;
                    if (bVar.p2(this, nVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    u8d.g gVar2 = (u8d.g) obj3;
                    n nVar2 = new n(gVar2, z3 ? 1 : 0, 21);
                    this.v = 1;
                    if (gVar2.p2(this, nVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    efm.b bVarD = ((com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) obj3).f93735q.d();
                    this.v = 1;
                    if (nim.a.a(bVarD, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    com.revolut.feature_retail_user_declarations.transaction_countries.flow.a aVar6 = (com.revolut.feature_retail_user_declarations.transaction_countries.flow.a) obj3;
                    uci.c cVar = new uci.c(aVar6, null);
                    this.v = 1;
                    if (aVar6.p2(this, cVar) == aVar5) {
                        return aVar5;
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
                if (i43 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (((r) ((q) obj3)).y(this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b) obj3;
                n nVar3 = new n(bVar2, z4 ? 1 : 0, 27);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar2.k, "confirmSuccess", nVar3, this);
                return objB2 == aVar8 ? aVar8 : objB2;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    xe7.d dVar = ((ue7.e) obj3).f279312a;
                    this.v = 1;
                    x4l.c cVar2 = dVar.e;
                    Object obj4 = Unit.f186387a;
                    Object objD = cVar2.d(obj4, true, this);
                    if (objD == aVar9) {
                        obj4 = objD;
                    }
                    if (obj4 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                ugb.f fVar = (ugb.f) obj3;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    n nVar4 = new n(fVar, z6 ? 1 : 0, 28);
                    this.v = 1;
                    if (fVar.p2(this, nVar4) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                fVar.C2(ugb.c.f279991a);
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    lx1.d dVar2 = ((com.revolut.feature.apm.wero.impl.ui.home.a) obj3).o;
                    n02.b bVar3 = n02.b.WERO;
                    this.v = 1;
                    if (((fy1.o) dVar2).g(bVar3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                uic.d dVar3 = (uic.d) obj3;
                uic.c cVar3 = new uic.c(dVar3, z11 ? 1 : 0, i5);
                this.v = 1;
                Object objB3 = pu7.a.B(dVar3.k, "perkAccess", cVar3, this);
                return objB3 == aVar12 ? aVar12 : objB3;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    p pVar = (p) obj3;
                    uk9.h hVar = new uk9.h(pVar, z12 ? 1 : 0, i5);
                    this.v = 1;
                    if (pVar.p2(this, hVar) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.feature.apm.aani.impl.ui.c) obj3).J2(false, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                vt1.a aVar16 = (vt1.a) ((uli.b) obj3).f.get();
                this.v = 1;
                Object objI = ((bu1.f) aVar16).i(this);
                return objI == aVar15 ? aVar15 : objI;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b bVar4 = (com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b) obj3;
                uk9.h hVar2 = new uk9.h(bVar4, z29 ? 1 : 0, 3);
                this.v = 1;
                Object objP2 = bVar4.p2(this, hVar2);
                return objP2 == aVar17 ? aVar17 : objP2;
            case 15:
                com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a aVar18 = (com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    avd.b bVar5 = aVar18.o;
                    this.v = 1;
                    if (bVar5.b(false, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return aVar18.X1(aVar18.f81443p.a(false));
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) obj3;
                    if (navBarWithToolbar != null) {
                        navBarWithToolbar.setExpanded(false, true);
                        efm.r rVarHide = navBarWithToolbar.f59422y.f275218a.hide();
                        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                        vkm.d dVarB = rd0.e.b(rVarHide);
                        tk9.i iVar = new tk9.i(i3, i2, z31 ? 1 : 0);
                        this.v = 1;
                        if (vkm.q.y(dVarB, iVar, this) == aVar20) {
                            return aVar20;
                        }
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    RecyclerView recyclerView = (RecyclerView) obj3;
                    this.v = 1;
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager == null) {
                        objB = Unit.f186387a;
                    } else {
                        Integer num = new Integer(layoutManager.getItemCount());
                        Integer num2 = num.intValue() > 0 ? num : null;
                        if (num2 != null) {
                            int iIntValue = num2.intValue() - 1;
                            eim.c cVar4 = new eim.c(fim.h.b(this));
                            hp3.j jVar = new hp3.j(i3, recyclerView.getContext(), cVar4);
                            jVar.setTargetPosition(iIntValue);
                            layoutManager.startSmoothScroll(jVar);
                            objB = cVar4.b();
                            if (objB == aVar21) {
                                Intrinsics.checkNotNullParameter(this, "frame");
                            }
                            if (objB != aVar21) {
                                objB = Unit.f186387a;
                            }
                        } else {
                            objB = Unit.f186387a;
                        }
                    }
                    if (objB == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                m mVar = (m) obj3;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    mVar.X1(vl7.a.c(null, null));
                    ll7.a aVar23 = mVar.f281583q;
                    String str = ((uo7.e) mVar.t2()).f281572a;
                    StringBuilder sb6 = new StringBuilder();
                    int length = str.length();
                    for (int i107 = 0; i107 < length; i107++) {
                        char cCharAt = str.charAt(i107);
                        if (Character.isLetterOrDigit(cCharAt)) {
                            sb6.append(cCharAt);
                        }
                    }
                    String string = sb6.toString();
                    this.v = 1;
                    ll7.h hVar3 = (ll7.h) aVar23;
                    hVar3.getClass();
                    ll7.f fVar2 = new ll7.f(hVar3, string, z41 ? 1 : 0, i5);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, fVar2, this);
                    if (obj2 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                mVar.v2(new uo7.h((InsurableCar) obj2));
                mVar.s1();
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                up9.l lVar = (up9.l) obj3;
                up9.k kVar = new up9.k(lVar, null);
                this.v = 1;
                Object objP22 = lVar.p2(this, kVar);
                return objP22 == aVar24 ? aVar24 : objP22;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    com.revolut.feature.tax_residency.impl.v2.ui.list.a aVar26 = (com.revolut.feature.tax_residency.impl.v2.ui.list.a) obj3;
                    jpe.d dVar4 = aVar26.f90269p;
                    TaxResidencyFlowContext taxResidencyFlowContext = aVar26.o.f90264b;
                    this.v = 1;
                    if (dVar4.a(taxResidencyFlowContext, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    ap5.b bVar6 = ((uq5.f) obj3).o;
                    xi0.b.Companion.getClass();
                    xi0.b bVar7 = xi0.b.H;
                    this.v = 1;
                    Object objA = nim.a.a(((hp5.o) bVar6.f8094a).f154493r.g(bVar7, false), this);
                    Object obj5 = objA;
                    if (objA != aVar27) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 != aVar27) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ae8.c cVarC = ((uq9.a) obj3).f282113a.c();
                this.v = 1;
                Object objX = vkm.q.x(cVarC, this);
                return objX == aVar28 ? aVar28 : objX;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a aVar30 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a) obj3;
                uk9.h hVar4 = new uk9.h(aVar30, z49 ? 1 : 0, 5);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar30.k, "reload_instalment", hVar4, this);
                return objB4 == aVar29 ? aVar29 : objB4;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    uth.c cVar5 = (uth.c) obj3;
                    tw9.h hVar5 = new tw9.h(cVar5, null);
                    this.v = 1;
                    if (cVar5.p2(this, hVar5) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                uug.j jVar2 = (uug.j) obj3;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    jhi.b bVarG = mo3.a.g(rd0.e.n(rd0.e.b(((aug.d) jVar2.o).a(jVar2.f283235p.f94957a)), h0.f322473a), null, new utk.b(4), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                AccountClosureStatus accountClosureStatus = (AccountClosureStatus) obj2;
                boolean z54 = accountClosureStatus instanceof AccountClosureStatus.AccountClosed;
                uug.g gVar3 = uug.g.f283233a;
                if (z54 || (accountClosureStatus instanceof AccountClosureStatus.AccountClosureInProgress) || (accountClosureStatus instanceof AccountClosureStatus.BackendRequestedAccountClosure) || Intrinsics.f(accountClosureStatus, AccountClosureStatus.NoAccountClosure.f104506a)) {
                    jVar2.C2(gVar3);
                } else {
                    if (!(accountClosureStatus instanceof AccountClosureStatus.AccountClosureProgressBlocked)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AccountClosureStatus.AccountClosureProgressBlocked accountClosureProgressBlocked = (AccountClosureStatus.AccountClosureProgressBlocked) accountClosureStatus;
                    if (accountClosureProgressBlocked.f104503b != null) {
                        jVar2.H2(jVar2.f283237r, new uu9.b(accountClosureProgressBlocked, i3));
                    } else {
                        jVar2.C2(gVar3);
                    }
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b bVar8 = (com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) obj3;
                    com.revolut.trading.orders.ui.invest.placement.wrapper_flow.a aVar34 = new com.revolut.trading.orders.ui.invest.placement.wrapper_flow.a(bVar8, null);
                    this.v = 1;
                    if (bVar8.p2(this, aVar34) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (uw2.g.I2((uw2.g) obj3, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    pfm.a aVarK0 = ((uwe.g) obj3).f.k0(AccountId.Personal.f51414a);
                    this.v = 1;
                    if (nim.a.a(aVarK0, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    o.b(obj2);
                    u uVar = (u) obj3;
                    b0 b0Var = uVar.f283691q;
                    String airportId = uVar.f283690p.f99030a;
                    b0Var.getClass();
                    Intrinsics.checkNotNullParameter(airportId, "airportId");
                    v0 v0Var = (v0) b0Var.f120410b;
                    v0Var.getClass();
                    Intrinsics.checkNotNullParameter(airportId, "airportId");
                    pfm.n nVar5 = new pfm.n(new fag.g(airportId, v0Var, i2), i5);
                    Intrinsics.checkNotNullExpressionValue(nVar5, "fromCallable(...)");
                    pfm.r rVarG0 = w.g0(nVar5);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
