package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzv extends zzk {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final CharSequence f39255zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final zzp f39256zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final boolean f39257zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    int f39258zze = 0;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    int f39259zzf = Integer.MAX_VALUE;

    public zzv(zzw zzwVar, CharSequence charSequence) {
        this.f39256zzc = zzwVar.zzf();
        this.f39257zzd = zzwVar.zzg();
        this.f39255zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzk
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int iZzd;
        int i = this.f39258zze;
        while (true) {
            int i2 = this.f39258zze;
            if (i2 == -1) {
                zzb();
                return null;
            }
            iZzc = zzc(i2);
            if (iZzc == -1) {
                iZzc = this.f39255zzb.length();
                this.f39258zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.f39258zze = iZzd;
            }
            if (iZzd == i) {
                int i3 = iZzd + 1;
                this.f39258zze = i3;
                if (i3 > this.f39255zzb.length()) {
                    this.f39258zze = -1;
                }
            } else {
                if (i < iZzc) {
                    this.f39255zzb.charAt(i);
                }
                if (i < iZzc) {
                    this.f39255zzb.charAt(iZzc - 1);
                }
                if (!this.f39257zzd || i != iZzc) {
                    break;
                }
                i = this.f39258zze;
            }
        }
        int i5 = this.f39259zzf;
        if (i5 == 1) {
            CharSequence charSequence = this.f39255zzb;
            int length = charSequence.length();
            this.f39258zze = -1;
            if (length > i) {
                charSequence.charAt(length - 1);
            }
            iZzc = length;
        } else {
            this.f39259zzf = i5 - 1;
        }
        return this.f39255zzb.subSequence(i, iZzc).toString();
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
