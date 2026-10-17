package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzak implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Iterator f39828zza;

    public zzak(Iterator it8) {
        this.f39828zza = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39828zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.f39828zza.next());
    }
}
