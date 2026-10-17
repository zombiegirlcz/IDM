package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes16.dex */
public final class zabi implements zaca, zau {
    final Map zaa;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final ClientSettings f37868zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    final Map f37869zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    final Api.AbstractClientBuilder f37870zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    int f37871zaf;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    final zabe f37872zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    final zabz f37873zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final Lock f37874zai;

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private final Condition f37875zaj;
    private final Context zak;

    /* JADX INFO: renamed from: zal, reason: collision with root package name */
    private final GoogleApiAvailabilityLight f37876zal;

    /* JADX INFO: renamed from: zam, reason: collision with root package name */
    private final zabh f37877zam;
    private volatile zabf zan;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final Map f37867zab = new HashMap();
    private ConnectionResult zao = null;

    public zabi(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList, zabz zabzVar) {
        this.zak = context;
        this.f37874zai = lock;
        this.f37876zal = googleApiAvailabilityLight;
        this.zaa = map;
        this.f37868zac = clientSettings;
        this.f37869zad = map2;
        this.f37870zae = abstractClientBuilder;
        this.f37872zag = zabeVar;
        this.f37873zah = zabzVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zat) arrayList.get(i)).zaa(this);
        }
        this.f37877zam = new zabh(this, looper);
        this.f37875zaj = lock.newCondition();
        this.zan = new zaax(this);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f37874zai.lock();
        try {
            this.zan.zag(bundle);
        } finally {
            this.f37874zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f37874zai.lock();
        try {
            this.zan.zai(i);
        } finally {
            this.f37874zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api api2, boolean z) {
        this.f37874zai.lock();
        try {
            this.zan.zah(connectionResult, api2, z);
        } finally {
            this.f37874zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        zaq();
        while (this.zan instanceof zaaw) {
            try {
                this.f37875zaj.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.zan instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zao;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j2, TimeUnit timeUnit) {
        zaq();
        long nanos = timeUnit.toNanos(j2);
        while (this.zan instanceof zaaw) {
            if (nanos <= 0) {
                zar();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.f37875zaj.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.zan instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zao;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(@NonNull Api api2) {
        Map map = this.zaa;
        Api.AnyClientKey anyClientKeyZab = api2.zab();
        if (!map.containsKey(anyClientKeyZab)) {
            return null;
        }
        if (((Api.Client) this.zaa.get(anyClientKeyZab)).isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        if (this.f37867zab.containsKey(anyClientKeyZab)) {
            return (ConnectionResult) this.f37867zab.get(anyClientKeyZab);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zae(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zan.zaa(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        return this.zan.zab(apiMethodImpl);
    }

    public final void zai() {
        this.f37874zai.lock();
        try {
            this.f37872zag.zak();
            this.zan = new zaaj(this);
            this.zan.zad();
            this.f37875zaj.signalAll();
        } finally {
            this.f37874zai.unlock();
        }
    }

    public final void zaj() throws Throwable {
        zabi zabiVar;
        this.f37874zai.lock();
        try {
            zabiVar = this;
            try {
                zabiVar.zan = new zaaw(zabiVar, this.f37868zac, this.f37869zad, this.f37876zal, this.f37870zae, this.f37874zai, this.zak);
                zabiVar.zan.zad();
                zabiVar.f37875zaj.signalAll();
                zabiVar.f37874zai.unlock();
            } catch (Throwable th10) {
                th = th10;
                zabiVar.f37874zai.unlock();
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            zabiVar = this;
        }
    }

    public final void zak(ConnectionResult connectionResult) {
        this.f37874zai.lock();
        try {
            this.zao = connectionResult;
            this.zan = new zaax(this);
            this.zan.zad();
            this.f37875zaj.signalAll();
        } finally {
            this.f37874zai.unlock();
        }
    }

    public final void zal(zabg zabgVar) {
        zabh zabhVar = this.f37877zam;
        zabhVar.sendMessage(zabhVar.obtainMessage(1, zabgVar));
    }

    public final void zam(RuntimeException runtimeException) {
        zabh zabhVar = this.f37877zam;
        zabhVar.sendMessage(zabhVar.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.zan.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        if (this.zan.zaj()) {
            this.f37867zab.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.zan);
        for (Api api2 : this.f37869zad.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) api2.zad()).println(":");
            ((Api.Client) Preconditions.checkNotNull((Api.Client) this.zaa.get(api2.zab()))).dump(strValueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        if (this.zan instanceof zaaj) {
            ((zaaj) this.zan).zaf();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        return this.zan instanceof zaaj;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        return this.zan instanceof zaaw;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        return false;
    }
}
