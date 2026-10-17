package com.google.android.gms.nearby.exposurenotification;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.nearby.zzua;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DiagnosisKeyFileProvider {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private int f47907zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzua f47908zzb;

    public DiagnosisKeyFileProvider(@NonNull List<File> list) {
        this.f47908zzb = zzua.zzj(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final File zza() {
        int i = this.f47907zza;
        this.f47907zza = i + 1;
        return (File) this.f47908zzb.get(i);
    }

    public final boolean zzb() {
        return this.f47908zzb.size() > this.f47907zza;
    }
}
