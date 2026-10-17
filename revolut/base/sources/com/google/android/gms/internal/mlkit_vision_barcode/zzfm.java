package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import ve.b;
import ve.f;

/* JADX INFO: loaded from: classes.dex */
final class zzfm implements f {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f41418zza = false;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f41419zzb = false;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private b f41420zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzfi f41421zzd;

    public zzfm(zzfi zzfiVar) {
        this.f41421zzd = zzfiVar;
    }

    private final void zzb() {
        if (this.f41418zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f41418zza = true;
    }

    @NonNull
    public final f add(double d) throws IOException {
        zzb();
        this.f41421zzd.zza(this.f41420zzc, d, this.f41419zzb);
        return this;
    }

    public final void zza(b bVar, boolean z) {
        this.f41418zza = false;
        this.f41420zzc = bVar;
        this.f41419zzb = z;
    }

    @NonNull
    public final f add(float f) throws IOException {
        zzb();
        this.f41421zzd.zzb(this.f41420zzc, f, this.f41419zzb);
        return this;
    }

    @NonNull
    public final f add(int i) throws IOException {
        zzb();
        this.f41421zzd.zzd(this.f41420zzc, i, this.f41419zzb);
        return this;
    }

    @NonNull
    public final f add(long j2) throws IOException {
        zzb();
        this.f41421zzd.zze(this.f41420zzc, j2, this.f41419zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(String str) throws IOException {
        zzb();
        this.f41421zzd.zzc(this.f41420zzc, str, this.f41419zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(boolean z) throws IOException {
        zzb();
        this.f41421zzd.zzd(this.f41420zzc, z ? 1 : 0, this.f41419zzb);
        return this;
    }

    @NonNull
    public final f add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.f41421zzd.zzc(this.f41420zzc, bArr, this.f41419zzb);
        return this;
    }
}
