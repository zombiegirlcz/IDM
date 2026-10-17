package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class bp implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f163650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f163651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HybridTileDelegate f163652c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;

    public bp(HybridTileDelegate.Model model, boolean z, HybridTileDelegate hybridTileDelegate, List list, int i) {
        this.f163650a = model;
        this.f163651b = z;
        this.f163652c = hybridTileDelegate;
        this.d = list;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h30.l.w(view, view).a(view, this.f163650a, null);
        if (this.f163651b) {
            this.f163652c.e.onNext(this.d.get(this.e));
        }
    }
}
