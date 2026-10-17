package pnh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.trades.b f237807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f237808x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.wealth.ui.impl.trades.b bVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237807w = bVar;
        this.f237808x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f237807w, this.f237808x, continuation, 0);
            default:
                return new z(this.f237807w, this.f237808x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.ui.impl.trades.b bVar = this.f237807w;
                y yVar = new y(bVar, this.f237808x, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "onGenerateTradeConfirmationClicked", yVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.ui.impl.trades.b bVar2 = this.f237807w;
                y yVar2 = new y(bVar2, this.f237808x, null, 4);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar2.k, "openPdf", yVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
