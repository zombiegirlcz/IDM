package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zznl implements zzns {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zznh f40508zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzoe f40509zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f40510zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzlq f40511zzd;

    private zznl(zzoe zzoeVar, zzlq zzlqVar, zznh zznhVar) {
        this.f40509zzb = zzoeVar;
        this.f40510zzc = zznhVar instanceof zzma;
        this.f40511zzd = zzlqVar;
        this.f40508zza = zznhVar;
    }

    public static zznl zzc(zzoe zzoeVar, zzlq zzlqVar, zznh zznhVar) {
        return new zznl(zzoeVar, zzlqVar, zznhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zza(Object obj2) {
        int iZzb = ((zzmd) obj2).f40459zzc.zzb();
        return this.f40510zzc ? iZzb + ((zzma) obj2).f40457zzb.zzc() : iZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zzb(Object obj2) {
        int iHashCode = ((zzmd) obj2).f40459zzc.hashCode();
        return this.f40510zzc ? (iHashCode * 53) + ((zzma) obj2).f40457zzb.f40435zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final Object zze() {
        zznh zznhVar = this.f40508zza;
        return zznhVar instanceof zzmd ? ((zzmd) zznhVar).zzcj() : zznhVar.zzcA().zzbc();
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzf(Object obj2) {
        this.f40509zzb.zza(obj2);
        this.f40511zzd.zza(obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzg(Object obj2, Object obj3) {
        zznu.zzp(this.f40509zzb, obj2, obj3);
        if (this.f40510zzc) {
            zznu.zzo(this.f40511zzd, obj2, obj3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzh(Object obj2, byte[] bArr, int i, int i2, zzks zzksVar) throws IOException {
        zzmd zzmdVar = (zzmd) obj2;
        if (zzmdVar.f40459zzc == zzof.zzc()) {
            zzmdVar.f40459zzc = zzof.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzi(Object obj2, zzor zzorVar) throws IOException {
        Iterator itZze = ((zzma) obj2).f40457zzb.zze();
        while (itZze.hasNext()) {
            Map.Entry entry = (Map.Entry) itZze.next();
            zzlt zzltVar = (zzlt) entry.getKey();
            if (zzltVar.zzc() != zzoq.MESSAGE || zzltVar.zze() || zzltVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzmo) {
                zzorVar.zzw(zzltVar.zza(), ((zzmo) entry).zza().zzb());
            } else {
                zzorVar.zzw(zzltVar.zza(), entry.getValue());
            }
        }
        ((zzmd) obj2).f40459zzc.zzk(zzorVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzj(Object obj2, Object obj3) {
        if (!((zzmd) obj2).f40459zzc.equals(((zzmd) obj3).f40459zzc)) {
            return false;
        }
        if (this.f40510zzc) {
            return ((zzma) obj2).f40457zzb.equals(((zzma) obj3).f40457zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzk(Object obj2) {
        return ((zzma) obj2).f40457zzb.zzh();
    }
}
