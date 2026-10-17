package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzmp implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Iterator f40480zza;

    public zzmp(Iterator it8) {
        this.f40480zza = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40480zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f40480zza.next();
        return entry.getValue() instanceof zzmr ? new zzmo(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40480zza.remove();
    }
}
