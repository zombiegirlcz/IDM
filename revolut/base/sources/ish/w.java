package ish;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f168292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WidgetContext f168293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dsh.p f168294y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, WidgetContext widgetContext, dsh.p pVar, Continuation continuation) {
        super(2, continuation);
        this.f168292w = zVar;
        this.f168293x = widgetContext;
        this.f168294y = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.f168292w, this.f168293x, this.f168294y, continuation);
        wVar.v = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        ConcurrentHashMap concurrentHashMap;
        dsh.p pVar = this.f168294y;
        String str = pVar.f117336a;
        WidgetContext widgetContext = this.f168293x;
        z zVar = this.f168292w;
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            try {
                l lVar = (l) zVar.f168301c.get(widgetContext.getClass());
                m mVar = (lVar == null || (concurrentHashMap = (ConcurrentHashMap) lVar.f168267b.c(widgetContext)) == null) ? null : (m) concurrentHashMap.get(str);
                Object obj3 = mVar != null ? mVar.f168270b : null;
                data = obj3 instanceof BaseDraggableWidgetDelegate.Model ? new Data(obj3, null, false, 6, null) : obj3 == null ? new Data(zVar.f168299a.a(widgetContext, str, pVar.f117337b, pVar.f117338c), null, true, 2, null) : new Data(null, null, false, 6, null);
            } catch (Exception e) {
                IllegalStateException illegalStateException = new IllegalStateException(e);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                data = new Data(null, null, false, 6, null);
            }
            this.v = null;
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
        return Unit.f186387a;
    }
}
