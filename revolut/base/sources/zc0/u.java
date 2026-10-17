package zc0;

import com.revolut.feature.backend_flow.domain.models.BackendEntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f321132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EntitiesSummaryItem f321133c;

    public /* synthetic */ u(y2 y2Var, EntitiesSummaryItem entitiesSummaryItem, int i) {
        this.f321131a = i;
        this.f321132b = y2Var;
        this.f321133c = entitiesSummaryItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f321131a) {
            case 0:
                BackendEntitiesSummaryItem summary = (BackendEntitiesSummaryItem) obj2;
                Intrinsics.checkNotNullParameter(summary, "summary");
                return rd0.e.c(nim.a.v(t9l.g.c(this.f321132b.f321173x, summary.f63262c), new pb0.e(this.f321133c, summary, 1)), kotlin.coroutines.g.f186406a);
            default:
                BackendFlow flow = (BackendFlow) obj2;
                Intrinsics.checkNotNullParameter(flow, "flow");
                y2 y2Var = this.f321132b;
                oc0.k kVar = y2Var.f321174y;
                String str = flow.f63264b;
                EntitiesSummaryItem entitiesSummaryItem = this.f321133c;
                return pd.b.r(rd0.e.c(oc0.k.a(kVar, new oc0.j(str, entitiesSummaryItem.f63427a, flow.f63267h)), kotlin.coroutines.g.f186406a), new u(y2Var, entitiesSummaryItem, 0));
        }
    }
}
