package y99;

import eo3.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ rbi.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.missinginfo.d f311770w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.onboarding.impl.missinginfo.d dVar, Continuation continuation, rbi.c cVar) {
        super(1, continuation);
        this.v = cVar;
        this.f311770w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f311770w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            a.c cVar = new a.c(this.v.f253120a.getCode(), 3);
            com.revolut.feature.onboarding.impl.missinginfo.d dVar = this.f311770w;
            pfm.a aVarE = ylg.b.c(dVar.f78300w, zhm.u.c(cVar)).e(((e0) dVar.f78299t).k3());
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            this.u = 1;
            if (nim.a.a(aVarE, this) == aVar) {
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
