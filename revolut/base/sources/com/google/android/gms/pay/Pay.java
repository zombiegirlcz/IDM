package com.google.android.gms.pay;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes16.dex */
public class Pay {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Api.ClientKey f48277zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final Api.ClientKey f48278zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final Api.AbstractClientBuilder f48279zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    static final Api.AbstractClientBuilder f48280zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @NonNull
    public static final Api f48281zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @NonNull
    public static final Api f48282zzf;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f48277zza = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f48278zzb = clientKey2;
        zzbk zzbkVar = new zzbk();
        f48279zzc = zzbkVar;
        zzbl zzblVar = new zzbl();
        f48280zzd = zzblVar;
        f48281zze = new Api("Pay.API", zzbkVar, clientKey);
        f48282zzf = new Api("Pay.THIRD_PARTY_API", zzblVar, clientKey2);
    }

    private Pay() {
    }

    @NonNull
    public static PayClient getClient(@NonNull Activity activity) {
        return new com.google.android.gms.internal.pay.zzx(activity);
    }

    @NonNull
    public static PayClient getClient(@NonNull Context context) {
        return new com.google.android.gms.internal.pay.zzx(context);
    }
}
