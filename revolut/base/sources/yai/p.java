package yai;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import y99.x;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ dii.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.email.screen.a f312041w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(dii.g gVar, com.revolut.feature_retail_user_declarations.email.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f312041w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, this.f312041w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature_retail_user_declarations.email.screen.a aVar = this.f312041w;
        if (i == 0) {
            yhm.o.b(obj2);
            if (Intrinsics.f(this.v, dii.f.f115069a)) {
                yva.a aVar2 = aVar.f97588p;
                this.u = 1;
                ewa.e eVar = (ewa.e) ((cwa.j) aVar2).f109596a;
                eVar.getClass();
                ewa.c cVar = new ewa.c(eVar, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, cVar, this);
                if (objJ != obj3) {
                    objJ = Unit.f186387a;
                }
                if (objJ != obj3) {
                    objJ = Unit.f186387a;
                }
                if (objJ == obj3) {
                    return obj3;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        aVar.H2(aVar.f97593w, new x(19));
        return Unit.f186387a;
    }
}
