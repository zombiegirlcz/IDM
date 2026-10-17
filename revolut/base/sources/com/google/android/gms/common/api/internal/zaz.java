package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes16.dex */
final class zaz implements zabz {
    final /* synthetic */ zaaa zaa;

    public /* synthetic */ zaz(zaaa zaaaVar, zay zayVar) {
        this.zaa = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        this.zaa.f37825zam.lock();
        try {
            this.zaa.zak = connectionResult;
            zaaa.zap(this.zaa);
        } finally {
            this.zaa.f37825zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        this.zaa.f37825zam.lock();
        try {
            this.zaa.zak = ConnectionResult.RESULT_SUCCESS;
            zaaa.zap(this.zaa);
        } finally {
            this.zaa.f37825zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        this.zaa.f37825zam.lock();
        try {
            zaaa zaaaVar = this.zaa;
            if (zaaaVar.f37824zal) {
                zaaaVar.f37824zal = false;
                zaaa.zan(this.zaa, i, z);
            } else {
                zaaaVar.f37824zal = true;
                this.zaa.f37817zad.onConnectionSuspended(i);
            }
            this.zaa.f37825zam.unlock();
        } catch (Throwable th10) {
            this.zaa.f37825zam.unlock();
            throw th10;
        }
    }
}
