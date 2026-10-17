package au6;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ k3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(k3 k3Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j3(this.v, continuation, 0);
            default:
                return new j3(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j3) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j3) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k3 k3Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k3Var.f9561c.G(Boolean.TRUE, "freelancer:taxConfiguration:resolvedTaxPocketBanner", wim.z.d(kotlin.jvm.internal.o0.b(Boolean.TYPE)));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = k3Var.f9561c;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = kotlin.jvm.internal.o0.b(ds6.j.class);
                companion.getClass();
                return eVar.T2("STORAGE_KEY_TAX_TYPE", wim.z.d(kotlin.jvm.internal.o0.c(Set.class, KTypeProjection.Companion.a(kTypeB))));
        }
    }
}
