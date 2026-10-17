package q97;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class y2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f243830b;

    public /* synthetic */ y2(e3 e3Var, int i) {
        this.f243829a = i;
        this.f243830b = e3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean tradingEnabled = (Boolean) obj2;
        switch (this.f243829a) {
            case 0:
                Intrinsics.checkNotNullParameter(tradingEnabled, "tradingEnabled");
                if (tradingEnabled.booleanValue()) {
                    e3 e3Var = this.f243830b;
                    efm.r rVarSwitchMap = rd0.e.c(new ae8.c(bla.b.b(e3Var.d, ne8.b.f214421c.a()), 23), kotlin.coroutines.g.f186406a).switchMap(new h2(10, new y2(e3Var, 1)));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(tradingEnabled, "youthIsaEnabled");
                if (tradingEnabled.booleanValue()) {
                    e3 e3Var2 = this.f243830b;
                }
                break;
        }
        return te0.w.h(zhm.f0.f322471a);
    }
}
