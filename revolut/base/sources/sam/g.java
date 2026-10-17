package sam;

import android.view.OrientationEventListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2m.b f261466a;

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (canDetectOrientation()) {
            c2m.b bVar = this.f261466a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i));
            } else {
                Intrinsics.r("orientationChanged");
                throw null;
            }
        }
    }
}
