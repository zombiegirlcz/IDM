package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzjd;

/* JADX INFO: loaded from: classes16.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private ActivityResultLauncher f25752zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private ActivityResultLauncher f25753zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private ActivityResultLauncher f25754zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private ActivityResultLauncher f25755zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private ResultReceiver f25756zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private ResultReceiver f25757zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private ResultReceiver f25758zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private ResultReceiver f25759zzh;

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25752zza = registerForActivityResult(new ActivityResultContracts$StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.zzdu
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                this.f25997zza.zza((ActivityResult) obj2);
            }
        });
        this.f25753zzb = registerForActivityResult(new ActivityResultContracts$StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.zzdv
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                this.f25998zza.zzb((ActivityResult) obj2);
            }
        });
        this.f25754zzc = registerForActivityResult(new ActivityResultContracts$StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.zzdw
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                this.f25999zza.zzc((ActivityResult) obj2);
            }
        });
        this.f25755zzd = registerForActivityResult(new ActivityResultContracts$StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.zzdx
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                this.f26000zza.zzd((ActivityResult) obj2);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f25756zze = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f25757zzf = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f25758zzg = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.f25759zzh = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f25756zze = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f25752zza.launch(new IntentSenderRequest.Builder(pendingIntent).build());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f25757zzf = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f25753zzb.launch(new IntentSenderRequest.Builder(pendingIntent2).build());
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f25758zzg = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f25754zzc.launch(new IntentSenderRequest.Builder(pendingIntent3).build());
        } else if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.f25759zzh = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.f25755zzd.launch(new IntentSenderRequest.Builder(pendingIntent4).build());
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f25756zze;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f25757zzf;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f25758zzg;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f25759zzh;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }

    public final void zza(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(data, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f25756zze;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    public final void zzb(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(data, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f25757zzf;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    public final void zzc(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + activityResult.getResultCode());
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjd.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + activityResult.getResultCode());
        }
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(data, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f25758zzg;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, extras);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + responseCode);
        }
        finish();
    }

    public final void zzd(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        Bundle extras = data == null ? null : data.getExtras();
        if (activityResult.getResultCode() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + activityResult.getResultCode());
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjd.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + activityResult.getResultCode());
        }
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(data, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f25759zzh;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, extras);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + responseCode);
        }
        finish();
    }
}
