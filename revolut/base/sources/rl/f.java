package rl;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rea.j;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements c {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f254903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Navigator f254904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnfidoConfig f254905c;
    public final ActivityResultRegistry d;
    public ActivityResultLauncher e;
    public final PublishSubject f;

    public f(Context context, Navigator navigator, OnfidoConfig onfidoConfig, ActivityResultRegistry activityResultRegistry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(activityResultRegistry, "activityResultRegistry");
        this.f254903a = context;
        this.f254904b = navigator;
        this.f254905c = onfidoConfig;
        this.d = activityResultRegistry;
        this.f = ch.qos.logback.core.util.a.n("create(...)");
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        a.onCreate(this, owner);
        ActivityResultLauncher activityResultLauncherRegister = this.d.register(ib.b.Workflow, owner, new ActivityResultContracts$StartActivityForResult(), new j(this, 23));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegister, "register(...)");
        this.e = activityResultLauncherRegister;
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DefaultLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        a.onDestroy(this, lifecycleOwner);
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DefaultLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        a.onPause(this, lifecycleOwner);
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DefaultLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        a.onResume(this, lifecycleOwner);
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DefaultLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        a.onStart(this, lifecycleOwner);
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DefaultLifecycleObserver
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        a.onStop(this, lifecycleOwner);
    }
}
