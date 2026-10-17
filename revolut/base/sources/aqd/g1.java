package aqd;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e f8344b;

    public /* synthetic */ g1(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar, int i) {
        this.f8343a = i;
        this.f8344b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8343a) {
            case 0:
                a detailsData = (a) obj2;
                Intrinsics.checkNotNullParameter(detailsData, "detailsData");
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = this.f8344b;
                return new ahd.y(eVar.A, detailsData, eVar, 2);
            default:
                rpd.f it8 = (rpd.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean zF = Intrinsics.f(it8, rpd.d.f256367a);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar2 = this.f8344b;
                if (zF) {
                    eVar2.K2();
                } else {
                    if (!Intrinsics.f(it8, rpd.e.f256368a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar2.C2(f0.f8339a);
                }
                return Unit.f186387a;
        }
    }
}
