package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzp f39260zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f39261zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzu f39262zzc;

    private zzw(zzu zzuVar, boolean z, zzp zzpVar, int i) {
        this.f39262zzc = zzuVar;
        this.f39261zzb = z;
        this.f39260zza = zzpVar;
    }

    public static zzw zza(zzp zzpVar) {
        return new zzw(new zzu(zzpVar), false, zzo.f39250zza, Integer.MAX_VALUE);
    }

    public final zzw zzb() {
        return new zzw(this.f39262zzc, true, this.f39260zza, Integer.MAX_VALUE);
    }

    public final Iterable zzc(CharSequence charSequence) {
        return new zzt(this, charSequence);
    }

    public final List zzd(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZza = this.f39262zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZza.hasNext()) {
            arrayList.add((String) itZza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final /* synthetic */ Iterator zze(CharSequence charSequence) {
        return this.f39262zzc.zza(this, charSequence);
    }

    public final /* synthetic */ zzp zzf() {
        return this.f39260zza;
    }

    public final /* synthetic */ boolean zzg() {
        return this.f39261zzb;
    }
}
