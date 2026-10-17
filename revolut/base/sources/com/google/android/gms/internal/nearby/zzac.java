package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzac implements Continuation {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final /* synthetic */ zzax f45067zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final /* synthetic */ List f45068zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public final /* synthetic */ ExposureConfiguration f45069zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public final /* synthetic */ String f45070zzd;

    public /* synthetic */ zzac(zzax zzaxVar, List list, ExposureConfiguration exposureConfiguration, String str) {
        this.f45067zza = zzaxVar;
        this.f45068zzb = list;
        this.f45069zzc = exposureConfiguration;
        this.f45070zzd = str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.f45067zza.zza(this.f45068zzb, this.f45069zzc, this.f45070zzd, task);
    }
}
