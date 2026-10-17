package i2l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.w1;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f158018w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i, m0 m0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f158018w = m0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(0, this.f158018w, continuation);
            case 1:
                return new i0(1, this.f158018w, continuation);
            case 2:
                return new i0(2, this.f158018w, continuation);
            case 3:
                return new i0(3, this.f158018w, continuation);
            default:
                return new i0(4, this.f158018w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        m0 m0Var = this.f158018w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    g4b.a0 a0Var = new g4b.a0(m0Var.f158032y.B(new i2i.o(11)), 22);
                    this.v = 1;
                    obj2 = vkm.q.x(a0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                a2l.m confirmation = (a2l.m) obj2;
                String str = m0Var.o.f104322a;
                Intrinsics.checkNotNullParameter(confirmation, "confirmation");
                m0Var.C2(new w(com.revolut.retail.feature.travel_status.impl.ui.screens.partner.a.a(confirmation.f915a, null, confirmation.f916b, a.HORIZONTAL), p.LINK_ACCOUNT, str));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    z1l.d dVar = m0Var.f158025p;
                    String str2 = m0Var.o.f104322a;
                    this.v = 1;
                    Object objD = ((u1l.e) dVar.f318897a).d.d(str2, false, this);
                    if (objD != aVar2) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar2) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    z1l.d dVar2 = m0Var.f158025p;
                    String str3 = m0Var.o.f104322a;
                    this.v = 1;
                    Object objD2 = ((u1l.e) dVar2.f318897a).d.d(str3, false, this);
                    if (objD2 != aVar3) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 != aVar3) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    z1l.d dVar3 = m0Var.f158025p;
                    String str4 = m0Var.o.f104322a;
                    this.v = 1;
                    dVar3.getClass();
                    z1l.a aVar4 = new z1l.a(dVar3, str4, continuation, i2);
                    skm.p0 p0Var = skm.p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, aVar4, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    w1 w1Var = w1.f264016b;
                    i0 i0Var = new i0(3, m0Var, continuation);
                    this.v = 1;
                    if (skm.e0.J(w1Var, i0Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
