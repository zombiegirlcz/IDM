package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class ClientSettings {
    private final Account zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Set f38030zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Set f38031zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final Map f38032zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final int f38033zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final View f38034zaf;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private final String f38035zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private final String f38036zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final SignInOptions f38037zai;

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private Integer f38038zaj;

    @KeepForSdk
    public static final class Builder {
        private Account zaa;

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        private ArraySet f38039zab;

        /* JADX INFO: renamed from: zac, reason: collision with root package name */
        private String f38040zac;

        /* JADX INFO: renamed from: zad, reason: collision with root package name */
        private String f38041zad;

        /* JADX INFO: renamed from: zae, reason: collision with root package name */
        private final SignInOptions f38042zae = SignInOptions.zaa;

        @NonNull
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.f38039zab, null, 0, null, this.f38040zac, this.f38041zad, this.f38042zae, false);
        }

        @NonNull
        @KeepForSdk
        public Builder setRealClientPackageName(@NonNull String str) {
            this.f38040zac = str;
            return this;
        }

        @NonNull
        public final Builder zaa(@NonNull Collection collection) {
            if (this.f38039zab == null) {
                this.f38039zab = new ArraySet();
            }
            this.f38039zab.addAll(collection);
            return this;
        }

        @NonNull
        public final Builder zab(Account account) {
            this.zaa = account;
            return this;
        }

        @NonNull
        public final Builder zac(@NonNull String str) {
            this.f38041zad = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@NonNull Account account, @NonNull Set<Scope> set, @NonNull Map<Api<?>, zab> map, int i, View view, @NonNull String str, @NonNull String str2, SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @NonNull
    @KeepForSdk
    public static ClientSettings createDefault(@NonNull Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    @KeepForSdk
    public Account getAccount() {
        return this.zaa;
    }

    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.zaa;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.f38031zac;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@NonNull Api<?> api2) {
        zab zabVar = (zab) this.f38032zad.get(api2);
        if (zabVar == null || zabVar.zaa.isEmpty()) {
            return this.f38030zab;
        }
        HashSet hashSet = new HashSet(this.f38030zab);
        hashSet.addAll(zabVar.zaa);
        return hashSet;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.f38033zae;
    }

    @NonNull
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.f38035zag;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.f38030zab;
    }

    @KeepForSdk
    public View getViewForPopups() {
        return this.f38034zaf;
    }

    @NonNull
    public final SignInOptions zaa() {
        return this.f38037zai;
    }

    public final Integer zab() {
        return this.f38038zaj;
    }

    public final String zac() {
        return this.f38036zah;
    }

    @NonNull
    public final Map zad() {
        return this.f38032zad;
    }

    public final void zae(@NonNull Integer num) {
        this.f38038zaj = num;
    }

    public ClientSettings(Account account, @NonNull Set set, @NonNull Map map, int i, View view, @NonNull String str, @NonNull String str2, SignInOptions signInOptions, boolean z) {
        this.zaa = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f38030zab = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f38032zad = map;
        this.f38034zaf = view;
        this.f38033zae = i;
        this.f38035zag = str;
        this.f38036zah = str2;
        this.f38037zai = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it8 = map.values().iterator();
        while (it8.hasNext()) {
            hashSet.addAll(((zab) it8.next()).zaa);
        }
        this.f38031zac = Collections.unmodifiableSet(hashSet);
    }
}
