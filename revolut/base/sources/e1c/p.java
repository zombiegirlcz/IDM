package e1c;

import a08.g0;
import efm.d0;
import efm.r;
import hha.z0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f121958b;

    public /* synthetic */ p(q qVar, int i) {
        this.f121957a = i;
        this.f121958b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121957a) {
            case 0:
                z0 earningRate = (z0) obj2;
                Intrinsics.checkNotNullParameter(earningRate, "earningRate");
                d0 d0VarF = this.f121958b.o.f(earningRate.f152378a);
                g0 g0Var = new g0(10, new a26.p(earningRate, 21));
                d0VarF.getClass();
                return new rfm.j(d0VarF, g0Var, 2);
            default:
                List loyaltyEarningRateList = (List) obj2;
                Intrinsics.checkNotNullParameter(loyaltyEarningRateList, "loyaltyEarningRateList");
                r rVarX = r.fromIterable(loyaltyEarningRateList).flatMapMaybe(new g0(10, new p(this.f121958b, 0))).toList().x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rVarX;
        }
    }
}
