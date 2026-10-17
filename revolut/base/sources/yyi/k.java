package yyi;

import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SchemeAirportLoungesFooter.Action f317946w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a aVar, SchemeAirportLoungesFooter.Action action, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f317946w = action;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f317946w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            SchemeAirportLoungesFooter.Action action = this.f317946w;
            com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a aVar2 = this.v;
            j jVar = new j(aVar2, action, null);
            this.u = 1;
            if (u0.b0(aVar2.X(), "HOME_LOADING_BUTTON_TAG", jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
