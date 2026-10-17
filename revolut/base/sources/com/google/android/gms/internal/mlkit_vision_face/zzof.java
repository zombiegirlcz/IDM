package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import xe.d;
import xe.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzof implements zznr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzku f44377zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzmt f44378zzb = new zzmt();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f44379zzc;

    private zzof(zzku zzkuVar, int i) {
        this.f44377zza = zzkuVar;
        zzoo.zza();
        this.f44379zzc = i;
    }

    public static zznr zzf(zzku zzkuVar) {
        return new zzof(zzkuVar, 0);
    }

    public static zznr zzg(zzku zzkuVar, int i) {
        return new zzof(zzkuVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final int zza() {
        return this.f44379zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzb(zzkt zzktVar) {
        this.f44377zza.zzf(zzktVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzc(zzmt zzmtVar) {
        this.f44378zzb = zzmtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final String zzd() {
        zzmv zzmvVarZzf = this.f44377zza.zzj().zzf();
        return (zzmvVarZzf == null || zzac.zzb(zzmvVarZzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzmvVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final byte[] zze(int i, boolean z) {
        this.f44378zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.f44378zzb.zze(Boolean.FALSE);
        this.f44377zza.zzi(this.f44378zzb.zzm());
        try {
            zzoo.zza();
            if (i != 0) {
                zzkw zzkwVarZzj = this.f44377zza.zzj();
                zzcy zzcyVar = new zzcy();
                zzix.f44186zza.configure(zzcyVar);
                return zzcyVar.zza().zza(zzkwVarZzj);
            }
            zzkw zzkwVarZzj2 = this.f44377zza.zzj();
            d dVar = new d();
            zzix.f44186zza.configure(dVar);
            dVar.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                e eVar = new e(stringWriter, dVar.f304508a, dVar.f304509b, dVar.f304510c, dVar.d);
                eVar.a(zzkwVarZzj2);
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
