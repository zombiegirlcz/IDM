package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public class UserRecoverableException extends Exception {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Intent f37689zza;

    public UserRecoverableException(@NonNull String str, @NonNull Intent intent) {
        super(str);
        this.f37689zza = intent;
    }

    @NonNull
    public Intent getIntent() {
        return new Intent(this.f37689zza);
    }
}
