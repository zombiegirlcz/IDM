package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes16.dex */
public final class zaaw implements zabf {
    private final zabi zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Lock f37840zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Context f37841zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final GoogleApiAvailabilityLight f37842zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private ConnectionResult f37843zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private int f37844zaf;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private int f37846zah;
    private com.google.android.gms.signin.zae zak;

    /* JADX INFO: renamed from: zal, reason: collision with root package name */
    private boolean f37849zal;

    /* JADX INFO: renamed from: zam, reason: collision with root package name */
    private boolean f37850zam;
    private boolean zan;
    private IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    private final ClientSettings zar;
    private final Map zas;
    private final Api.AbstractClientBuilder zat;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private int f37845zag = 0;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final Bundle f37847zai = new Bundle();

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private final Set f37848zaj = new HashSet();
    private final ArrayList zau = new ArrayList();

    public zaaw(zabi zabiVar, ClientSettings clientSettings, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder abstractClientBuilder, Lock lock, Context context) {
        this.zaa = zabiVar;
        this.zar = clientSettings;
        this.zas = map;
        this.f37842zad = googleApiAvailabilityLight;
        this.zat = abstractClientBuilder;
        this.f37840zab = lock;
        this.f37841zac = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaA() {
        this.f37850zam = false;
        this.zaa.f37872zag.f37858zad = Collections.EMPTY_SET;
        for (Api.AnyClientKey anyClientKey : this.f37848zaj) {
            if (!this.zaa.f37867zab.containsKey(anyClientKey)) {
                zabi zabiVar = this.zaa;
                zabiVar.f37867zab.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    private final void zaB(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.zak;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.zaa();
            }
            zaeVar.disconnect();
            this.zao = null;
        }
    }

    private final void zaC() {
        this.zaa.zai();
        zabj.zaa().execute(new zaak(this));
        com.google.android.gms.signin.zae zaeVar = this.zak;
        if (zaeVar != null) {
            if (this.zap) {
                zaeVar.zac((IAccountAccessor) Preconditions.checkNotNull(this.zao), this.zaq);
            }
            zaB(false);
        }
        Iterator it8 = this.zaa.f37867zab.keySet().iterator();
        while (it8.hasNext()) {
            ((Api.Client) Preconditions.checkNotNull((Api.Client) this.zaa.zaa.get((Api.AnyClientKey) it8.next()))).disconnect();
        }
        this.zaa.f37873zah.zab(this.f37847zai.isEmpty() ? null : this.f37847zai);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaD(ConnectionResult connectionResult) {
        zaz();
        zaB(!connectionResult.hasResolution());
        this.zaa.zak(connectionResult);
        this.zaa.f37873zah.zaa(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(ConnectionResult connectionResult, Api api2, boolean z) {
        int priority = api2.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.f37842zad.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.f37843zae == null || priority < this.f37844zaf)) {
            this.f37843zae = connectionResult;
            this.f37844zaf = priority;
        }
        zabi zabiVar = this.zaa;
        zabiVar.f37867zab.put(api2.zab(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaF() {
        if (this.f37846zah != 0) {
            return;
        }
        if (!this.f37850zam || this.zan) {
            ArrayList arrayList = new ArrayList();
            this.f37845zag = 1;
            this.f37846zah = this.zaa.zaa.size();
            for (Api.AnyClientKey anyClientKey : this.zaa.zaa.keySet()) {
                if (!this.zaa.f37867zab.containsKey(anyClientKey)) {
                    arrayList.add((Api.Client) this.zaa.zaa.get(anyClientKey));
                } else if (zaH()) {
                    zaC();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.zau.add(zabj.zaa().submit(new zaap(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaG(int i) {
        if (this.f37845zag == i) {
            return true;
        }
        this.zaa.f37872zag.zaf();
        "Unexpected callback in ".concat(toString());
        String str = "mRemainingConnections=" + this.f37846zah;
        StringBuilder sbX = a.x("GoogleApiClient connecting is in step ", zaJ(this.f37845zag), " but received callback for step ");
        sbX.append(zaJ(i));
        sbX.toString();
        new Exception();
        zaD(new ConnectionResult(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaH() {
        int i = this.f37846zah - 1;
        this.f37846zah = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.zaa.f37872zag.zaf();
            new Exception();
            zaD(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f37843zae;
        if (connectionResult == null) {
            return true;
        }
        this.zaa.f37871zaf = this.f37844zaf;
        zaD(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaI(ConnectionResult connectionResult) {
        return this.f37849zal && !connectionResult.hasResolution();
    }

    private static final String zaJ(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Set zao(zaaw zaawVar) {
        ClientSettings clientSettings = zaawVar.zar;
        if (clientSettings == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(clientSettings.getRequiredScopes());
        Map mapZad = zaawVar.zar.zad();
        for (Api api2 : mapZad.keySet()) {
            zabi zabiVar = zaawVar.zaa;
            if (!zabiVar.f37867zab.containsKey(api2.zab())) {
                hashSet.addAll(((com.google.android.gms.common.internal.zab) mapZad.get(api2)).zaa);
            }
        }
        return hashSet;
    }

    public static /* bridge */ /* synthetic */ void zar(zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        if (zaawVar.zaG(0)) {
            ConnectionResult connectionResultZaa = zakVar.zaa();
            if (!connectionResultZaa.isSuccess()) {
                if (!zaawVar.zaI(connectionResultZaa)) {
                    zaawVar.zaD(connectionResultZaa);
                    return;
                } else {
                    zaawVar.zaA();
                    zaawVar.zaF();
                    return;
                }
            }
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult connectionResultZaa2 = zavVar.zaa();
            if (!connectionResultZaa2.isSuccess()) {
                String strValueOf = String.valueOf(connectionResultZaa2);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                zaawVar.zaD(connectionResultZaa2);
                return;
            }
            zaawVar.zan = true;
            zaawVar.zao = (IAccountAccessor) Preconditions.checkNotNull(zavVar.zab());
            zaawVar.zap = zavVar.zac();
            zaawVar.zaq = zavVar.zad();
            zaawVar.zaF();
        }
    }

    private final void zaz() {
        ArrayList arrayList = this.zau;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.zau.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zaa(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zaa.f37872zag.zaa.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        this.zaa.f37867zab.clear();
        this.f37850zam = false;
        zaas zaasVar = null;
        this.f37843zae = null;
        this.f37845zag = 0;
        this.f37849zal = true;
        this.zan = false;
        this.zap = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (Api api2 : this.zas.keySet()) {
            Api.Client client = (Api.Client) Preconditions.checkNotNull((Api.Client) this.zaa.zaa.get(api2.zab()));
            z |= api2.zac().getPriority() == 1;
            boolean zBooleanValue = ((Boolean) this.zas.get(api2)).booleanValue();
            if (client.requiresSignIn()) {
                this.f37850zam = true;
                if (zBooleanValue) {
                    this.f37848zaj.add(api2.zab());
                } else {
                    this.f37849zal = false;
                }
            }
            map.put(client, new zaal(this, api2, zBooleanValue));
        }
        if (z) {
            this.f37850zam = false;
        }
        if (this.f37850zam) {
            Preconditions.checkNotNull(this.zar);
            Preconditions.checkNotNull(this.zat);
            this.zar.zae(Integer.valueOf(System.identityHashCode(this.zaa.f37872zag)));
            zaat zaatVar = new zaat(this, zaasVar);
            Api.AbstractClientBuilder abstractClientBuilder = this.zat;
            Context context = this.f37841zac;
            zabi zabiVar = this.zaa;
            ClientSettings clientSettings = this.zar;
            this.zak = abstractClientBuilder.buildClient(context, zabiVar.f37872zag.getLooper(), clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) zaatVar, (GoogleApiClient.OnConnectionFailedListener) zaatVar);
        }
        this.f37846zah = this.zaa.zaa.size();
        this.zau.add(zabj.zaa().submit(new zaao(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(Bundle bundle) {
        if (zaG(1)) {
            if (bundle != null) {
                this.f37847zai.putAll(bundle);
            }
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api api2, boolean z) {
        if (zaG(1)) {
            zaE(connectionResult, api2, z);
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
        zaD(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        zaz();
        zaB(true);
        this.zaa.zak(null);
        return true;
    }
}
