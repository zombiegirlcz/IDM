package xmd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o0 extends kotlin.jvm.internal.q implements Function1 {
    public static final o0 f = new o0();

    public o0() {
        super(1, g0.class, "<init>", "<init>(Lcom/revolut/feature/spending_analytics/impl/ui/budget/providers/BudgetSpentProvider$Spent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        wmd.e p0 = (wmd.e) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new g0(p0);
    }
}
