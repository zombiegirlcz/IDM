package ctb;

import igk.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v p0 = (v) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b bVar = (com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b) this.receiver;
        bVar.getClass();
        bVar.l2(new cn0.d(bVar, p0, (Continuation) null, 9), new yi5.b(26));
        return Unit.f186387a;
    }
}
