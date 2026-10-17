package tea;

import com.revolut.feature.pockets.impl.new_pocket_details.NewPocketDetailsScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ NewPocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(NewPocketDetailsScreen newPocketDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = newPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
            case 0:
                return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
            default:
                ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
                throw null;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        NewPocketDetailsScreen newPocketDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                newPocketDetailsScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                newPocketDetailsScreen.e3();
                throw null;
        }
    }
}
