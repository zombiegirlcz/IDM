package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;

/* JADX INFO: loaded from: classes19.dex */
public final class ng implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f165506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f165507c;
    public final /* synthetic */ ExpandableCellDelegate d;
    public final /* synthetic */ ExpandableCellDelegate.Model e;

    public /* synthetic */ ng(ExpandableCellDelegate.Model model, py0.d dVar, ExpandableCellDelegate expandableCellDelegate, ExpandableCellDelegate.Model model2, int i) {
        this.f165505a = i;
        this.f165506b = model;
        this.f165507c = dVar;
        this.d = expandableCellDelegate;
        this.e = model2;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f165505a;
        ExpandableCellDelegate.Model model = this.e;
        ExpandableCellDelegate expandableCellDelegate = this.d;
        py0.d dVar = this.f165507c;
        TrackableItem trackableItem = this.f165506b;
        switch (i) {
            case 0:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                expandableCellDelegate.f52255c.onNext(model);
                break;
            default:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                ResourceImage resourceImage = ExpandableCellDelegate.f;
                ((ihm.f) expandableCellDelegate.d.getValue()).onNext(model);
                break;
        }
    }
}
