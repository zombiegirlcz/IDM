package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class AccountPicker {

    public static class AccountChooserOptions {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private Account f37637zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private ArrayList f37638zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private ArrayList f37639zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private boolean f37640zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private String f37641zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private Bundle f37642zzf;

        public static class Builder {

            /* JADX INFO: renamed from: zza, reason: collision with root package name */
            private Account f37643zza;

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            private ArrayList f37644zzb;

            /* JADX INFO: renamed from: zzc, reason: collision with root package name */
            private ArrayList f37645zzc;

            /* JADX INFO: renamed from: zzd, reason: collision with root package name */
            private boolean f37646zzd = false;

            /* JADX INFO: renamed from: zze, reason: collision with root package name */
            private String f37647zze;

            /* JADX INFO: renamed from: zzf, reason: collision with root package name */
            private Bundle f37648zzf;

            @NonNull
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.zzf(this.f37645zzc);
                accountChooserOptions.zzd(this.f37644zzb);
                accountChooserOptions.zzh(this.f37646zzd);
                accountChooserOptions.zzl(this.f37648zzf);
                accountChooserOptions.zzb(this.f37643zza);
                accountChooserOptions.zzj(this.f37647zze);
                return accountChooserOptions;
            }

            @NonNull
            public Builder setAllowableAccounts(List<Account> list) {
                this.f37644zzb = list == null ? null : new ArrayList(list);
                return this;
            }

            @NonNull
            public Builder setAllowableAccountsTypes(List<String> list) {
                this.f37645zzc = list == null ? null : new ArrayList(list);
                return this;
            }

            @NonNull
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.f37646zzd = z;
                return this;
            }

            @NonNull
            public Builder setOptionsForAddingAccount(Bundle bundle) {
                this.f37648zzf = bundle;
                return this;
            }

            @NonNull
            public Builder setSelectedAccount(Account account) {
                this.f37643zza = account;
                return this;
            }

            @NonNull
            public Builder setTitleOverrideText(String str) {
                this.f37647zze = str;
                return this;
            }
        }

        public final /* synthetic */ Account zza() {
            return this.f37637zza;
        }

        public final /* synthetic */ void zzb(Account account) {
            this.f37637zza = account;
        }

        public final /* synthetic */ ArrayList zzc() {
            return this.f37638zzb;
        }

        public final /* synthetic */ void zzd(ArrayList arrayList) {
            this.f37638zzb = arrayList;
        }

        public final /* synthetic */ ArrayList zze() {
            return this.f37639zzc;
        }

        public final /* synthetic */ void zzf(ArrayList arrayList) {
            this.f37639zzc = arrayList;
        }

        public final /* synthetic */ boolean zzg() {
            return this.f37640zzd;
        }

        public final /* synthetic */ void zzh(boolean z) {
            this.f37640zzd = z;
        }

        public final /* synthetic */ String zzi() {
            return this.f37641zze;
        }

        public final /* synthetic */ void zzj(String str) {
            this.f37641zze = str;
        }

        public final /* synthetic */ Bundle zzk() {
            return this.f37642zzf;
        }

        public final /* synthetic */ void zzl(Bundle bundle) {
            this.f37642zzf = bundle;
        }
    }

    private AccountPicker() {
    }

    @NonNull
    @Deprecated
    public static Intent newChooseAccountIntent(Account account, ArrayList<Account> arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @NonNull
    public static Intent newChooseAccountIntent(@NonNull AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.zzc());
        if (accountChooserOptions.zze() != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.zze().toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.zzk());
        intent.putExtra("selectedAccount", accountChooserOptions.zza());
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.zzg());
        intent.putExtra("descriptionTextOverride", accountChooserOptions.zzi());
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("realClientPackage", (String) null);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
