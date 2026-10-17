package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import ve.b;
import ve.f;

/* JADX INFO: loaded from: classes16.dex */
final class zzao implements f {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f42639zza = false;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f42640zzb = false;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private b f42641zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzak f42642zzd;

    public zzao(zzak zzakVar) {
        this.f42642zzd = zzakVar;
    }

    private final void zzb() {
        if (this.f42639zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f42639zza = true;
    }

    @NonNull
    public final f add(double d) throws IOException {
        zzb();
        this.f42642zzd.zza(this.f42641zzc, d, this.f42640zzb);
        return this;
    }

    public final void zza(b bVar, boolean z) {
        this.f42639zza = false;
        this.f42641zzc = bVar;
        this.f42640zzb = z;
    }

    @NonNull
    public final f add(float f) throws IOException {
        zzb();
        this.f42642zzd.zzb(this.f42641zzc, f, this.f42640zzb);
        return this;
    }

    @NonNull
    public final f add(int i) throws IOException {
        zzb();
        this.f42642zzd.zzd(this.f42641zzc, i, this.f42640zzb);
        return this;
    }

    @NonNull
    public final f add(long j2) throws IOException {
        zzb();
        this.f42642zzd.zze(this.f42641zzc, j2, this.f42640zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(String str) throws IOException {
        zzb();
        this.f42642zzd.zzc(this.f42641zzc, str, this.f42640zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(boolean z) throws IOException {
        zzb();
        this.f42642zzd.zzd(this.f42641zzc, z ? 1 : 0, this.f42640zzb);
        return this;
    }

    @NonNull
    public final f add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.f42642zzd.zzc(this.f42641zzc, bArr, this.f42640zzb);
        return this;
    }
}
