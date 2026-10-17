package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import xe.d;
import xe.e;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmk implements zzmb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zziw f43404zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzky f43405zzb = new zzky();

    private zzmk(zziw zziwVar, int i) {
        this.f43404zza = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.f43404zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.f43405zzb = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzlaVarZzc = this.f43404zza.zzf().zzc();
        return (zzlaVarZzc == null || zzg.zzb(zzlaVarZzc.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzlaVarZzc.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i, boolean z) {
        this.f43405zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.f43405zzb.zze(Boolean.FALSE);
        this.f43404zza.zze(this.f43405zzb.zzm());
        try {
            zzmw.zza();
            if (i != 0) {
                zziy zziyVarZzf = this.f43404zza.zzf();
                zzam zzamVar = new zzam();
                zzhe.f43290zza.configure(zzamVar);
                return zzamVar.zza().zza(zziyVarZzf);
            }
            zziy zziyVarZzf2 = this.f43404zza.zzf();
            d dVar = new d();
            zzhe.f43290zza.configure(dVar);
            dVar.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                e eVar = new e(stringWriter, dVar.f304508a, dVar.f304509b, dVar.f304510c, dVar.d);
                eVar.a(zziyVarZzf2);
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
