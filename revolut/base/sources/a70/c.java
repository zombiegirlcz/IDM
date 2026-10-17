package a70;

import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import jo0.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseDelegatesActivity f1712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f1713b = new a(this, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1714c = new b(this, 0);

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(BaseDelegatesActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (((Boolean) g.f176833q.getValue()).booleanValue() && !Intrinsics.f(this.f1712a, activity) && activity.getRequestedOrientation() == 1) {
            BaseDelegatesActivity baseDelegatesActivity = this.f1712a;
            a aVar = this.f1713b;
            b bVar = this.f1714c;
            if (baseDelegatesActivity != null) {
                this.f1712a = null;
                baseDelegatesActivity.getLifecycle().removeObserver(bVar);
                baseDelegatesActivity.removeOnMultiWindowModeChangedListener(aVar);
            }
            this.f1712a = activity;
            if (activity.isInMultiWindowMode()) {
                activity.setRequestedOrientation(-1);
            }
            activity.getLifecycle().addObserver(bVar);
            activity.addOnMultiWindowModeChangedListener(aVar);
        }
    }
}
