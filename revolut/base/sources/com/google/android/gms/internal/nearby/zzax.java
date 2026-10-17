package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;
import com.google.android.gms.nearby.exposurenotification.DailySummary;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeyFileProvider;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.nearby.exposurenotification.ExposureInformation;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationStatus;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationStatusCodes;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import com.google.android.gms.nearby.exposurenotification.ExposureWindow;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class zzax extends GoogleApi implements ExposureNotificationClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f45094zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api f45095zzb = new Api("Nearby.EXPOSURE_NOTIFICATION_API", new zzap(), new Api.ClientKey());

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final long f45096zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final long f45097zzd;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f45096zzc = timeUnit.toMillis(2L);
        f45097zzd = timeUnit.toMillis(60L);
    }

    public zzax(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions>) f45095zzb, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    private final Task zzb(final DiagnosisKeyFileProvider diagnosisKeyFileProvider, final ExposureConfiguration exposureConfiguration, final String str) {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzo
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzed zzedVar = new zzed();
                zzedVar.zzb(exposureConfiguration);
                zzedVar.zza(new zzat(this.f45538zza, diagnosisKeyFileProvider));
                zzedVar.zzd(new zzao((TaskCompletionSource) obj3));
                zzedVar.zze(str);
                zzdrVar.zzo(zzedVar.zzf());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzp).build()), f45097zzd);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final boolean deviceSupportsLocationlessScanning() {
        return Settings.Global.getInt(getApplicationContext().getContentResolver(), "bluetooth_sanitized_exposure_notification_supported", 0) == 1;
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Integer> getCalibrationConfidence() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzab
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzak zzakVar = new zzak(this.f45066zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzay zzayVar = new zzay();
                zzayVar.zza(zzakVar);
                zzdrVar.zzd(zzayVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.f48275zzl).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<List<DailySummary>> getDailySummaries(final DailySummariesConfig dailySummariesConfig) {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzaj zzajVar = new zzaj(this.f45780zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzbc zzbcVar = new zzbc();
                zzbcVar.zzb(zzajVar);
                zzbcVar.zza(dailySummariesConfig);
                zzdrVar.zze(zzbcVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzm).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<DiagnosisKeysDataMapping> getDiagnosisKeysDataMapping() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzah
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzal zzalVar = new zzal(this.f45078zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzbg zzbgVar = new zzbg();
                zzbgVar.zza(zzalVar);
                zzdrVar.zzf(zzbgVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzo).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<List<ExposureInformation>> getExposureInformation(final String str) {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzaw zzawVar = new zzaw(this.f45784zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzbk zzbkVar = new zzbk();
                zzbkVar.zza(zzawVar);
                zzbkVar.zzb(str);
                zzdrVar.zzg(zzbkVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<ExposureSummary> getExposureSummary(final String str) {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzu
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzav zzavVar = new zzav(this.f45735zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzbo zzboVar = new zzbo();
                zzboVar.zza(zzavVar);
                zzboVar.zzb(str);
                zzdrVar.zzh(zzboVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<List<ExposureWindow>> getExposureWindows() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzt(this, "TYZWQ32170AXEUVCDW7A")).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<PackageConfiguration> getPackageConfiguration() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzad
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzan zzanVar = new zzan(this.f45071zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzbw zzbwVar = new zzbw();
                zzbwVar.zza(zzanVar);
                zzdrVar.zzj(zzbwVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzq).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Set<ExposureNotificationStatus>> getStatus() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzq
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzam zzamVar = new zzam(this.f45585zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzca zzcaVar = new zzca();
                zzcaVar.zza(zzamVar);
                zzdrVar.zzk(zzcaVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzn).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<List<TemporaryExposureKey>> getTemporaryExposureKeyHistory() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzag
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzar zzarVar = new zzar(this.f45077zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzce zzceVar = new zzce();
                zzceVar.zza(zzarVar);
                zzdrVar.zzl(zzceVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Long> getVersion() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzaa(this)).setFeatures(com.google.android.gms.nearby.zza.f48274zzk).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Boolean> isEnabled() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzr
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzaq zzaqVar = new zzaq(this.f45633zza, (TaskCompletionSource) obj3);
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzdz zzdzVar = new zzdz();
                zzdzVar.zza(zzaqVar);
                zzdrVar.zzn(zzdzVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> provideDiagnosisKeys(DiagnosisKeyFileProvider diagnosisKeyFileProvider) {
        return zzb(diagnosisKeyFileProvider, new ExposureConfiguration.ExposureConfigurationBuilder().build(), "TYZWQ32170AXEUVCDW7A");
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> requestPreAuthorizedTemporaryExposureKeyHistory() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzx
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzax.f45094zza;
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzeh zzehVar = new zzeh();
                zzehVar.zza(false);
                zzehVar.zzb(new zzao((TaskCompletionSource) obj3));
                zzdrVar.zzp(zzehVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzr).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> requestPreAuthorizedTemporaryExposureKeyHistoryForSelfReport() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzp
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzax.f45094zza;
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzeh zzehVar = new zzeh();
                zzehVar.zza(true);
                zzehVar.zzb(new zzao((TaskCompletionSource) obj3));
                zzdrVar.zzp(zzehVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzs).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> requestPreAuthorizedTemporaryExposureKeyRelease() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzs
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzax.f45094zza;
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzel zzelVar = new zzel();
                zzelVar.zza(new zzao((TaskCompletionSource) obj3));
                zzdrVar.zzq(zzelVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzr).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> setDiagnosisKeysDataMapping(final DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzy
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzax.f45094zza;
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzep zzepVar = new zzep();
                zzepVar.zzb(new zzao((TaskCompletionSource) obj3));
                zzepVar.zza(diagnosisKeysDataMapping);
                zzdrVar.zzr(zzepVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzo).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> start() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzv
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzax.f45094zza;
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzet zzetVar = new zzet();
                zzetVar.zza(new zzao((TaskCompletionSource) obj3));
                zzdrVar.zzs(zzetVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> stop() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzaf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzax.f45094zza;
                zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
                zzex zzexVar = new zzex();
                zzexVar.zza(new zzao((TaskCompletionSource) obj3));
                zzdrVar.zzt(zzexVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build()), f45096zzc);
    }

    public final /* synthetic */ Task zza(final List list, final ExposureConfiguration exposureConfiguration, final String str, Task task) throws Exception {
        return ((Long) task.getResult()).longValue() >= 17203704004L ? zzb(new DiagnosisKeyFileProvider(list), exposureConfiguration, str) : doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzae
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                List list2 = list;
                zzn zznVar = (zzn) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                ArrayList arrayList = new ArrayList(list2.size());
                zzax zzaxVar = this.f45072zza;
                ExposureConfiguration exposureConfiguration2 = exposureConfiguration;
                String str2 = str;
                try {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(ParcelFileDescriptor.open((File) it8.next(), 268435456));
                    }
                    zzdr zzdrVar = (zzdr) zznVar.getService();
                    zzed zzedVar = new zzed();
                    zzedVar.zzc(arrayList);
                    zzedVar.zzb(exposureConfiguration2);
                    zzedVar.zzd(new zzas(zzaxVar, arrayList, taskCompletionSource));
                    zzedVar.zze(str2);
                    zzdrVar.zzo(zzedVar.zzf());
                } catch (FileNotFoundException e) {
                    TaskUtil.setResultOrApiException(new Status(ExposureNotificationStatusCodes.FAILED_DISK_IO, e.getMessage()), taskCompletionSource);
                }
            }
        }).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build());
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> provideDiagnosisKeys(List<File> list) {
        return zzfd.zza(zzfd.zza(doRead(TaskApiCall.builder().run(new zzaa(this)).setFeatures(com.google.android.gms.nearby.zza.f48274zzk).build()), f45096zzc).continueWithTask(new zzac(this, list, new ExposureConfiguration.ExposureConfigurationBuilder().build(), "TYZWQ32170AXEUVCDW7A")), f45097zzd);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<List<ExposureWindow>> getExposureWindows(String str) {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzt(this, str)).setFeatures(com.google.android.gms.nearby.zza.f48272zzi).build()), f45096zzc);
    }

    @Override // com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient
    public final Task<Void> provideDiagnosisKeys(List<File> list, ExposureConfiguration exposureConfiguration, String str) {
        return zzfd.zza(zzfd.zza(doRead(TaskApiCall.builder().run(new zzaa(this)).setFeatures(com.google.android.gms.nearby.zza.f48274zzk).build()), f45096zzc).continueWithTask(new zzac(this, list, exposureConfiguration, str)), f45097zzd);
    }
}
