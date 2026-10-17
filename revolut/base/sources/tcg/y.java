package tcg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f269811w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(RowDelegate.Model model, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f269811w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.f269811w, this.v, continuation);
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
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar2 = this.v;
            aVar2.f93943t.Q();
            x xVar = new x(this.f269811w, aVar2, null);
            this.u = 1;
            if (aVar2.p2(this, xVar) == aVar) {
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
