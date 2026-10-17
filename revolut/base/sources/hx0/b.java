package hx0;

import androidx.lifecycle.Lifecycle;
import androidx.view.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f156297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f156298b;

    public b(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f156297a = activity;
    }

    public final void a() {
        if (this.f156298b) {
            return;
        }
        ComponentActivity componentActivity = this.f156297a;
        if (componentActivity.isFinishing() || componentActivity.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        this.f156298b = true;
        if (componentActivity.getLifecycle().getState() != Lifecycle.State.CREATED) {
            componentActivity.getLifecycle().addObserver(new a(this));
        } else {
            if (componentActivity.isFinishing()) {
                return;
            }
            componentActivity.finish();
        }
    }
}
