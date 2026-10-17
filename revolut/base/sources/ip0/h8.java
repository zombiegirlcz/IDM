package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTwinButtonsDelegate;
import com.revolut.core.ui_kit.delegates.CellWithLinearGaugeDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.ChatPreviewDelegate;
import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import com.revolut.core.ui_kit.delegates.ChatTooltipDelegate;
import com.revolut.core.ui_kit.delegates.ChatTravelPreviewDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164519a;

    public /* synthetic */ h8(int i) {
        this.f164519a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        int i = this.f164519a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsSingleButtonDelegate.Model);
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsStandaloneNoteDelegate.Model);
            case 2:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsSwitcherDelegate.Model);
            case 3:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsTextProgressDelegate.Model);
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof n8);
            case 5:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsTwinButtonsDelegate.Model);
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof u8);
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellWithLinearGaugeDelegate.Model);
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CenteredAmountDelegate.Model);
            case 9:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CenteredContentTileDelegate.Model);
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof p9);
            case 11:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChallengeMediumDelegate.Model);
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChallengeMediumImageCardDelegate.Model);
            case 13:
                ChallengeMediumImageCardLoadingDelegate.Companion aVar = ChallengeMediumImageCardLoadingDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof z9);
            case 14:
                ChallengeMediumLoadingDelegate.Companion aVar2 = ChallengeMediumLoadingDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof da);
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ga);
            case 16:
                ChatContextualChartDelegate.Companion aVar3 = ChatContextualChartDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatContextualChartDelegate.Model);
            case 17:
                ChatItemsDelegate.Companion aVar4 = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatItemsDelegate.Model);
            case 18:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof oa);
            case 19:
                ChatPreviewDelegate.Companion aVar5 = ChatPreviewDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof pa);
            case 20:
                ChatTilesCollectionDelegate.Companion aVar6 = ChatTilesCollectionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatTilesCollectionDelegate.Model);
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof sa);
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatTooltipDelegate.Model);
            case 23:
                int i2 = ChatTravelPreviewDelegate.f52077l;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ChatTravelPreviewDelegate.Model);
            case 24:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.y3);
            case 25:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CircleActionButtonsBarDelegate.CircleActionButton);
            case 26:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.z3);
            case 27:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ComparisonCellDelegate.Model);
        }
    }
}
