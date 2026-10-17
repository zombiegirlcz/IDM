package z27;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f f318997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f318998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f318999y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f fVar, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f318997w = fVar;
        this.f318998x = str;
        this.f318999y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f318997w, this.f318998x, this.f318999y, continuation, 0);
            default:
                return new t(this.f318997w, this.f318998x, this.f318999y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f fVar = this.f318997w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    r10.d dVar = fVar.f74246s;
                    this.v = 1;
                    if (dVar.E(this.f318998x, this.f318999y, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                fVar.H2(fVar.v, new z1i.l(11));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f fVar2 = this.f318997w;
                    t tVar = new t(fVar2, this.f318998x, this.f318999y, null, 0);
                    this.v = 1;
                    if (fVar2.p2(this, tVar) == aVar2) {
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
