package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import xe.d;
import xe.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzua implements zztm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzpl f42474zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzsj f42475zzb = new zzsj();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f42476zzc;

    private zzua(zzpl zzplVar, int i) {
        this.f42474zza = zzplVar;
        zzuj.zza();
        this.f42476zzc = i;
    }

    public static zztm zzf(zzpl zzplVar) {
        return new zzua(zzplVar, 0);
    }

    public static zztm zzg(zzpl zzplVar, int i) {
        return new zzua(zzplVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final int zza() {
        return this.f42476zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final zztm zzb(zzpk zzpkVar) {
        this.f42474zza.zzf(zzpkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final zztm zzc(zzsj zzsjVar) {
        this.f42475zzb = zzsjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final String zzd() {
        zzsl zzslVarZzg = this.f42474zza.zzk().zzg();
        return (zzslVarZzg == null || zzbd.zzc(zzslVarZzg.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzslVarZzg.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final byte[] zze(int i, boolean z) {
        this.f42475zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.f42475zzb.zze(Boolean.FALSE);
        this.f42474zza.zzj(this.f42475zzb.zzm());
        try {
            zzuj.zza();
            if (i != 0) {
                zzpn zzpnVarZzk = this.f42474zza.zzk();
                zzfk zzfkVar = new zzfk();
                zznj.f42227zza.configure(zzfkVar);
                return zzfkVar.zza().zza(zzpnVarZzk);
            }
            zzpn zzpnVarZzk2 = this.f42474zza.zzk();
            d dVar = new d();
            zznj.f42227zza.configure(dVar);
            dVar.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                e eVar = new e(stringWriter, dVar.f304508a, dVar.f304509b, dVar.f304510c, dVar.d);
                eVar.a(zzpnVarZzk2);
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
