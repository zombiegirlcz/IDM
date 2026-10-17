package pij;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dfj.x0 f236572x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, dfj.x0 x0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236571w = bVar;
        this.f236572x = x0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o0(this.f236571w, this.f236572x, continuation, 0);
            case 1:
                return new o0(this.f236571w, this.f236572x, continuation, 1);
            default:
                return new o0(this.f236571w, this.f236572x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.f236571w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    n0 n0Var = new n0(bVar, this.f236572x, null, 0);
                    this.v = 1;
                    obj2 = bVar.p2(this, n0Var);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.M2(bVar, (EsimProfile) obj2);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    dfj.x0 x0Var = this.f236572x;
                    com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar2 = this.f236571w;
                    n0 n0Var2 = new n0(x0Var, bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, n0Var2) == aVar2) {
                        return aVar2;
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
                    com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar3 = this.f236571w;
                    n0 n0Var3 = new n0(bVar3, this.f236572x, null, 2);
                    this.v = 1;
                    if (bVar3.p2(this, n0Var3) == aVar3) {
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
