package wug;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountClosureProgressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountClosureProgressScreen accountClosureProgressScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountClosureProgressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        Intrinsics.h(model);
        j jVar = (j) eVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "ACCOUNT_CLOSURE_LEARN_MORE_ID")) {
            jVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.how-do-i-close-my-robo-advisor-account", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
        }
        return Unit.f186387a;
    }
}
