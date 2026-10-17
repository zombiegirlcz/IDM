package mf;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final qf.a e = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f204817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameMetricsAggregator f204818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f204819c;
    public boolean d;

    public f(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.d = false;
        this.f204817a = activity;
        this.f204818b = frameMetricsAggregator;
        this.f204819c = map;
    }

    public final com.google.firebase.perf.util.f a() {
        boolean z = this.d;
        qf.a aVar = e;
        if (!z) {
            aVar.a("No recording has been started.");
            return new com.google.firebase.perf.util.f();
        }
        SparseIntArray[] metrics = this.f204818b.getMetrics();
        if (metrics == null) {
            aVar.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new com.google.firebase.perf.util.f();
        }
        SparseIntArray sparseIntArray = metrics[0];
        if (sparseIntArray == null) {
            aVar.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new com.google.firebase.perf.util.f();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
            int iKeyAt = sparseIntArray.keyAt(i5);
            int iValueAt = sparseIntArray.valueAt(i5);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new com.google.firebase.perf.util.f(new rf.c(i, i2, i3));
    }
}
