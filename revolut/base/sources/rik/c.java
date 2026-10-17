package rik;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import onk.g;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a f254589b;

    public /* synthetic */ c(com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a aVar, int i) {
        this.f254588a = i;
        this.f254589b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f254588a;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a aVar = this.f254589b;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Unable to start StudentFlow", throwable, h0Var);
                aVar.J2();
                return Boolean.TRUE;
            case 1:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a aVar2 = this.f254589b;
                i iVar = aVar2.f103270q;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a output = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof a.b) {
                    h.t2(aVar2, aVar2.f103270q, StudentFlowContract$Step.StudentHub.f103266a, false, null, false, 12);
                } else {
                    if (!Intrinsics.f(output, a.C0635a.f103287a) && !Intrinsics.f(output, a.d.f103290a) && !Intrinsics.f(output, a.c.f103289a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(iVar);
                }
                return Unit.f186387a;
            default:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, g.a.f226960a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(aVar.f103270q);
                return Unit.f186387a;
        }
    }
}
