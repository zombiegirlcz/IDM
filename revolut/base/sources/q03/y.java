package q03;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f241106w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(RowDelegate.Model model, com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f241106w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.f241106w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        RowDelegate.Model model = this.f241106w;
        com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = this.v;
        x xVar = new x(model, bVar, null);
        this.u = 1;
        Object objB = pu7.a.B(bVar.k, "update_settings", xVar, this);
        return objB == aVar ? aVar : objB;
    }
}
