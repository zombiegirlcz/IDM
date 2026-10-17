package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes16.dex */
public final class zbn {

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    private static zbn f37530zbd;

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final Storage f37531zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    GoogleSignInAccount f37532zbb;
    GoogleSignInOptions zbc;

    private zbn(Context context) {
        Storage storage = Storage.getInstance(context);
        this.f37531zba = storage;
        this.f37532zbb = storage.getSavedDefaultGoogleSignInAccount();
        this.zbc = storage.getSavedDefaultGoogleSignInOptions();
    }

    public static synchronized zbn zbc(@NonNull Context context) {
        return zbf(context.getApplicationContext());
    }

    private static synchronized zbn zbf(Context context) {
        zbn zbnVar = f37530zbd;
        if (zbnVar != null) {
            return zbnVar;
        }
        zbn zbnVar2 = new zbn(context);
        f37530zbd = zbnVar2;
        return zbnVar2;
    }

    public final synchronized GoogleSignInAccount zba() {
        return this.f37532zbb;
    }

    public final synchronized GoogleSignInOptions zbb() {
        return this.zbc;
    }

    public final synchronized void zbd() {
        this.f37531zba.clear();
        this.f37532zbb = null;
        this.zbc = null;
    }

    public final synchronized void zbe(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f37531zba.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.f37532zbb = googleSignInAccount;
        this.zbc = googleSignInOptions;
    }
}
