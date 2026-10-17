package op0;

import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.EarthMapLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.EarthMapWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.EsimCarouselWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ExtraSmallCardScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ExtraSmallTileGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.FullScreenStateWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressEmptyWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalBarsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.IconGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.IconsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.InputLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.InputWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.MapLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.MapWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QrCodeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227453a;

    public /* synthetic */ v0(int i) {
        this.f227453a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        boolean z;
        int i = this.f227453a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ComparisonLineChartLoadingWidgetDelegate.Model;
                break;
            case 1:
                ComparisonLineChartWidgetDelegate.a aVar = ComparisonLineChartWidgetDelegate.Companion;
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ComparisonLineChartWidgetDelegate.Model;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ContactsWidgetDelegate.Model;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof EarthMapLoadingWidgetDelegate.Model;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof EarthMapWidgetDelegate.Model;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ErrorWidgetDelegate.Model;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof EsimCarouselWidgetDelegate.Model;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ExtraSmallCardScrollerWidgetDelegate.Model;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ExtraSmallTileGridWidgetDelegate.Model;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof FullScreenStateWidgetDelegate.Model;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof GoalProgressEmptyWidgetDelegate.Model;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof GoalProgressLoadingTileWidgetDelegate.Model;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof GoalProgressLoadingWidgetDelegate.Model;
                break;
            case 13:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof GoalProgressTileWidgetDelegate.Model;
                break;
            case 14:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof GoalProgressWidgetDelegate.Model;
                break;
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof HorizontalBarsTileWidgetDelegate.Model;
                break;
            case 16:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof IconGridWidgetDelegate.Model;
                break;
            case 17:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof IconsTileWidgetDelegate.Model;
                break;
            case 18:
                Intrinsics.checkNotNullParameter(data, "model");
                z = data instanceof InputLoadingWidgetDelegate.Model;
                break;
            case 19:
                Intrinsics.checkNotNullParameter(data, "model");
                z = data instanceof InputWidgetDelegate.Model;
                break;
            case 20:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof LineChartLoadingTileWidgetDelegate.Model;
                break;
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof LineChartTileWidgetDelegate.Model;
                break;
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof MapLoadingWidgetDelegate.Model;
                break;
            case 23:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof MapWidgetDelegate.Model;
                break;
            case 24:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof NewsWidgetDelegate.Model;
                break;
            case 25:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof PaymentLinkWidgetDelegate.Model;
                break;
            case 26:
                Intrinsics.checkNotNullParameter(data, "model");
                z = data instanceof PaymentLinkWidgetLoadingDelegate.Model;
                break;
            case 27:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof PhotoBannerWidgetDelegate.Model;
                break;
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof QrCodeWidgetDelegate.Model;
                break;
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof QuickActionWidgetDelegate.Model;
                break;
        }
        return Boolean.valueOf(z);
    }
}
