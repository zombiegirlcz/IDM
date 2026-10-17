package com.google.android.gms.internal.fido;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzfg extends AbstractMap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Comparator f39439zza = new zzfd();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object[] f39440zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int[] f39441zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Set f39442zzd = new zzff(this, -1);

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Integer f39443zze = null;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f39444zzf = null;

    public zzfg(List list) {
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            zzfc.zza((zzfc) it8.next());
            throw null;
        }
        int size = list.size();
        Object[] objArrCopyOf = new Object[size];
        Iterator it9 = list.iterator();
        if (it9.hasNext()) {
            zzfc.zza((zzfc) it9.next());
            throw null;
        }
        int[] iArr = {0};
        if (size > 16 && size * 9 > 0) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, 0);
        }
        this.f39440zzb = objArrCopyOf;
        this.f39441zzc = iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f39442zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f39443zze == null) {
            this.f39443zze = Integer.valueOf(super.hashCode());
        }
        return this.f39443zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f39444zzf == null) {
            this.f39444zzf = super.toString();
        }
        return this.f39444zzf;
    }
}
