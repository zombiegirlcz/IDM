package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import ve.b;
import ve.f;

/* JADX INFO: loaded from: classes16.dex */
final class zzdd implements f {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f44547zza = false;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f44548zzb = false;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private b f44549zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzcz f44550zzd;

    public zzdd(zzcz zzczVar) {
        this.f44550zzd = zzczVar;
    }

    private final void zzb() {
        if (this.f44547zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f44547zza = true;
    }

    @NonNull
    public final f add(double d) throws IOException {
        zzb();
        this.f44550zzd.zza(this.f44549zzc, d, this.f44548zzb);
        return this;
    }

    public final void zza(b bVar, boolean z) {
        this.f44547zza = false;
        this.f44549zzc = bVar;
        this.f44548zzb = z;
    }

    @NonNull
    public final f add(float f) throws IOException {
        zzb();
        this.f44550zzd.zzb(this.f44549zzc, f, this.f44548zzb);
        return this;
    }

    @NonNull
    public final f add(int i) throws IOException {
        zzb();
        this.f44550zzd.zzd(this.f44549zzc, i, this.f44548zzb);
        return this;
    }

    @NonNull
    public final f add(long j2) throws IOException {
        zzb();
        this.f44550zzd.zze(this.f44549zzc, j2, this.f44548zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(String str) throws IOException {
        zzb();
        this.f44550zzd.zzc(this.f44549zzc, str, this.f44548zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(boolean z) throws IOException {
        zzb();
        this.f44550zzd.zzd(this.f44549zzc, z ? 1 : 0, this.f44548zzb);
        return this;
    }

    @NonNull
    public final f add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.f44550zzd.zzc(this.f44549zzc, bArr, this.f44548zzb);
        return this;
    }
}
