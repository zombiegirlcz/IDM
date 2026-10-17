package lua;

import aw0.n6;
import cli.y;
import com.revolut.feature.recurring_buys.schedule.impl.ui.RecurringSettingsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RecurringSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(RecurringSettingsController recurringSettingsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = recurringSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RecurringSettingsController recurringSettingsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.recurring_buys.schedule.impl.ui.a) ((b) recurringSettingsController.L.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.recurring_buys.schedule.impl.ui.a aVar3 = (com.revolut.feature.recurring_buys.schedule.impl.ui.a) ((b) recurringSettingsController.L.getValue());
                y yVar = aVar3.o;
                aVar3.C2(new iua.b(((a) ((j2) yVar.f22677a).getValue()).f200202a, ((a) ((j2) yVar.f22677a).getValue()).f200203b));
                break;
        }
        return Unit.f186387a;
    }
}
