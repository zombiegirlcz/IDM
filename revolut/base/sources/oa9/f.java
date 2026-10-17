package oa9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.onboarding.impl.onboarding.contractual_documentation.screen.ContractualDocsController;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ContractualDocsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ContractualDocsController contractualDocsController, Continuation continuation) {
        super(2, continuation);
        this.v = contractualDocsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.M.getValue();
        Intrinsics.h(model);
        h hVar = (h) bVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof Terms) {
            hVar.C1(new BridgeDestination(((rre.d) hVar.o).b((Terms) obj3)));
        }
        return Unit.f186387a;
    }
}
