package bke;

import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x xVar, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.q] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        aii.n nVarA2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        x xVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(new bk6.c(xVar.Q.a(w4l.h.f294642c), 2), null, new bk6.n(4), 1);
            this.u = 1;
            obj2 = vkm.q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ec5.c cVar = ((ec5.b) obj2).f124430b;
        ec5.d dVar = cVar != null ? cVar.f124434c : null;
        if (dVar != null && (str2 = dVar.f124436b) != null && (nVarA2 = xVar.A2(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, str2, null, null, 6)))) != null) {
            return nVarA2;
        }
        if (dVar == null || (str = dVar.f124435a) == null) {
            return null;
        }
        xVar.f16374m.invoke(new TabCryptoFlowContract$ModalStep.MicaAutoPrompt(str), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
        return Unit.f186387a;
    }
}
