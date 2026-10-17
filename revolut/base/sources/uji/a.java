package uji;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import wji.d;
import wji.g;
import yji.q;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f280630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KompotFragment f280631b;

    public a(b bVar, KompotFragment kompotFragment) {
        this.f280630a = bVar;
        this.f280631b = kompotFragment;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        q qVarB = this.f280630a.b();
        d dVar = qVarB.d;
        com.revolut.kompot.navigable.a aVar = qVarB.k;
        if (aVar != null) {
            dVar.remove(aVar.D2());
        }
        g gVar = (g) dVar;
        gVar.f298144b = null;
        gVar.f298145c = null;
        this.f280631b.getViewLifecycleOwner().getLifecycle().removeObserver(this);
    }
}
