package ia0;

import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.backend_flow.impl.flow.BackendFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ra0.h;
import skm.a2;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends i implements Function2 {
    public a2 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f159920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f159921x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f159921x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f159921x, continuation);
        eVar.f159920w = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar = this.f159921x;
        BackendFlowInput backendFlowInput = fVar.o;
        ?? r2 = (CoroutineScope) this.f159920w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                a2 a2VarC = e0.C(r2, null, null, new i44.a(fVar, null, 11), 3);
                h hVar = fVar.f159922p;
                BackendFlowInput.Source source = backendFlowInput.f51218a;
                String str = ((BackendFlowInput.Source.Remote) source).f51221a;
                Map map = ((BackendFlowInput.Source.Remote) source).f51222b;
                this.f159920w = null;
                this.u = a2VarC;
                this.v = 1;
                obj2 = g4i.a.q(hVar, str, map, this);
                r2 = a2VarC;
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a2 a2Var = this.u;
                o.b(obj2);
                r2 = a2Var;
            }
            UUID uuid = (UUID) obj2;
            r2.f(null);
            oki.h.u2(fVar, fVar.f159924r, new BackendFlowContract$Step(new BackendFlowInput(new BackendFlowInput.Source.Session(uuid), backendFlowInput.f51219b, null, backendFlowInput.d, false, backendFlowInput.f, 52)), TransitionAnimation.FADE.f98392a, 4);
            return Unit.f186387a;
        } catch (Throwable th10) {
            r2.f(null);
            throw th10;
        }
    }
}
