package y1f;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2f.o;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c f310373b;

    public /* synthetic */ c(com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c cVar, int i) {
        this.f310372a = i;
        this.f310373b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f310372a) {
            case 0:
                o result = (o) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c cVar = this.f310373b;
                cVar.n2(new xnl.f(cVar, result, null, 25), new whi.b(6));
                break;
            case 1:
                this.f310373b.B2();
                break;
            default:
                this.f310373b.B2();
                break;
        }
        return Unit.f186387a;
    }
}
