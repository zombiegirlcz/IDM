package jnc;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.robo.impl.ui.screen.projection.a f176704b;

    public /* synthetic */ p(com.revolut.feature.robo.impl.ui.screen.projection.a aVar, int i) {
        this.f176703a = i;
        this.f176704b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f176703a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                od0.h hVar = od0.i.Companion;
                PortfolioGoal portfolioGoal = this.f176704b.o.f85181b;
                hVar.getClass();
                return e.a(update, null, null, null, zi0.c.P(od0.h.a(portfolioGoal), false, null, 3), null, 47);
            case 1:
                k5f.e result = (k5f.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                Data dataP = zi0.c.P(result.f181502a, false, null, 3);
                com.revolut.feature.robo.impl.ui.screen.projection.a aVar = this.f176704b;
                aVar.H2(aVar.f85191x, new jkh.h(dataP, 2));
                return Unit.f186387a;
            default:
                wnc.o result2 = (wnc.o) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 != null) {
                    Data dataP2 = zi0.c.P(result2.f298809a, false, null, 3);
                    com.revolut.feature.robo.impl.ui.screen.projection.a aVar2 = this.f176704b;
                    aVar2.H2(aVar2.f85191x, new jkh.h(dataP2, 2));
                }
                return Unit.f186387a;
        }
    }
}
