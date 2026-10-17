package androidx.lifecycle;

import androidx.content.fragment.FragmentNavigator;
import androidx.content.internal.NavControllerImpl;
import androidx.lifecycle.Lifecycle;
import androidx.os.internal.SavedStateRegistryImpl;
import aw.k;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.revolut.camerakit.core.settings.VideoWatermark;
import dw.e;
import dw.h;
import dw.u;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7441b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f7440a = i;
        this.f7441b = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f7440a) {
            case 0:
                Lifecycle._get_currentStateFlow_$lambda$0((j2) this.f7441b, lifecycleOwner, event);
                break;
            case 1:
                k kVar = (k) this.f7441b;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (aw.b.f10138a[event.ordinal()] == 1) {
                    h hVar = ((dw.b) kVar.f10181j.get()).f118164b;
                    hVar.d.execute(new e(hVar, 1));
                    if (kVar.f10178c.a() instanceof VideoWatermark.Enabled) {
                        h hVar2 = ((u) kVar.f10182l.get()).f118224b;
                        hVar2.d.execute(new e(hVar2, 1));
                    }
                }
                break;
            case 2:
                LifecycleAwareDialog.observer$lambda$0((LifecycleAwareDialog) this.f7441b, lifecycleOwner, event);
                break;
            case 3:
                SavedStateRegistryImpl.performAttach$lambda$12((SavedStateRegistryImpl) this.f7441b, lifecycleOwner, event);
                break;
            case 4:
                FragmentNavigator.fragmentObserver$lambda$1((FragmentNavigator) this.f7441b, lifecycleOwner, event);
                break;
            default:
                NavControllerImpl.lifecycleObserver$lambda$1((NavControllerImpl) this.f7441b, lifecycleOwner, event);
                break;
        }
    }
}
