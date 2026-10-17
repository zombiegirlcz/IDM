package com.google.android.gms.internal.auth;

import android.content.Context;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzcd extends zzda {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Context f38937zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzdj f38938zzb;

    public zzcd(Context context, zzdj zzdjVar) {
        this.f38937zza = context;
        this.f38938zzb = zzdjVar;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzda) {
            zzda zzdaVar = (zzda) obj2;
            if (this.f38937zza.equals(zzdaVar.zza()) && this.f38938zzb.equals(zzdaVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38937zza.hashCode() ^ 1000003) * 1000003) ^ this.f38938zzb.hashCode();
    }

    public final String toString() {
        return a.s("FlagsContext{context=", this.f38937zza.toString(), ", hermeticFileOverrides=", this.f38938zzb.toString(), "}");
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final Context zza() {
        return this.f38937zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final zzdj zzb() {
        return this.f38938zzb;
    }
}
