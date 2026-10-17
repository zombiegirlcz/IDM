package com.google.android.gms.internal.mlkit_common;

import ch.j;
import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzrx extends zzsj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzmu f41192zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f41193zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f41194zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final boolean f41195zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final j f41196zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final zzna f41197zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final int f41198zzg;

    public /* synthetic */ zzrx(zzmu zzmuVar, String str, boolean z, boolean z3, j jVar, zzna zznaVar, int i, zzrw zzrwVar) {
        this.f41192zza = zzmuVar;
        this.f41193zzb = str;
        this.f41194zzc = z;
        this.f41195zzd = z3;
        this.f41196zze = jVar;
        this.f41197zzf = zznaVar;
        this.f41198zzg = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzsj) {
            zzsj zzsjVar = (zzsj) obj2;
            if (this.f41192zza.equals(zzsjVar.zzc()) && this.f41193zzb.equals(zzsjVar.zze()) && this.f41194zzc == zzsjVar.zzg() && this.f41195zzd == zzsjVar.zzf() && this.f41196zze.equals(zzsjVar.zzb()) && this.f41197zzf.equals(zzsjVar.zzd()) && this.f41198zzg == zzsjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f41192zza.hashCode() ^ 1000003) * 1000003) ^ this.f41193zzb.hashCode()) * 1000003) ^ (true != this.f41194zzc ? 1237 : 1231)) * 1000003) ^ (true != this.f41195zzd ? 1237 : 1231)) * 1000003) ^ this.f41196zze.hashCode()) * 1000003) ^ this.f41197zzf.hashCode()) * 1000003) ^ this.f41198zzg;
    }

    public final String toString() {
        zzna zznaVar = this.f41197zzf;
        j jVar = this.f41196zze;
        String string = this.f41192zza.toString();
        String string2 = jVar.toString();
        String string3 = zznaVar.toString();
        StringBuilder sbX = a.x("RemoteModelLoggingOptions{errorCode=", string, ", tfliteSchemaVersion=");
        sbX.append(this.f41193zzb);
        sbX.append(", shouldLogRoughDownloadTime=");
        sbX.append(this.f41194zzc);
        sbX.append(", shouldLogExactDownloadTime=");
        sbX.append(this.f41195zzd);
        sbX.append(", modelType=");
        sbX.append(string2);
        sbX.append(", downloadStatus=");
        sbX.append(string3);
        sbX.append(", failureStatusCode=");
        return j6.a.v(sbX, "}", this.f41198zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
        return this.f41198zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final j zzb() {
        return this.f41196zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzmu zzc() {
        return this.f41192zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzna zzd() {
        return this.f41197zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zze() {
        return this.f41193zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
        return this.f41195zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
        return this.f41194zzc;
    }
}
