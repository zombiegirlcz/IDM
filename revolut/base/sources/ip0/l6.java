package ip0;

import android.view.View;
import android.widget.Button;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.views.NumpadView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class l6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165134c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l6(Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f165132a = i2;
        this.f165134c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f165133b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f165132a) {
            case 0:
                h30.l.w(view, view).a(view, (TrackableItem) this.f165134c, null);
                ihm.f fVar = ((CellDetailsAttachmentDelegate) this.d).f51808c;
                CellDetailsAttachmentDelegate.Model model = (CellDetailsAttachmentDelegate.Model) this.e;
                fVar.onNext(new com.revolut.core.ui_kit.delegates.d2(model, new cw0.c((cw0.i) model.f51811c.get(this.f165133b))));
                break;
            default:
                NumpadView.a((NumpadView) this.f165134c, (Button) this.d);
                ((NumpadView) this.e).f58810a.onNext(Integer.valueOf(this.f165133b));
                break;
        }
    }
}
