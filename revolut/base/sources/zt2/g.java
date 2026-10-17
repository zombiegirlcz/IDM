package zt2;

import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f325059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f325060b;

    public g(TelephonyManager telephonyManager) {
        Intrinsics.checkNotNullParameter(telephonyManager, "telephonyManager");
        this.f325059a = telephonyManager;
    }

    @Override // zt2.h
    public final void a(c phoneCallCallback) {
        Intrinsics.checkNotNullParameter(phoneCallCallback, "phoneCallCallback");
        f fVar = new f(phoneCallCallback);
        this.f325060b = fVar;
        this.f325059a.listen(fVar, 32);
    }

    @Override // zt2.h
    public final void onStop() {
        f fVar = this.f325060b;
        if (fVar != null) {
            this.f325059a.listen(fVar, 0);
        }
    }
}
