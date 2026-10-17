package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class xg0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f167170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f167171c;
    public final /* synthetic */ ihm.f d;
    public final /* synthetic */ SplitColumnCellDelegate.Model e;

    public /* synthetic */ xg0(SplitColumnCellDelegate.Model model, py0.d dVar, ihm.f fVar, SplitColumnCellDelegate.Model model2, int i) {
        this.f167169a = i;
        this.f167170b = model;
        this.f167171c = dVar;
        this.d = fVar;
        this.e = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f167169a) {
            case 0:
                h30.l.w(view, view).a(view, this.f167170b, this.f167171c);
                this.d.onNext(this.e);
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f167170b, this.f167171c);
                this.d.onNext(this.e);
                break;
            default:
                h30.l.w(view, view).a(view, this.f167170b, this.f167171c);
                this.d.onNext(this.e);
                break;
        }
    }
}
