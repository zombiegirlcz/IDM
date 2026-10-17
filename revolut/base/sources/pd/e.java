package pd;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f235019a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized (g.k) {
            try {
                for (g gVar : new ArrayList(g.f235022l.values())) {
                    if (gVar.e.get()) {
                        Iterator it8 = gVar.i.iterator();
                        while (it8.hasNext()) {
                            g gVar2 = ((d) it8.next()).f235018a;
                            if (!z) {
                                ((af.e) gVar2.f235027h.get()).a();
                            }
                        }
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
