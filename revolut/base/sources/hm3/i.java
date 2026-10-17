package hm3;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zm3.l f153532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, zm3.l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f153532w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f153532w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar = new h(jVar, null);
            this.u = 1;
            obj2 = jVar.Y2(this, hVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ViewController viewController = (ViewController) obj2;
        zm3.l lVar = this.f153532w;
        if (viewController != null) {
            n.P2(jVar, viewController, null, new b(jVar, lVar, 1), 1);
        } else {
            jVar.Z2(lVar);
        }
        return Unit.f186387a;
    }
}
