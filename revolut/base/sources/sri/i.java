package sri;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatActivity f265235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w70.a f265236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce0.b f265237c;
    public final Handler d;
    public boolean e;

    public i(nri.b activity, w70.a androidVersion, ce0.b navigation) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f265235a = activity;
        this.f265236b = androidVersion;
        this.f265237c = navigation;
        this.d = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.d.removeCallbacksAndMessages(null);
        this.e = false;
        this.f265235a.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.d.removeCallbacksAndMessages(null);
        this.e = false;
        super.onPause(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        j.Companion.getClass();
        AppCompatActivity appCompatActivity = this.f265235a;
        if (h.a(appCompatActivity, this.f265236b) || this.e) {
            appCompatActivity.getLifecycle().removeObserver(this);
            this.f265237c.invoke();
        } else {
            this.e = true;
            this.d.post(new p6.e(this, owner, 21));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.d.removeCallbacksAndMessages(null);
        this.e = false;
        super.onStop(owner);
    }
}
