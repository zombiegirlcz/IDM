package k40;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ BaseDraggableWidgetDelegate.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f180825w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BaseDraggableWidgetDelegate.a aVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f180825w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f180825w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            if (this.v instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
                kgm.c cVar = this.f180825w.f180826a;
                this.u = 1;
                ((uc7.a) cVar.f184018b).b(fc7.a.f133648a);
                if (Unit.f186387a == aVar) {
                    return aVar;
                }
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
