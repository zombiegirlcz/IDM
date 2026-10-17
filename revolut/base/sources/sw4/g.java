package sw4;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f266100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f266101x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f266100w = hVar;
        this.f266101x = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g gVar = new g(this.f266100w, this.f266101x, (Continuation) obj4);
        gVar.v = (FlowCollector) obj2;
        return gVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            ErrorWidgetDelegate.Model modelJ = h.j(this.f266101x);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(modelJ, this) == aVar) {
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
