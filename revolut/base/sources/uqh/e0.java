package uqh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenerSortingOptions f282143b;

    public /* synthetic */ e0(ScreenerSortingOptions screenerSortingOptions, int i) {
        this.f282142a = i;
        this.f282143b = screenerSortingOptions;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f282142a) {
            case 0:
                z update = (z) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return z.a(update, null, null, null, null, this.f282143b, null, false, null, null, null, 1007);
            default:
                z update2 = (z) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ScreenerSortingOptions screenerSortingOptions = this.f282143b;
                return z.a(update2, null, null, null, null, screenerSortingOptions, screenerSortingOptions, false, null, null, null, 975);
        }
    }
}
