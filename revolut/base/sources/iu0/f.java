package iu0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View[] f168436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatorSet f168437b;

    public f(View[] dots) {
        Intrinsics.checkNotNullParameter(dots, "dots");
        this.f168436a = dots;
        this.f168437b = new AnimatorSet();
        ArrayList arrayList = new ArrayList(dots.length);
        for (View view : dots) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.3f, 1.0f));
        }
        this.f168437b.playSequentially(arrayList);
        this.f168437b.setDuration(500 / ((long) 4));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        this.f168437b.pause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        this.f168437b.resume();
    }
}
