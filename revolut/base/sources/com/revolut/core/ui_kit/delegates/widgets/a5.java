package com.revolut.core.ui_kit.delegates.widgets;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5 f55295a = new a5();

    private a5() {
    }

    public static List a() {
        List listK = zhm.v.k(new GoalProgressLoadingWidgetDelegate(), new ContactsWidgetDelegate(), new LineChartTileWidgetDelegate(), new LineChartLoadingTileWidgetDelegate(), new RowsWidgetDelegate(), new SmallCardGridWidgetDelegate(), new ExtraSmallCardScrollerWidgetDelegate(), new QuickActionWidgetDelegate(), new QuickActionWidgetLoadingDelegate(), new MapWidgetDelegate(), new MapLoadingWidgetDelegate(), new ErrorWidgetDelegate(), new TileGridWidgetDelegate(), new BannerWidgetDelegate(), new SupportTileWidgetDelegate(), new SupportTileWidgetLoadingDelegate(), new SwitcherWidgetDelegate(), new SwitcherWidgetLoadingDelegate(), new IconsTileWidgetDelegate(), new TileLoadingWidgetDelegate(), new AvatarWidgetDelegate(), new AvatarWidgetLoadingDelegate(), new ActionWidgetDelegate(), new ActionWidgetLoadingDelegate(), new QrCodeWidgetDelegate(), new PaymentLinkWidgetDelegate(), new PaymentLinkWidgetLoadingDelegate(), new CompactCellWidgetDelegate(), new AvatarGridWidgetDelegate(), new NewsWidgetDelegate(), new GoalProgressWidgetDelegate(), new ExtraSmallTileGridWidgetDelegate(), new SimpleTileWidgetDelegate(), new ComparisonLineChartWidgetDelegate(), new ChartWithDetailsWidgetDelegate(), new TileWithHalfPieWidgetDelegate(), new ChartWithDetailsLoadingWidgetDelegate(), new ComparisonBarsTileWidgetDelegate(), new CellWithLinearGaugeWidgetDelegate(), new HorizontalBarsTileWidgetDelegate(), new BarChartWidgetDelegate(), new CellWithLinearProgressDelegate(), new CardWidgetDelegate(), new CardWidgetLoadingDelegate(), new CardsWidgetAnimatedEmptyStateDelegate(), new IconGridWidgetDelegate(), new CalendarListWidgetDelegate(), new InputWidgetDelegate(), new InputLoadingWidgetDelegate(), new TravelModeWidgetDelegate(), new TravelModeLoadingWidgetDelegate(), new EarthMapWidgetDelegate(), new EarthMapLoadingWidgetDelegate(), new FullScreenStateWidgetDelegate(), new TrackingProgressWidgetDelegate(), new TrackingProgressLoadingWidgetDelegate(), new TrackingProgressEmptyWidgetDelegate(), new AccessPassWidgetDelegate(), new GoalProgressEmptyWidgetDelegate(), new GoalProgressTileWidgetDelegate(), new GoalProgressLoadingTileWidgetDelegate(), new EsimCarouselWidgetDelegate(), new PhotoBannerWidgetDelegate(), new TilePaginatedGridWidgetDelegate());
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            ((BaseDraggableWidgetDelegate) listK.get(i)).d = true;
        }
        return listK;
    }
}
