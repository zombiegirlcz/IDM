package com.google.android.gms.internal.pay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.pay.EmoneyReadiness;
import com.google.android.gms.pay.Pay;
import com.google.android.gms.pay.PayClient;
import com.google.android.gms.pay.zzae;
import com.google.android.gms.pay.zzag;
import com.google.android.gms.pay.zzaw;
import com.google.android.gms.pay.zzba;
import com.google.android.gms.pay.zzbx;
import com.google.android.gms.pay.zzcb;
import com.google.android.gms.pay.zzcd;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final class zzx extends GoogleApi implements PayClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f45815zza = 0;

    public zzx(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) Pay.f48282zzf, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.pay.PayClient
    public final Task<EmoneyReadiness> checkReadinessForEmoney(final String str, final String str2) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.pay.zzn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzg zzgVar = (zzg) ((zzab) obj2).getService();
                com.google.android.gms.pay.zze zzeVar = new com.google.android.gms.pay.zze();
                zzeVar.zzb(str);
                zzeVar.zza(str2);
                zzgVar.zzc(zzeVar.zzc(), new zzt(this.f45799zza, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.pay.zzn.zzay).setAutoResolveMissingFeatures(false).setMethodKey(7337).build());
    }

    @Override // com.google.android.gms.pay.PayClient
    public final Task<Integer> getPayApiAvailabilityStatus(int i) {
        com.google.android.gms.pay.zzw zzwVar = new com.google.android.gms.pay.zzw();
        zzwVar.zza(i);
        final com.google.android.gms.pay.zzy zzyVarZzb = zzwVar.zzb();
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.pay.zzo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzg) ((zzab) obj2).getService()).zzd(zzyVarZzb, new zzw((TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.pay.zzn.f48414zzg).setAutoResolveMissingFeatures(false).setMethodKey(7289).build());
    }

    @Override // com.google.android.gms.pay.PayClient
    public final Task<PendingIntent> getPendingIntentForWalletOnWear(String str, @PayClient.WearWalletIntentSource int i) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i);
        zzaeVar.zzb(str);
        final zzag zzagVarZzc = zzaeVar.zzc();
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.pay.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzg) ((zzab) obj2).getService()).zze(zzagVarZzc, new zzr(this.f45797zza, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.pay.zzn.zzaj).setAutoResolveMissingFeatures(false).setMethodKey(7319).build());
    }

    @Override // com.google.android.gms.pay.PayClient
    public final PayClient.ProductName getProductName() {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoResolveActivity = getApplicationContext().getPackageManager().resolveActivity(new Intent("com.google.android.gms.pay.brand.WALLET").setPackage("com.google.android.gms"), 65536);
        return (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null || !activityInfo.exported) ? PayClient.ProductName.GOOGLE_PAY : PayClient.ProductName.GOOGLE_WALLET;
    }

    @Override // com.google.android.gms.pay.PayClient
    public final Task<Void> notifyCardTapEvent(final String str) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.pay.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzg zzgVar = (zzg) ((zzab) obj2).getService();
                zzaw zzawVar = new zzaw();
                zzawVar.zza(str);
                zzgVar.zzf(zzawVar.zzb(), new zzs(this.f45803zza, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.pay.zzn.zzaw).setAutoResolveMissingFeatures(false).setMethodKey(7334).build());
    }

    @Override // com.google.android.gms.pay.PayClient
    public final Task<Void> notifyEmoneyCardStatusUpdate(final String str) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.pay.zzi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzg zzgVar = (zzg) ((zzab) obj2).getService();
                zzba zzbaVar = new zzba();
                zzbaVar.zza(str);
                zzgVar.zzg(zzbaVar.zzb(), new zzv(this.f45791zza, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.pay.zzn.zzaA).setAutoResolveMissingFeatures(false).setMethodKey(7339).build());
    }

    @Override // com.google.android.gms.pay.PayClient
    public final Task<Void> pushEmoneyCard(final String str, final ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.pay.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzg zzgVar = (zzg) ((zzab) obj2).getService();
                zzbx zzbxVar = new zzbx();
                zzbxVar.zza(str);
                zzgVar.zzh(zzbxVar.zzb(), new zzu(this.f45805zza, activityResultLauncher, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.pay.zzn.zzaz).setAutoResolveMissingFeatures(false).setMethodKey(7338).build());
    }

    @Override // com.google.android.gms.pay.PayClient
    public final void savePasses(String str, Activity activity, int i) {
        zzcb zzcbVar = new zzcb();
        zzcbVar.zza(str);
        final zzcd zzcdVarZzc = zzcbVar.zzc();
        final zzz zzzVar = new zzz(activity, i);
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.pay.zzh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzg) ((zzab) obj2).getService()).zzi(zzcdVarZzc, zzzVar);
            }
        }).setFeatures(com.google.android.gms.pay.zzn.zzB).setAutoResolveMissingFeatures(false).setMethodKey(7288).build()).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.pay.zzj
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc2) {
                zzz zzzVar2 = zzzVar;
                if (exc2 instanceof UnsupportedApiCallException) {
                    zzzVar2.zzh(new Status(1));
                } else {
                    zzzVar2.zzh(new Status(3));
                }
            }
        });
    }

    @Override // com.google.android.gms.pay.PayClient
    public final void savePassesJwt(String str, Activity activity, int i) {
        zzcb zzcbVar = new zzcb();
        zzcbVar.zzb(str);
        final zzcd zzcdVarZzc = zzcbVar.zzc();
        final zzz zzzVar = new zzz(activity, i);
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.pay.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzg) ((zzab) obj2).getService()).zzi(zzcdVarZzc, zzzVar);
            }
        }).setFeatures(com.google.android.gms.pay.zzn.zzC).setAutoResolveMissingFeatures(false).setMethodKey(7295).build()).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.pay.zzl
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc2) {
                zzz zzzVar2 = zzzVar;
                if (exc2 instanceof UnsupportedApiCallException) {
                    zzzVar2.zzh(new Status(1));
                } else {
                    zzzVar2.zzh(new Status(3));
                }
            }
        });
    }

    public zzx(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) Pay.f48282zzf, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
