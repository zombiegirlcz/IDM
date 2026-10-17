package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class p60 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f165774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f165775c;
    public final /* synthetic */ PromptContentDelegate d;
    public final /* synthetic */ PromptContentDelegate.Model e;

    public /* synthetic */ p60(PromptContentDelegate.Model model, py0.b bVar, PromptContentDelegate promptContentDelegate, PromptContentDelegate.Model model2, int i) {
        this.f165773a = i;
        this.f165774b = model;
        this.f165775c = bVar;
        this.d = promptContentDelegate;
        this.e = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f165773a) {
            case 0:
                h30.l.w(view, view).a(view, this.f165774b, this.f165775c);
                this.d.q().onNext(this.e);
                break;
            default:
                h30.l.w(view, view).a(view, this.f165774b, this.f165775c);
                this.d.d.onNext(this.e);
                break;
        }
    }
}
