package lb1;

import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l7j.t;
import lb0.b0;
import skm.a2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f193581b;

    public /* synthetic */ k(n nVar, int i) {
        this.f193580a = i;
        this.f193581b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193580a) {
            case 0:
                AddressFlowContract$OutputData it8 = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Continuation continuation = null;
                Data dataP = zi0.c.P(it8.f60940a, false, null, 3);
                t tVar = new t(dataP, 10);
                n nVar = this.f193581b;
                nVar.x2(tVar);
                a2 a2Var = nVar.f193585r;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                nVar.f193585r = nVar.l2(new b0(dataP, nVar, continuation, 1), new yi5.b(26));
                return Unit.f186387a;
            default:
                c updateState = (c) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return this.f193581b.f193586s;
        }
    }
}
