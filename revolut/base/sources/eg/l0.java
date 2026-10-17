package eg;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f125463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Throwable f125464x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Throwable th10 = (Throwable) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(3, 0, continuation);
                l0Var.f125463w = flowCollector;
                l0Var.f125464x = th10;
                return l0Var.invokeSuspend(Unit.f186387a);
            default:
                l0 l0Var2 = new l0(3, 1, continuation);
                l0Var2.f125463w = flowCollector;
                l0Var2.f125464x = th10;
                return l0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f125463w;
                    Throwable th10 = this.f125464x;
                    Preferences preferencesCreateEmpty = PreferencesFactory.createEmpty();
                    this.f125463w = null;
                    this.v = 1;
                    if (flowCollector.emit(preferencesCreateEmpty, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = this.f125463w;
                Throwable th11 = this.f125464x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    r20.e eVar = new r20.e(th11);
                    this.f125463w = null;
                    this.f125464x = null;
                    this.v = 1;
                    if (flowCollector2.emit(eVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
