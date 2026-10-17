package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zaaj implements zabf {
    private final zabi zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private boolean f37832zab = false;

    public zaaj(zabi zabiVar) {
        this.zaa = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zaa(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zab(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        try {
            this.zaa.f37872zag.f37863zai.zaa(apiMethodImpl);
            zabe zabeVar = this.zaa.f37872zag;
            Api.Client client = (Api.Client) zabeVar.f37857zac.get(apiMethodImpl.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.zaa.f37867zab.containsKey(apiMethodImpl.getClientKey())) {
                apiMethodImpl.run(client);
                return apiMethodImpl;
            }
            apiMethodImpl.setFailedResult(new Status(17));
            return apiMethodImpl;
        } catch (DeadObjectException unused) {
            this.zaa.zal(new zaah(this, this));
            return apiMethodImpl;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        if (this.f37832zab) {
            this.f37832zab = false;
            this.zaa.zal(new zaai(this, this));
        }
    }

    public final void zaf() {
        if (this.f37832zab) {
            this.f37832zab = false;
            this.zaa.f37872zag.f37863zai.zab();
            zaj();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api api2, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
        this.zaa.zak(null);
        this.zaa.f37873zah.zac(i, this.f37832zab);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        if (this.f37832zab) {
            return false;
        }
        Set set = this.zaa.f37872zag.f37862zah;
        if (set == null || set.isEmpty()) {
            this.zaa.zak(null);
            return true;
        }
        this.f37832zab = true;
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((zada) it8.next()).zah();
        }
        return false;
    }
}
