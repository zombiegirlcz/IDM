package zf;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f321812a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Clock clock = g.f321813j;
        synchronized (g.class) {
            Iterator it8 = g.f321814l.values().iterator();
            while (it8.hasNext()) {
                ((a) it8.next()).c(z);
            }
        }
    }
}
