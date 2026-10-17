package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f167076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AmountInputActionsDelegate f167077c;
    public final /* synthetic */ AmountInputActionsDelegate.Model d;

    public /* synthetic */ x0(AmountInputActionsDelegate.Model model, AmountInputActionsDelegate amountInputActionsDelegate, AmountInputActionsDelegate.Model model2, int i) {
        this.f167075a = i;
        this.f167076b = model;
        this.f167077c = amountInputActionsDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f167075a) {
            case 0:
                h30.l.w(view, view).a(view, this.f167076b, null);
                this.f167077c.f51639g.onNext(this.d);
                break;
            default:
                h30.l.w(view, view).a(view, this.f167076b, null);
                this.f167077c.f51640h.onNext(this.d);
                break;
        }
    }
}
