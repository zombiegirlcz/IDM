package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class fu implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f164313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ListSubheaderDelegate f164314c;
    public final /* synthetic */ ListSubheaderDelegate.Model d;

    public /* synthetic */ fu(ListSubheaderDelegate.Model model, ListSubheaderDelegate listSubheaderDelegate, ListSubheaderDelegate.Model model2, int i) {
        this.f164312a = i;
        this.f164313b = model;
        this.f164314c = listSubheaderDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f164312a) {
            case 0:
                h30.l.w(view, view).a(view, this.f164313b, null);
                this.f164314c.f52707c.onNext(this.d);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f164313b, null);
                this.f164314c.d.onNext(this.d);
                break;
            default:
                h30.l.w(view, view).a(view, this.f164313b, null);
                this.f164314c.e.onNext(this.d);
                break;
        }
    }
}
