package xt0;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jv0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f308737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f308738b;

    public b(LifecycleOwner lifecycleOwner, a aVar) {
        this.f308737a = lifecycleOwner;
        this.f308738b = aVar;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        this.f308737a.getLifecycle().removeObserver(this);
        LinkedHashSet linkedHashSet = this.f308738b.f308736a;
        ArrayList arrayList = d.f178736a;
        Iterator it8 = linkedHashSet.iterator();
        while (it8.hasNext()) {
            d.b((ExoPlayer) it8.next());
        }
        linkedHashSet.clear();
    }
}
