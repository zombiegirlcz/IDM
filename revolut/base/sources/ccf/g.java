package ccf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ AddOnsGoodbyeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddOnsGoodbyeScreen addOnsGoodbyeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = addOnsGoodbyeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = AddOnsGoodbyeScreen.j0;
        AddOnsGoodbyeScreen addOnsGoodbyeScreen = this.u;
        j60.a.v((j60.a) addOnsGoodbyeScreen.f91673e0.getValue(), false, null, 3);
        addOnsGoodbyeScreen.V = false;
        t tVar = (t) addOnsGoodbyeScreen.T2();
        tVar.getClass();
        tVar.l2(new bv4.h(tVar, null, 16), new yi5.b(26));
        return Unit.f186387a;
    }
}
