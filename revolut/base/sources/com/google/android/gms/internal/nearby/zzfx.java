package com.google.android.gms.internal.nearby;

import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzfx extends zzjv implements zzgl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ListenerHolder f45180zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Set f45181zzb = new ArraySet();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Set f45182zzc = new ArraySet();

    public zzfx(ListenerHolder listenerHolder) {
        this.f45180zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzjw
    public final void zzb(zzkr zzkrVar) {
        this.f45180zza.notifyListener(new zzfu(this, zzkrVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzjw
    public final synchronized void zzc(zzkt zzktVar) {
        this.f45181zzb.add(zzktVar.zzc());
        this.f45180zza.notifyListener(new zzfr(this, zzktVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzjw
    public final synchronized void zzd(zzkz zzkzVar) {
        try {
            this.f45181zzb.remove(zzkzVar.zzb());
            Status statusZzG = zzgz.zzG(zzkzVar.zza());
            if (statusZzG.isSuccess()) {
                this.f45182zzc.add(zzkzVar.zzb());
            }
            this.f45180zza.notifyListener(new zzfs(this, zzkzVar, statusZzG));
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzjw
    public final synchronized void zze(zzlb zzlbVar) {
        this.f45182zzc.remove(zzlbVar.zza());
        this.f45180zza.notifyListener(new zzft(this, zzlbVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzgl
    public final synchronized void zzf() {
        try {
            Iterator it8 = this.f45181zzb.iterator();
            while (it8.hasNext()) {
                this.f45180zza.notifyListener(new zzfv(this, (String) it8.next()));
            }
            this.f45181zzb.clear();
            Iterator it9 = this.f45182zzc.iterator();
            while (it9.hasNext()) {
                this.f45180zza.notifyListener(new zzfw(this, (String) it9.next()));
            }
            this.f45182zzc.clear();
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
