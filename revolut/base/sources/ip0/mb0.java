package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class mb0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f165353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RowDelegate f165354c;
    public final /* synthetic */ RowDelegate.Model d;

    public /* synthetic */ mb0(RowDelegate.Model model, RowDelegate rowDelegate, RowDelegate.Model model2, int i) {
        this.f165352a = i;
        this.f165353b = model;
        this.f165354c = rowDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f165352a) {
            case 0:
                h30.l.w(view, view).a(view, this.f165353b, null);
                this.f165354c.i.onNext(this.d);
                break;
            default:
                h30.l.w(view, view).a(view, this.f165353b, null);
                this.f165354c.f53219j.onNext(this.d);
                break;
        }
    }
}
