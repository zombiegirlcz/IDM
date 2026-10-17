package ef5;

import com.revolut.core.ui_kit.models.Clause;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a f125285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f125285w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f125285w, continuation, 0);
            default:
                return new m(this.f125285w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a aVar2 = this.f125285w;
                if (i == 0) {
                    o.b(obj2);
                    df5.b bVar = aVar2.f70797r;
                    this.v = 1;
                    obj2 = bVar.a(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar2.H2(aVar2.f70801x, new ag1.l((Clause) obj2, 3));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a aVar4 = this.f125285w;
                if (i2 == 0) {
                    o.b(obj2);
                    d0 d0VarC = ((gi5.d) aVar4.v).c(null);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarC, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar4.H2(aVar4.f70801x, new bke.o((sh5.c) obj2, 4));
                return Unit.f186387a;
        }
    }
}
