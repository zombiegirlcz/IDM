package com.google.android.gms.common.signatureverification;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@KeepForSdk
public class SignatureVerificationConfigurationProvider {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final SignatureVerificationConfiguration f38263zza = zzd.zzc();

    private SignatureVerificationConfigurationProvider() {
    }

    @NonNull
    public static SignatureVerificationConfiguration zza() {
        return f38263zza;
    }
}
