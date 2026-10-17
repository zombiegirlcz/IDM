package uji;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.os.SavedStateRegistry;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import com.revolut.kompot.navigable.root.RootFlow;
import gki.c;
import gki.d;
import gki.j;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import yji.q;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements LifecycleObserver, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootFlow f280632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f280633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f280634c;
    public q d;
    public KompotFragment e;
    public final LinkedHashMap f;

    public b(RootFlow rootFlow, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(rootFlow, "rootFlow");
        this.f280632a = rootFlow;
        this.f280633b = num;
        this.f280634c = z;
        this.f = new LinkedHashMap();
    }

    public final d a(c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj2 = this.f.get(key);
        if (obj2 instanceof d) {
            return (d) obj2;
        }
        return null;
    }

    public final q b() {
        q qVar = this.d;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        SavedStateRegistry savedStateRegistry;
        Lifecycle lifecycle;
        b().d();
        KompotFragment kompotFragment = this.e;
        if (kompotFragment != null && (lifecycle = kompotFragment.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        KompotFragment kompotFragment2 = this.e;
        if (kompotFragment2 != null && (savedStateRegistry = kompotFragment2.getSavedStateRegistry()) != null) {
            savedStateRegistry.unregisterSavedStateProvider("KOMPOT_SAVED_STATE_KEY");
        }
        this.e = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        b().f();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        b().g();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        b().c();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        b().e();
    }
}
