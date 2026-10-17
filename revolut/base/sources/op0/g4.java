package op0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class g4 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f227275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f227276c;
    public final /* synthetic */ SimpleTileWidgetDelegate d;
    public final /* synthetic */ SimpleTileWidgetDelegate.Model e;

    public /* synthetic */ g4(SimpleTileWidgetDelegate.Model model, py0.c cVar, SimpleTileWidgetDelegate simpleTileWidgetDelegate, SimpleTileWidgetDelegate.Model model2, int i) {
        this.f227274a = i;
        this.f227275b = model;
        this.f227276c = cVar;
        this.d = simpleTileWidgetDelegate;
        this.e = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f227274a) {
            case 0:
                h30.l.w(view, view).a(view, this.f227275b, this.f227276c);
                SimpleTileWidgetDelegate.Model model = this.e;
                this.d.r(model, new com.revolut.core.ui_kit.delegates.widgets.h4(model.f55232b, model));
                break;
            default:
                h30.l.w(view, view).a(view, this.f227275b, this.f227276c);
                SimpleTileWidgetDelegate.Model model2 = this.e;
                this.d.r(model2, new com.revolut.core.ui_kit.delegates.widgets.a4(model2.f55232b, model2));
                break;
        }
    }
}
