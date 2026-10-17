package fxj;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import my8.t;
import p0j.e;
import vs8.b;
import zhm.q0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f138832b;

    public /* synthetic */ b(g gVar, int i) {
        this.f138831a = i;
        this.f138832b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        t tVar;
        int i = this.f138831a;
        g gVar = this.f138832b;
        switch (i) {
            case 0:
                e it8 = (e) obj2;
                int i2 = c.f138833a;
                Intrinsics.checkNotNullParameter(it8, "it");
                gVar.I2();
                return Unit.f186387a;
            case 1:
                vs8.b output = (vs8.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, b.C1619b.f291747a)) {
                    tVar = t.SUCCESS;
                } else {
                    if (!Intrinsics.f(output, b.a.f291746a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tVar = t.CANCEL;
                }
                knm.b.j(gVar.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("KYC_SUBMISSION_STATUS", tVar)), null, 4)));
                return Unit.f186387a;
            case 2:
                ly8.b output2 = (ly8.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                knm.b.j(gVar.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("KYC_SUBMISSION_STATUS", output2.f().a())), null, 4)));
                return Unit.f186387a;
            default:
                pgj.d result = (pgj.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof pgj.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar.F1(new EsimFeatureConfig.HomeDestination(((pgj.c) result).f(), (TransitionAnimation) null, 4));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(g gVar, xu8.d dVar, int i) {
        this.f138831a = i;
        this.f138832b = gVar;
    }
}
