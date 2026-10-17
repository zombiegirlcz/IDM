package com.google.android.gms.internal.fido;

import java.util.Arrays;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhn extends zzhp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f39536zza;

    public zzhn(String str) {
        this.f39536zza = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        int length;
        int length2;
        zzhp zzhpVar = (zzhp) obj2;
        if (zzhp.zzd((byte) 96) != zzhpVar.zza()) {
            length = zzhpVar.zza();
            length2 = zzhp.zzd((byte) 96);
        } else {
            String str = this.f39536zza;
            String str2 = ((zzhn) zzhpVar).f39536zza;
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            length = str2.length();
            length2 = str.length();
        }
        return length2 - length;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && zzhn.class == obj2.getClass()) {
            return this.f39536zza.equals(((zzhn) obj2).f39536zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) 96)), this.f39536zza});
    }

    public final String toString() {
        return a.i(new StringBuilder("\""), this.f39536zza, "\"");
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd((byte) 96);
    }
}
