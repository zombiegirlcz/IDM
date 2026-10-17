package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zao extends GoogleApi implements TelemetryLoggingClient {

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    public static final /* synthetic */ int f38102zab = 0;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private static final Api.ClientKey f38103zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f38104zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private static final Api f38105zae;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f38103zac = clientKey;
        zan zanVar = new zan();
        f38104zad = zanVar;
        f38105zae = new Api("ClientTelemetry.API", zanVar, clientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, (Api<TelemetryLoggingOptions>) f38105zae, telemetryLoggingOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final Task<Void> log(final TelemetryData telemetryData) {
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(com.google.android.gms.internal.base.zaf.zaa);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zam
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zao.f38102zab;
                ((zai) ((zap) obj2).getService()).zae(telemetryData);
                ((TaskCompletionSource) obj3).setResult(null);
            }
        });
        return doBestEffortWrite(builder.build());
    }
}
