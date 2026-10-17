package fmf;

import elf.s0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.u1;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f136400w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(n0 n0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f136400w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f136400w, continuation, 0);
            default:
                return new m0(this.f136400w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        int i = this.u;
        Continuation continuation = null;
        n0 n0Var = this.f136400w;
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
                        s0 s0VarC = ((hmf.a) b0Var).c();
                        if (s0VarC == null || (objC = s0VarC.c(null, "ID_NAV_BAR_ICON", this)) != aVar) {
                            objC = Unit.f186387a;
                        }
                        if (objC == aVar) {
                            return aVar;
                        }
                    } else {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TransactionDetailsScreenModel", "Item click not handled, screenBuilder: null, listId: ID_NAV_BAR_ICON", null, h0Var);
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (do3.q.J(this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    m0 m0Var = new m0(n0Var, continuation, 0);
                    this.v = 1;
                    if (n0Var.p2(this, m0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
