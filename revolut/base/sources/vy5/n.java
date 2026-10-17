package vy5;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f293193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io3.d f293194x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w wVar, e eVar, io3.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = wVar;
        this.f293193w = eVar;
        this.f293194x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f293193w, this.f293194x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            String str = this.f293193w.f293147a;
            io3.d dVar = this.f293194x;
            sfe.m mVar = new sfe.m(str, new ProductAccountId(dVar.f163145a, null), dVar);
            this.u = 1;
            if (this.v.c3(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
