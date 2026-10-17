package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzll implements zzor {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzlk f40422zza;

    private zzll(zzlk zzlkVar) {
        byte[] bArr = zzmk.f40466zzb;
        this.f40422zza = zzlkVar;
        zzlkVar.f40421zza = this;
    }

    public static zzll zza(zzlk zzlkVar) {
        zzll zzllVar = zzlkVar.f40421zza;
        return zzllVar != null ? zzllVar : new zzll(zzlkVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).getClass();
                i3 += 8;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                this.f40422zza.zzh(i, zzmwVar.zza(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int i6 = 0;
        for (int i21 = 0; i21 < zzmwVar.size(); i21++) {
            zzmwVar.zza(i21);
            i6 += 8;
        }
        zzlkVar2.zzt(i6);
        while (i2 < zzmwVar.size()) {
            zzlkVar2.zzi(zzmwVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzB(int i, int i2) throws IOException {
        this.f40422zza.zzs(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzlk zzlkVar = this.f40422zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zzlkVar.zzs(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            zzlk zzlkVar2 = this.f40422zza;
            zzlkVar2.zzr(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzz += zzlk.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzlkVar2.zzt(iZzz);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zzlkVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                zzlk zzlkVar3 = this.f40422zza;
                int iZze = zzmeVar.zze(i2);
                zzlkVar3.zzs(i, (iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return;
        }
        zzlk zzlkVar4 = this.f40422zza;
        zzlkVar4.zzr(i, 2);
        int iZzz2 = 0;
        for (int i5 = 0; i5 < zzmeVar.size(); i5++) {
            int iZze2 = zzmeVar.zze(i5);
            iZzz2 += zzlk.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzlkVar4.zzt(iZzz2);
        while (i2 < zzmeVar.size()) {
            int iZze3 = zzmeVar.zze(i2);
            zzlkVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzD(int i, long j2) throws IOException {
        this.f40422zza.zzu(i, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzlk zzlkVar = this.f40422zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zzlkVar.zzu(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            zzlk zzlkVar2 = this.f40422zza;
            zzlkVar2.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzA += zzlk.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzlkVar2.zzt(iZzA);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zzlkVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                zzlk zzlkVar3 = this.f40422zza;
                long jZza = zzmwVar.zza(i2);
                zzlkVar3.zzu(i, (jZza >> 63) ^ (jZza + jZza));
                i2++;
            }
            return;
        }
        zzlk zzlkVar4 = this.f40422zza;
        zzlkVar4.zzr(i, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zzmwVar.size(); i5++) {
            long jZza2 = zzmwVar.zza(i5);
            iZzA2 += zzlk.zzA((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        zzlkVar4.zzt(iZzA2);
        while (i2 < zzmwVar.size()) {
            long jZza3 = zzmwVar.zza(i2);
            zzlkVar4.zzv((jZza3 >> 63) ^ (jZza3 + jZza3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.f40422zza.zzr(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzG(int i, String str) throws IOException {
        this.f40422zza.zzp(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzmt)) {
            while (i2 < list.size()) {
                this.f40422zza.zzp(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzmt zzmtVar = (zzmt) list;
        while (i2 < list.size()) {
            Object objZzc = zzmtVar.zzc();
            if (objZzc instanceof String) {
                this.f40422zza.zzp(i, (String) objZzc);
            } else {
                this.f40422zza.zze(i, (zzld) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzI(int i, int i2) throws IOException {
        this.f40422zza.zzs(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzs(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzz += zzlk.zzz(((Integer) list.get(i3)).intValue());
            }
            zzlkVar.zzt(iZzz);
            while (i2 < list.size()) {
                zzlkVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.f40422zza.zzs(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int iZzz2 = 0;
        for (int i5 = 0; i5 < zzmeVar.size(); i5++) {
            iZzz2 += zzlk.zzz(zzmeVar.zze(i5));
        }
        zzlkVar2.zzt(iZzz2);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzt(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzK(int i, long j2) throws IOException {
        this.f40422zza.zzu(i, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzu(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzlk.zzA(((Long) list.get(i3)).longValue());
            }
            zzlkVar.zzt(iZzA);
            while (i2 < list.size()) {
                zzlkVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                this.f40422zza.zzu(i, zzmwVar.zza(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zzmwVar.size(); i5++) {
            iZzA2 += zzlk.zzA(zzmwVar.zza(i5));
        }
        zzlkVar2.zzt(iZzA2);
        while (i2 < zzmwVar.size()) {
            zzlkVar2.zzv(zzmwVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzb(int i, boolean z) throws IOException {
        this.f40422zza.zzd(i, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzku)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).getClass();
                i3++;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzku zzkuVar = (zzku) list;
        if (!z) {
            while (i2 < zzkuVar.size()) {
                this.f40422zza.zzd(i, zzkuVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int i6 = 0;
        for (int i21 = 0; i21 < zzkuVar.size(); i21++) {
            zzkuVar.zzf(i21);
            i6++;
        }
        zzlkVar2.zzt(i6);
        while (i2 < zzkuVar.size()) {
            zzlkVar2.zzb(zzkuVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzd(int i, zzld zzldVar) throws IOException {
        this.f40422zza.zze(i, zzldVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f40422zza.zze(i, (zzld) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzf(int i, double d) throws IOException {
        this.f40422zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzlm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).getClass();
                i3 += 8;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z) {
            while (i2 < zzlmVar.size()) {
                this.f40422zza.zzh(i, Double.doubleToRawLongBits(zzlmVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int i6 = 0;
        for (int i21 = 0; i21 < zzlmVar.size(); i21++) {
            zzlmVar.zze(i21);
            i6 += 8;
        }
        zzlkVar2.zzt(i6);
        while (i2 < zzlmVar.size()) {
            zzlkVar2.zzi(Double.doubleToRawLongBits(zzlmVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.f40422zza.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzi(int i, int i2) throws IOException {
        this.f40422zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzlk.zzA(((Integer) list.get(i3)).intValue());
            }
            zzlkVar.zzt(iZzA);
            while (i2 < list.size()) {
                zzlkVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.f40422zza.zzj(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zzmeVar.size(); i5++) {
            iZzA2 += zzlk.zzA(zzmeVar.zze(i5));
        }
        zzlkVar2.zzt(iZzA2);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzk(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzk(int i, int i2) throws IOException {
        this.f40422zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).getClass();
                i3 += 4;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.f40422zza.zzf(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int i6 = 0;
        for (int i21 = 0; i21 < zzmeVar.size(); i21++) {
            zzmeVar.zze(i21);
            i6 += 4;
        }
        zzlkVar2.zzt(i6);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzg(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzm(int i, long j2) throws IOException {
        this.f40422zza.zzh(i, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).getClass();
                i3 += 8;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                this.f40422zza.zzh(i, zzmwVar.zza(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int i6 = 0;
        for (int i21 = 0; i21 < zzmwVar.size(); i21++) {
            zzmwVar.zza(i21);
            i6 += 8;
        }
        zzlkVar2.zzt(i6);
        while (i2 < zzmwVar.size()) {
            zzlkVar2.zzi(zzmwVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzo(int i, float f) throws IOException {
        this.f40422zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzlw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).getClass();
                i3 += 4;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzlw zzlwVar = (zzlw) list;
        if (!z) {
            while (i2 < zzlwVar.size()) {
                this.f40422zza.zzf(i, Float.floatToRawIntBits(zzlwVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int i6 = 0;
        for (int i21 = 0; i21 < zzlwVar.size(); i21++) {
            zzlwVar.zze(i21);
            i6 += 4;
        }
        zzlkVar2.zzt(i6);
        while (i2 < zzlwVar.size()) {
            zzlkVar2.zzg(Float.floatToRawIntBits(zzlwVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzq(int i, Object obj2, zzns zznsVar) throws IOException {
        zzlk zzlkVar = this.f40422zza;
        zzlkVar.zzr(i, 3);
        zznsVar.zzi((zznh) obj2, zzlkVar.f40421zza);
        zzlkVar.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzr(int i, int i2) throws IOException {
        this.f40422zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzlk.zzA(((Integer) list.get(i3)).intValue());
            }
            zzlkVar.zzt(iZzA);
            while (i2 < list.size()) {
                zzlkVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.f40422zza.zzj(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zzmeVar.size(); i5++) {
            iZzA2 += zzlk.zzA(zzmeVar.zze(i5));
        }
        zzlkVar2.zzt(iZzA2);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzk(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzt(int i, long j2) throws IOException {
        this.f40422zza.zzu(i, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzu(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzlk.zzA(((Long) list.get(i3)).longValue());
            }
            zzlkVar.zzt(iZzA);
            while (i2 < list.size()) {
                zzlkVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                this.f40422zza.zzu(i, zzmwVar.zza(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zzmwVar.size(); i5++) {
            iZzA2 += zzlk.zzA(zzmwVar.zza(i5));
        }
        zzlkVar2.zzt(iZzA2);
        while (i2 < zzmwVar.size()) {
            zzlkVar2.zzv(zzmwVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzv(int i, Object obj2, zzns zznsVar) throws IOException {
        this.f40422zza.zzm(i, (zznh) obj2, zznsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzw(int i, Object obj2) throws IOException {
        if (obj2 instanceof zzld) {
            this.f40422zza.zzo(i, (zzld) obj2);
        } else {
            this.f40422zza.zzn(i, (zznh) obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzx(int i, int i2) throws IOException {
        this.f40422zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f40422zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzlk zzlkVar = this.f40422zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).getClass();
                i3 += 4;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.f40422zza.zzf(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        zzlk zzlkVar2 = this.f40422zza;
        zzlkVar2.zzr(i, 2);
        int i6 = 0;
        for (int i21 = 0; i21 < zzmeVar.size(); i21++) {
            zzmeVar.zze(i21);
            i6 += 4;
        }
        zzlkVar2.zzt(i6);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzg(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzz(int i, long j2) throws IOException {
        this.f40422zza.zzh(i, j2);
    }
}
