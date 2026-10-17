package au0;

import android.text.Editable;
import android.view.View;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.VoucherBigTileDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.chat.ShimmeringTextBubbleDelegate;
import com.revolut.core.ui_kit.delegates.lh;
import com.revolut.core.ui_kit.delegates.vi;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import com.revolut.core.ui_kit.internal.popups.PopupMenuItemDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.conditional_amount.ConditionalAmountActionChipDelegate;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.TickerTapeView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import ip0.xc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.hb;

/* JADX INFO: loaded from: classes19.dex */
public final class r2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9336c;

    public /* synthetic */ r2(Object obj2, Object obj3, int i) {
        this.f9334a = i;
        this.f9335b = obj2;
        this.f9336c = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9334a) {
            case 0:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9335b, null);
                ((s2) this.f9336c).f9353g.onNext(Unit.f186387a);
                return;
            case 1:
                h30.l.w(view, view).a(view, (ChatParentLayout) this.f9335b, null);
                ((ChatParentLayout) this.f9336c).getOnSideStatusBadgeClick().invoke();
                return;
            case 2:
                Intrinsics.h(view);
                ((ConditionalAmountActionChipDelegate) this.f9335b).f56869c.onNext(((ft0.e) this.f9336c).f137754a);
                return;
            case 3:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9335b, null);
                ((com.revolut.core.ui_kit.delegates.r) this.f9336c).f54649r.onNext(Unit.f186387a);
                return;
            case 4:
                Intrinsics.h(view);
                ((BackgroundSelectionDelegate) this.f9335b).d.onNext((BackgroundSelectionDelegate.Model) this.f9336c);
                return;
            case 5:
                Intrinsics.h(view);
                ((BigTileDelegate) this.f9335b).e.onNext((BigTileDelegate.Model) this.f9336c);
                return;
            case 6:
                Intrinsics.h(view);
                ((ContainerDelegate) this.f9335b).f52124g.onNext((xc) this.f9336c);
                return;
            case 7:
                Intrinsics.h(view);
                ((ExtraLargeListingCardDelegate) this.f9335b).f52266c.onNext((ExtraLargeListingCardDelegate.Model) this.f9336c);
                return;
            case 8:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9335b, null);
                ((ExtraSmallTileDelegate) this.f9336c).e.onNext(null);
                throw null;
            case 9:
                Intrinsics.h(view);
                ((PlanWidgetDelegate) this.f9335b).f52955c.onNext((PlanWidgetDelegate.Model) this.f9336c);
                return;
            case 10:
                Intrinsics.h(view);
                ((ProgressStepVerticalV2Delegate) this.f9335b).d.onNext((ProgressStepVerticalV2Delegate.Model) this.f9336c);
                return;
            case 11:
                Intrinsics.h(view);
                ((VoucherBigTileDelegate) this.f9335b).f53592c.onNext((vi) this.f9336c);
                return;
            case 12:
                Intrinsics.h(view);
                ((VoucherSmallTileDelegate) this.f9335b).d.onNext((VoucherSmallTileDelegate.Model) this.f9336c);
                return;
            case 13:
                Intrinsics.h(view);
                ((ShimmeringTextBubbleDelegate) this.f9335b).k.onNext((ShimmeringTextBubbleDelegate.Model) this.f9336c);
                return;
            case 14:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9335b, null);
                ((Function0) this.f9336c).invoke();
                return;
            case 15:
                Intrinsics.h(view);
                ((ms0.u4) this.f9335b).f208454l.onNext((lh) this.f9336c);
                return;
            case 16:
                Intrinsics.h(view);
                Function1 function1 = ((mx0.a) this.f9335b).f209561b;
                if (function1 != null) {
                    function1.invoke((com.revolut.core.ui_kit.models.b0) this.f9336c);
                    return;
                }
                return;
            case 17:
                h30.l.w(view, view).a(view, (ChatInputView) this.f9335b, null);
                Editable text = ((ChatInputView) this.f9336c).getInput$ui_kit_components_release().getText();
                if (text != null) {
                    text.clear();
                    return;
                }
                return;
            case 18:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9335b, null);
                ((hb) this.f9336c).invoke(aw0.v2.f10570a);
                return;
            case 19:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9335b, null);
                ((TickerTapeView.TickerDelegate) this.f9336c).d.onNext(null);
                throw null;
            case 20:
                Intrinsics.h(view);
                BaseDraggableWidgetDelegate baseDraggableWidgetDelegate = (BaseDraggableWidgetDelegate) this.f9335b;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) this.f9336c;
                or0.u.k(view).n0().a(view, model, model.getF54970q());
                baseDraggableWidgetDelegate.r(model, new com.revolut.core.ui_kit.delegates.widgets.i(model.getF53563a(), model));
                return;
            case 21:
                Intrinsics.h(view);
                PaymentLinkWidgetDelegate paymentLinkWidgetDelegate = (PaymentLinkWidgetDelegate) this.f9335b;
                PaymentLinkWidgetDelegate.Model model2 = (PaymentLinkWidgetDelegate.Model) this.f9336c;
                paymentLinkWidgetDelegate.r(model2, new com.revolut.core.ui_kit.delegates.widgets.q2(model2.f55201b, model2));
                return;
            case 22:
                Intrinsics.h(view);
                RowsWidgetDelegate rowsWidgetDelegate = (RowsWidgetDelegate) this.f9335b;
                RowsWidgetDelegate.Model model3 = (RowsWidgetDelegate.Model) this.f9336c;
                rowsWidgetDelegate.r(model3, new com.revolut.core.ui_kit.delegates.widgets.l3(model3.e));
                return;
            case 23:
                Intrinsics.h(view);
                TilePaginatedGridWidgetDelegate tilePaginatedGridWidgetDelegate = (TilePaginatedGridWidgetDelegate) this.f9335b;
                TilePaginatedGridWidgetDelegate.Model model4 = (TilePaginatedGridWidgetDelegate.Model) this.f9336c;
                tilePaginatedGridWidgetDelegate.r(model4, new com.revolut.core.ui_kit.delegates.widgets.k4(model4.f55249b, model4.f55251g));
                return;
            case 24:
                h30.l.w(view, view).a(view, (BasicNavBar) this.f9335b, null);
                ((BasicNavBar) this.f9336c).f59211b.onNext(Unit.f186387a);
                return;
            case 25:
                h30.l.w(view, view).a(view, (TrackableItem) this.f9335b, null);
                ((NavBarLargeCentred) this.f9336c).o.onNext(Unit.f186387a);
                return;
            default:
                Intrinsics.h(view);
                ((PopupMenuItemDelegate) this.f9335b).f56052c.b((PopupMenuItem) this.f9336c);
                return;
        }
    }
}
