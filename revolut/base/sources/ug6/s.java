package ug6;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wf6.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f279966w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = vVar;
        this.f279966w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, this.f279966w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        v vVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            e0 e0Var = vVar.f279973r;
            this.u = 1;
            obj2 = e0Var.a(this.f279966w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        vVar.f279974s.c((NaviCommand) obj2);
        return Unit.f186387a;
    }
}
