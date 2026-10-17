package cnc;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.robo.impl.ui.screen.manage_goal.a f25403b;

    public /* synthetic */ u(com.revolut.feature.robo.impl.ui.screen.manage_goal.a aVar, int i) {
        this.f25402a = i;
        this.f25403b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f25402a) {
            case 0:
                alc.n portfolio = (alc.n) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                com.revolut.feature.robo.impl.ui.screen.manage_goal.a aVar = this.f25403b;
                return rd0.e.b(ael.t.d(aVar.v, aVar.o.f25389a, false, null, portfolio.i, false, null, 54));
            case 1:
                alc.n it8 = (alc.n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                emc.e eVar = this.f25403b.f85141r;
                String str = it8.e;
                if (str != null) {
                    return eVar.c(str);
                }
                throw new IllegalStateException("No template assigned to portfolio but ManageGoalScreen launched");
            default:
                Intrinsics.checkNotNullParameter((aii.q) obj2, "it");
                this.f25403b.C2(aii.q.f5292a);
                return Unit.f186387a;
        }
    }
}
