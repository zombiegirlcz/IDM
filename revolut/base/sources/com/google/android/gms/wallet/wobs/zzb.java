package com.google.android.gms.wallet.wobs;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;

/* JADX INFO: loaded from: classes16.dex */
public final class zzb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ CommonWalletObject f49005zza;

    public /* synthetic */ zzb(CommonWalletObject commonWalletObject, zza zzaVar) {
        this.f49005zza = commonWalletObject;
    }

    public final zzb zza(UriData uriData) {
        this.f49005zza.zzq.add(uriData);
        return this;
    }

    public final zzb zzb(Collection collection) {
        this.f49005zza.zzq.addAll(collection);
        return this;
    }

    public final zzb zzc(LabelValueRow labelValueRow) {
        this.f49005zza.zzo.add(labelValueRow);
        return this;
    }

    public final zzb zzd(Collection collection) {
        this.f49005zza.zzo.addAll(collection);
        return this;
    }

    public final zzb zze(UriData uriData) {
        this.f49005zza.zzs.add(uriData);
        return this;
    }

    public final zzb zzf(Collection collection) {
        this.f49005zza.zzs.addAll(collection);
        return this;
    }

    public final zzb zzg(LatLng latLng) {
        this.f49005zza.f48975zzl.add(latLng);
        return this;
    }

    public final zzb zzh(Collection collection) {
        this.f49005zza.f48975zzl.addAll(collection);
        return this;
    }

    public final zzb zzi(WalletObjectMessage walletObjectMessage) {
        this.f49005zza.f48973zzj.add(walletObjectMessage);
        return this;
    }

    public final zzb zzj(Collection collection) {
        this.f49005zza.f48973zzj.addAll(collection);
        return this;
    }

    public final zzb zzk(TextModuleData textModuleData) {
        this.f49005zza.zzr.add(textModuleData);
        return this;
    }

    public final zzb zzl(Collection collection) {
        this.f49005zza.zzr.addAll(collection);
        return this;
    }

    public final zzb zzm(String str) {
        this.f49005zza.f48968zze = str;
        return this;
    }

    @Deprecated
    public final zzb zzn(String str) {
        this.f49005zza.f48971zzh = str;
        return this;
    }

    public final zzb zzo(String str) {
        this.f49005zza.f48969zzf = str;
        return this;
    }

    public final zzb zzp(String str) {
        this.f49005zza.f48970zzg = str;
        return this;
    }

    public final zzb zzq(String str) {
        this.f49005zza.f48965zzb = str;
        return this;
    }

    public final zzb zzr(String str) {
        this.f49005zza.f48964zza = str;
        return this;
    }

    @Deprecated
    public final zzb zzs(String str) {
        this.f49005zza.zzn = str;
        return this;
    }

    @Deprecated
    public final zzb zzt(String str) {
        this.f49005zza.zzm = str;
        return this;
    }

    public final zzb zzu(boolean z) {
        this.f49005zza.zzp = z;
        return this;
    }

    public final zzb zzv(String str) {
        this.f49005zza.f48967zzd = str;
        return this;
    }

    public final zzb zzw(String str) {
        this.f49005zza.f48966zzc = str;
        return this;
    }

    public final zzb zzx(int i) {
        this.f49005zza.f48972zzi = i;
        return this;
    }

    public final zzb zzy(TimeInterval timeInterval) {
        this.f49005zza.f48974zzk = timeInterval;
        return this;
    }

    public final CommonWalletObject zzz() {
        return this.f49005zza;
    }
}
