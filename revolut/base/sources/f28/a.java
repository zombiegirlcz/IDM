package f28;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f131446b;

    public /* synthetic */ a(h0 h0Var, int i) {
        this.f131445a = i;
        this.f131446b = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data chartData = (Data) obj2;
        switch (this.f131445a) {
            case 0:
                Intrinsics.checkNotNullParameter(chartData, "chartData");
                return new f(this.f131446b, chartData);
            default:
                Intrinsics.checkNotNullParameter(chartData, "chartData");
                return new e(this.f131446b, chartData);
        }
    }
}
