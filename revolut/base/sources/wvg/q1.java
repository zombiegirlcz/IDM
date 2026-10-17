package wvg;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import java.util.Optional;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f300457b;

    public /* synthetic */ q1(x1 x1Var, int i) {
        this.f300456a = i;
        this.f300457b = x1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f300456a) {
            case 0:
                Optional chartFacadeOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(chartFacadeOptional, "chartFacadeOptional");
                return chartFacadeOptional.map(new bpd.a(new r1(this.f300457b, 1), 29));
            case 1:
                p1 params = (p1) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return this.f300457b.e(params.f300449g, params.f300450h);
            case 2:
                i1 params2 = (i1) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return this.f300457b.e(params2.f, params2.f300396g);
            case 3:
                Optional chartFacadeOptional2 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(chartFacadeOptional2, "chartFacadeOptional");
                final r1 r1Var = new r1(this.f300457b, 2);
                final int i = 0;
                return chartFacadeOptional2.map(new Function() { // from class: wvg.t1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        switch (i) {
                            case 0:
                                return (TotalValueChart) ((r1) r1Var).invoke(obj3);
                            default:
                                return (SimpleTotalValueChart) ((r1) r1Var).invoke(obj3);
                        }
                    }
                });
            case 4:
                Optional chartFacadeOptional3 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(chartFacadeOptional3, "chartFacadeOptional");
                final r1 r1Var2 = new r1(this.f300457b, 3);
                final int i2 = 1;
                return chartFacadeOptional3.map(new Function() { // from class: wvg.t1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        switch (i2) {
                            case 0:
                                return (TotalValueChart) ((r1) r1Var2).invoke(obj3);
                            default:
                                return (SimpleTotalValueChart) ((r1) r1Var2).invoke(obj3);
                        }
                    }
                });
            default:
                Optional chartFacadeOptional4 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(chartFacadeOptional4, "chartFacadeOptional");
                return chartFacadeOptional4.map(new bpd.a(new r1(this.f300457b, 0), 28));
        }
    }
}
