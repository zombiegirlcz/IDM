package xo8;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f307732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f307733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ io3.d f307734y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(h0 h0Var, ProductAccountId productAccountId, io3.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f307732w = h0Var;
        this.f307733x = productAccountId;
        this.f307734y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f307732w, this.f307733x, this.f307734y, continuation, 0);
            default:
                return new w(this.f307732w, this.f307733x, this.f307734y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                h0 h0Var = this.f307732w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarL0 = h0Var.f307699q.l0(true);
                    this.v = 1;
                    if (nim.a.a(bVarL0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                v68.a aVar2 = h0Var.C;
                String value = h0Var.o.f77340a;
                Intrinsics.checkNotNullParameter(value, "value");
                aVar2.c3(value, this.f307733x, this.f307734y);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                h0 h0Var2 = this.f307732w;
                w wVar = new w(h0Var2, this.f307733x, this.f307734y, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(h0Var2.k, "REMOVE_POCKET_ACCOUNT_TASK_ID", wVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
