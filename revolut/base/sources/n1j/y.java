package n1j;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f211410w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(RowDelegate.Model model, com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f211410w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.f211410w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            RowDelegate.Model model = this.f211410w;
            com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar = this.v;
            com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.a aVar2 = new com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.a(model, cVar, null);
            this.u = 1;
            if (cVar.p2(this, aVar2) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
