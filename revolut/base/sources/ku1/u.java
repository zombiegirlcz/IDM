package ku1;

import com.revolut.core.model.account.AccountId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f189624w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(e0 e0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f189624w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f189624w, continuation, 0);
            case 1:
                return new u(this.f189624w, continuation, 1);
            case 2:
                return new u(this.f189624w, continuation, 2);
            case 3:
                return new u(this.f189624w, continuation, 3);
            default:
                return new u(this.f189624w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e0 e0Var;
        Object objQ;
        Object objB;
        Object objB2;
        e0 e0Var2;
        Object objQ2;
        int i = this.u;
        e0 e0Var3 = this.f189624w;
        int i2 = 2;
        int i3 = 0;
        Continuation continuation = null;
        int i5 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    t tVar = new t(e0Var3, continuation, i3);
                    this.v = 1;
                    if (e0Var3.p2(this, tVar) == aVar) {
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
                e0 e0Var4 = this.f189624w;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    v vVar = new v(i3);
                    t tVar2 = new t(e0Var4, continuation, i5);
                    this.v = 1;
                    e0Var = e0Var4;
                    objQ = n14.k.Q(e0Var, null, null, vVar, tVar2, this, 3);
                    if (objQ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    e0Var = e0Var4;
                    objQ = obj2;
                }
                nii.e eVar = (nii.e) objQ;
                if (!(eVar instanceof nii.c)) {
                    if (!(eVar instanceof nii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h32.j jVar = new h32.j((nii.d) eVar, i5);
                    q qVar = e0.Companion;
                    e0Var.x2(jVar);
                    e0Var.z2();
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    efm.d0<List<zt1.k>> blikTransactions = ((eu1.h) e0Var3.f189601q).f129469a.f308742a.getBlikTransactions();
                    xt1.a aVar4 = new xt1.a(i2, new xrl.a(13));
                    blikTransactions.getClass();
                    ufm.i iVar = new ufm.i(blikTransactions, aVar4, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.i iVar2 = new ufm.i(te0.w.i0(iVar), new ksb.a(new p(e0Var3, i5), 8), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    this.v = 1;
                    objB = nim.a.b(iVar2, this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                kog.k kVar = new kog.k((c02.j) objB, 21);
                q qVar2 = e0.Companion;
                e0Var3.x2(kVar);
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarY = e0Var3.f189603s.y(AccountId.Personal.f51414a);
                    this.v = 1;
                    objB2 = nim.a.b(iVarY, this);
                    if (objB2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                afa.s sVar = new afa.s((io3.d) objB2, 9);
                q qVar3 = e0.Companion;
                e0Var3.x2(sVar);
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                e0 e0Var5 = this.f189624w;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    c02.j jVarY2 = e0.y2(e0Var5);
                    a0 a0Var = new a0(e0Var5, jVarY2, i3);
                    b0 b0Var = new b0(e0Var5, jVarY2, continuation, i2);
                    this.v = 1;
                    e0Var2 = e0Var5;
                    objQ2 = n14.k.Q(e0Var2, null, null, a0Var, b0Var, this, 2);
                    if (objQ2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    e0Var2 = e0Var5;
                    objQ2 = obj2;
                }
                nii.e eVar2 = (nii.e) objQ2;
                if (!(eVar2 instanceof nii.c)) {
                    if (!(eVar2 instanceof nii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nii.d dVar = (nii.d) eVar2;
                    h32.j jVar2 = new h32.j(dVar, i2);
                    q qVar4 = e0.Companion;
                    e0Var2.x2(jVar2);
                    Object obj3 = dVar.f216133a;
                    Intrinsics.checkNotNullExpressionValue(obj3, "<get-data>(...)");
                    e0Var2.v2(new i((String) obj3));
                }
                return Unit.f186387a;
        }
    }
}
