package mki;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import rp0.m;
import rp0.o;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206463b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f206462a = i;
        this.f206463b = obj2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        switch (this.f206462a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                ((ao.h) this.f206463b).f7848c = null;
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                m mVar = (m) this.f206463b;
                o oVar = mVar.f;
                if (oVar != null) {
                    mVar.f = null;
                    oVar.b();
                }
                mVar.e = null;
                break;
        }
    }
}
