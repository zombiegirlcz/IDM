package op0;

import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SmallCardGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileWithHalfPieWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TrackingProgressEmptyWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TrackingProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TrackingProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TravelModeLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227458a;

    public /* synthetic */ v3(int i) {
        this.f227458a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f227458a) {
            case 0:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof QuickActionWidgetLoadingDelegate.Model);
            case 1:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof RowsWidgetDelegate.Model);
            case 2:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 3:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof b4);
            case 4:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SimpleTileWidgetDelegate.Model);
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmallCardGridWidgetDelegate.Model);
            case 6:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 7:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TileGridWidgetDelegate.Model);
            case 11:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TileLoadingWidgetDelegate.Model);
            case 12:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TilePaginatedGridWidgetDelegate.Model);
            case 13:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TileWithHalfPieWidgetDelegate.Model);
            case 14:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TrackingProgressEmptyWidgetDelegate.Model);
            case 15:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TrackingProgressLoadingWidgetDelegate.Model);
            case 16:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TrackingProgressWidgetDelegate.Model);
            case 17:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TravelModeLoadingWidgetDelegate.Model);
            case 18:
                ((Integer) obj2).intValue();
                TravelModeWidgetDelegate.Companion aVar = TravelModeWidgetDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TravelModeWidgetDelegate.Model);
            case 19:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.widgets.z4);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return zhm.f0.f322471a;
            case 21:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 23:
                Throwable error = (Throwable) obj2;
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (savingsAccountDetails == null) {
                    return error;
                }
                return null;
            case 24:
                Throwable error2 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 25:
                Throwable error3 = (Throwable) obj2;
                ejb.b bVar = (ejb.b) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bVar == null) {
                    return error3;
                }
                return null;
            case 26:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 27:
                Throwable error5 = (Throwable) obj2;
                DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (deFiAssetDetails == null) {
                    return error5;
                }
                return null;
            case 28:
                Throwable error6 = (Throwable) obj2;
                List list3 = (List) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list3 == null) {
                    return error6;
                }
                return null;
            default:
                Function1 getErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return (List) getErrorItems.invoke(new iii.d(14, null, true, false, null));
        }
    }
}
