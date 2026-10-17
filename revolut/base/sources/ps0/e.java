package ps0;

import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import ip0.h3;
import ip0.u3;
import ip0.z3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3 f239356b;

    public /* synthetic */ e(h3 h3Var, int i) {
        this.f239355a = i;
        this.f239356b = h3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f239355a;
        h3 h3Var = this.f239356b;
        u3 series = (u3) obj2;
        switch (i) {
            case 0:
                BarChartView.a aVar = BarChartView.Companion;
                Intrinsics.checkNotNullParameter(series, "series");
                z3 z3Var = (z3) h3Var.f164501c.get(series.f166584a);
                if (z3Var != null) {
                    return Float.valueOf(z3Var.f167391a);
                }
                return null;
            case 1:
                BarChartView.a aVar2 = BarChartView.Companion;
                Intrinsics.checkNotNullParameter(series, "series");
                z3 z3Var2 = (z3) h3Var.f164501c.get(series.f166584a);
                if (z3Var2 != null) {
                    return Float.valueOf(z3Var2.f167391a);
                }
                return null;
            case 2:
                BarChartView.a aVar3 = BarChartView.Companion;
                Intrinsics.checkNotNullParameter(series, "series");
                z3 z3Var3 = (z3) h3Var.f164501c.get(series.f166584a);
                if (z3Var3 != null) {
                    return Float.valueOf(z3Var3.f167391a);
                }
                return null;
            case 3:
                BarChartView.a aVar4 = BarChartView.Companion;
                Intrinsics.checkNotNullParameter(series, "series");
                z3 z3Var4 = (z3) h3Var.f164501c.get(series.f166584a);
                if (z3Var4 != null) {
                    return Float.valueOf(z3Var4.f167391a);
                }
                return null;
            case 4:
                BarChartView.a aVar5 = BarChartView.Companion;
                Intrinsics.checkNotNullParameter(series, "series");
                z3 z3Var5 = (z3) h3Var.f164501c.get(series.f166584a);
                if (z3Var5 != null) {
                    return Float.valueOf(z3Var5.f167391a);
                }
                return null;
            case 5:
                BarChartView.a aVar6 = BarChartView.Companion;
                Intrinsics.checkNotNullParameter(series, "series");
                z3 z3Var6 = (z3) h3Var.f164501c.get(series.f166584a);
                if (z3Var6 != null) {
                    return Float.valueOf(z3Var6.f167391a);
                }
                return null;
            case 6:
                BarChartView.a aVar7 = BarChartView.Companion;
                Intrinsics.checkNotNullParameter(series, "series");
                z3 z3Var7 = (z3) h3Var.f164501c.get(series.f166584a);
                if (z3Var7 != null) {
                    return Float.valueOf(z3Var7.f167391a);
                }
                return null;
            default:
                BarChartView.a aVar8 = BarChartView.Companion;
                Intrinsics.checkNotNullParameter(series, "series");
                z3 z3Var8 = (z3) h3Var.f164501c.get(series.f166584a);
                if (z3Var8 != null) {
                    return Float.valueOf(z3Var8.f167391a);
                }
                return null;
        }
    }
}
