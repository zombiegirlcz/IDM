package ood;

import com.revolut.core.ui_kit.delegates.widgets.AccessPassWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BarChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CardWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CardWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CardsWidgetAnimatedEmptyStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CellWithLinearGaugeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CellWithLinearProgressDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonBarsTileWidgetDelegate;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227041a;

    public /* synthetic */ g0(int i) {
        this.f227041a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f227041a) {
            case 0:
                Data data2 = (Data) obj2;
                Data data3 = (Data) data;
                return Boolean.valueOf((Intrinsics.f(org.bouncycastle.jcajce.provider.digest.a.m(data2, data3, "old", "new"), data3.getContent()) && Intrinsics.f(data2.getError(), data3.getError())) ? true : data2.equals(data3));
            case 1:
                Throwable th10 = (Throwable) obj2;
                if (((List) data) == null) {
                    return th10;
                }
                return null;
            case 2:
                Throwable th11 = (Throwable) obj2;
                if (((Pair) data) == null) {
                    return th11;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 4:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, false, null));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 7:
                Throwable error = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new oog.j((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), false, false);
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof AccessPassWidgetDelegate.Model);
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ActionWidgetDelegate.Model);
            case 11:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ActionWidgetLoadingDelegate.Model);
            case 12:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof AvatarGridWidgetDelegate.Model);
            case 13:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof AvatarWidgetDelegate.Model);
            case 14:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof AvatarWidgetLoadingDelegate.Model);
            case 15:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 16:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof BarChartWidgetDelegate.Model);
            case 17:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof BaseDynamicWidgetDelegate.BigHeaderModel);
            case 18:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof op0.s);
            case 19:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CalendarListWidgetDelegate.Model);
            case 20:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CardWidgetDelegate.Model);
            case 21:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CardWidgetLoadingDelegate.Model);
            case 22:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CardsWidgetAnimatedEmptyStateDelegate.Model);
            case 23:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellWithLinearGaugeWidgetDelegate.Model);
            case 24:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellWithLinearProgressDelegate.Model);
            case 25:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 26:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChartWithDetailsLoadingWidgetDelegate.Model);
            case 27:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChartWithDetailsWidgetDelegate.Model);
            case 28:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            default:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ComparisonBarsTileWidgetDelegate.Model);
        }
    }
}
