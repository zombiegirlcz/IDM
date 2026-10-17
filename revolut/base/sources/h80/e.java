package h80;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class e implements LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f149934a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f149935b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile LifecycleRegistry f149936c;

    public static final class a extends Lifecycle {
        @Override // androidx.lifecycle.Lifecycle
        public final void addObserver(LifecycleObserver observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            e.a().addObserver(observer);
        }

        @Override // androidx.lifecycle.Lifecycle
        /* JADX INFO: renamed from: getCurrentState */
        public final Lifecycle.State getState() {
            return e.a().getState();
        }

        @Override // androidx.lifecycle.Lifecycle
        public final void removeObserver(LifecycleObserver observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            e.a().removeObserver(observer);
        }
    }

    private e() {
    }

    public static final LifecycleRegistry a() {
        e eVar = f149934a;
        LifecycleRegistry lifecycleRegistry = f149936c;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        if (Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
            return eVar.b();
        }
        synchronized (eVar) {
            LifecycleRegistry lifecycleRegistry2 = f149936c;
            if (lifecycleRegistry2 != null) {
                return lifecycleRegistry2;
            }
            CompletableFuture completableFuture = new CompletableFuture();
            new Handler(Looper.getMainLooper()).post(new androidx.view.d(completableFuture, 13));
            Object obj2 = completableFuture.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            return (LifecycleRegistry) obj2;
        }
    }

    public final LifecycleRegistry b() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        LifecycleRegistry lifecycleRegistry = f149936c;
        ref$ObjectRef.f186409a = lifecycleRegistry;
        if (lifecycleRegistry == null) {
            ref$ObjectRef.f186409a = LifecycleRegistry.INSTANCE.createUnsafe(this);
            ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(new f(ref$ObjectRef));
            f149936c = (LifecycleRegistry) ref$ObjectRef.f186409a;
        }
        return (LifecycleRegistry) ref$ObjectRef.f186409a;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return f149935b;
    }
}
