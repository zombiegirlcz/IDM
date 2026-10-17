package fia;

import com.revolut.retail.core.navigation.feature.FeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public g u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f135361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f135362x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f135362x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f135362x, continuation);
        dVar.f135361w = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Function1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar;
        Function1 function1 = (Function1) this.f135361w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            this.f135361w = null;
            g gVar2 = this.f135362x;
            this.u = gVar2;
            this.v = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == aVar) {
                return aVar;
            }
            gVar = gVar2;
            obj2 = objInvoke;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.u;
            o.b(obj2);
        }
        gVar.A2(u0.c((FeatureConfig) obj2));
        return Unit.f186387a;
    }
}
