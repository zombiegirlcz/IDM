package com.google.android.gms.internal.nearby;

import androidx.collection.ArraySet;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzgh extends zzkc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ListenerHolder f45193zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Set f45194zzb = new ArraySet();

    public zzgh(ListenerHolder listenerHolder) {
        this.f45193zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzg(zzlf zzlfVar) {
        if (zzlfVar.zza() != null) {
            return zzlfVar.zzb() == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(zzlfVar.zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzkd
    public final synchronized void zzb(zzld zzldVar) {
        this.f45193zza.notifyListener(new zzgd(this, zzldVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzkd
    public final synchronized void zzc(zzlf zzlfVar) {
        try {
            if (!zzg(zzlfVar)) {
                this.f45194zzb.add(zzlfVar.zzb());
            }
            this.f45193zza.notifyListener(new zzge(this, zzlfVar));
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzkd
    public final synchronized void zzd(zzlh zzlhVar) {
        this.f45194zzb.remove(zzlhVar.zza());
        this.f45193zza.notifyListener(new zzgf(this, zzlhVar));
    }

    public final synchronized void zze() {
        try {
            Iterator it8 = this.f45194zzb.iterator();
            while (it8.hasNext()) {
                this.f45193zza.notifyListener(new zzgg(this, (String) it8.next()));
            }
            this.f45194zzb.clear();
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
