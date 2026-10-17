package sri;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jpf.a f265232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nri.b f265233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xri.b f265234c;
    public final /* synthetic */ Fragment d;

    public e(jpf.a aVar, nri.b bVar, xri.b bVar2, Fragment fragment) {
        this.f265232a = aVar;
        this.f265233b = bVar;
        this.f265234c = bVar2;
        this.d = fragment;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f265232a.getClass();
        jpf.a.o(this.f265233b).removeView(this.f265234c);
        this.d.getLifecycle().removeObserver(this);
    }
}
