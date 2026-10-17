package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgn extends zzlz implements zzni {
    private zzgn() {
        throw null;
    }

    public final int zza() {
        return ((zzgo) this.f40454zza).zzb();
    }

    public final zzgm zzb(int i) {
        return ((zzgo) this.f40454zza).zze(i);
    }

    public final zzgn zzc() {
        zzbe();
        ((zzgo) this.f40454zza).f40134zzj = zzmd.zzcn();
        return this;
    }

    public final zzgn zzd() {
        zzbe();
        ((zzgo) this.f40454zza).zzm = zzmd.zzcn();
        return this;
    }

    public final zzgn zze(int i, zzgl zzglVar) {
        zzbe();
        zzgo.zzs((zzgo) this.f40454zza, i, (zzgm) zzglVar.zzba());
        return this;
    }

    public final String zzf() {
        return ((zzgo) this.f40454zza).zzk();
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzgo) this.f40454zza).zzm());
    }

    public final List zzh() {
        return Collections.unmodifiableList(((zzgo) this.f40454zza).zzn());
    }

    public /* synthetic */ zzgn(zzgz zzgzVar) {
        super(zzgo.f40127zzb);
    }
}
