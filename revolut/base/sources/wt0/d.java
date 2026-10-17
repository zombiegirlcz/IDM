package wt0;

import ah0.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299764a;

    public d(List listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f299764a = listeners;
    }

    @Override // ah0.e
    public final void onCameraIdle() {
        Iterator it8 = this.f299764a.iterator();
        while (it8.hasNext()) {
            ((e) it8.next()).onCameraIdle();
        }
    }
}
