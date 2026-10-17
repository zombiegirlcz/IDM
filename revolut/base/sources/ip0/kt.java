package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressTrackingDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.LogosTileDelegate;
import com.revolut.core.ui_kit.delegates.NewProductDelegate;
import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.ReferralStatusDelegate;
import com.revolut.core.ui_kit.delegates.RewardProgressDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherRoundedDelegate;
import com.revolut.core.ui_kit.delegates.ThumbnailPreviewDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.WallpaperPreviewDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class kt implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f165069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f165070c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TrackableItem e;

    public /* synthetic */ kt(TrackableItem trackableItem, py0.d dVar, Object obj2, TrackableItem trackableItem2, int i) {
        this.f165068a = i;
        this.f165069b = trackableItem;
        this.f165070c = dVar;
        this.d = obj2;
        this.e = trackableItem2;
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f165068a;
        TrackableItem trackableItem = this.e;
        Object obj2 = this.d;
        py0.d dVar = this.f165070c;
        TrackableItem trackableItem2 = this.f165069b;
        switch (i) {
            case 0:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((LineChartResizableTileDelegate) obj2).f52642c.onNext((LineChartResizableTileDelegate.Model) trackableItem);
                break;
            case 1:
                h30.l.w(view, view).a(view, trackableItem2, (py0.c) dVar);
                ((LinearProgressTrackingDelegate) obj2).f52659c.onNext((LinearProgressTrackingDelegate.Model) trackableItem);
                break;
            case 2:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((LinearProgressWithAmountDelegate) obj2).d.onNext((LinearProgressWithAmountDelegate.Model) trackableItem);
                break;
            case 3:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((ListCellDelegate) obj2).f52692c.onNext((ListCellDelegate.Model) trackableItem);
                break;
            case 4:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((ListSubheaderDelegate) obj2).f.onNext((ListSubheaderDelegate.Model) trackableItem);
                break;
            case 5:
                h30.l.w(view, view).a(view, trackableItem2, (py0.c) dVar);
                ((ListingCardBasicDelegate) obj2).f52729c.onNext((ListingCardBasicDelegate.Model) trackableItem);
                break;
            case 6:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((LogosTileDelegate) obj2).f52753c.onNext((LogosTileDelegate.Model) trackableItem);
                break;
            case 7:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((NewProductDelegate) obj2).f52780c.onNext((NewProductDelegate.Model) trackableItem);
                break;
            case 8:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((NewProductSmallDelegate) obj2).f52791c.onNext((NewProductSmallDelegate.Model) trackableItem);
                break;
            case 9:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((PhotoBannerLargeDelegate) obj2).f52902c.onNext((PhotoBannerLargeDelegate.Model) trackableItem);
                break;
            case 10:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((PlainTextDelegate) obj2).f52925c.onNext((PlainTextDelegate.Model) trackableItem);
                break;
            case 11:
                h30.l.w(view, view).a(view, trackableItem2, (py0.c) dVar);
                ((PlanWidgetDelegate) obj2).f52955c.onNext((PlanWidgetDelegate.Model) trackableItem);
                break;
            case 12:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((PlanWidgetDelegate) obj2).d.onNext((PlanWidgetDelegate.Model) trackableItem);
                break;
            case 13:
                h30.l.w(view, view).a(view, trackableItem2, (py0.a) dVar);
                ((PromotionalMediumTileDelegate) obj2).d.onNext((PromotionalMediumTileDelegate.Model) trackableItem);
                break;
            case 14:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                QRCodeDelegate.Companion aVar = QRCodeDelegate.INSTANCE;
                ((ihm.f) ((QRCodeDelegate) obj2).e.getValue()).onNext((QRCodeDelegate.Model) trackableItem);
                break;
            case 15:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((ReferralStatusDelegate) obj2).f53176c.onNext((ReferralStatusDelegate.Model) trackableItem);
                break;
            case 16:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((ihm.f) ((RewardProgressDelegate) obj2).d.getValue()).onNext((RewardProgressDelegate.Model) trackableItem);
                break;
            case 17:
                h30.l.w(view, view).a(view, trackableItem2, (py0.c) dVar);
                ((RowDelegate) obj2).k.onNext((RowDelegate.Model) trackableItem);
                break;
            case 18:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                SingleChoiceDelegate.Companion companion = SingleChoiceDelegate.INSTANCE;
                ((SingleChoiceDelegate) obj2).p().onNext((SingleChoiceDelegate.Model) trackableItem);
                break;
            case 19:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((SmallCardDelegate) obj2).d.onNext((SmallCardDelegate.Model) trackableItem);
                break;
            case 20:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((SmartTileExchangeDelegate) obj2).f.onNext((SmartTileExchangeDelegate.Model) trackableItem);
                break;
            case 21:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((TextDelegate) obj2).f53530c.onNext((TextDelegate.Model) trackableItem);
                break;
            case 22:
                h30.l.w(view, view).a(view, (CustomTrackableComponent) trackableItem2, dVar);
                ((ThemeSwitcherRoundedDelegate.ItemDelegate) obj2).f53547c.onNext(((ThemeSwitcherRoundedDelegate.Item) trackableItem).f53546c);
                break;
            case 23:
                h30.l.w(view, view).a(view, trackableItem2, (py0.c) dVar);
                ((ThumbnailPreviewDelegate) obj2).d.onNext((ThumbnailPreviewDelegate.Model) trackableItem);
                break;
            case 24:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((TripDetailsDelegate) obj2).e.onNext((TripDetailsDelegate.Model) trackableItem);
                break;
            case 25:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((VoucherExtraSmallTileDelegate) obj2).f53594c.onNext((VoucherExtraSmallTileDelegate.Model) trackableItem);
                break;
            case 26:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((VoucherSmallTileDelegate) obj2).f53608c.onNext((VoucherSmallTileDelegate.Model) trackableItem);
                break;
            case 27:
                h30.l.w(view, view).a(view, trackableItem2, (py0.c) dVar);
                ((WallpaperPreviewDelegate) obj2).f53633c.onNext((WallpaperPreviewDelegate.Model) trackableItem);
                break;
            case 28:
                h30.l.w(view, view).a(view, trackableItem2, dVar);
                ((AirTipDelegate) obj2).f53689c.onNext((AirTipDelegate.Model) trackableItem);
                break;
            default:
                h30.l.w(view, view).a(view, (FullScreenStateView) trackableItem2, dVar);
                View.OnClickListener onClickListener = (View.OnClickListener) obj2;
                if (onClickListener != null) {
                    onClickListener.onClick(((FullScreenStateView) trackableItem).getImageContainerView());
                }
                break;
        }
    }
}
