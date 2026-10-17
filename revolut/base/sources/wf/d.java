package wf;

import android.content.Context;
import com.google.firebase.perf.util.i;
import java.util.List;
import java.util.Random;
import xf.m0;
import xf.o0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nf.a f296846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f296847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f296848c;
    public final c d;
    public final c e;

    public d(Context context, i iVar) {
        ah.a aVar = new ah.a(3);
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        nf.a aVarE = nf.a.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        this.f296847b = dNextDouble;
        this.f296848c = dNextDouble2;
        this.f296846a = aVarE;
        this.d = new c(iVar, aVar, aVarE, "Trace");
        this.e = new c(iVar, aVar, aVarE, "Network");
        jh.d.i(context);
    }

    public static boolean a(List list) {
        return list.size() > 0 && ((m0) list.get(0)).getSessionVerbosityCount() > 0 && ((m0) list.get(0)).getSessionVerbosity(0) == o0.GAUGES_AND_SYSTEM_EVENTS;
    }
}
