package zt2;

import a41.g0;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f325062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f325063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f325064c;

    public j(TelephonyManager telephonyManager, Executor executor) {
        Intrinsics.checkNotNullParameter(telephonyManager, "telephonyManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f325062a = telephonyManager;
        this.f325063b = executor;
    }

    @Override // zt2.h
    public final void a(c phoneCallCallback) {
        Intrinsics.checkNotNullParameter(phoneCallCallback, "phoneCallCallback");
        i iVar = new i(phoneCallCallback);
        this.f325064c = iVar;
        g0.s(this.f325062a, this.f325063b, iVar);
    }

    @Override // zt2.h
    public final void onStop() {
        i iVar = this.f325064c;
        if (iVar != null) {
            g0.r(this.f325062a, u3.a.h(iVar));
        }
    }
}
