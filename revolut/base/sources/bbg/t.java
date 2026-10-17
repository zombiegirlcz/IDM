package bbg;

import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wbg.g0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HotelsPointsRedeemOption f14300b;

    public /* synthetic */ t(HotelsPointsRedeemOption hotelsPointsRedeemOption, int i) {
        this.f14299a = i;
        this.f14300b = hotelsPointsRedeemOption;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14299a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, null, null, null, null, null, null, this.f14300b, null, null, null, 1919);
            default:
                g0 update2 = (g0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return g0.a(update2, null, this.f14300b, null, null, null, false, false, null, null, null, null, null, null, 8189);
        }
    }
}
