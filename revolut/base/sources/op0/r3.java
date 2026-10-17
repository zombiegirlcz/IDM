package op0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QrCodeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TrackingProgressEmptyWidgetDelegate;
import com.revolut.core.ui_kit.internal.delegates.SelectableIconDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.core.ui_kit.internal.popups.PopupMenuItemDelegate;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class r3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f227402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f227403c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TrackableItem e;

    public /* synthetic */ r3(TrackableItem trackableItem, py0.c cVar, Object obj2, TrackableItem trackableItem2, int i) {
        this.f227401a = i;
        this.f227402b = trackableItem;
        this.f227403c = cVar;
        this.d = obj2;
        this.e = trackableItem2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f227401a) {
            case 0:
                h30.l.w(view, view).a(view, this.f227402b, this.f227403c);
                QrCodeWidgetDelegate qrCodeWidgetDelegate = (QrCodeWidgetDelegate) this.d;
                QrCodeWidgetDelegate.Model model = (QrCodeWidgetDelegate.Model) this.e;
                qrCodeWidgetDelegate.r(model, new com.revolut.core.ui_kit.delegates.widgets.z2(model.f55212b, model));
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f227402b, (py0.c) this.f227403c);
                TrackingProgressEmptyWidgetDelegate trackingProgressEmptyWidgetDelegate = (TrackingProgressEmptyWidgetDelegate) this.d;
                ihm.f fVar = trackingProgressEmptyWidgetDelegate.f55259h;
                TrackingProgressEmptyWidgetDelegate.Model model2 = (TrackingProgressEmptyWidgetDelegate.Model) this.e;
                fVar.onNext(model2);
                trackingProgressEmptyWidgetDelegate.r(model2, new com.revolut.core.ui_kit.delegates.widgets.i(model2.f55260b, model2));
                break;
            case 2:
                h30.l.w(view, view).a(view, this.f227402b, this.f227403c);
                ((SelectableIconDelegate) this.d).d.onNext((IconSelectorDelegate.SelectableIconModel) this.e);
                break;
            case 3:
                h30.l.w(view, view).a(view, (SuggestionsBarDelegate.Suggestion) this.f227402b, this.f227403c);
                ((SuggestionDelegate) this.d).d.onNext((SuggestionsBarDelegate.Suggestion) this.e);
                break;
            case 4:
                h30.l.w(view, view).a(view, (NavBarMessage) this.f227402b, this.f227403c);
                NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) this.d;
                if (navBarWithContainerHeaderView.c0 == 0) {
                    navBarWithContainerHeaderView.U.onNext((NavBarMessage) this.e);
                }
                break;
            default:
                h30.l.w(view, view).a(view, this.f227402b, this.f227403c);
                ((PopupMenuItemDelegate) this.d).f56052c.b((PopupMenuItem) this.e);
                break;
        }
    }
}
