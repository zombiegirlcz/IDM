package com.google.android.gms.internal.fido;

import java.util.Arrays;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhh extends zzhp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final boolean f39529zza;

    public zzhh(boolean z) {
        this.f39529zza = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        zzhp zzhpVar = (zzhp) obj2;
        if (zzhp.zzd(ISO7816.INS_CREATE_FILE) != zzhpVar.zza()) {
            return zzhp.zzd(ISO7816.INS_CREATE_FILE) - zzhpVar.zza();
        }
        return (true != this.f39529zza ? 20 : 21) - (true != ((zzhh) zzhpVar).f39529zza ? 20 : 21);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return obj2 != null && zzhh.class == obj2.getClass() && this.f39529zza == ((zzhh) obj2).f39529zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd(ISO7816.INS_CREATE_FILE)), Boolean.valueOf(this.f39529zza)});
    }

    public final String toString() {
        return Boolean.toString(this.f39529zza);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd(ISO7816.INS_CREATE_FILE);
    }
}
