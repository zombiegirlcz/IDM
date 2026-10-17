package fmf;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.u1;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f136393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f136394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f136395y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(n0 n0Var, String str, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f136393w = n0Var;
        this.f136394x = str;
        this.f136395y = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(this.f136393w, this.f136394x, this.f136395y, continuation, 0);
            case 1:
                return new i0(this.f136393w, this.f136394x, this.f136395y, continuation, 1);
            case 2:
                return new i0(this.f136393w, this.f136394x, this.f136395y, continuation, 2);
            case 3:
                return new i0(this.f136393w, this.f136394x, this.f136395y, continuation, 3);
            case 4:
                return new i0(this.f136393w, this.f136394x, this.f136395y, continuation, 4);
            default:
                return new i0(this.f136393w, this.f136394x, this.f136395y, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = this.f136395y;
        n0 n0Var = this.f136393w;
        String str = this.f136394x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    u1 u1Var = n0Var.f136405t;
                    if (u1Var == null) {
                        Intrinsics.r("screenBuilder");
                        throw null;
                    }
                    hmf.b0 b0Var = (hmf.b0) u1Var.f290128a.getValue();
                    if (b0Var != null) {
                        this.v = 1;
                        if (hmf.a.k((hmf.a) b0Var, str, obj3, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TransactionDetailsScreenModel", j6.a.q("Action click not handled, screenBuilder: null, listId: ", str), null, h0Var);
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    n0 n0Var2 = this.f136393w;
                    i0 i0Var = new i0(n0Var2, this.f136394x, this.f136395y, null, 0);
                    this.v = 1;
                    if (n0Var2.p2(this, i0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (do3.q.J(this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    u1 u1Var2 = n0Var.f136405t;
                    if (u1Var2 == null) {
                        Intrinsics.r("screenBuilder");
                        throw null;
                    }
                    hmf.b0 b0Var2 = (hmf.b0) u1Var2.f290128a.getValue();
                    if (b0Var2 != null) {
                        this.v = 1;
                        if (hmf.a.l((hmf.a) b0Var2, str, obj3, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TransactionDetailsScreenModel", j6.a.q("Item click not handled, screenBuilder: null, listId: ", str), null, h0Var2);
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    n0 n0Var3 = this.f136393w;
                    i0 i0Var2 = new i0(n0Var3, this.f136394x, this.f136395y, null, 2);
                    this.v = 1;
                    if (n0Var3.p2(this, i0Var2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (do3.q.J(this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    u1 u1Var3 = n0Var.f136405t;
                    if (u1Var3 == null) {
                        Intrinsics.r("screenBuilder");
                        throw null;
                    }
                    hmf.b0 b0Var3 = (hmf.b0) u1Var3.f290128a.getValue();
                    if (b0Var3 != null) {
                        this.v = 1;
                        if (hmf.a.m((hmf.a) b0Var3, str, obj3, this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TransactionDetailsScreenModel", j6.a.q("Menu item click not handled, screenBuilder: null, listId: ", str), null, h0Var3);
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    n0 n0Var4 = this.f136393w;
                    i0 i0Var3 = new i0(n0Var4, this.f136394x, this.f136395y, null, 4);
                    this.v = 1;
                    if (n0Var4.p2(this, i0Var3) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (do3.q.J(this) == aVar6) {
                    return aVar6;
                }
                return Unit.f186387a;
        }
    }
}
