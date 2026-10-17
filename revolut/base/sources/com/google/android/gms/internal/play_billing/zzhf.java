package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzhf implements zzhl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzhb f46082zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzib f46083zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f46084zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzfi f46085zzd;

    private zzhf(zzib zzibVar, zzfi zzfiVar, zzhb zzhbVar) {
        this.f46083zzb = zzibVar;
        this.f46084zzc = zzhbVar instanceof zzfr;
        this.f46085zzd = zzfiVar;
        this.f46082zza = zzhbVar;
    }

    public static zzhf zzc(zzib zzibVar, zzfi zzfiVar, zzhb zzhbVar) {
        return new zzhf(zzibVar, zzfiVar, zzhbVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final int zza(Object obj2) {
        int iZzb = ((zzfu) obj2).f46022zzc.zzb();
        return this.f46084zzc ? iZzb + ((zzfr) obj2).f46020zzb.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final int zzb(Object obj2) {
        int iHashCode = ((zzfu) obj2).f46022zzc.hashCode();
        return this.f46084zzc ? (iHashCode * 53) + ((zzfr) obj2).f46020zzb.f45999zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final Object zze() {
        zzhb zzhbVar = this.f46082zza;
        return zzhbVar instanceof zzfu ? ((zzfu) zzhbVar).zzs() : zzhbVar.zzw().zzk();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzf(Object obj2) {
        this.f46083zzb.zzb(obj2);
        this.f46085zzd.zza(obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzg(Object obj2, Object obj3) {
        zzhn.zzq(this.f46083zzb, obj2, obj3);
        if (this.f46084zzc) {
            zzhn.zzp(this.f46085zzd, obj2, obj3);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzh(Object obj2, byte[] bArr, int i, int i2, zzej zzejVar) throws IOException {
        zzfu zzfuVar = (zzfu) obj2;
        if (zzfuVar.f46022zzc == zzic.zzc()) {
            zzfuVar.f46022zzc = zzic.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzi(Object obj2, zzit zzitVar) throws IOException {
        Iterator itZzf = ((zzfr) obj2).f46020zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzfl zzflVar = (zzfl) entry.getKey();
            if (zzflVar.zzc() != zzis.MESSAGE || zzflVar.zze() || zzflVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzge) {
                zzitVar.zzx(zzflVar.zza(), ((zzge) entry).zza().zzb());
            } else {
                zzitVar.zzx(zzflVar.zza(), entry.getValue());
            }
        }
        ((zzfu) obj2).f46022zzc.zzk(zzitVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final boolean zzj(Object obj2, Object obj3) {
        if (!((zzfu) obj2).f46022zzc.equals(((zzfu) obj3).f46022zzc)) {
            return false;
        }
        if (this.f46084zzc) {
            return ((zzfr) obj2).f46020zzb.equals(((zzfr) obj3).f46020zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final boolean zzk(Object obj2) {
        return ((zzfr) obj2).f46020zzb.zzj();
    }
}
