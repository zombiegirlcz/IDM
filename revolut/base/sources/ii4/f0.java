package ii4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.spinner.b f161520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ it3.d f161521x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.revolut.feature.credit.application.plugins.impl.ui.spinner.b bVar, it3.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f161520w = bVar;
        this.f161521x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f161520w, this.f161521x, continuation, 0);
            default:
                return new f0(this.f161520w, this.f161521x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (c84.t.N2(this.f161520w, this.f161521x, this, 2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.spinner.b bVar = this.f161520w;
                    f0 f0Var = new f0(bVar, this.f161521x, null, 0);
                    this.v = 1;
                    if (bVar.p2(this, f0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
