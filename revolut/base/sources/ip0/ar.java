package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class ar implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f163485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f163486c;
    public final /* synthetic */ InputSliderDelegate d;
    public final /* synthetic */ InputSliderDelegate.Model e;

    public /* synthetic */ ar(InputSliderDelegate.Model model, py0.c cVar, InputSliderDelegate inputSliderDelegate, InputSliderDelegate.Model model2, int i) {
        this.f163484a = i;
        this.f163485b = model;
        this.f163486c = cVar;
        this.d = inputSliderDelegate;
        this.e = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f163484a) {
            case 0:
                h30.l.w(view, view).a(view, this.f163485b, this.f163486c);
                this.d.d.onNext(this.e);
                break;
            default:
                h30.l.w(view, view).a(view, this.f163485b, this.f163486c);
                this.d.e.onNext(this.e);
                break;
        }
    }
}
