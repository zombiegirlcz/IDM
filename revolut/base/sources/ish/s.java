package ish;

import ahe.y0;
import ard.b0;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f168281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WidgetContext f168282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f168283y;
    public final /* synthetic */ FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, WidgetContext widgetContext, Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f168281w = zVar;
        this.f168282x = widgetContext;
        this.f168283y = ref$ObjectRef;
        this.z = flowCollector;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.f168281w, this.f168282x, this.f168283y, this.z, continuation);
        sVar.v = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            z zVar = this.f168281w;
            WidgetContext widgetContext = this.f168282x;
            wkm.l lVarQ = vkm.q.Q(((gsh.n) zVar.c(widgetContext)).k(), new y0(13, zVar, this.f168282x, linkedHashMap, coroutineScope, (Continuation) null));
            b0 b0Var = new b0(11, this.f168283y, zVar, widgetContext, this.z);
            this.v = null;
            this.u = 1;
            if (lVarQ.collect(b0Var, this) == aVar) {
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
