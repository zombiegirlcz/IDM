package ge7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.MtaState;
import com.revolut.feature.insurance_car.impl.data.model.OneTimePayment;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.revolut.feature_fourthline_impl.R;
import g84.u;
import gh3.l;
import gic.h;
import gim.i;
import gk9.o;
import gkk.k;
import gld.a0;
import gm0.j;
import gm0.m;
import go7.s;
import gq2.n;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kl7.k2;
import kl7.y0;
import klf.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import lfg.d0;
import lfg.g0;
import ll7.p;
import ll7.v;
import nii.n1;
import skm.e0;
import skm.k0;
import skm.p0;
import vkm.q;
import vkm.y;
import vkm.z1;
import yh5.d;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f143269w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f143269w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((com.revolut.feature.in_app_calls.flow.c) this.f143269w, continuation, 0);
            case 1:
                return new f((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.a) this.f143269w, continuation, 1);
            case 2:
                return new f((l) this.f143269w, continuation, 2);
            case 3:
                return new f((com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) this.f143269w, continuation, 3);
            case 4:
                return new f((com.revolut.feature.address.common.impl.flow.screen.add.a) this.f143269w, continuation, 4);
            case 5:
                return new f((h) this.f143269w, continuation, 5);
            case 6:
                return new f((gie.e) this.f143269w, continuation, 6);
            case 7:
                return new f((gif.h) this.f143269w, continuation, 7);
            case 8:
                return new f((gik.h) this.f143269w, continuation, 8);
            case 9:
                return new f((gjh.e) this.f143269w, continuation, 9);
            case 10:
                return new f((o) this.f143269w, continuation, 10);
            case 11:
                return new f((k) this.f143269w, continuation, 11);
            case 12:
                return new f((com.revolut.feature.external_accounts.impl.ui.consents_kompot.c) this.f143269w, continuation, 12);
            case 13:
                return new f((a0) this.f143269w, continuation, 13);
            case 14:
                return new f((bld.i) this.f143269w, continuation, 14);
            case 15:
                return new f((j) this.f143269w, continuation, 15);
            case 16:
                return new f((m) this.f143269w, continuation, 16);
            case 17:
                return new f((gm5.e) this.f143269w, continuation, 17);
            case 18:
                return new f((com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b) this.f143269w, continuation, 18);
            case 19:
                return new f((gna.h) this.f143269w, continuation, 19);
            case 20:
                return new f((s) this.f143269w, continuation, 20);
            case 21:
                return new f((gp4.e) this.f143269w, continuation, 21);
            case 22:
                return new f((gq1.l) this.f143269w, continuation, 22);
            case 23:
                return new f((n) this.f143269w, continuation, 23);
            case 24:
                return new f((com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) this.f143269w, continuation, 24);
            case 25:
                return new f((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) this.f143269w, continuation, 25);
            case 26:
                return new f((gsh.n) this.f143269w, continuation, 26);
            case 27:
                return new f((gsh.a0) this.f143269w, continuation, 27);
            case 28:
                return new f((com.revolut.feature.credit.card.impl.ui.repay.flow.b) this.f143269w, continuation, 28);
            default:
                return new f((gui.j) this.f143269w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, java.util.List, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objZ;
        Object objB;
        Object objP;
        ?? r3;
        Object objH3;
        Object objJ;
        Object objB2;
        Object objN;
        Object objP2;
        Object objI;
        Address address;
        String country;
        int i = this.u;
        int i2 = 12;
        int i3 = 15;
        int i5 = 8;
        int i6 = 5;
        int i21 = 3;
        int i22 = 0;
        int i32 = 14;
        int i33 = 4;
        int i43 = 2;
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
        boolean z54 = false;
        boolean z74 = false;
        Object obj3 = this.f143269w;
        int i59 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(1500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oki.h.D2(((com.revolut.feature.in_app_calls.flow.c) obj3).f74814t);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.a aVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.a) obj3;
                    u uVar = new u(aVar3, null);
                    this.v = 1;
                    if (u0.b0(aVar3.X(), "BUTTON_TAG_CHECKOUT", uVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l lVar = (l) obj3;
                a54.g gVar = new a54.g(lVar, z ? 1 : 0, 23);
                this.v = 1;
                Object objB3 = pu7.a.B(lVar.k, "reload", gVar, this);
                return objB3 == aVar4 ? aVar4 : objB3;
            case 3:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) obj3;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(rd0.e.e(new y(new w1(i43, i5, z4 ? 1 : 0), new d0(cVar.f94289p.f288635a.d.C0("PREFILLED_LOCATIONS_STORAGE_KEY", g0.f194884p), i22)), h0.f322473a, new im2.b(i21, i2, z3 ? 1 : 0)), null, null, 3);
                    this.v = 1;
                    objZ = q.z(bVarG, this);
                    if (objZ == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objZ = obj2;
                }
                cVar.H2(cVar.f94293t, new gbi.c(cVar, (hfg.h0) objZ, i3));
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.address.common.impl.flow.screen.add.a.I2((com.revolut.feature.address.common.impl.flow.screen.add.a) obj3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Flow flowL2 = ((h) obj3).L2(new mii.k("PROMO_CODE_COPIED_SHOT_ID", new TextLocalisedClause(R.string.common_copied_to_clipboard, null, null, 14), null, null, null, 28));
                this.v = 1;
                Object objX = q.x(flowL2, this);
                return objX == aVar7 ? aVar7 : objX;
            case 6:
                gie.e eVar = (gie.e) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    eVar.f144132n.i();
                    eVar.f3(gie.b.IN_PROGRESS);
                    p0 p0Var = p0.f264001a;
                    tkm.e eVar2 = zkm.o.f323119a.e;
                    g85.f fVar = new g85.f(eVar, z6 ? 1 : 0, i32);
                    this.v = 1;
                    if (e0.J(eVar2, fVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    mhf.j jVar = ((gif.h) obj3).d;
                    this.v = 1;
                    if (((mjf.k0) jVar).f(true, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gik.h hVar = (gik.h) obj3;
                gik.g gVar2 = new gik.g(hVar, z11 ? 1 : 0, i59);
                this.v = 1;
                Object objB4 = pu7.a.B(hVar.k, "enable_plan_sharing", gVar2, this);
                return objB4 == aVar10 ? aVar10 : objB4;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gjh.e eVar3 = (gjh.e) obj3;
                gca.l lVar2 = new gca.l(eVar3, z12 ? 1 : 0, i43);
                this.v = 1;
                Object objB5 = pu7.a.B(eVar3.e, "investInWidgetHideUpsellingAccountsClick", lVar2, this);
                return objB5 == aVar11 ? aVar11 : objB5;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o oVar = (o) obj3;
                gi2.i iVar = new gi2.i(i21, (Continuation) (z29 ? 1 : 0), (yji.l) oVar);
                this.v = 1;
                Object objB6 = pu7.a.B(oVar.k, "navigateToPayLaterCard", iVar, this);
                return objB6 == aVar12 ? aVar12 : objB6;
            case 11:
                k kVar = (k) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarF = kVar.o.f(false);
                    this.v = 1;
                    objB = nim.a.b(d0VarF, this);
                    if (objB == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                kVar.H2(kVar.v, new a2f.j((do3.n) objB, 7));
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.c cVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.c) obj3;
                gi2.i iVar2 = new gi2.i(i33, (Continuation) (z31 ? 1 : 0), (yji.l) cVar2);
                this.v = 1;
                Object objP22 = cVar2.p2(this, iVar2);
                return objP22 == aVar14 ? aVar14 : objP22;
            case 13:
                a0 a0Var = (a0) obj3;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                try {
                    if (i108 == 0) {
                        yhm.o.b(obj2);
                        SlotContext slotContextC = a0Var.c();
                        if (slotContextC == null) {
                            return Unit.f186387a;
                        }
                        skd.i iVar3 = a0Var.f144618c;
                        this.v = 1;
                        if (iVar3.d(slotContextC, false, this) == aVar15) {
                            return aVar15;
                        }
                    } else {
                        if (i108 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit = Unit.f186387a;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    bld.k kVar2 = ((bld.e) ((bld.i) obj3)).f16532b;
                    this.v = 1;
                    if (kVar2.invoke(this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    cpi.g gVar3 = ((j) obj3).f144741b;
                    this.v = 1;
                    objP = gVar3.p(this);
                    if (objP == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP = obj2;
                }
                return ((UUID) objP).toString();
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                cpi.g gVar4 = ((m) obj3).e;
                this.v = 1;
                Object objP3 = gVar4.p(this);
                return objP3 == aVar18 ? aVar18 : objP3;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    gm5.e eVar4 = (gm5.e) obj3;
                    vh5.a aVar20 = eVar4.o;
                    a54.g gVar5 = new a54.g(eVar4, z41 ? 1 : 0, 24);
                    this.v = 1;
                    if (aVar20.Z2((3 & 1) != 0, d.a.f313774a, gVar5, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b bVar = (com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                Continuation continuation = null;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    bVar.X1(vl7.a.c(null, null));
                    v vVar = bVar.u;
                    String str = bVar.f75507t.f75496a;
                    k2 k2Var = k2.DOCS_REQUESTED;
                    this.v = 1;
                    ll7.e0 e0Var = (ll7.e0) vVar;
                    e0Var.getClass();
                    km2.n nVar = new km2.n(19, e0Var, k2Var, str, continuation);
                    r3 = 0;
                    p0 p0Var2 = p0.f264001a;
                    if (e0.J(elm.f.f127540b, nVar, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i113 != 1) {
                        if (i113 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        r3 = 0;
                        return yji.l.a1(bVar, bVar.X1(vl7.a.e(new TextLocalisedClause(R$string.car_insurance_document_upload_success_sheet_title, r3, r3, 14), new TextLocalisedClause(R$string.car_insurance_document_upload_success_sheet_description, r3, r3, 14), r3, 12)), null, null, new g85.f(bVar, r3, 20), 3);
                    }
                    yhm.o.b(obj2);
                    r3 = 0;
                }
                v vVar2 = bVar.u;
                String str2 = bVar.f75507t.f75496a;
                this.v = 2;
                w4l.f fVar2 = ((ll7.e0) vVar2).o;
                fVar2.h(str2);
                Object objA = nim.a.a(fVar2.g(str2, false), this);
                Object obj4 = objA;
                if (objA != aVar21) {
                    obj4 = Unit.f186387a;
                }
                if (obj4 == aVar21) {
                    return aVar21;
                }
                return yji.l.a1(bVar, bVar.X1(vl7.a.e(new TextLocalisedClause(R$string.car_insurance_document_upload_success_sheet_title, r3, r3, 14), new TextLocalisedClause(R$string.car_insurance_document_upload_success_sheet_description, r3, r3, 14), r3, 12)), null, null, new g85.f(bVar, r3, 20), 3);
            case 19:
                gna.h hVar2 = (gna.h) obj3;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    ina.k kVar3 = hVar2.f144945p;
                    DocumentsPage documentsPage = hVar2.o.f81412a;
                    this.v = 1;
                    objH3 = kVar3.h3(documentsPage, this);
                    if (objH3 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objH3 = obj2;
                }
                hVar2.H2(hVar2.f144947r, new ag1.l((Clause) objH3, i6));
                return Unit.f186387a;
            case 20:
                s sVar = (s) obj3;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    sVar.X1(vl7.a.c(new TextLocalisedClause(R$string.car_insurance_mta_in_progress_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_in_progress_description, null, null, 14)));
                    ll7.m mVar = sVar.f145107q;
                    String str3 = sVar.f145106p.d;
                    this.v = 1;
                    p pVar = (p) mVar;
                    pVar.getClass();
                    ll6.i iVar4 = new ll6.i(pVar, str3, z49 ? 1 : 0, i59);
                    p0 p0Var3 = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, iVar4, this);
                    if (objJ == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i115 != 1) {
                        if (i115 != 2 && i115 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                MtaState mtaState = (MtaState) objJ;
                int i116 = go7.k.f145102a[mtaState.f75263c.ordinal()];
                if (i116 == 1) {
                    this.v = 2;
                    if (s.y2(sVar, this) == aVar23) {
                        return aVar23;
                    }
                } else if (i116 == 2) {
                    this.v = 3;
                    y0 y0Var = mtaState.f;
                    int i117 = y0Var == null ? -1 : go7.j.f145101c[y0Var.ordinal()];
                    if (i117 == -1) {
                        sVar.X1(vl7.a.a(15, null, null, null));
                        objB2 = Unit.f186387a;
                    } else {
                        if (i117 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        OneTimePayment oneTimePayment = ((go7.f) sVar.t2()).e.d;
                        objB2 = sVar.B2(oneTimePayment != null ? oneTimePayment.f75268c : null, this);
                        if (objB2 != aVar23) {
                            objB2 = Unit.f186387a;
                        }
                    }
                    if (objB2 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i116 != 3 && i116 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.a1(sVar, sVar.X1(vl7.a.d(new TextLocalisedClause(R$string.car_insurance_mta_still_processing_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_still_processing_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null, 8)), null, null, new go7.n(sVar, null), 3);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    gp4.e eVar5 = (gp4.e) obj3;
                    gca.l lVar3 = new gca.l(eVar5, z54 ? 1 : 0, i33);
                    this.v = 1;
                    if (eVar5.p2(this, lVar3) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                gq1.l lVar4 = (gq1.l) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    zjh.j jVar2 = lVar4.o;
                    this.v = 1;
                    objN = jVar2.n(this);
                    if (objN == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objN = obj2;
                }
                lVar4.H2(lVar4.f145516q, new fvk.q((List) objN, 13));
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = (n) obj3;
                    gq2.l lVar5 = new gq2.l(nVar2, null);
                    this.v = 1;
                    if (u0.b0(nVar2.X(), "ACCEPT_BUTTON_LOADING_TAG", lVar5, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a aVar27 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) obj3;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    gca.l lVar6 = new gca.l(aVar27, z74 ? 1 : 0, i6);
                    this.v = 1;
                    objP2 = aVar27.p2(this, lVar6);
                    if (objP2 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                rp0.y yVar = (rp0.y) objP2;
                j60.a aVar29 = aVar27.u;
                Intrinsics.h(yVar);
                aVar29.x(yVar);
                return Unit.f186387a;
            case 25:
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) obj3;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    efm.k kVarC = dVar.u.d.c();
                    this.v = 1;
                    objI = nim.a.i(kVarC, this);
                    if (objI == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI = obj2;
                }
                do3.n nVar3 = (do3.n) objI;
                if (nVar3 == null || (address = nVar3.k) == null || (country = address.getCountry()) == null) {
                    return Unit.f186387a;
                }
                dVar.H2(dVar.f87925x, new gqh.a(country, i33));
                return Unit.f186387a;
            case 26:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (gsh.n.a((gsh.n) obj3, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i124 = this.v;
                if (i124 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((gsh.a0) obj3).b(this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i124 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i125 = this.v;
                if (i125 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.repay.flow.b bVar2 = (com.revolut.feature.credit.card.impl.ui.repay.flow.b) obj3;
                    com.revolut.feature.credit.card.impl.ui.repay.flow.a aVar34 = new com.revolut.feature.credit.card.impl.ui.repay.flow.a(bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, aVar34) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i125 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i126 = this.v;
                if (i126 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((gui.j) obj3).f146958p;
                    this.v = 1;
                    if (z1Var.emit(gui.e.f146951a, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i126 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
