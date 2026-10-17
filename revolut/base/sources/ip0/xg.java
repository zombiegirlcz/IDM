package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class xg implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f167167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExtraLargeListingCardDelegate f167168c;
    public final /* synthetic */ ExtraLargeListingCardDelegate.Model d;

    public /* synthetic */ xg(ExtraLargeListingCardDelegate.Model model, ExtraLargeListingCardDelegate extraLargeListingCardDelegate, ExtraLargeListingCardDelegate.Model model2, int i) {
        this.f167166a = i;
        this.f167167b = model;
        this.f167168c = extraLargeListingCardDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f167166a) {
            case 0:
                h30.l.w(view, view).a(view, this.f167167b, null);
                this.f167168c.e.onNext(this.d);
                break;
            default:
                h30.l.w(view, view).a(view, this.f167167b, null);
                this.f167168c.f52268h.onNext(this.d);
                break;
        }
    }
}
