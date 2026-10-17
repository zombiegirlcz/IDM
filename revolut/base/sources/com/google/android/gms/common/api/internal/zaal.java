package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
final class zaal implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final WeakReference zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Api f37833zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final boolean f37834zac;

    public zaal(zaaw zaawVar, Api api2, boolean z) {
        this.zaa = new WeakReference(zaawVar);
        this.f37833zab = api2;
        this.f37834zac = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zaaw zaawVar = (zaaw) this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        Preconditions.checkState(Looper.myLooper() == zaawVar.zaa.f37872zag.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaawVar.f37840zab.lock();
        try {
            if (zaawVar.zaG(0)) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.zaE(connectionResult, this.f37833zab, this.f37834zac);
                }
                if (zaawVar.zaH()) {
                    zaawVar.zaF();
                }
            }
        } finally {
            zaawVar.f37840zab.unlock();
        }
    }
}
