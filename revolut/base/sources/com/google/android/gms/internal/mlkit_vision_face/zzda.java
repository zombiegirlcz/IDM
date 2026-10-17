package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import ve.b;
import ve.f;

/* JADX INFO: loaded from: classes.dex */
final class zzda implements f {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f43567zza = false;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f43568zzb = false;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private b f43569zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzcw f43570zzd;

    public zzda(zzcw zzcwVar) {
        this.f43570zzd = zzcwVar;
    }

    private final void zzb() {
        if (this.f43567zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f43567zza = true;
    }

    @NonNull
    public final f add(double d) throws IOException {
        zzb();
        this.f43570zzd.zza(this.f43569zzc, d, this.f43568zzb);
        return this;
    }

    public final void zza(b bVar, boolean z) {
        this.f43567zza = false;
        this.f43569zzc = bVar;
        this.f43568zzb = z;
    }

    @NonNull
    public final f add(float f) throws IOException {
        zzb();
        this.f43570zzd.zzb(this.f43569zzc, f, this.f43568zzb);
        return this;
    }

    @NonNull
    public final f add(int i) throws IOException {
        zzb();
        this.f43570zzd.zzd(this.f43569zzc, i, this.f43568zzb);
        return this;
    }

    @NonNull
    public final f add(long j2) throws IOException {
        zzb();
        this.f43570zzd.zze(this.f43569zzc, j2, this.f43568zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(String str) throws IOException {
        zzb();
        this.f43570zzd.zzc(this.f43569zzc, str, this.f43568zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(boolean z) throws IOException {
        zzb();
        this.f43570zzd.zzd(this.f43569zzc, z ? 1 : 0, this.f43568zzb);
        return this;
    }

    @NonNull
    public final f add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.f43570zzd.zzc(this.f43569zzc, bArr, this.f43568zzb);
        return this;
    }
}
