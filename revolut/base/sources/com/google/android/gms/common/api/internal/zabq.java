package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zabq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {
    final /* synthetic */ GoogleApiManager zaa;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Api.Client f37880zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final ApiKey f37881zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final zaad f37882zae;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private final int f37885zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final zact f37886zai;

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private boolean f37887zaj;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Queue f37879zab = new LinkedList();

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final Set f37883zaf = new HashSet();

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private final Map f37884zag = new HashMap();
    private final List zak = new ArrayList();

    /* JADX INFO: renamed from: zal, reason: collision with root package name */
    private ConnectionResult f37888zal = null;

    /* JADX INFO: renamed from: zam, reason: collision with root package name */
    private int f37889zam = 0;

    public zabq(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.zaa = googleApiManager;
        Api.Client clientZab = googleApi.zab(googleApiManager.zar.getLooper(), this);
        this.f37880zac = clientZab;
        this.f37881zad = googleApi.getApiKey();
        this.f37882zae = new zaad();
        this.f37885zah = googleApi.zaa();
        if (clientZab.requiresSignIn()) {
            this.f37886zai = googleApi.zac(googleApiManager.f37776zai, googleApiManager.zar);
        } else {
            this.f37886zai = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Feature zaC(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f37880zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                arrayMap.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l2 = (Long) arrayMap.get(feature2.getName());
                if (l2 == null || l2.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void zaD(ConnectionResult connectionResult) {
        Iterator it8 = this.f37883zaf.iterator();
        while (it8.hasNext()) {
            ((zal) it8.next()).zac(this.f37881zad, connectionResult, Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.f37880zac.getEndpointPackageName() : null);
        }
        this.f37883zaf.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(Status status) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        zaF(status, null, false);
    }

    private final void zaF(Status status, Exception exc2, boolean z) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if ((status == null) == (exc2 == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it8 = this.f37879zab.iterator();
        while (it8.hasNext()) {
            zai zaiVar = (zai) it8.next();
            if (!z || zaiVar.f37935zac == 2) {
                if (status != null) {
                    zaiVar.zad(status);
                } else {
                    zaiVar.zae(exc2);
                }
                it8.remove();
            }
        }
    }

    private final void zaG() {
        ArrayList arrayList = new ArrayList(this.f37879zab);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (!this.f37880zac.isConnected()) {
                return;
            }
            if (zaM(zaiVar)) {
                this.f37879zab.remove(zaiVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaH() {
        zan();
        zaD(ConnectionResult.RESULT_SUCCESS);
        zaL();
        Iterator it8 = this.f37884zag.values().iterator();
        while (it8.hasNext()) {
            zaci zaciVar = (zaci) it8.next();
            if (zaC(zaciVar.zaa.getRequiredFeatures()) != null) {
                it8.remove();
            } else {
                try {
                    zaciVar.zaa.registerListener(this.f37880zac, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f37880zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it8.remove();
                }
            }
        }
        zaG();
        zaJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaI(int i) {
        zan();
        this.f37887zaj = true;
        this.f37882zae.zae(i, this.f37880zac.getLastDisconnectMessage());
        ApiKey apiKey = this.f37881zad;
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 9, apiKey), 5000L);
        ApiKey apiKey2 = this.f37881zad;
        GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zar.sendMessageDelayed(Message.obtain(googleApiManager2.zar, 11, apiKey2), 120000L);
        this.zaa.zak.zac();
        Iterator it8 = this.f37884zag.values().iterator();
        while (it8.hasNext()) {
            ((zaci) it8.next()).f37911zac.run();
        }
    }

    private final void zaJ() {
        this.zaa.zar.removeMessages(12, this.f37881zad);
        ApiKey apiKey = this.f37881zad;
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zar.sendMessageDelayed(googleApiManager.zar.obtainMessage(12, apiKey), this.zaa.f37772zae);
    }

    private final void zaK(zai zaiVar) {
        zaiVar.zag(this.f37882zae, zaA());
        try {
            zaiVar.zaf(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f37880zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void zaL() {
        if (this.f37887zaj) {
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.removeMessages(11, this.f37881zad);
            GoogleApiManager googleApiManager2 = this.zaa;
            googleApiManager2.zar.removeMessages(9, this.f37881zad);
            this.f37887zaj = false;
        }
    }

    private final boolean zaM(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaK(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature featureZaC = zaC(zacVar.zab(this));
        if (featureZaC == null) {
            zaK(zaiVar);
            return true;
        }
        String str = this.f37880zac.getClass().getName() + " could not execute call because it requires feature (" + featureZaC.getName() + ", " + featureZaC.getVersion() + ").";
        if (!this.zaa.zas || !zacVar.zaa(this)) {
            zacVar.zae(new UnsupportedApiCallException(featureZaC));
            return true;
        }
        zabs zabsVar = new zabs(this.f37881zad, featureZaC, null);
        int iIndexOf = this.zak.indexOf(zabsVar);
        if (iIndexOf >= 0) {
            zabs zabsVar2 = (zabs) this.zak.get(iIndexOf);
            this.zaa.zar.removeMessages(15, zabsVar2);
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 15, zabsVar2), 5000L);
            return false;
        }
        this.zak.add(zabsVar);
        GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zar.sendMessageDelayed(Message.obtain(googleApiManager2.zar, 15, zabsVar), 5000L);
        GoogleApiManager googleApiManager3 = this.zaa;
        googleApiManager3.zar.sendMessageDelayed(Message.obtain(googleApiManager3.zar, 16, zabsVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (zaN(connectionResult)) {
            return false;
        }
        this.zaa.zaE(connectionResult, this.f37885zah);
        return false;
    }

    private final boolean zaN(@NonNull ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.f37770zac) {
            try {
                GoogleApiManager googleApiManager = this.zaa;
                if (googleApiManager.zao == null || !googleApiManager.zap.contains(this.f37881zad)) {
                    return false;
                }
                this.zaa.zao.zah(connectionResult, this.f37885zah);
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaO(boolean z) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (!this.f37880zac.isConnected() || !this.f37884zag.isEmpty()) {
            return false;
        }
        if (!this.f37882zae.zag()) {
            this.f37880zac.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        zaJ();
        return false;
    }

    public static /* bridge */ /* synthetic */ void zal(zabq zabqVar, zabs zabsVar) {
        if (zabqVar.zak.contains(zabsVar) && !zabqVar.f37887zaj) {
            if (zabqVar.f37880zac.isConnected()) {
                zabqVar.zaG();
            } else {
                zabqVar.zao();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zam(zabq zabqVar, zabs zabsVar) {
        Feature[] featureArrZab;
        if (zabqVar.zak.remove(zabsVar)) {
            zabqVar.zaa.zar.removeMessages(15, zabsVar);
            zabqVar.zaa.zar.removeMessages(16, zabsVar);
            Feature feature = zabsVar.f37890zab;
            ArrayList arrayList = new ArrayList(zabqVar.f37879zab.size());
            for (zai zaiVar : zabqVar.f37879zab) {
                if ((zaiVar instanceof zac) && (featureArrZab = ((zac) zaiVar).zab(zabqVar)) != null && ArrayUtils.contains(featureArrZab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zai zaiVar2 = (zai) arrayList.get(i);
                zabqVar.f37879zab.remove(zaiVar2);
                zaiVar2.zae(new UnsupportedApiCallException(feature));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.zaa.zar.getLooper()) {
            zaH();
        } else {
            this.zaa.zar.post(new zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.zaa.zar.getLooper()) {
            zaI(i);
        } else {
            this.zaa.zar.post(new zabn(this, i));
        }
    }

    public final boolean zaA() {
        return this.f37880zac.requiresSignIn();
    }

    @ResultIgnorabilityUnspecified
    public final boolean zaB() {
        return zaO(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult, Api api2, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.f37885zah;
    }

    public final int zac() {
        return this.f37889zam;
    }

    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        return this.f37888zal;
    }

    public final Api.Client zaf() {
        return this.f37880zac;
    }

    public final Map zah() {
        return this.f37884zag;
    }

    public final void zan() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        this.f37888zal = null;
    }

    public final void zao() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.f37880zac.isConnected() || this.f37880zac.isConnecting()) {
            return;
        }
        try {
            GoogleApiManager googleApiManager = this.zaa;
            int iZab = googleApiManager.zak.zab(googleApiManager.f37776zai, this.f37880zac);
            if (iZab != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iZab, null);
                String str = "The service for " + this.f37880zac.getClass().getName() + " is not available: " + connectionResult.toString();
                zar(connectionResult, null);
                return;
            }
            GoogleApiManager googleApiManager2 = this.zaa;
            Api.Client client = this.f37880zac;
            zabu zabuVar = new zabu(googleApiManager2, client, this.f37881zad);
            if (client.requiresSignIn()) {
                ((zact) Preconditions.checkNotNull(this.f37886zai)).zae(zabuVar);
            }
            try {
                this.f37880zac.connect(zabuVar);
            } catch (SecurityException e) {
                zar(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            zar(new ConnectionResult(10), e2);
        }
    }

    public final void zap(zai zaiVar) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.f37880zac.isConnected()) {
            if (zaM(zaiVar)) {
                zaJ();
                return;
            } else {
                this.f37879zab.add(zaiVar);
                return;
            }
        }
        this.f37879zab.add(zaiVar);
        ConnectionResult connectionResult = this.f37888zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.f37888zal, null);
        }
    }

    public final void zaq() {
        this.f37889zam++;
    }

    public final void zar(@NonNull ConnectionResult connectionResult, Exception exc2) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        zact zactVar = this.f37886zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        this.zaa.zak.zac();
        zaD(connectionResult);
        if ((this.f37880zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.zaa.f37773zaf = true;
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.sendMessageDelayed(googleApiManager.zar.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            zaE(GoogleApiManager.f37769zab);
            return;
        }
        if (this.f37879zab.isEmpty()) {
            this.f37888zal = connectionResult;
            return;
        }
        if (exc2 != null) {
            Preconditions.checkHandlerThread(this.zaa.zar);
            zaF(null, exc2, false);
            return;
        }
        if (!this.zaa.zas) {
            zaE(GoogleApiManager.zaF(this.f37881zad, connectionResult));
            return;
        }
        zaF(GoogleApiManager.zaF(this.f37881zad, connectionResult), null, true);
        if (this.f37879zab.isEmpty() || zaN(connectionResult) || this.zaa.zaE(connectionResult, this.f37885zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.f37887zaj = true;
        }
        if (!this.f37887zaj) {
            zaE(GoogleApiManager.zaF(this.f37881zad, connectionResult));
            return;
        }
        GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zar.sendMessageDelayed(Message.obtain(googleApiManager2.zar, 9, this.f37881zad), 5000L);
    }

    public final void zas(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        Api.Client client = this.f37880zac;
        client.disconnect("onSignInFailed for " + client.getClass().getName() + " with " + String.valueOf(connectionResult));
        zar(connectionResult, null);
    }

    public final void zat(zal zalVar) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        this.f37883zaf.add(zalVar);
    }

    public final void zau() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.f37887zaj) {
            zao();
        }
    }

    public final void zav() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        zaE(GoogleApiManager.zaa);
        this.f37882zae.zaf();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f37884zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zap(new zah(listenerKey, new TaskCompletionSource()));
        }
        zaD(new ConnectionResult(4));
        if (this.f37880zac.isConnected()) {
            this.f37880zac.onUserSignOut(new zabp(this));
        }
    }

    public final void zaw() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.f37887zaj) {
            zaL();
            GoogleApiManager googleApiManager = this.zaa;
            zaE(googleApiManager.f37777zaj.isGooglePlayServicesAvailable(googleApiManager.f37776zai) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f37880zac.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.f37880zac.isConnected();
    }
}
