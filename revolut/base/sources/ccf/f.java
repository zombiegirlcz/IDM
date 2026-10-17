package ccf;

import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddOnsGoodbyeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AddOnsGoodbyeScreen addOnsGoodbyeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addOnsGoodbyeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            default:
                return new f(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddOnsGoodbyeScreen addOnsGoodbyeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) addOnsGoodbyeScreen.j3()).u2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) addOnsGoodbyeScreen.j3()).u2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ?? r62 = addOnsGoodbyeScreen.f91673e0;
                t tVar = (t) addOnsGoodbyeScreen.j3();
                tVar.getClass();
                Intrinsics.checkNotNullParameter("", "feedback");
                tVar.x2(new c86.c("", 3));
                y yVar = addOnsGoodbyeScreen.U;
                if (yVar != null) {
                    ((j60.a) r62.getValue()).d((List) addOnsGoodbyeScreen.f0.getValue());
                    ((j60.a) r62.getValue()).x(yVar);
                    addOnsGoodbyeScreen.V = true;
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) addOnsGoodbyeScreen.j3()).u2();
                break;
        }
        return Unit.f186387a;
    }
}
