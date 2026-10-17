package gld;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import rp0.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function0 f144636w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, Continuation continuation, Function0 function0) {
        super(2, continuation);
        this.u = i;
        this.f144636w = function0;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(0, continuation, this.f144636w);
                e0Var.v = obj2;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(1, continuation, this.f144636w);
                e0Var2.v = obj2;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0(2, continuation, this.f144636w);
                e0Var3.v = obj2;
                return e0Var3;
            case 3:
                e0 e0Var4 = new e0(3, continuation, this.f144636w);
                e0Var4.v = obj2;
                return e0Var4;
            case 4:
                e0 e0Var5 = new e0(4, continuation, this.f144636w);
                e0Var5.v = obj2;
                return e0Var5;
            case 5:
                e0 e0Var6 = new e0(5, continuation, this.f144636w);
                e0Var6.v = obj2;
                return e0Var6;
            default:
                e0 e0Var7 = new e0(6, continuation, this.f144636w);
                e0Var7.v = obj2;
                return e0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Function0 function0 = this.f144636w;
        switch (i) {
            case 0:
                mii.q qVar = (mii.q) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((qVar instanceof mii.n) && ((mii.n) qVar).f205875b == y0.TRIGGERED_ACTION) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 1:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
                    function0.invoke();
                } else if (!(n1Var instanceof j1) && !(n1Var instanceof m1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 2:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 3:
                n1 n1Var3 = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var3 instanceof j1) || (n1Var3 instanceof k1) || (n1Var3 instanceof l1)) {
                    IllegalStateException illegalStateException = new IllegalStateException("Result of polling dialog " + n1Var3 + " can't be handled");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PennyTopUpControllerExtension", null, illegalStateException, h0Var);
                } else {
                    if (!(n1Var3 instanceof m1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function0.invoke();
                }
                return Unit.f186387a;
            case 4:
                n1 n1Var4 = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var4 instanceof k1) || (n1Var4 instanceof l1)) {
                    function0.invoke();
                } else {
                    int i2 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 5:
                n1 n1Var5 = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var5 instanceof l1) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if (!(n1Var5 instanceof k1)) {
                    if (!(n1Var5 instanceof m1) && !(n1Var5 instanceof j1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hx7.e.n(new IllegalArgumentException(com.revolut.data.database.models.openbanking.d.s("Unexpected dialog result ", n1Var5)));
                }
                return Unit.f186387a;
            default:
                n1 n1Var6 = (n1) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var6 instanceof l1) {
                    function0.invoke();
                }
                return Unit.f186387a;
        }
    }
}
