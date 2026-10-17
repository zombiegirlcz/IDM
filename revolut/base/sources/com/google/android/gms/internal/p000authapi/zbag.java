package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.zbi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final class zbag extends GoogleApi implements CredentialSavingClient {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    private static final Api.ClientKey f38827zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f38828zbb;
    private static final Api zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    private final String f38829zbd;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f38827zba = clientKey;
        zbad zbadVar = new zbad();
        f38828zbb = zbadVar;
        zbc = new Api("Auth.Api.Identity.CredentialSaving.API", zbadVar, clientKey);
    }

    public zbag(@NonNull Activity activity, @NonNull zbi zbiVar) {
        super(activity, (Api<zbi>) zbc, zbiVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f38829zbd = zbat.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Status getStatusFromIntent(Intent intent) {
        Status status;
        return (intent == null || (status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR)) == null) ? Status.RESULT_INTERNAL_ERROR : status;
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(@NonNull SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Preconditions.checkNotNull(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.Builder builderZba = SaveAccountLinkingTokenRequest.zba(saveAccountLinkingTokenRequest);
        builderZba.zba(this.f38829zbd);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequestBuild = builderZba.build();
        return doRead(TaskApiCall.builder().setFeatures(zbas.f38850zbg).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zbn) ((zbh) obj2).getService()).zbc(new zbae(this.f38821zba, (TaskCompletionSource) obj3), (SaveAccountLinkingTokenRequest) Preconditions.checkNotNull(saveAccountLinkingTokenRequestBuild));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1535).build());
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Task<SavePasswordResult> savePassword(@NonNull SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        SavePasswordRequest.Builder builderZba = SavePasswordRequest.zba(savePasswordRequest);
        builderZba.zba(this.f38829zbd);
        final SavePasswordRequest savePasswordRequestBuild = builderZba.build();
        return doRead(TaskApiCall.builder().setFeatures(zbas.f38848zbe).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zbn) ((zbh) obj2).getService()).zbd(new zbaf(this.f38823zba, (TaskCompletionSource) obj3), (SavePasswordRequest) Preconditions.checkNotNull(savePasswordRequestBuild));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }

    public zbag(@NonNull Context context, @NonNull zbi zbiVar) {
        super(context, (Api<zbi>) zbc, zbiVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f38829zbd = zbat.zba();
    }
}
