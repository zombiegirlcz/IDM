package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class Storage {
    private static final Lock zaa = new ReentrantLock();

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private static Storage f37516zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Lock f37517zac = new ReentrantLock();

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final SharedPreferences f37518zad;

    public Storage(Context context) {
        this.f37518zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @KeepForSdk
    public static Storage getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = zaa;
        lock.lock();
        try {
            if (f37516zab == null) {
                f37516zab = new Storage(context.getApplicationContext());
            }
            Storage storage = f37516zab;
            lock.unlock();
            return storage;
        } catch (Throwable th10) {
            zaa.unlock();
            throw th10;
        }
    }

    private static final String zae(String str, String str2) {
        return a.o(str, ":", str2);
    }

    @KeepForSdk
    public void clear() {
        this.f37517zac.lock();
        try {
            this.f37518zad.edit().clear().apply();
        } finally {
            this.f37517zac.unlock();
        }
    }

    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String strZaa;
        String strZaa2 = zaa("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strZaa2) && (strZaa = zaa(zae("googleSignInAccount", strZaa2))) != null) {
            try {
                return GoogleSignInAccount.zab(strZaa);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String strZaa;
        String strZaa2 = zaa("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strZaa2) && (strZaa = zaa(zae("googleSignInOptions", strZaa2))) != null) {
            try {
                return GoogleSignInOptions.zab(strZaa);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @KeepForSdk
    public String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strZac = googleSignInAccount.zac();
        zad(zae("googleSignInAccount", strZac), googleSignInAccount.zad());
        zad(zae("googleSignInOptions", strZac), googleSignInOptions.zaf());
    }

    public final String zaa(@NonNull String str) {
        this.f37517zac.lock();
        try {
            return this.f37518zad.getString(str, null);
        } finally {
            this.f37517zac.unlock();
        }
    }

    public final void zab(@NonNull String str) {
        this.f37517zac.lock();
        try {
            this.f37518zad.edit().remove(str).apply();
        } finally {
            this.f37517zac.unlock();
        }
    }

    public final void zac() {
        String strZaa = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strZaa)) {
            return;
        }
        zab(zae("googleSignInAccount", strZaa));
        zab(zae("googleSignInOptions", strZaa));
    }

    public final void zad(@NonNull String str, @NonNull String str2) {
        this.f37517zac.lock();
        try {
            this.f37518zad.edit().putString(str, str2).apply();
        } finally {
            this.f37517zac.unlock();
        }
    }
}
