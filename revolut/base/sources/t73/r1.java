package t73;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class r1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h93.f0 f268530x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, h93.f0 f0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f268529w = gVar;
        this.f268530x = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r1(this.f268529w, this.f268530x, continuation, 0);
            case 1:
                return new r1(this.f268529w, this.f268530x, continuation, 1);
            case 2:
                return new r1(this.f268529w, this.f268530x, continuation, 2);
            case 3:
                return new r1(this.f268529w, this.f268530x, continuation, 3);
            case 4:
                return new r1(this.f268529w, this.f268530x, continuation, 4);
            case 5:
                return new r1(this.f268529w, this.f268530x, continuation, 5);
            case 6:
                return new r1(this.f268529w, this.f268530x, continuation, 6);
            case 7:
                return new r1(this.f268529w, this.f268530x, continuation, 7);
            case 8:
                return new r1(this.f268529w, this.f268530x, continuation, 8);
            case 9:
                return new r1(this.f268529w, this.f268530x, continuation, 9);
            case 10:
                return new r1(this.f268529w, this.f268530x, continuation, 10);
            case 11:
                return new r1(this.f268529w, this.f268530x, continuation, 11);
            case 12:
                return new r1(this.f268529w, this.f268530x, continuation, 12);
            case 13:
                return new r1(this.f268529w, this.f268530x, continuation, 13);
            case 14:
                return new r1(this.f268529w, this.f268530x, continuation, 14);
            case 15:
                return new r1(this.f268529w, this.f268530x, continuation, 15);
            case 16:
                return new r1(this.f268529w, this.f268530x, continuation, 16);
            default:
                return new r1(this.f268529w, this.f268530x, continuation, 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objZ;
        int i = this.u;
        int i2 = 9;
        int i3 = 0;
        Continuation continuation = null;
        h93.f0 f0Var = this.f268530x;
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268529w;
        int i5 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    q1 q1Var = new q1(gVar, f0Var, continuation, i3);
                    this.v = 1;
                    if (gVar.p2(this, q1Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    q1 q1Var2 = new q1(gVar, f0Var, continuation, 3);
                    this.v = 1;
                    if (gVar.p2(this, q1Var2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z1 z1Var = new z1(gVar, f0Var, continuation, i3);
                this.v = 1;
                Object objP2 = gVar.p2(this, z1Var);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    vkm.u1 u1Var = gVar.Z.f325055m;
                    this.v = 1;
                    objZ = vkm.q.z(u1Var, this);
                    if (objZ == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objZ = obj2;
                }
                if (Intrinsics.f(objZ, new st2.b(false))) {
                    j60.a aVar5 = gVar.f65440t;
                    gVar.Y.getClass();
                    h93.f0 card = this.f268530x;
                    Intrinsics.checkNotNullParameter(card, "card");
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_call_warning_title, null, null, 14), new TextLocalisedClause(R$string.card_call_warning_subtitle, null, null, 14), null, 28);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_call_warning_button_safe, null, null, 14);
                    int i33 = R$attr.uikit_dp16;
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CARD_DETAIL_CALL_SHARE_SAFE_ID", defaultFilledButton, null, textLocalisedClause, false, null, card, 0, i33, i33, i33, 880);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_call_warning_button_cancel, null, null, 14);
                    int i43 = R$attr.uikit_dp16;
                    aVar5.x(new rp0.y(zhm.v.k(model, new LargeActionButtonDelegate.Model("CARD_DETAIL_CALL_SHARE_CANCEL_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, 0, R$attr.uikit_dp24, i43, i43, 1008)), tVar, null, null, null, null, 1020));
                } else {
                    gVar.S2(f0Var);
                }
                return Unit.f186387a;
            case 4:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar = gVar.X;
                    String str = f0Var.f150110a;
                    this.v = 1;
                    uVar.getClass();
                    skm.p0 p0Var = skm.p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, new d73.r(uVar, str, null, 0), this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar2 = gVar.X;
                    String str2 = f0Var.f150110a;
                    this.v = 1;
                    uVar2.getClass();
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    Object objJ2 = skm.e0.J(elm.f.f127540b, new d73.r(uVar2, str2, null, 2), this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar3 = gVar.X;
                    String str3 = f0Var.f150110a;
                    this.v = 1;
                    uVar3.getClass();
                    skm.p0 p0Var3 = skm.p0.f264001a;
                    Object objJ3 = skm.e0.J(elm.f.f127540b, new d73.r(uVar3, str3, null, 1), this);
                    if (objJ3 != obj5) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.b bVar = new com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.b(gVar, f0Var, null);
                    this.v = 1;
                    if (gVar.p2(this, bVar) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.c cVar = new com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.c(gVar, f0Var, null);
                    this.v = 1;
                    if (gVar.p2(this, cVar) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.d dVar = new com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.d(gVar, f0Var, null);
                    this.v = 1;
                    if (gVar.p2(this, dVar) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    q1 q1Var3 = new q1(gVar, f0Var, continuation, 4);
                    this.v = 1;
                    if (gVar.p2(this, q1Var3) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var2 = new z1(gVar, f0Var, continuation, i5);
                    this.v = 1;
                    if (gVar.p2(this, z1Var2) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q1 q1Var4 = new q1(gVar, f0Var, continuation, 5);
                this.v = 1;
                Object objT = do3.q.t(gVar, q1Var4, this);
                return objT == aVar11 ? aVar11 : objT;
            case 13:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q1 q1Var5 = new q1(gVar, f0Var, continuation, 6);
                this.v = 1;
                Object objP22 = gVar.p2(this, q1Var5);
                return objP22 == aVar12 ? aVar12 : objP22;
            case 14:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s15.j jVar = new s15.j(gVar, f0Var, continuation, i2);
                this.v = 1;
                Object objP23 = gVar.p2(this, jVar);
                return objP23 == aVar13 ? aVar13 : objP23;
            case 15:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    q1 q1Var6 = new q1(gVar, f0Var, continuation, 7);
                    this.v = 1;
                    if (gVar.p2(this, q1Var6) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    q1 q1Var7 = new q1(gVar, f0Var, continuation, 8);
                    this.v = 1;
                    if (gVar.p2(this, q1Var7) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    q1 q1Var8 = new q1(gVar, f0Var, continuation, i2);
                    this.v = 1;
                    if (gVar.p2(this, q1Var8) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
