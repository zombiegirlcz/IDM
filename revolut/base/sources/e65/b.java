package e65;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a f122892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f122893x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f122892w = aVar;
        this.f122893x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f122892w, this.f122893x, continuation, 0);
            default:
                return new b(this.f122892w, this.f122893x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    r35.b bVar = new r35.b(this.f122893x);
                    this.v = 1;
                    if (this.f122892w.G1(bVar, this) == aVar) {
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
                com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a aVar3 = this.f122892w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    b bVar2 = new b(aVar3, this.f122893x, null, 0);
                    this.v = 1;
                    if (aVar3.p2(this, bVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yki.i iVar = aVar3.f70366r;
                if (iVar.d() == null) {
                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                    iVar.n();
                }
                return Unit.f186387a;
        }
    }
}
