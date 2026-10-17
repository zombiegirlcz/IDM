package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
@KeepName
public class UserRecoverableAuthException extends GoogleAuthException {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Intent f37287zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final PendingIntent f37288zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzn f37289zzc;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, zzn.LEGACY);
    }

    @NonNull
    public static UserRecoverableAuthException zza(String str, @NonNull Intent intent, @NonNull PendingIntent pendingIntent) {
        Preconditions.checkNotNull(intent);
        Preconditions.checkNotNull(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, zzn.AUTH_INSTANTIATION);
    }

    public Intent getIntent() {
        Intent intent = this.f37287zza;
        if (intent != null) {
            return new Intent(intent);
        }
        int iOrdinal = this.f37289zzc.ordinal();
        return (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2) ? null : null;
    }

    private UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, zzn zznVar) {
        super(str);
        this.f37288zzb = pendingIntent;
        this.f37287zza = intent;
        this.f37289zzc = (zzn) Preconditions.checkNotNull(zznVar);
    }
}
