package com.onfido.android.sdk.capture.internal.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DefaultLifecycleObserver extends LifecycleObserver {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        public static void onCreate(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public static void onDestroy(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public static void onPause(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public static void onResume(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public static void onStart(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public static void onStop(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop(@NotNull LifecycleOwner owner);
}
