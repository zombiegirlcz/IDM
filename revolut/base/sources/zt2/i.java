package zt2;

import android.telephony.TelephonyCallback;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends TelephonyCallback implements TelephonyCallback.CallStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f325061a;

    public i(c phoneCallCallback) {
        Intrinsics.checkNotNullParameter(phoneCallCallback, "phoneCallCallback");
        this.f325061a = phoneCallCallback;
    }

    public final void onCallStateChanged(int i) {
        if (i != 0) {
            if (i != 2) {
                return;
            }
            this.f325061a.f325053j.k(Boolean.TRUE);
        } else {
            c cVar = this.f325061a;
            z1 z1Var = cVar.f325053j;
            Boolean bool = Boolean.FALSE;
            z1Var.k(bool);
            cVar.k.k(bool);
        }
    }
}
