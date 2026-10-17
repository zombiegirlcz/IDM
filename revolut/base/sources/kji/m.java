package kji;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kji.l;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l.a f184417a;

    public m(l.a aVar) {
        this.f184417a = aVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        z1 z1Var = nhi.k.f215504a;
        nhi.k.a(this.f184417a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        z1 z1Var = nhi.k.f215504a;
        nhi.k.b(this.f184417a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        l.a aVar = this.f184417a;
        com.revolut.kompot.navigable.a aVar2 = aVar.e;
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
    }
}
