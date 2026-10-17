package ish;

import com.revolut.data.model.Data;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import skm.e0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.i implements Function3 {
    public final /* synthetic */ dsh.p A;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f168289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f168290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ WidgetContext f168291y;
    public final /* synthetic */ CoroutineScope z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, WidgetContext widgetContext, CoroutineScope coroutineScope, dsh.p pVar, Continuation continuation) {
        super(3, continuation);
        this.f168290x = zVar;
        this.f168291y = widgetContext;
        this.z = coroutineScope;
        this.A = pVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        CoroutineScope coroutineScope = this.z;
        dsh.p pVar = this.A;
        v vVar = new v(this.f168290x, this.f168291y, coroutineScope, pVar, (Continuation) obj4);
        vVar.v = (FlowCollector) obj2;
        vVar.f168289w = (Throwable) obj3;
        return vVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        Throwable th10 = this.f168289w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Data data = new Data(null, null, false, 6, null);
            this.v = null;
            this.f168289w = th10;
            this.u = 1;
            if (flowCollector.emit(data, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        dsh.p pVar = this.A;
        String str = pVar.f117336a;
        Unit unit = Unit.f186387a;
        m mVar = new m(pVar, unit);
        z zVar = this.f168290x;
        WidgetContext widgetContext = this.f168291y;
        zVar.i(widgetContext, str, mVar);
        if (th10 instanceof WidgetNotAvailableException) {
            e0.C(this.z, null, null, new hsd.c(zVar, widgetContext, pVar, (Continuation) null, 27), 3);
            return unit;
        }
        IllegalStateException illegalStateException = new IllegalStateException(th10);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return unit;
    }
}
