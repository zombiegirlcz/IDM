package com.google.android.gms.wallet;

import a0.d;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.wallet.wobs.WalletObjects;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class Wallet {

    @NonNull
    public static final Api<WalletOptions> API;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public static final WalletObjects f48939zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.gms.internal.wallet.zzr f48940zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @ShowFirstParty
    public static final com.google.android.gms.internal.wallet.zzz f48941zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Api.ClientKey f48942zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f48943zze;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f48942zzd = clientKey;
        zzap zzapVar = new zzap();
        f48943zze = zzapVar;
        API = new Api<>("Wallet.API", zzapVar, clientKey);
        f48940zzb = new com.google.android.gms.internal.wallet.zzr();
        f48939zza = new com.google.android.gms.internal.wallet.zzab();
        f48941zzc = new com.google.android.gms.internal.wallet.zzz();
    }

    private Wallet() {
    }

    @NonNull
    public static PaymentsClient getPaymentsClient(@NonNull Activity activity, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(activity, walletOptions);
    }

    @NonNull
    public static WalletObjectsClient getWalletObjectsClient(@NonNull Activity activity, WalletOptions walletOptions) {
        return new WalletObjectsClient(activity, walletOptions);
    }

    public static final class WalletOptions implements Api.ApiOptions.HasAccountOptions {
        public final int environment;
        public final int theme;

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        @NonNull
        @ShowFirstParty
        public final Account f48944zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        final boolean f48945zzb;

        public static final class Builder {

            /* JADX INFO: renamed from: zza, reason: collision with root package name */
            private int f48946zza = 3;

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            private int f48947zzb = 1;

            /* JADX INFO: renamed from: zzc, reason: collision with root package name */
            private boolean f48948zzc = true;

            @NonNull
            public WalletOptions build() {
                return new WalletOptions(this);
            }

            @NonNull
            public Builder setEnvironment(int i) {
                if (i != 0) {
                    if (i == 0) {
                        i = 0;
                    } else if (i != 2 && i != 1 && i != 23 && i != 3) {
                        Locale locale = Locale.US;
                        throw new IllegalArgumentException(d.n("Invalid environment value ", i));
                    }
                }
                this.f48946zza = i;
                return this;
            }

            @NonNull
            public Builder setTheme(int i) {
                if (i == 0 || i == 1 || i == 2 || i == 3) {
                    this.f48947zzb = i;
                    return this;
                }
                Locale locale = Locale.US;
                throw new IllegalArgumentException(d.n("Invalid theme value ", i));
            }

            @NonNull
            @Deprecated
            public Builder useGoogleWallet() {
                this.f48948zzc = false;
                return this;
            }
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.f48946zza;
            this.theme = builder.f48947zzb;
            this.f48945zzb = builder.f48948zzc;
            this.f48944zza = null;
        }

        public boolean equals(Object obj2) {
            if (obj2 instanceof WalletOptions) {
                WalletOptions walletOptions = (WalletOptions) obj2;
                if (Objects.equal(Integer.valueOf(this.environment), Integer.valueOf(walletOptions.environment)) && Objects.equal(Integer.valueOf(this.theme), Integer.valueOf(walletOptions.theme)) && Objects.equal(null, null) && Objects.equal(Boolean.valueOf(this.f48945zzb), Boolean.valueOf(walletOptions.f48945zzb))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
        @NonNull
        public Account getAccount() {
            return null;
        }

        public int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.environment), Integer.valueOf(this.theme), null, Boolean.valueOf(this.f48945zzb));
        }

        private WalletOptions() {
            this(new Builder());
        }
    }

    @NonNull
    public static PaymentsClient getPaymentsClient(@NonNull Context context, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(context, walletOptions);
    }
}
