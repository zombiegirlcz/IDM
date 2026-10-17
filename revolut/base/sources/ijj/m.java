package ijj;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefund;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a;
import dej.d3;
import dej.p0;
import dej.p3;
import dfj.b5;
import dfj.s4;
import dfj.x4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b f161818b;

    public /* synthetic */ m(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar, int i) {
        this.f161817a = i;
        this.f161818b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        EsimSubscriptionRefund esimSubscriptionRefund;
        Object obj3 = null;
        Object[] objArr = 0;
        switch (this.f161817a) {
            case 0:
                p3 quote = (p3) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                EsimMobilePlanCancellationScreenContract$InputData esimMobilePlanCancellationScreenContract$InputData = this.f161818b.o;
                Iterator it8 = quote.f113617a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((d3) next).f113523a.f113650a, esimMobilePlanCancellationScreenContract$InputData.f101108c)) {
                            obj3 = next;
                        }
                    }
                }
                d3 d3Var = (d3) obj3;
                if (d3Var != null) {
                    return d3Var;
                }
                throw new IllegalStateException(h30.l.r("Cancellation quote is missing for given subscription id: ", esimMobilePlanCancellationScreenContract$InputData.f101108c));
            default:
                jjj.h output = (jjj.h) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof jjj.f;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar = this.f161818b;
                if (z) {
                    bVar.C2(a.C0616a.f101118a);
                } else {
                    if (!(output instanceof jjj.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d3 d3Var2 = (d3) ((f) ((j2) bVar.f101125t.f22677a).getValue()).f161807a.getContent();
                    String refundToken = (d3Var2 == null || (esimSubscriptionRefund = d3Var2.f113524b) == null) ? null : esimSubscriptionRefund.e;
                    if (refundToken == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanCancellationScreenModel", "Unable to perform plan cancellation: refund token is null", null, h0Var);
                    } else {
                        s4 s4Var = bVar.f101121p;
                        EsimMobilePlanCancellationScreenContract$InputData esimMobilePlanCancellationScreenContract$InputData2 = bVar.o;
                        String subscriptionId = esimMobilePlanCancellationScreenContract$InputData2.f101108c;
                        p0 p0Var = esimMobilePlanCancellationScreenContract$InputData2.d;
                        String str = esimMobilePlanCancellationScreenContract$InputData2.e;
                        String str2 = esimMobilePlanCancellationScreenContract$InputData2.f101109g;
                        b5 b5Var = (b5) s4Var;
                        b5Var.getClass();
                        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
                        Intrinsics.checkNotNullParameter(refundToken, "refundToken");
                        yji.l.a1(bVar, t1.E(new v1(new x4(b5Var, subscriptionId, refundToken, p0Var, str, str2, null))), null, null, new n(bVar, objArr == true ? 1 : 0, 1), 3);
                    }
                }
                return Unit.f186387a;
        }
    }
}
