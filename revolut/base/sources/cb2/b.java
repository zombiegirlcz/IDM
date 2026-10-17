package cb2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.payid.impl.screen.settings.actions.AliasActionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AliasActionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AliasActionsScreen aliasActionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = aliasActionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((m) ((f) this.v.S.getValue())).K2(new g(model.f53228a));
        return Unit.f186387a;
    }
}
