package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class zzad extends zzaa {
    public zzad() {
        super(4);
    }

    public final zzad zzb(Object obj2) {
        zza(obj2);
        return this;
    }

    public final zzad zzc(Iterator it8) {
        while (it8.hasNext()) {
            zza(it8.next());
        }
        return this;
    }

    public final zzah zzd() {
        this.f39227zzc = true;
        return zzah.zzq(this.f39225zza, this.f39226zzb);
    }

    public zzad(int i) {
        super(4);
    }
}
