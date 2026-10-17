package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzgf implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Iterator f46044zza;

    public zzgf(Iterator it8) {
        this.f46044zza = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46044zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f46044zza.next();
        return entry.getValue() instanceof zzgh ? new zzge(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f46044zza.remove();
    }
}
