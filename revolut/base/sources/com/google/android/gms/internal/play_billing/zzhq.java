package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzhq implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzht f46103zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f46104zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f46105zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Iterator f46106zzd;

    public /* synthetic */ zzhq(zzht zzhtVar, zzhs zzhsVar) {
        Objects.requireNonNull(zzhtVar);
        this.f46103zza = zzhtVar;
        this.f46104zzb = -1;
    }

    private final Iterator zza() {
        if (this.f46106zzd == null) {
            this.f46106zzd = this.f46103zza.f46110zzc.entrySet().iterator();
        }
        return this.f46106zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f46104zzb + 1;
        zzht zzhtVar = this.f46103zza;
        if (i >= zzhtVar.f46109zzb) {
            return !zzhtVar.f46110zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f46105zzc = true;
        int i = this.f46104zzb + 1;
        this.f46104zzb = i;
        zzht zzhtVar = this.f46103zza;
        return i < zzhtVar.f46109zzb ? (zzhp) zzhtVar.f46108zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f46105zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f46105zzc = false;
        zzht zzhtVar = this.f46103zza;
        zzhtVar.zzo();
        int i = this.f46104zzb;
        if (i >= zzhtVar.f46109zzb) {
            zza().remove();
        } else {
            this.f46104zzb = i - 1;
            zzhtVar.zzm(i);
        }
    }
}
