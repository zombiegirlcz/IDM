package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class l20 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f165114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f165115c;
    public final /* synthetic */ PlanTileDelegate d;
    public final /* synthetic */ PlanTileDelegate.Model e;

    public /* synthetic */ l20(PlanTileDelegate.Model model, py0.c cVar, PlanTileDelegate planTileDelegate, PlanTileDelegate.Model model2, int i) {
        this.f165113a = i;
        this.f165114b = model;
        this.f165115c = cVar;
        this.d = planTileDelegate;
        this.e = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f165113a) {
            case 0:
                h30.l.w(view, view).a(view, this.f165114b, this.f165115c);
                this.d.e.onNext(this.e);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f165114b, this.f165115c);
                this.d.f52942c.onNext(this.e);
                break;
            default:
                h30.l.w(view, view).a(view, this.f165114b, this.f165115c);
                this.d.d.onNext(this.e);
                break;
        }
    }
}
