package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.android.billingclient.api.EnableBillingProgramParams;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingProgram {

        @zzi
        public static final int EXTERNAL_CONTENT_LINK = 1;

        @zzk
        public static final int EXTERNAL_OFFER = 3;

        @zzl
        public static final int EXTERNAL_PAYMENTS = 4;

        @zzh
        public static final int UNSPECIFIED_BILLING_PROGRAM = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {

        @NonNull
        @zzj
        public static final String EXTERNAL_OFFER = "kkk";

        @NonNull
        public static final String INCLUDE_SUSPENDED_SUBSCRIPTIONS = "nnn";

        @NonNull
        public static final String SUBSCRIPTIONS = "subscriptions";

        @NonNull
        public static final String IN_APP_MESSAGING = "bbb";

        @NonNull
        public static final String PRODUCT_DETAILS = "fff";

        @NonNull
        @zzm
        public static final String BILLING_CONFIG = "ggg";

        @NonNull
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";

        @NonNull
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";

        @NonNull
        @zzf
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";
    }

    @zzq
    @Retention(RetentionPolicy.SOURCE)
    public @interface OnPurchasesUpdatedSubResponseCode {
        public static final int NO_APPLICABLE_SUB_RESPONSE_CODE = 0;
        public static final int PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS = 1;
        public static final int USER_INELIGIBLE = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {

        @NonNull
        public static final String SUBS = "subs";

        @NonNull
        public static final String INAPP = "inapp";
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {

        @NonNull
        public static final String SUBS = "subs";

        @NonNull
        public static final String INAPP = "inapp";
    }

    @NonNull
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context, null);
    }

    public abstract void acknowledgePurchase(@NonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @NonNull AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(@NonNull ConsumeParams consumeParams, @NonNull ConsumeResponseListener consumeResponseListener);

    @zzf
    @KeepForSdk
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(@NonNull AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @zzh
    public abstract void createBillingProgramReportingDetailsAsync(@NonNull BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, @NonNull BillingProgramReportingDetailsListener billingProgramReportingDetailsListener);

    @zzj
    @Deprecated
    public abstract void createExternalOfferReportingDetailsAsync(@NonNull ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    @zzm
    public abstract void getBillingConfigAsync(@NonNull GetBillingConfigParams getBillingConfigParams, @NonNull BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    @zzf
    @KeepForSdk
    public abstract void isAlternativeBillingOnlyAvailableAsync(@NonNull AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @zzh
    public abstract void isBillingProgramAvailableAsync(int i, @NonNull BillingProgramAvailabilityListener billingProgramAvailabilityListener);

    @zzj
    @Deprecated
    public abstract void isExternalOfferAvailableAsync(@NonNull ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    @NonNull
    public abstract BillingResult isFeatureSupported(@NonNull String str);

    public abstract boolean isReady();

    @NonNull
    public abstract BillingResult launchBillingFlow(@NonNull Activity activity, @NonNull BillingFlowParams billingFlowParams);

    @zzo
    public abstract void launchExternalLink(@NonNull Activity activity, @NonNull LaunchExternalLinkParams launchExternalLinkParams, @NonNull LaunchExternalLinkResponseListener launchExternalLinkResponseListener);

    public abstract void queryProductDetailsAsync(@NonNull QueryProductDetailsParams queryProductDetailsParams, @NonNull ProductDetailsResponseListener productDetailsResponseListener);

    public abstract void queryPurchasesAsync(@NonNull QueryPurchasesParams queryPurchasesParams, @NonNull PurchasesResponseListener purchasesResponseListener);

    @NonNull
    @zzf
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(@NonNull Activity activity, @NonNull AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @NonNull
    @zzj
    @Deprecated
    public abstract BillingResult showExternalOfferInformationDialog(@NonNull Activity activity, @NonNull ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    @NonNull
    public abstract BillingResult showInAppMessages(@NonNull Activity activity, @NonNull InAppMessageParams inAppMessageParams, @NonNull InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(@NonNull BillingClientStateListener billingClientStateListener);

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        volatile boolean f25609zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        volatile com.google.android.gms.internal.play_billing.zzbo f25610zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private volatile String f25611zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private volatile PendingPurchasesParams f25612zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private final Context f25613zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private volatile PurchasesUpdatedListener f25614zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private volatile zzdo f25615zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private volatile zzcz f25616zzh;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private volatile zzb f25617zzi;

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        private volatile UserChoiceBillingListener f25618zzj;

        /* JADX INFO: renamed from: zzk, reason: collision with root package name */
        private volatile DeveloperProvidedBillingListener f25619zzk;

        /* JADX INFO: renamed from: zzl, reason: collision with root package name */
        private volatile ExecutorService f25620zzl;
        private volatile boolean zzm;
        private volatile boolean zzn;
        private volatile boolean zzo;
        private volatile boolean zzp;
        private volatile boolean zzq;
        private volatile boolean zzr;

        public /* synthetic */ Builder(Context context, zzac zzacVar) {
            this.f25613zze = context;
        }

        private final boolean zza() {
            try {
                Context context = this.f25613zze;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
                return false;
            }
        }

        @NonNull
        public BillingClient build() {
            Context context = this.f25613zze;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f25614zzf == null) {
                if (this.f25618zzj != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (this.zzm || this.zzn || this.zzp || this.zzq || this.zzr) {
                    return zza() ? new zzcw(null, context, null, null, this) : new BillingClientImpl(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f25612zzd == null || !this.f25612zzd.isEnabledForOneTimeProducts()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f25614zzf == null) {
                PendingPurchasesParams pendingPurchasesParams = this.f25612zzd;
                return zza() ? new zzcw(null, pendingPurchasesParams, context, null, null, null, this) : new BillingClientImpl(null, pendingPurchasesParams, context, null, null, null, this);
            }
            if (this.f25618zzj == null && this.f25619zzk == null) {
                PendingPurchasesParams pendingPurchasesParams2 = this.f25612zzd;
                PurchasesUpdatedListener purchasesUpdatedListener = this.f25614zzf;
                return zza() ? new zzcw(null, pendingPurchasesParams2, context, purchasesUpdatedListener, null, null, null, this) : new BillingClientImpl(null, pendingPurchasesParams2, context, purchasesUpdatedListener, null, null, null, this);
            }
            PendingPurchasesParams pendingPurchasesParams3 = this.f25612zzd;
            PurchasesUpdatedListener purchasesUpdatedListener2 = this.f25614zzf;
            UserChoiceBillingListener userChoiceBillingListener = this.f25618zzj;
            DeveloperProvidedBillingListener developerProvidedBillingListener = this.f25619zzk;
            return zza() ? new zzcw(null, pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, developerProvidedBillingListener, null, null, this) : new BillingClientImpl(null, pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, developerProvidedBillingListener, null, null, this);
        }

        @NonNull
        @zzf
        public Builder enableAlternativeBillingOnly() {
            this.zzm = true;
            return this;
        }

        @NonNull
        @zzg
        public Builder enableAutoServiceReconnection() {
            this.f25609zza = true;
            return this;
        }

        @NonNull
        @zzh
        public Builder enableBillingProgram(int i) {
            EnableBillingProgramParams.Builder builderNewBuilder = EnableBillingProgramParams.newBuilder();
            builderNewBuilder.setBillingProgram(i);
            enableBillingProgram(builderNewBuilder.build());
            return this;
        }

        @NonNull
        @zzj
        @Deprecated
        public Builder enableExternalOffer() {
            this.zzn = true;
            return this;
        }

        @NonNull
        @zzu
        public Builder enablePendingPurchases(@NonNull PendingPurchasesParams pendingPurchasesParams) {
            this.f25612zzd = pendingPurchasesParams;
            return this;
        }

        @NonNull
        @zzw
        public Builder enableUserChoiceBilling(@NonNull UserChoiceBillingListener userChoiceBillingListener) {
            this.f25618zzj = userChoiceBillingListener;
            if (this.f25619zzk == null) {
                return this;
            }
            throw new IllegalArgumentException("UserChoiceBillingListener and DeveloperProvidedBillingListener cannot be set at the same time.");
        }

        @NonNull
        public Builder setListener(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.f25614zzf = purchasesUpdatedListener;
            return this;
        }

        @NonNull
        @zzl
        public Builder enableBillingProgram(@NonNull EnableBillingProgramParams enableBillingProgramParams) {
            if (enableBillingProgramParams.getDeveloperProvidedBillingListener() != null) {
                if (this.f25618zzj == null) {
                    if (enableBillingProgramParams.getBillingProgram() == 4) {
                        this.f25619zzk = enableBillingProgramParams.getDeveloperProvidedBillingListener();
                    } else {
                        throw new IllegalArgumentException("DeveloperProvidedBillingListener can only be set when enabling the EXTERNAL_PAYMENTS billing program.");
                    }
                } else {
                    throw new IllegalArgumentException("UserChoiceBillingListener and DeveloperProvidedBillingListener cannot be set at the same time.");
                }
            }
            int billingProgram = enableBillingProgramParams.getBillingProgram();
            if (billingProgram == 1) {
                this.zzp = true;
                return this;
            }
            if (billingProgram == 2) {
                this.zzq = true;
                return this;
            }
            if (billingProgram == 3) {
                this.zzn = true;
                return this;
            }
            if (billingProgram != 4) {
                throw new IllegalArgumentException("An invalid BillingProgram has been provided.");
            }
            this.zzr = true;
            return this;
        }
    }
}
