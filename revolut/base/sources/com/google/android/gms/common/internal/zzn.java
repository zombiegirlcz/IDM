package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.UserHandle;

/* JADX INFO: loaded from: classes.dex */
public final class zzn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f38161zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f38162zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ComponentName f38163zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f38164zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final boolean f38165zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final UserHandle f38166zzf;

    public zzn(ComponentName componentName, int i, UserHandle userHandle) {
        this.f38161zza = null;
        this.f38162zzb = null;
        Preconditions.checkNotNull(componentName);
        this.f38163zzc = componentName;
        this.f38164zzd = 4225;
        this.f38165zze = false;
        this.f38166zzf = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj2;
        return Objects.equal(this.f38161zza, zznVar.f38161zza) && Objects.equal(this.f38162zzb, zznVar.f38162zzb) && Objects.equal(this.f38163zzc, zznVar.f38163zzc) && this.f38165zze == zznVar.f38165zze && Objects.equal(this.f38166zzf, zznVar.f38166zzf);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38161zza, this.f38162zzb, this.f38163zzc, 4225, Boolean.valueOf(this.f38165zze), this.f38166zzf);
    }

    public final String toString() {
        String str = this.f38161zza;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f38163zzc;
        Preconditions.checkNotNull(componentName);
        return componentName.flattenToString();
    }

    public final String zza() {
        return this.f38161zza;
    }

    public final String zzb() {
        return this.f38162zzb;
    }

    public final ComponentName zzc() {
        return this.f38163zzc;
    }

    public final boolean zzd() {
        return this.f38165zze;
    }

    public final UserHandle zze() {
        return this.f38166zzf;
    }

    public zzn(String str, int i, boolean z) {
        this(str, "com.google.android.gms", 4225, false, null);
    }

    public zzn(String str, String str2, int i, boolean z, UserHandle userHandle) {
        Preconditions.checkNotEmpty(str);
        this.f38161zza = str;
        Preconditions.checkNotEmpty(str2);
        this.f38162zzb = str2;
        this.f38163zzc = null;
        this.f38164zzd = 4225;
        this.f38165zze = z;
        this.f38166zzf = userHandle;
    }
}
