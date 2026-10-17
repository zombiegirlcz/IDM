package ip0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProfileDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class tz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166568a;

    public /* synthetic */ tz(int i) {
        this.f166568a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        boolean z;
        int i = this.f166568a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof uz;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof com.revolut.core.ui_kit.delegates.ea;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof com.revolut.core.ui_kit.delegates.fa;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof e00;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof com.revolut.core.ui_kit.delegates.ga;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof m00;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof com.revolut.core.ui_kit.delegates.ka;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof PhotoBannerLargeDelegate.Model;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof r00;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof com.revolut.core.ui_kit.delegates.na;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof a10;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof e10;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof k10;
                break;
            case 13:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof PlainTextDelegate.Model;
                break;
            case 14:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof t10;
                break;
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof com.revolut.core.ui_kit.delegates.sa;
                break;
            case 16:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof g20;
                break;
            case 17:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof PlanTileDelegate.Model;
                break;
            case 18:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof m20;
                break;
            case 19:
                ResourceImage resourceImage = PlanWidgetDelegate.f;
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof PlanWidgetDelegate.Model;
                break;
            case 20:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof p20;
                break;
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ProductSelectionDelegate.Model;
                break;
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof u20;
                break;
            case 23:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof z20;
                break;
            case 24:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof n30;
                break;
            case 25:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ProfileDelegate.Model;
                break;
            case 26:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof t30;
                break;
            case 27:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof w30;
                break;
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof y30;
                break;
            default:
                Color.Solid solid = ProgressStepHorizontalV2Delegate.d;
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof a40;
                break;
        }
        return Boolean.valueOf(z);
    }
}
