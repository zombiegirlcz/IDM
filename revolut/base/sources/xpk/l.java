package xpk;

import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f307997w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307997w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f307997w, continuation, 0);
            default:
                return new l(this.f307997w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                m mVar = this.f307997w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarC = ((gi5.d) mVar.f308004x).c(null);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarC, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                sh5.c cVar = (sh5.c) obj2;
                if (cVar.f263437c) {
                    mVar.x2(new bke.o(cVar, 16));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                m mVar2 = this.f307997w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ypk.a aVar3 = mVar2.f308003w;
                    this.v = 1;
                    obj2 = aVar3.Z2(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                w8b.c cVar2 = mVar2.f308005y;
                RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = mVar2.f307998p;
                return mVar2.C1(cVar2.a((qta.f) obj2, rateDetailsScreenContract$InputData.f103727a, rateDetailsScreenContract$InputData.f103728b));
        }
    }
}
