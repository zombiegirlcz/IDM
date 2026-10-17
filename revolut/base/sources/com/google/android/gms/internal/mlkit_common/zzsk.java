package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import xe.d;
import xe.e;

/* JADX INFO: loaded from: classes16.dex */
public final class zzsk implements zzry {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzmw f41220zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzqt f41221zzb = new zzqt();

    private zzsk(zzmw zzmwVar, int i) {
        this.f41220zza = zzmwVar;
        zzsv.zza();
    }

    public static zzry zzf(zzmw zzmwVar) {
        return new zzsk(zzmwVar, 0);
    }

    public static zzry zzg() {
        return new zzsk(new zzmw(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zza(zzmv zzmvVar) {
        this.f41220zza.zzf(zzmvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzb(zznc zzncVar) {
        this.f41220zza.zzi(zzncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzc(zzqt zzqtVar) {
        this.f41221zzb = zzqtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final String zzd() {
        String strZzk;
        zzqv zzqvVarZzf = this.f41220zza.zzk().zzf();
        return (zzqvVarZzf == null || (strZzk = zzqvVarZzf.zzk()) == null || strZzk.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(zzqvVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final byte[] zze(int i, boolean z) {
        this.f41221zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.f41221zzb.zze(Boolean.FALSE);
        this.f41220zza.zzj(this.f41221zzb.zzm());
        try {
            zzsv.zza();
            if (i != 0) {
                zzmy zzmyVarZzk = this.f41220zza.zzk();
                zzbg zzbgVar = new zzbg();
                zzkr.f41035zza.configure(zzbgVar);
                return zzbgVar.zza().zza(zzmyVarZzk);
            }
            zzmy zzmyVarZzk2 = this.f41220zza.zzk();
            d dVar = new d();
            zzkr.f41035zza.configure(dVar);
            dVar.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                e eVar = new e(stringWriter, dVar.f304508a, dVar.f304509b, dVar.f304510c, dVar.d);
                eVar.a(zzmyVarZzk2);
                eVar.c();
                eVar.f304512b.flush();
            } catch (IOException unused) {
            }
            return stringWriter.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
