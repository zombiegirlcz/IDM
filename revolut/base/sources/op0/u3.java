package op0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class u3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f227445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f227446c;
    public final /* synthetic */ QuickActionWidgetDelegate d;
    public final /* synthetic */ QuickActionWidgetDelegate.Model e;

    public /* synthetic */ u3(QuickActionWidgetDelegate.Model model, py0.c cVar, QuickActionWidgetDelegate quickActionWidgetDelegate, QuickActionWidgetDelegate.Model model2, int i) {
        this.f227444a = i;
        this.f227445b = model;
        this.f227446c = cVar;
        this.d = quickActionWidgetDelegate;
        this.e = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f227444a) {
            case 0:
                h30.l.w(view, view).a(view, this.f227445b, this.f227446c);
                QuickActionWidgetDelegate.Model model = this.e;
                this.d.r(model, new com.revolut.core.ui_kit.delegates.widgets.a3(model.f55217b, model));
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f227445b, this.f227446c);
                QuickActionWidgetDelegate.Model model2 = this.e;
                this.d.r(model2, new com.revolut.core.ui_kit.delegates.widgets.c3(model2.f55217b, model2));
                break;
            case 2:
                h30.l.w(view, view).a(view, this.f227445b, this.f227446c);
                QuickActionWidgetDelegate.Model model3 = this.e;
                this.d.r(model3, new com.revolut.core.ui_kit.delegates.widgets.f3(model3.f55217b, model3));
                break;
            default:
                h30.l.w(view, view).a(view, this.f227445b, this.f227446c);
                QuickActionWidgetDelegate.Model model4 = this.e;
                this.d.r(model4, new com.revolut.core.ui_kit.delegates.widgets.b3(model4.f55217b, model4));
                break;
        }
    }
}
