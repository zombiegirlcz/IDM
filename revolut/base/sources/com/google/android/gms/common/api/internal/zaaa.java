package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes16.dex */
final class zaaa implements zaca {
    private final Context zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final zabe f37815zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Looper f37816zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final zabi f37817zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final zabi f37818zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final Map f37819zaf;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private final Api.Client f37821zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private Bundle f37822zai;

    /* JADX INFO: renamed from: zam, reason: collision with root package name */
    private final Lock f37825zam;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private final Set f37820zag = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private ConnectionResult f37823zaj = null;
    private ConnectionResult zak = null;

    /* JADX INFO: renamed from: zal, reason: collision with root package name */
    private boolean f37824zal = false;
    private int zan = 0;

    /* JADX WARN: Multi-variable type inference failed */
    private zaaa(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.zaa = context;
        this.f37815zab = zabeVar;
        this.f37825zam = lock;
        this.f37816zac = looper;
        this.f37821zah = client;
        this.f37817zad = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zax(this, null));
        this.f37818zae = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, 0 == true ? 1 : 0));
        ArrayMap arrayMap = new ArrayMap();
        Iterator it8 = map2.keySet().iterator();
        while (it8.hasNext()) {
            arrayMap.put((Api.AnyClientKey) it8.next(), this.f37817zad);
        }
        Iterator it9 = map.keySet().iterator();
        while (it9.hasNext()) {
            arrayMap.put((Api.AnyClientKey) it9.next(), this.f37818zae);
        }
        this.f37819zaf = Collections.unmodifiableMap(arrayMap);
    }

    private final void zaA(ConnectionResult connectionResult) {
        int i = this.zan;
        if (i == 1) {
            zaB();
        } else if (i != 2) {
            new Exception();
        } else {
            this.f37815zab.zaa(connectionResult);
            zaB();
        }
        this.zan = 0;
    }

    private final void zaB() {
        Iterator it8 = this.f37820zag.iterator();
        while (it8.hasNext()) {
            ((SignInConnectionListener) it8.next()).onComplete();
        }
        this.f37820zag.clear();
    }

    private final boolean zaC() {
        ConnectionResult connectionResult = this.zak;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaD(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = (zabi) this.f37819zaf.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.f37818zae);
    }

    private static boolean zaE(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static zaaa zag(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                arrayMap.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                arrayMap2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.checkState(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (Api api2 : map2.keySet()) {
            Api.AnyClientKey anyClientKeyZab = api2.zab();
            if (arrayMap.containsKey(anyClientKeyZab)) {
                arrayMap3.put(api2, (Boolean) map2.get(api2));
            } else {
                if (!arrayMap2.containsKey(anyClientKeyZab)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                arrayMap4.put(api2, (Boolean) map2.get(api2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zat zatVar = (zat) arrayList.get(i);
            if (arrayMap3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else {
                if (!arrayMap4.containsKey(zatVar.zaa)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zatVar);
            }
        }
        return new zaaa(context, zabeVar, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    public static /* bridge */ /* synthetic */ void zan(zaaa zaaaVar, int i, boolean z) {
        zaaaVar.f37815zab.zac(i, z);
        zaaaVar.zak = null;
        zaaaVar.f37823zaj = null;
    }

    public static /* bridge */ /* synthetic */ void zao(zaaa zaaaVar, Bundle bundle) {
        Bundle bundle2 = zaaaVar.f37822zai;
        if (bundle2 == null) {
            zaaaVar.f37822zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void zap(zaaa zaaaVar) {
        ConnectionResult connectionResult;
        if (!zaE(zaaaVar.f37823zaj)) {
            if (zaaaVar.f37823zaj != null && zaE(zaaaVar.zak)) {
                zaaaVar.f37818zae.zar();
                zaaaVar.zaA((ConnectionResult) Preconditions.checkNotNull(zaaaVar.f37823zaj));
                return;
            }
            ConnectionResult connectionResult2 = zaaaVar.f37823zaj;
            if (connectionResult2 == null || (connectionResult = zaaaVar.zak) == null) {
                return;
            }
            if (zaaaVar.f37818zae.f37871zaf < zaaaVar.f37817zad.f37871zaf) {
                connectionResult2 = connectionResult;
            }
            zaaaVar.zaA(connectionResult2);
            return;
        }
        if (zaE(zaaaVar.zak) || zaaaVar.zaC()) {
            int i = zaaaVar.zan;
            if (i == 1) {
                zaaaVar.zaB();
            } else if (i != 2) {
                new AssertionError();
            } else {
                ((zabe) Preconditions.checkNotNull(zaaaVar.f37815zab)).zab(zaaaVar.f37822zai);
                zaaaVar.zaB();
            }
            zaaaVar.zan = 0;
            return;
        }
        ConnectionResult connectionResult3 = zaaaVar.zak;
        if (connectionResult3 != null) {
            if (zaaaVar.zan == 1) {
                zaaaVar.zaB();
            } else {
                zaaaVar.zaA(connectionResult3);
                zaaaVar.f37817zad.zar();
            }
        }
    }

    private final PendingIntent zaz() {
        Api.Client client = this.f37821zah;
        if (client == null) {
            return null;
        }
        return PendingIntent.getActivity(this.zaa, System.identityHashCode(this.f37815zab), client.getSignInIntent(), com.google.android.gms.internal.base.zap.zaa | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j2, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(@NonNull Api api2) {
        return Objects.equal(this.f37819zaf.get(api2.zab()), this.f37818zae) ? zaC() ? new ConnectionResult(4, zaz()) : this.f37818zae.zad(api2) : this.f37817zad.zad(api2);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zae(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            this.f37817zad.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        if (zaC()) {
            apiMethodImpl.setFailedResult(new Status(4, (String) null, zaz()));
            return apiMethodImpl;
        }
        this.f37818zae.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            return this.f37817zad.zaf(apiMethodImpl);
        }
        if (!zaC()) {
            return this.f37818zae.zaf(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new Status(4, (String) null, zaz()));
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.zan = 2;
        this.f37824zal = false;
        this.zak = null;
        this.f37823zaj = null;
        this.f37817zad.zaq();
        this.f37818zae.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.zak = null;
        this.f37823zaj = null;
        this.zan = 0;
        this.f37817zad.zar();
        this.f37818zae.zar();
        zaB();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f37818zae.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f37817zad.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.f37817zad.zat();
        this.f37818zae.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.f37825zam.lock();
        try {
            boolean zZax = zax();
            this.f37818zae.zar();
            this.zak = new ConnectionResult(4);
            if (zZax) {
                new com.google.android.gms.internal.base.zau(this.f37816zac).post(new zav(this));
            } else {
                zaB();
            }
            this.f37825zam.unlock();
        } catch (Throwable th10) {
            this.f37825zam.unlock();
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zaw() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f37825zam
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.f37817zad     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.zabi r0 = r3.f37818zae     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.zaC()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.zan     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = r2
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r0 = r3.f37825zam
            r0.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r1 = r3.f37825zam
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.zaw():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.f37825zam.lock();
        try {
            return this.zan == 2;
        } finally {
            this.f37825zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.f37825zam.lock();
        try {
            boolean z = false;
            if (zax() || zaw()) {
                if (!this.f37818zae.zaw()) {
                    this.f37820zag.add(signInConnectionListener);
                    z = true;
                    if (this.zan == 0) {
                        this.zan = 1;
                    }
                    this.zak = null;
                    this.f37818zae.zaq();
                }
            }
            this.f37825zam.unlock();
            return z;
        } catch (Throwable th10) {
            this.f37825zam.unlock();
            throw th10;
        }
    }
}
