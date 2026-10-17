package jz6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f179600w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f179600w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f179600w, continuation);
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
            j2 j2Var = this.v.f179602q;
            this.u = 1;
            j2Var.setValue(this.f179600w);
            if (Unit.f186387a == aVar) {
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
