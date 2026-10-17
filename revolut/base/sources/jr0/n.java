package jr0;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.revolut.RevGhostViewFacade;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RevGhostViewFacade f177920b;

    public n(View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f177919a = target;
    }

    @Override // jr0.l
    public final void b() {
        RevGhostViewFacade revGhostViewFacade = this.f177920b;
        if (revGhostViewFacade != null) {
            revGhostViewFacade.detach();
        }
        this.f177920b = null;
    }

    @Override // jr0.l
    public final void onStart() {
        if (this.f177920b != null) {
            return;
        }
        View view = this.f177919a;
        ViewGroup viewGroup = (ViewGroup) view.getRootView().findViewById(R.id.content);
        if (viewGroup == null) {
            return;
        }
        RevGhostViewFacade revGhostViewFacade = new RevGhostViewFacade(view);
        revGhostViewFacade.attach(viewGroup);
        this.f177920b = revGhostViewFacade;
    }
}
