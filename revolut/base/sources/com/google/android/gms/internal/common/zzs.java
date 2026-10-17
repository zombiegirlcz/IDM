package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes16.dex */
final class zzs extends zzv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzp f39251zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzw zzwVar, CharSequence charSequence, zzp zzpVar) {
        super(zzwVar, charSequence);
        this.f39251zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.common.zzv
    public final int zzc(int i) {
        CharSequence charSequence = ((zzv) this).f39255zzb;
        int length = charSequence.length();
        zzr.zzc(i, length, "index");
        while (i < length) {
            if (this.f39251zza.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzv
    public final int zzd(int i) {
        return i + 1;
    }
}
