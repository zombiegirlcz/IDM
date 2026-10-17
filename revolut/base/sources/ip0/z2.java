package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class z2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f167383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerDelegate f167384c;
    public final /* synthetic */ BannerDelegate.Model d;

    public /* synthetic */ z2(BannerDelegate.Model model, BannerDelegate bannerDelegate, BannerDelegate.Model model2, int i) {
        this.f167382a = i;
        this.f167383b = model;
        this.f167384c = bannerDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f167382a) {
            case 0:
                h30.l.w(view, view).a(view, this.f167383b, null);
                this.f167384c.e.onNext(this.d);
                break;
            default:
                h30.l.w(view, view).a(view, this.f167383b, null);
                this.f167384c.e.onNext(this.d);
                break;
        }
    }
}
