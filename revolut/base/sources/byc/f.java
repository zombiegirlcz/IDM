package byc;

import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FincrimeHomeScreenAction.Request f19804w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, FincrimeHomeScreenAction.Request request, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f19804w = request;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f19804w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            FincrimeHomeScreenAction.Request request = this.f19804w;
            j jVar = this.v;
            e eVar = new e(jVar, request, null);
            this.u = 1;
            if (jVar.Y2(this, eVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
