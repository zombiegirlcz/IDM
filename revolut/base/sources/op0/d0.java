package op0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.widgets.CardWidgetDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f227219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f227220c;
    public final /* synthetic */ CardWidgetDelegate d;
    public final /* synthetic */ CardWidgetDelegate.Model e;

    public /* synthetic */ d0(CardWidgetDelegate.Model model, py0.c cVar, CardWidgetDelegate cardWidgetDelegate, CardWidgetDelegate.Model model2, int i) {
        this.f227218a = i;
        this.f227219b = model;
        this.f227220c = cVar;
        this.d = cardWidgetDelegate;
        this.e = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f227218a) {
            case 0:
                h30.l.w(view, view).a(view, this.f227219b, this.f227220c);
                CardWidgetDelegate.Model model = this.e;
                this.d.r(model, new com.revolut.core.ui_kit.delegates.widgets.q(model.f55001b, model));
                break;
            default:
                h30.l.w(view, view).a(view, this.f227219b, this.f227220c);
                CardWidgetDelegate.Model model2 = this.e;
                this.d.r(model2, new com.revolut.core.ui_kit.delegates.widgets.q(model2.f55001b, model2));
                break;
        }
    }
}
