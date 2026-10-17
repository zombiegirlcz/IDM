package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    zzio f46833zza = null;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f46834zzb = new ArrayMap();

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzdb zzdbVar) {
        try {
            zzdbVar.zze();
        } catch (RemoteException e) {
            ((zzio) Preconditions.checkNotNull(appMeasurementDynamiteService.f46833zza)).zzaW().zzk().zzb("Failed to call IDynamiteUploadBatchesCallback", e);
        }
    }

    private final void zzb() {
        if (this.f46833zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcy zzcyVar, String str) {
        zzb();
        this.f46833zza.zzw().zzZ(zzcyVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void beginAdUnitExposure(@NonNull String str, long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzd().zzd(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zzb();
        this.f46833zza.zzq().zzJ(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearMeasurementEnabled(long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzq().zzai(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void endAdUnitExposure(@NonNull String str, long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzd().zze(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void generateEventId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        long jZzs = this.f46833zza.zzw().zzs();
        zzb();
        this.f46833zza.zzw().zzY(zzcyVar, jZzs);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.f46833zza.zzaX().zzq(new zzj(this, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzc(zzcyVar, this.f46833zza.zzq().zzr());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.f46833zza.zzaX().zzq(new zzn(this, zzcyVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzc(zzcyVar, this.f46833zza.zzq().zzs());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzc(zzcyVar, this.f46833zza.zzq().zzt());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzlw zzlwVarZzq = this.f46833zza.zzq();
        zzio zzioVar = zzlwVarZzq.zzu;
        String strZzc = null;
        if (zzioVar.zzf().zzx(null, zzgi.zzbp) || zzlwVarZzq.zzu.zzx() == null) {
            try {
                strZzc = zzmg.zzc(zzioVar.zzaT(), "google_app_id", zzlwVarZzq.zzu.zzA());
            } catch (IllegalStateException e) {
                zzlwVarZzq.zzu.zzaW().zze().zzb("getGoogleAppId failed with exception", e);
            }
        } else {
            strZzc = zzlwVarZzq.zzu.zzx();
        }
        zzc(zzcyVar, strZzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.f46833zza.zzq().zzi(str);
        zzb();
        this.f46833zza.zzw().zzX(zzcyVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getSessionId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzlw zzlwVarZzq = this.f46833zza.zzq();
        zzlwVarZzq.zzu.zzaX().zzq(new zzlj(zzlwVarZzq, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcy zzcyVar, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.f46833zza.zzw().zzZ(zzcyVar, this.f46833zza.zzq().zzu());
            return;
        }
        if (i == 1) {
            this.f46833zza.zzw().zzY(zzcyVar, this.f46833zza.zzq().zzq().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f46833zza.zzw().zzX(zzcyVar, this.f46833zza.zzq().zzp().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.f46833zza.zzw().zzT(zzcyVar, this.f46833zza.zzq().zzl().booleanValue());
                return;
            }
        }
        zzqf zzqfVarZzw = this.f46833zza.zzw();
        double dDoubleValue = this.f46833zza.zzq().zzm().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            zzqfVarZzw.zzu.zzaW().zzk().zzb("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.f46833zza.zzaX().zzq(new zzl(this, zzcyVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initForTests(@NonNull Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdh zzdhVar, long j2) throws RemoteException {
        zzio zzioVar = this.f46833zza;
        if (zzioVar == null) {
            this.f46833zza = zzio.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdhVar, Long.valueOf(j2));
        } else {
            a.C(zzioVar, "Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.f46833zza.zzaX().zzq(new zzo(this, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z3, long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzq().zzP(str, str2, bundle, z, z3, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j2) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f46833zza.zzaX().zzq(new zzk(this, zzcyVar, new zzbh(str2, new zzbf(bundle), "app", j2), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logHealthData(int i, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        this.f46833zza.zzaW().zzu(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j2) throws RemoteException {
        zzb();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), bundle, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle, long j2) {
        zzb();
        zzlv zzlvVar = this.f46833zza.zzq().f47395zza;
        if (zzlvVar != null) {
            this.f46833zza.zzq().zzK();
            zzlvVar.zza(zzdjVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j2) throws RemoteException {
        zzb();
        zzlv zzlvVar = this.f46833zza.zzq().f47395zza;
        if (zzlvVar != null) {
            this.f46833zza.zzq().zzK();
            zzlvVar.zzb(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j2) throws RemoteException {
        zzb();
        zzlv zzlvVar = this.f46833zza.zzq().f47395zza;
        if (zzlvVar != null) {
            this.f46833zza.zzq().zzK();
            zzlvVar.zzc(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j2) throws RemoteException {
        zzb();
        zzlv zzlvVar = this.f46833zza.zzq().f47395zza;
        if (zzlvVar != null) {
            this.f46833zza.zzq().zzK();
            zzlvVar.zzd(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j2) throws RemoteException {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), zzcyVar, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j2) throws RemoteException {
        zzb();
        zzlv zzlvVar = this.f46833zza.zzq().f47395zza;
        Bundle bundle = new Bundle();
        if (zzlvVar != null) {
            this.f46833zza.zzq().zzK();
            zzlvVar.zze(zzdjVar, bundle);
        }
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.f46833zza.zzaW().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j2) throws RemoteException {
        zzb();
        if (this.f46833zza.zzq().f47395zza != null) {
            this.f46833zza.zzq().zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        zzb();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j2) throws RemoteException {
        zzb();
        if (this.f46833zza.zzq().f47395zza != null) {
            this.f46833zza.zzq().zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j2) throws RemoteException {
        zzb();
        zzcyVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde zzdeVar) throws RemoteException {
        zzkc zzqVar;
        zzb();
        Map map = this.f46834zzb;
        synchronized (map) {
            try {
                zzqVar = (zzkc) map.get(Integer.valueOf(zzdeVar.zze()));
                if (zzqVar == null) {
                    zzqVar = new zzq(this, zzdeVar);
                    map.put(Integer.valueOf(zzdeVar.zze()), zzqVar);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.f46833zza.zzq().zzV(zzqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void resetAnalyticsData(long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzq().zzX(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.zzdb zzdbVar) {
        zzb();
        if (this.f46833zza.zzf().zzx(null, zzgi.zzaR)) {
            this.f46833zza.zzq().zzY(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this.f47113zza, zzdbVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j2) throws RemoteException {
        zzb();
        if (bundle == null) {
            a.w(this.f46833zza, "Conditional user property must not be null");
        } else {
            this.f46833zza.zzq().zzae(bundle, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsent(@NonNull final Bundle bundle, final long j2) throws RemoteException {
        zzb();
        final zzlw zzlwVarZzq = this.f46833zza.zzq();
        zzlwVarZzq.zzu.zzaX().zzr(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkm
            @Override // java.lang.Runnable
            public final void run() {
                zzlw zzlwVar = zzlwVarZzq;
                if (!TextUtils.isEmpty(zzlwVar.zzu.zzh().zzo())) {
                    zzlwVar.zzu.zzaW().zzl().zza("Using developer consent only; google app id found");
                } else {
                    zzlwVar.zzaf(bundle, 0, j2);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsentThirdParty(@NonNull Bundle bundle, long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzq().zzaf(bundle, -20, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j2) throws RemoteException {
        zzb();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, String str, String str2, long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzt().zzx(zzdjVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzlw zzlwVarZzq = this.f46833zza.zzq();
        zzlwVarZzq.zza();
        zzlwVarZzq.zzu.zzaX().zzq(new zzkv(zzlwVarZzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zzb();
        final zzlw zzlwVarZzq = this.f46833zza.zzq();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzlwVarZzq.zzu.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkk
            @Override // java.lang.Runnable
            public final void run() {
                zzlw.zzz(zzlwVarZzq, bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzde zzdeVar) throws RemoteException {
        zzb();
        zzp zzpVar = new zzp(this, zzdeVar);
        if (this.f46833zza.zzaX().zzu()) {
            this.f46833zza.zzq().zzah(zzpVar);
        } else {
            this.f46833zza.zzaX().zzq(new zzm(this, zzpVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMeasurementEnabled(boolean z, long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzq().zzai(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMinimumSessionDuration(long j2) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSessionTimeoutDuration(long j2) throws RemoteException {
        zzb();
        zzlw zzlwVarZzq = this.f46833zza.zzq();
        zzlwVarZzq.zzu.zzaX().zzq(new zzkx(zzlwVarZzq, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zzb();
        zzlw zzlwVarZzq = this.f46833zza.zzq();
        Uri data = intent.getData();
        if (data == null) {
            zzlwVarZzq.zzu.zzaW().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzio zzioVar = zzlwVarZzq.zzu;
            zzioVar.zzaW().zzi().zza("[sgtm] Preview Mode was not enabled.");
            zzioVar.zzf().zzv(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzio zzioVar2 = zzlwVarZzq.zzu;
            zzioVar2.zzaW().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zzioVar2.zzf().zzv(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserId(@NonNull final String str, long j2) throws RemoteException {
        zzb();
        final zzlw zzlwVarZzq = this.f46833zza.zzq();
        if (str != null && TextUtils.isEmpty(str)) {
            a.C(zzlwVarZzq.zzu, "User ID must be non-empty or null");
        } else {
            zzlwVarZzq.zzu.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkg
                @Override // java.lang.Runnable
                public final void run() {
                    zzio zzioVar = zzlwVarZzq.zzu;
                    if (zzioVar.zzh().zzr(str)) {
                        zzioVar.zzh().zzq();
                    }
                }
            });
            zzlwVarZzq.zzam(null, "_id", str, true, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z, long j2) throws RemoteException {
        zzb();
        this.f46833zza.zzq().zzam(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde zzdeVar) throws RemoteException {
        zzkc zzqVar;
        zzb();
        Map map = this.f46834zzb;
        synchronized (map) {
            zzqVar = (zzkc) map.remove(Integer.valueOf(zzdeVar.zze()));
        }
        if (zzqVar == null) {
            zzqVar = new zzq(this, zzdeVar);
        }
        this.f46833zza.zzq().zzao(zzqVar);
    }
}
