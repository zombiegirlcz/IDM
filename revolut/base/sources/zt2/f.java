package zt2;

import android.telephony.PhoneStateListener;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends PhoneStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f325058a;

    public f(c phoneCallCallback) {
        Intrinsics.checkNotNullParameter(phoneCallCallback, "phoneCallCallback");
        this.f325058a = phoneCallCallback;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        super.onCallStateChanged(i, str);
        c cVar = this.f325058a;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            cVar.f325053j.k(Boolean.TRUE);
        } else {
            z1 z1Var = cVar.f325053j;
            Boolean bool = Boolean.FALSE;
            z1Var.k(bool);
            cVar.k.k(bool);
        }
    }
}
