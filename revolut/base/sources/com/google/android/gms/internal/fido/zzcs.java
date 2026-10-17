package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzcs implements Comparator {
    @Override // java.util.Comparator
    public abstract int compare(Object obj2, Object obj3);

    public zzcs zza() {
        return new zzcx(this);
    }
}
