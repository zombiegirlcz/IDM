package op0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.widgets.AccessPassWidgetDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f227198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccessPassWidgetDelegate f227199c;
    public final /* synthetic */ AccessPassWidgetDelegate.Model d;

    public /* synthetic */ c(AccessPassWidgetDelegate.Model model, AccessPassWidgetDelegate accessPassWidgetDelegate, AccessPassWidgetDelegate.Model model2, int i) {
        this.f227197a = i;
        this.f227198b = model;
        this.f227199c = accessPassWidgetDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f227197a) {
            case 0:
                h30.l.w(view, view).a(view, this.f227198b, null);
                AccessPassWidgetDelegate.Model model = this.d;
                this.f227199c.r(model, new com.revolut.core.ui_kit.delegates.widgets.a(model.f54939b));
                break;
            default:
                h30.l.w(view, view).a(view, this.f227198b, null);
                AccessPassWidgetDelegate.Model model2 = this.d;
                this.f227199c.r(model2, new com.revolut.core.ui_kit.delegates.widgets.b(model2.f54939b));
                break;
        }
    }
}
