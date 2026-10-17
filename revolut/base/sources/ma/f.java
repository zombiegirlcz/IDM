package ma;

import com.feature.navigation.hub.impl.ui.hub.NavigationHubController;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NavigationHubController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NavigationHubController navigationHubController, Continuation continuation) {
        super(2, continuation);
        this.v = navigationHubController;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        fa.c action = obj3 instanceof fa.c ? (fa.c) obj3 : null;
        if (action != null) {
            u uVarE3 = this.v.R2();
            uVarE3.getClass();
            Intrinsics.checkNotNullParameter(action, "action");
            uVarE3.C2(new i(action));
        }
        return Unit.f186387a;
    }
}
