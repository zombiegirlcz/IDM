package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzgr implements Iterator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzgv f39106zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39107zzb = -1;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f39108zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Iterator f39109zzd;

    private final Iterator zza() {
        if (this.f39109zzd == null) {
            this.f39109zzd = this.f39106zza.f39113zzc.entrySet().iterator();
        }
        return this.f39109zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39107zzb + 1 >= this.f39106zza.f39112zzb.size()) {
            return !this.f39106zza.f39113zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f39108zzc = true;
        int i = this.f39107zzb + 1;
        this.f39107zzb = i;
        return i < this.f39106zza.f39112zzb.size() ? (Map.Entry) this.f39106zza.f39112zzb.get(this.f39107zzb) : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f39108zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f39108zzc = false;
        this.f39106zza.zzn();
        if (this.f39107zzb >= this.f39106zza.f39112zzb.size()) {
            zza().remove();
            return;
        }
        zzgv zzgvVar = this.f39106zza;
        int i = this.f39107zzb;
        this.f39107zzb = i - 1;
        zzgvVar.zzl(i);
    }
}
