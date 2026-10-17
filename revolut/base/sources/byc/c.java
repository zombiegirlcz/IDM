package byc;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f19801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f19801w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f19801w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f19801w;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            x xVar = jVar.o;
            lg0.a aVar2 = lg0.a.IGNORE;
            Boolean bool = Boolean.FALSE;
            this.u = 1;
            obj2 = xVar.L1(str, aVar2, bool, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (!((Boolean) obj2).booleanValue()) {
            jVar.A2(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) jVar.f19809m).f(str), 0, null, 494));
        }
        return Unit.f186387a;
    }
}
