package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import cw0.a;

/* JADX INFO: loaded from: classes19.dex */
public final class k6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f164965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CellDetailsAttachmentDelegate f164966c;
    public final /* synthetic */ CellDetailsAttachmentDelegate.Model d;

    public /* synthetic */ k6(CellDetailsAttachmentDelegate.Model model, CellDetailsAttachmentDelegate cellDetailsAttachmentDelegate, CellDetailsAttachmentDelegate.Model model2, int i) {
        this.f164964a = i;
        this.f164965b = model;
        this.f164966c = cellDetailsAttachmentDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f164964a) {
            case 0:
                h30.l.w(view, view).a(view, this.f164965b, null);
                this.f164966c.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(this.d, a.C0648a.f109510a));
                break;
            default:
                h30.l.w(view, view).a(view, this.f164965b, null);
                this.f164966c.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(this.d, a.b.f109511a));
                break;
        }
    }
}
