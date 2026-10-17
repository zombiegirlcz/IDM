package njg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f216517w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a f216518x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f216518x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f216518x, continuation, 0);
                mVar.f216517w = obj2;
                return mVar;
            default:
                m mVar2 = new m(this.f216518x, continuation, 1);
                mVar2.f216517w = obj2;
                return mVar2;
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
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar = this.f216518x;
        int i2 = 0;
        int i3 = 2;
        int i5 = 3;
        int i6 = 1;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f216517w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g0[] g0VarArr = {e0.g(coroutineScope, null, null, new l(aVar, continuation, i2), 3), e0.g(coroutineScope, null, null, new l(aVar, continuation, i6), 3)};
                this.f216517w = null;
                this.v = 1;
                Object objI = e0.i(g0VarArr, this);
                return objI == aVar2 ? aVar2 : objI;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f216517w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g0[] g0VarArr2 = {e0.g(coroutineScope2, null, null, new l(aVar, continuation, i3), 3), e0.g(coroutineScope2, null, null, new l(aVar, continuation, i5), 3)};
                this.f216517w = null;
                this.v = 1;
                Object objI2 = e0.i(g0VarArr2, this);
                return objI2 == aVar3 ? aVar3 : objI2;
        }
    }
}
