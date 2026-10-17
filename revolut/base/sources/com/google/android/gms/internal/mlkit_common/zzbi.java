package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import ve.b;
import ve.f;

/* JADX INFO: loaded from: classes16.dex */
final class zzbi implements f {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f40770zza = false;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f40771zzb = false;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private b f40772zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzbe f40773zzd;

    public zzbi(zzbe zzbeVar) {
        this.f40773zzd = zzbeVar;
    }

    private final void zzb() {
        if (this.f40770zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f40770zza = true;
    }

    @NonNull
    public final f add(double d) throws IOException {
        zzb();
        this.f40773zzd.zza(this.f40772zzc, d, this.f40771zzb);
        return this;
    }

    public final void zza(b bVar, boolean z) {
        this.f40770zza = false;
        this.f40772zzc = bVar;
        this.f40771zzb = z;
    }

    @NonNull
    public final f add(float f) throws IOException {
        zzb();
        this.f40773zzd.zzb(this.f40772zzc, f, this.f40771zzb);
        return this;
    }

    @NonNull
    public final f add(int i) throws IOException {
        zzb();
        this.f40773zzd.zzd(this.f40772zzc, i, this.f40771zzb);
        return this;
    }

    @NonNull
    public final f add(long j2) throws IOException {
        zzb();
        this.f40773zzd.zze(this.f40772zzc, j2, this.f40771zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(String str) throws IOException {
        zzb();
        this.f40773zzd.zzc(this.f40772zzc, str, this.f40771zzb);
        return this;
    }

    @Override // ve.f
    @NonNull
    public final f add(boolean z) throws IOException {
        zzb();
        this.f40773zzd.zzd(this.f40772zzc, z ? 1 : 0, this.f40771zzb);
        return this;
    }

    @NonNull
    public final f add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.f40773zzd.zzc(this.f40772zzc, bArr, this.f40771zzb);
        return this;
    }
}
