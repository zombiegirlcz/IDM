package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import xe.d;
import xe.e;

/* JADX INFO: loaded from: classes16.dex */
public final class zzuf implements zztr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzow f45012zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzsr f45013zzb = new zzsr();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f45014zzc;

    private zzuf(zzow zzowVar, int i) {
        this.f45012zza = zzowVar;
        zzuo.zza();
        this.f45014zzc = i;
    }

    public static zztr zzf(zzow zzowVar) {
        return new zzuf(zzowVar, 0);
    }

    public static zztr zzg(zzow zzowVar, int i) {
        return new zzuf(zzowVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final int zza() {
        return this.f45014zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzb(zzov zzovVar) {
        this.f45012zza.zzf(zzovVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzc(zzsr zzsrVar) {
        this.f45013zzb = zzsrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final String zzd() {
        zzst zzstVarZzf = this.f45012zza.zzj().zzf();
        return (zzstVarZzf == null || zzy.zzb(zzstVarZzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzstVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final byte[] zze(int i, boolean z) {
        this.f45013zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.f45013zzb.zze(Boolean.FALSE);
        this.f45012zza.zzi(this.f45013zzb.zzm());
        try {
            zzuo.zza();
            if (i != 0) {
                zzoy zzoyVarZzj = this.f45012zza.zzj();
                zzdb zzdbVar = new zzdb();
                zzmq.f44838zza.configure(zzdbVar);
                return zzdbVar.zza().zza(zzoyVarZzj);
            }
            zzoy zzoyVarZzj2 = this.f45012zza.zzj();
            d dVar = new d();
            zzmq.f44838zza.configure(dVar);
            dVar.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                e eVar = new e(stringWriter, dVar.f304508a, dVar.f304509b, dVar.f304510c, dVar.d);
                eVar.a(zzoyVarZzj2);
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
