package ph4;

import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import hs3.n;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d f236205b;

    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar, int i) {
        this.f236204a = i;
        this.f236205b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f236204a;
        com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar = this.f236205b;
        switch (i) {
            case 0:
                l84.e output = (l84.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof l84.b) {
                    dVar.O2(null, dVar.f68313p.f68304c.f66892b);
                } else if (output instanceof l84.c) {
                    dVar.l2(new h(dVar, ((l84.c) output).f192778a, (Continuation) null), new yi5.b(26));
                } else {
                    if (!(output instanceof l84.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Proceed credit health action was called after credit application");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "RejectedLazyFlowModel", null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            default:
                eii.k output2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof eii.g) {
                    dVar.O2(null, dVar.f68313p.f68304c.f66892b);
                } else if (output2 instanceof eii.i) {
                    Object obj3 = ((eii.i) output2).f126655a;
                    if (obj3 instanceof n) {
                        dVar.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(((n) obj3).f154916c, null, 0, false, false, true, 65422))));
                    } else {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "RejectedLazyFlowModel", a0.d.m(obj3, "Unsupported bureau row parcel: "), null, h0Var2);
                    }
                } else {
                    if (!(output2 instanceof eii.d) && !(output2 instanceof eii.e) && !(output2 instanceof eii.f) && !(output2 instanceof eii.h) && !(output2 instanceof eii.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "RejectedLazyFlowModel", "Unsupported bureaus bottom sheet " + o0.f186429a.b(output2.getClass()) + " output", null, h0Var3);
                }
                return Unit.f186387a;
        }
    }
}
