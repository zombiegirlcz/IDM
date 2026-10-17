package hy0;

import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.revolut.core.ui_kit.views.stories.StoriesPagerView;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public final class f implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f156626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoriesPagerView f156627b;

    public f(StoriesPagerView storiesPagerView) {
        this.f156627b = storiesPagerView;
        this.f156626a = w.y0(new a(storiesPagerView, 1));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private final void onStart() {
        ContextCompat.registerReceiver(this.f156627b.getContext(), (e) this.f156626a.getValue(), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"), 4);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private final void onStop() {
        this.f156627b.getContext().unregisterReceiver((e) this.f156626a.getValue());
    }
}
