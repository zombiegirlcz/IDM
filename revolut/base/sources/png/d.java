package png;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qng.g;
import qng.h;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f237762w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a aVar, h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f237762w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f237762w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar3 = aVar2.f94616p;
            String str = aVar2.o.f105044a;
            MobileScreenParams.AddressSuggestion addressSuggestion = new MobileScreenParams.AddressSuggestion(((g) this.f237762w).f247944a);
            this.u = 1;
            if (aVar3.j(str, addressSuggestion, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.C2(qbl.a.f244373a);
        return Unit.f186387a;
    }
}
