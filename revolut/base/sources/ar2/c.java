package ar2;

import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import bi0.f;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import l80.h;
import skm.e0;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq2.d f8504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er2.a f8505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LifecycleOwner f8506c;
    public final f d;
    public final Lazy e;
    public volatile long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f8507g;

    public c(xq2.d detectorSettings, er2.a barcodeScannerErrorsObserver, h systemTimeProvider, LifecycleOwner lifecycleOwner, f msBarcodeDetectorFactory, e legacyMapper) {
        Intrinsics.checkNotNullParameter(detectorSettings, "detectorSettings");
        Intrinsics.checkNotNullParameter(barcodeScannerErrorsObserver, "barcodeScannerErrorsObserver");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(msBarcodeDetectorFactory, "msBarcodeDetectorFactory");
        Intrinsics.checkNotNullParameter(legacyMapper, "legacyMapper");
        this.f8504a = detectorSettings;
        this.f8505b = barcodeScannerErrorsObserver;
        this.f8506c = lifecycleOwner;
        this.d = msBarcodeDetectorFactory;
        this.e = j.b(new aqe.a(this, 2));
        this.f = SystemClock.elapsedRealtime();
        this.f8507g = v0.a.d("create(...)");
    }

    public final void a(xu.e frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        this.f8504a.getClass();
        if (jElapsedRealtime > 0) {
            this.f = SystemClock.elapsedRealtime();
            e0.C(LifecycleOwnerKt.getLifecycleScope(this.f8506c), null, null, new b(this, frame, null), 3);
        }
    }
}
