package oqk;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.q6;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f227924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q6[] f227925x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(g0 g0Var, q6[] q6VarArr, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f227924w = g0Var;
        this.f227925x = q6VarArr;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.f227924w, this.f227925x, continuation, 0);
            case 1:
                return new b0(this.f227924w, this.f227925x, continuation, 1);
            default:
                return new b0(this.f227924w, this.f227925x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objY;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jxa.l lVar = this.f227924w.f227943l;
                    q6[] q6VarArr = this.f227925x;
                    q6[] q6VarArr2 = (q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length);
                    this.v = 1;
                    if (lVar.a(q6VarArr2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jxa.l lVar2 = this.f227924w.f227943l;
                    q6[] q6VarArr3 = this.f227925x;
                    q6[] q6VarArr4 = (q6[]) Arrays.copyOf(q6VarArr3, q6VarArr3.length);
                    this.v = 1;
                    com.revolut.domain.interactors.transactions.a aVar2 = lVar2.f179103a;
                    if (q6VarArr4.length == 0) {
                        objY = Unit.f186387a;
                    } else {
                        mjf.b0 b0Var = (mjf.b0) aVar2;
                        b0Var.t((q6[]) Arrays.copyOf(q6VarArr4, q6VarArr4.length));
                        objY = vkm.q.y(rd0.e.b(b0Var.m((q6[]) Arrays.copyOf(q6VarArr4, q6VarArr4.length))), new qkg.a(2, 0, null), this);
                        if (objY != obj3) {
                            objY = Unit.f186387a;
                        }
                    }
                    if (objY != obj3) {
                        objY = Unit.f186387a;
                    }
                    if (objY == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    jxa.l lVar3 = this.f227924w.f227943l;
                    q6[] q6VarArr5 = this.f227925x;
                    q6[] q6VarArr6 = (q6[]) Arrays.copyOf(q6VarArr5, q6VarArr5.length);
                    this.v = 1;
                    if (lVar3.a(q6VarArr6, this) == aVar3) {
                        return aVar3;
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
