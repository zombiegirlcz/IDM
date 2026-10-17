package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class ig implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f164690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f164691c;
    public final /* synthetic */ EsimDetailsDelegate d;
    public final /* synthetic */ EsimDetailsDelegate.Model e;

    public /* synthetic */ ig(TrackableItem trackableItem, py0.c cVar, EsimDetailsDelegate esimDetailsDelegate, EsimDetailsDelegate.Model model, int i) {
        this.f164689a = i;
        this.f164690b = trackableItem;
        this.f164691c = cVar;
        this.d = esimDetailsDelegate;
        this.e = model;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f164689a) {
            case 0:
                h30.l.w(view, view).a(view, this.f164690b, this.f164691c);
                this.d.d.onNext(this.e);
                break;
            default:
                h30.l.w(view, view).a(view, this.f164690b, this.f164691c);
                this.d.e.onNext(this.e);
                break;
        }
    }
}
