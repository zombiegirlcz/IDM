package nv0;

import android.view.View;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f219383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f219384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f219385c;

    public p(TrackableItem trackableItem, n nVar, int i) {
        this.f219383a = trackableItem;
        this.f219384b = nVar;
        this.f219385c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h30.l.w(view, view).a(view, this.f219383a, null);
        this.f219384b.f.invoke(Integer.valueOf(this.f219385c));
    }
}
