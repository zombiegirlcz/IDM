package gzi;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import gim.i;
import grl.t9;
import kii.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import op0.q;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f148134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f148135x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f148134w = dVar;
        this.f148135x = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        c cVar = new c(this.f148134w, this.f148135x, (Continuation) obj4);
        cVar.v = (FlowCollector) obj2;
        return cVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            w0 w0VarE = e.e(RevPointsGenericWidgetContext.newBuilder(), t9.ERROR, AnalyticsContext.INSTANCE);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_common_state_error_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.airport_lounges_common_state_error_action_try_again, null, null, 14);
            q qVar = q.MEDIUM;
            ViewableRecordItem$Type.ViewableRecord viewableRecord = new ViewableRecordItem$Type.ViewableRecord(null);
            AnalyticsContext analyticsContext = new AnalyticsContext(w0VarE);
            String str = this.f148135x;
            ErrorWidgetDelegate.Model model = new ErrorWidgetDelegate.Model(str, null, textLocalisedClause, textLocalisedClause2, qVar, new AnalyticsContext(w0VarE), new zn.b(str, viewableRecord, analyticsContext), 130);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(model, this) == aVar) {
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
