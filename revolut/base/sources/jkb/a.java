package jkb;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.feature.retail.savings.api.R$string;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f175140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f175141x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f175140w = bVar;
        this.f175141x = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a(this.f175140w, this.f175141x, (Continuation) obj4);
        aVar.v = (FlowCollector) obj2;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            ErrorWidgetDelegate.Model modelA = rpb.b.a(R$string.savings_challenge_widget_goal_error, this.f175141x);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(modelA, this) == aVar) {
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
