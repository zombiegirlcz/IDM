package ip0;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileAssetViewDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileAssetViewLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarCellDelegate;
import com.revolut.core.ui_kit.delegates.SummaryCardDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class je0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164830a;

    public /* synthetic */ je0(int i) {
        this.f164830a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        int i = this.f164830a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof le0);
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 2:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof we0);
            case 3:
                SingleChoiceDelegate.Companion aVar = SingleChoiceDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SingleChoiceDelegate.Model);
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof bf0);
            case 5:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ef0);
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmallActionButtonDelegate.Model);
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmallCardDelegate.Model);
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof nf0);
            case 9:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof rf0);
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmallStockCardDelegate.Model);
            case 11:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmartTileAssetViewDelegate.Model);
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmartTileAssetViewLoadingDelegate.Model);
            case 13:
                SmartTileExchangeDelegate.Companion aVar2 = SmartTileExchangeDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmartTileExchangeDelegate.Model);
            case 14:
                aw0.b7 b7Var = SmartTileExchangeLoadingDelegate.f53434c;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmartTileExchangeLoadingDelegate.Model);
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SmartTileSendMoneyDelegate.Model);
            case 16:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof sg0);
            case 17:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ug0);
            case 18:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SplitColumnCellDelegate.Model);
            case 19:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.kh);
            case 20:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof StreakStepVerticalDelegate.Model);
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof eh0);
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SuggestionsBarCellDelegate.Model);
            case 23:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.nh);
            case 24:
                yp0.p pVar = SummaryCardDelegate.d;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof SummaryCardDelegate.Model);
            case 25:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof qh0);
            case 26:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 27:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ci0);
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ii0);
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof oi0);
        }
    }
}
