package com.google.android.play.core.install;

/* JADX INFO: loaded from: classes16.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f49172c;
    public final int d;
    public final String e;

    public zza(int i, int i2, long j2, long j3, String str) {
        this.f49170a = i;
        this.f49171b = j2;
        this.f49172c = j3;
        this.d = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zza) {
            zza zzaVar = (zza) obj2;
            if (this.f49170a == zzaVar.f49170a && this.f49171b == zzaVar.f49171b && this.f49172c == zzaVar.f49172c && this.d == zzaVar.d && this.e.equals(zzaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f49170a ^ 1000003;
        long j2 = this.f49171b;
        long j3 = this.f49172c;
        return (((((((i * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f49170a + ", bytesDownloaded=" + this.f49171b + ", totalBytesToDownload=" + this.f49172c + ", installErrorCode=" + this.d + ", packageName=" + this.e + "}";
    }
}
