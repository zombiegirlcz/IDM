package au0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorIconDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeWideDelegate;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BasketDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellWithLinearGaugeDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate;
import com.revolut.core.ui_kit.delegates.ChatTooltipDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.delegates.DrivingScoreDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.FeedCollectionDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarMenuImpl$NavBarLabelMenuItemDelegate;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import ip0.oj0;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ py0.d f9234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f9235c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i3(TrackableItem trackableItem, py0.d dVar, Object obj2, Object obj3, int i) {
        this.f9233a = i;
        this.f9235c = trackableItem;
        this.f9234b = dVar;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9233a) {
            case 0:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((NavBarMenuImpl$NavBarLabelMenuItemDelegate) this.d).f57317c.invoke(((LabelNavBarMenuItem) this.e).f59241a);
                break;
            case 1:
                h30.l.w(view, view).a(view, (CustomTrackableComponent) this.f9235c, this.f9234b);
                ((es0.m) this.d).e.onNext((oj0) this.e);
                break;
            case 2:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((ActionCardDelegate) this.d).f51572n.onNext((ActionCardDelegate.Model) this.e);
                break;
            case 3:
                h30.l.w(view, view).a(view, this.f9235c, (py0.c) this.f9234b);
                ((AttributeSelectorIconDelegate) this.d).f51655c.onNext((AttributeSelectorIconDelegate.Model) this.e);
                break;
            case 4:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((AttributeSelectorSmallDelegate) this.d).f51670c.onNext((AttributeSelectorSmallDelegate.Model) this.e);
                break;
            case 5:
                h30.l.w(view, view).a(view, this.f9235c, (py0.c) this.f9234b);
                ((AttributeWideDelegate) this.d).f51683c.onNext((AttributeWideDelegate.Model) this.e);
                break;
            case 6:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((BackgroundSelectionDelegate) this.d).f51692c.onNext((BackgroundSelectionDelegate.Model) this.e);
                break;
            case 7:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((BannerDelegate) this.d).f51699c.onNext((BannerDelegate.Model) this.e);
                break;
            case 8:
                h30.l.w(view, view).a(view, this.f9235c, (py0.c) this.f9234b);
                ((BasketDelegate) this.d).f51715c.onNext((BasketDelegate.Model) this.e);
                break;
            case 9:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((BigTileDelegate) this.d).d.onNext((BigTileDelegate.Model) this.e);
                break;
            case 10:
                h30.l.w(view, view).a(view, this.f9235c, (py0.c) this.f9234b);
                ((CalendarRowDelegate) this.d).f.onNext((CalendarRowDelegate.Model) this.e);
                break;
            case 11:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((CellDetailsActionListDelegate) this.d).f51795c.onNext((CellDetailsActionListDelegate.Model) this.e);
                break;
            case 12:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((CellDetailsDelegate) this.d).f.onNext((CellDetailsDelegate.Model) this.e);
                break;
            case 13:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((CellDetailsNoteDelegate) this.d).f.onNext((CellDetailsNoteDelegate.Model) this.e);
                break;
            case 14:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((CellDetailsSingleButtonDelegate) this.d).e.onNext((CellDetailsSingleButtonDelegate.Model) this.e);
                break;
            case 15:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((CellDetailsStandaloneNoteDelegate) this.d).d.onNext((CellDetailsStandaloneNoteDelegate.Model) this.e);
                break;
            case 16:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((CellWithLinearGaugeDelegate) this.d).e.onNext((CellWithLinearGaugeDelegate.Model) this.e);
                break;
            case 17:
                h30.l.w(view, view).a(view, this.f9235c, (py0.c) this.f9234b);
                ((CenteredContentTileDelegate) this.d).e.onNext((CenteredContentTileDelegate.Model) this.e);
                break;
            case 18:
                h30.l.w(view, view).a(view, this.f9235c, (py0.c) this.f9234b);
                ((ChallengeMediumImageCardDelegate) this.d).f52013c.onNext((ChallengeMediumImageCardDelegate.Model) this.e);
                break;
            case 19:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((ChatTooltipDelegate) this.d).f52068c.onNext((ChatTooltipDelegate.Model) this.e);
                break;
            case 20:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((CounterTextDelegate) this.d).d.onNext((CounterTextDelegate.Model) this.e);
                break;
            case 21:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((DetailGridItemDelegate) this.d).f52178c.onNext((DetailGridItemDelegate.Model) this.e);
                break;
            case 22:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((DrivingScoreDelegate) this.d).f52207c.onNext((DrivingScoreDelegate.Model) this.e);
                break;
            case 23:
                h30.l.w(view, view).a(view, this.f9235c, (py0.c) this.f9234b);
                ((EsimDelegate) this.d).d.onNext((EsimDelegate.Model) this.e);
                break;
            case 24:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((ExtraSmallCardDelegate) this.d).d.onNext((ExtraSmallCardDelegate.Model) this.e);
                break;
            case 25:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((FeedCollectionDelegate) this.d).e.onNext((FeedCollectionDelegate.Model) this.e);
                break;
            case 26:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((HeroBannerDelegate) this.d).d.onNext((HeroBannerDelegate.Model) this.e);
                break;
            case 27:
                h30.l.w(view, view).a(view, this.f9235c, (py0.c) this.f9234b);
                ((HybridTileDelegate) this.d).f52467c.onNext((HybridTileDelegate.Model) this.e);
                break;
            case 28:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((HybridTileDelegate) this.d).d.onNext((HybridTileDelegate.Model) this.e);
                break;
            default:
                h30.l.w(view, view).a(view, this.f9235c, this.f9234b);
                ((InputChecklistDelegate) this.d).d.onNext((InputChecklistDelegate.Model) this.e);
                break;
        }
    }
}
