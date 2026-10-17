package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final Api.AbstractClientBuilder zaa = com.google.android.gms.signin.zad.f48452zac;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Context f37913zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Handler f37914zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final Api.AbstractClientBuilder f37915zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final Set f37916zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final ClientSettings f37917zaf;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private com.google.android.gms.signin.zae f37918zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private zacs f37919zah;

    public zact(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        Api.AbstractClientBuilder abstractClientBuilder = zaa;
        this.f37913zab = context;
        this.f37914zac = handler;
        this.f37917zaf = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.f37916zae = clientSettings.getRequiredScopes();
        this.f37915zad = abstractClientBuilder;
    }

    public static /* bridge */ /* synthetic */ void zad(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        ConnectionResult connectionResultZaa = zakVar.zaa();
        if (connectionResultZaa.isSuccess()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult connectionResultZaa2 = zavVar.zaa();
            if (!connectionResultZaa2.isSuccess()) {
                String strValueOf = String.valueOf(connectionResultZaa2);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                zactVar.f37919zah.zae(connectionResultZaa2);
                zactVar.f37918zag.disconnect();
                return;
            }
            zactVar.f37919zah.zaf(zavVar.zab(), zactVar.f37916zae);
        } else {
            zactVar.f37919zah.zae(connectionResultZaa);
        }
        zactVar.f37918zag.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f37918zag.zad(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f37919zah.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f37919zah.zag(i);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.f37914zac.post(new zacr(this, zakVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    public final void zae(zacs zacsVar) {
        com.google.android.gms.signin.zae zaeVar = this.f37918zag;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        this.f37917zaf.zae(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder abstractClientBuilder = this.f37915zad;
        Context context = this.f37913zab;
        Handler handler = this.f37914zac;
        ClientSettings clientSettings = this.f37917zaf;
        this.f37918zag = abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.f37919zah = zacsVar;
        Set set = this.f37916zae;
        if (set == null || set.isEmpty()) {
            this.f37914zac.post(new zacq(this));
        } else {
            this.f37918zag.zab();
        }
    }

    public final void zaf() {
        com.google.android.gms.signin.zae zaeVar = this.f37918zag;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }
}
