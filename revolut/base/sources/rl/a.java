package rl;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.onfido.android.sdk.capture.internal.util.DefaultLifecycleObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public static void onCreate(@NotNull c cVar, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        DefaultLifecycleObserver.DefaultImpls.onCreate(cVar, owner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public static void onDestroy(@NotNull c cVar, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        DefaultLifecycleObserver.DefaultImpls.onDestroy(cVar, owner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public static void onPause(@NotNull c cVar, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        DefaultLifecycleObserver.DefaultImpls.onPause(cVar, owner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public static void onResume(@NotNull c cVar, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        DefaultLifecycleObserver.DefaultImpls.onResume(cVar, owner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public static void onStart(@NotNull c cVar, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        DefaultLifecycleObserver.DefaultImpls.onStart(cVar, owner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public static void onStop(@NotNull c cVar, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        DefaultLifecycleObserver.DefaultImpls.onStop(cVar, owner);
    }
}
