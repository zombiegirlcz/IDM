package com.android.billingclient.api;

import ch.qos.logback.core.util.a;
import com.android.billingclient.api.BillingResult;

/* JADX INFO: loaded from: classes16.dex */
final class zzdc {
    static final BillingResult zzA;
    static final BillingResult zzB;
    static final BillingResult zzC;
    static final BillingResult zzD;
    static final BillingResult zzE;
    static final BillingResult zzF;
    static final BillingResult zzG;
    static final BillingResult zzH;
    public static final /* synthetic */ int zzI = 0;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final BillingResult f25975zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final BillingResult f25976zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final BillingResult f25977zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    static final BillingResult f25978zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    static final BillingResult f25979zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    static final BillingResult f25980zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    static final BillingResult f25981zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    static final BillingResult f25982zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    static final BillingResult f25983zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    static final BillingResult f25984zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    static final BillingResult f25985zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    static final BillingResult f25986zzl;
    static final BillingResult zzm;
    static final BillingResult zzn;
    static final BillingResult zzo;
    static final BillingResult zzp;
    static final BillingResult zzq;
    static final BillingResult zzr;
    static final BillingResult zzs;
    static final BillingResult zzt;
    static final BillingResult zzu;
    static final BillingResult zzv;
    static final BillingResult zzw;
    static final BillingResult zzx;
    static final BillingResult zzy;
    static final BillingResult zzz;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(3);
        builderNewBuilder.setDebugMessage("Google Play In-app Billing API version is less than 3");
        builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(3);
        builderNewBuilder2.setDebugMessage("Google Play In-app Billing API version is less than 9");
        f25975zza = builderNewBuilder2.build();
        f25976zzb = a.g(3, "Billing service unavailable on device.");
        f25977zzc = a.g(2, "Billing service unavailable on device.");
        f25978zzd = a.g(5, "Client is already in the process of connecting to billing service.");
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(5);
        builderNewBuilder3.setDebugMessage("The list of SKUs can't be empty.");
        builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(5);
        builderNewBuilder4.setDebugMessage("SKU type can't be empty.");
        builderNewBuilder4.build();
        BillingResult.Builder builderNewBuilder5 = BillingResult.newBuilder();
        builderNewBuilder5.setResponseCode(5);
        builderNewBuilder5.setDebugMessage("Product type can't be empty.");
        f25979zze = builderNewBuilder5.build();
        f25980zzf = a.g(-2, "Client does not support extra params.");
        f25981zzg = a.g(5, "Invalid purchase token.");
        f25982zzh = a.g(6, "An internal error occurred.");
        BillingResult.Builder builderNewBuilder6 = BillingResult.newBuilder();
        builderNewBuilder6.setResponseCode(5);
        builderNewBuilder6.setDebugMessage("SKU can't be null.");
        builderNewBuilder6.build();
        BillingResult.Builder builderNewBuilder7 = BillingResult.newBuilder();
        builderNewBuilder7.setResponseCode(0);
        f25983zzi = builderNewBuilder7.build();
        f25984zzj = a.g(-1, "Service connection is disconnected.");
        f25985zzk = a.g(2, "Timeout communicating with service.");
        f25986zzl = a.g(-2, "Client does not support subscriptions.");
        zzm = a.g(-2, "Client does not support subscriptions update.");
        BillingResult.Builder builderNewBuilder8 = BillingResult.newBuilder();
        builderNewBuilder8.setResponseCode(-2);
        builderNewBuilder8.setDebugMessage("Client does not support get purchase history.");
        builderNewBuilder8.build();
        BillingResult.Builder builderNewBuilder9 = BillingResult.newBuilder();
        builderNewBuilder9.setResponseCode(-2);
        builderNewBuilder9.setDebugMessage("Client does not support price change confirmation.");
        zzn = builderNewBuilder9.build();
        zzo = a.g(-2, "Play Store version installed does not support cross selling products.");
        zzp = a.g(-2, "Client does not support multi-item purchases.");
        zzq = a.g(-2, "Client does not support offer_id_token.");
        zzr = a.g(-2, "Client does not support ProductDetails.");
        zzs = a.g(-2, "Client does not support in-app messages.");
        BillingResult.Builder builderNewBuilder10 = BillingResult.newBuilder();
        builderNewBuilder10.setResponseCode(-2);
        builderNewBuilder10.setDebugMessage("Client does not support user choice billing.");
        builderNewBuilder10.build();
        BillingResult.Builder builderNewBuilder11 = BillingResult.newBuilder();
        builderNewBuilder11.setResponseCode(-2);
        builderNewBuilder11.setDebugMessage("Play Store version installed does not support external offer.");
        zzt = builderNewBuilder11.build();
        zzu = a.g(-2, "Play Store version installed does not support multi-item purchases with season pass in one cart.");
        zzv = a.g(-2, "Play Store version installed does not support querying AutoPay plan purchase.");
        zzw = a.g(-2, "Play Store version installed does not support including suspended subscriptions.");
        zzx = a.g(5, "Unknown feature");
        zzy = a.g(-2, "Play Store version installed does not support get billing config.");
        zzz = a.g(-2, "Query product details with serialized docid is not supported.");
        BillingResult.Builder builderNewBuilder12 = BillingResult.newBuilder();
        builderNewBuilder12.setResponseCode(-2);
        builderNewBuilder12.setDebugMessage("Play Store version installed does not support launching external offer flow.");
        builderNewBuilder12.build();
        BillingResult.Builder builderNewBuilder13 = BillingResult.newBuilder();
        builderNewBuilder13.setResponseCode(4);
        builderNewBuilder13.setDebugMessage("Item is unavailable for purchase.");
        zzA = builderNewBuilder13.build();
        zzB = a.g(-2, "Query product details with developer specified account is not supported.");
        zzC = a.g(-2, "Play Store version installed does not support alternative billing only.");
        zzD = a.g(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        zzE = a.g(6, "An error occurred while retrieving billing override.");
        zzF = a.g(-2, "Play Store version installed does not support the provided billing program.");
        zzG = a.g(-2, "Play Store version installed does not support launching external links.");
        zzH = a.g(5, "A DeveloperProvidedBillingListener must be provided when initializing the BillingClient in order to use multiple payment options for this billing program.");
    }

    public static BillingResult zza(int i, String str) {
        return a.g(i, str);
    }
}
