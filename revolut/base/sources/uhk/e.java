package uhk;

import bmk.b;
import glk.j;
import igk.f;
import jlk.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uhk.c;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a f280264b;

    public /* synthetic */ e(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar, int i) {
        this.f280263a = i;
        this.f280264b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f280263a) {
            case 0:
                igk.f output = (igk.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof f.a;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar = this.f280264b;
                if (z) {
                    aVar.B2();
                } else {
                    if (!(output instanceof f.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.l2(new g(aVar, null, 3), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                ulk.i output2 = (ulk.i) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar2 = this.f280264b;
                aVar2.getClass();
                if (!(output2 instanceof ulk.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                ulk.h hVar = (ulk.h) output2;
                aVar2.C2(new d(hVar.f281036a, hVar.f281037b));
                return Unit.f186387a;
            case 2:
                j output3 = (j) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                boolean zF = Intrinsics.f(output3, glk.h.f144720a);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar3 = this.f280264b;
                if (zF) {
                    oki.h.D2(aVar3.f103165s);
                } else {
                    if (!(output3 instanceof glk.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.C1(foh.i.i(((glk.i) output3).f144721a));
                }
                return Unit.f186387a;
            case 3:
                jlk.j result = (jlk.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF2 = Intrinsics.f(result, j.a.f175856a);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar4 = this.f280264b;
                if (zF2) {
                    oki.h.D2(aVar4.f103165s);
                } else {
                    if (!(result instanceof j.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.l2(new g(aVar4, null, 2), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                b.AbstractC0116b abstractC0116b = (b.AbstractC0116b) obj2;
                boolean zF3 = Intrinsics.f(abstractC0116b, b.AbstractC0116b.C0117b.f16851a);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar5 = this.f280264b;
                if (zF3) {
                    aVar5.C2(c.a.f280260a);
                } else {
                    if (!Intrinsics.f(abstractC0116b, b.AbstractC0116b.a.f16850a) && !Intrinsics.f(abstractC0116b, b.AbstractC0116b.c.f16852a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar5.l2(new g(aVar5, null, 1), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
