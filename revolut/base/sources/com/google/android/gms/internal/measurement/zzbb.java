package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzap zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        double dZzc;
        Double dValueOf = Double.valueOf(-1.0d);
        String strZzi = ",";
        double dZzc2 = 0.0d;
        zzai zzaiVar = null;
        int i = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.zzh("toString", 0, list);
                    return new zzat(zzaeVar.zzj(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    zzae zzaeVar2 = (zzae) zzaeVar.zzd();
                    if (!list.isEmpty()) {
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            zzap zzapVarZzb = zzgVar.zzb((zzap) it8.next());
                            if (zzapVarZzb instanceof zzag) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int iZzc = zzaeVar2.zzc();
                            if (zzapVarZzb instanceof zzae) {
                                zzae zzaeVar3 = (zzae) zzapVarZzb;
                                Iterator itZzk = zzaeVar3.zzk();
                                while (itZzk.hasNext()) {
                                    Integer num = (Integer) itZzk.next();
                                    zzaeVar2.zzq(num.intValue() + iZzc, zzaeVar3.zze(num.intValue()));
                                }
                            } else {
                                zzaeVar2.zzq(iZzc, zzapVarZzb);
                            }
                        }
                    }
                    return zzaeVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    zzh.zzh("filter", 1, list);
                    zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(0));
                    if (!(zzapVarZzb2 instanceof zzao)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzb() == 0) {
                        return new zzae();
                    }
                    zzae zzaeVar4 = (zzae) zzaeVar.zzd();
                    zzae zzaeVarZzb = zzb(zzaeVar, zzgVar, (zzao) zzapVarZzb2, null, Boolean.TRUE);
                    zzae zzaeVar5 = new zzae();
                    Iterator itZzk2 = zzaeVarZzb.zzk();
                    while (itZzk2.hasNext()) {
                        zzaeVar5.zzq(zzaeVar5.zzc(), zzaeVar4.zze(((Integer) itZzk2.next()).intValue()));
                    }
                    return zzaeVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return zzc(zzaeVar, zzgVar, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new zzae();
                    }
                    int iZza = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                    if (iZza < 0) {
                        iZza = Math.max(0, zzaeVar.zzc() + iZza);
                    } else if (iZza > zzaeVar.zzc()) {
                        iZza = zzaeVar.zzc();
                    }
                    int iZzc2 = zzaeVar.zzc();
                    zzae zzaeVar6 = new zzae();
                    if (list.size() > 1) {
                        int iMax = Math.max(0, (int) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
                        if (iMax > 0) {
                            for (int i2 = iZza; i2 < Math.min(iZzc2, iZza + iMax); i2++) {
                                zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(iZza));
                                zzaeVar.zzp(iZza);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i3 = 2; i3 < list.size(); i3++) {
                                zzap zzapVarZzb3 = zzgVar.zzb((zzap) list.get(i3));
                                if (zzapVarZzb3 instanceof zzag) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                zzaeVar.zzo((iZza + i3) - 2, zzapVarZzb3);
                            }
                        }
                    } else {
                        while (iZza < iZzc2) {
                            zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(iZza));
                            zzaeVar.zzq(iZza, null);
                            iZza++;
                        }
                    }
                    return zzaeVar6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    zzh.zzh("forEach", 1, list);
                    zzap zzapVarZzb4 = zzgVar.zzb((zzap) list.get(0));
                    if (!(zzapVarZzb4 instanceof zzao)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzb() == 0) {
                        return zzap.f39833zzf;
                    }
                    zzb(zzaeVar, zzgVar, (zzao) zzapVarZzb4, null, null);
                    return zzap.f39833zzf;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.zzj("lastIndexOf", 2, list);
                    zzap zzapVarZzb5 = zzap.f39833zzf;
                    if (!list.isEmpty()) {
                        zzapVarZzb5 = zzgVar.zzb((zzap) list.get(0));
                    }
                    int iZzc3 = zzaeVar.zzc() - 1;
                    if (list.size() > 1) {
                        zzap zzapVarZzb6 = zzgVar.zzb((zzap) list.get(1));
                        dZzc = Double.isNaN(zzapVarZzb6.zzh().doubleValue()) ? zzaeVar.zzc() - 1 : zzh.zza(zzapVarZzb6.zzh().doubleValue());
                        if (dZzc < 0.0d) {
                            dZzc += (double) zzaeVar.zzc();
                        }
                    } else {
                        dZzc = iZzc3;
                    }
                    if (dZzc < 0.0d) {
                        return new zzah(dValueOf);
                    }
                    for (int iMin = (int) Math.min(zzaeVar.zzc(), dZzc); iMin >= 0; iMin--) {
                        if (zzaeVar.zzs(iMin) && zzh.zzl(zzaeVar.zze(iMin), zzapVarZzb5)) {
                            return new zzah(Double.valueOf(iMin));
                        }
                    }
                    return new zzah(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        zzae zzaeVar7 = new zzae();
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            zzap zzapVarZzb7 = zzgVar.zzb((zzap) it9.next());
                            if (zzapVarZzb7 instanceof zzag) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            zzaeVar7.zzq(zzaeVar7.zzc(), zzapVarZzb7);
                        }
                        int iZzc4 = zzaeVar7.zzc();
                        Iterator itZzk3 = zzaeVar.zzk();
                        while (itZzk3.hasNext()) {
                            Integer num2 = (Integer) itZzk3.next();
                            zzaeVar7.zzq(num2.intValue() + iZzc4, zzaeVar.zze(num2.intValue()));
                        }
                        zzaeVar.zzn();
                        Iterator itZzk4 = zzaeVar7.zzk();
                        while (itZzk4.hasNext()) {
                            Integer num3 = (Integer) itZzk4.next();
                            zzaeVar.zzq(num3.intValue(), zzaeVar7.zze(num3.intValue()));
                        }
                    }
                    return new zzah(Double.valueOf(zzaeVar.zzc()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    zzh.zzh("map", 1, list);
                    zzap zzapVarZzb8 = zzgVar.zzb((zzap) list.get(0));
                    if (zzapVarZzb8 instanceof zzao) {
                        return zzaeVar.zzc() == 0 ? new zzae() : zzb(zzaeVar, zzgVar, (zzao) zzapVarZzb8, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    zzh.zzh("pop", 0, list);
                    int iZzc5 = zzaeVar.zzc();
                    if (iZzc5 == 0) {
                        return zzap.f39833zzf;
                    }
                    int i5 = iZzc5 - 1;
                    zzap zzapVarZze = zzaeVar.zze(i5);
                    zzaeVar.zzp(i5);
                    return zzapVarZze;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    zzh.zzj("join", 1, list);
                    if (zzaeVar.zzc() == 0) {
                        return zzap.zzm;
                    }
                    if (!list.isEmpty()) {
                        zzap zzapVarZzb9 = zzgVar.zzb((zzap) list.get(0));
                        strZzi = ((zzapVarZzb9 instanceof zzan) || (zzapVarZzb9 instanceof zzau)) ? "" : zzapVarZzb9.zzi();
                    }
                    return new zzat(zzaeVar.zzj(strZzi));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            zzaeVar.zzq(zzaeVar.zzc(), zzgVar.zzb((zzap) it10.next()));
                        }
                    }
                    return new zzah(Double.valueOf(zzaeVar.zzc()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    zzh.zzh("some", 1, list);
                    zzap zzapVarZzb10 = zzgVar.zzb((zzap) list.get(0));
                    if (!(zzapVarZzb10 instanceof zzai)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzc() == 0) {
                        return zzap.f39839zzl;
                    }
                    zzai zzaiVar2 = (zzai) zzapVarZzb10;
                    Iterator itZzk5 = zzaeVar.zzk();
                    while (itZzk5.hasNext()) {
                        int iIntValue = ((Integer) itZzk5.next()).intValue();
                        if (zzaeVar.zzs(iIntValue) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zze(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar)).zzg().booleanValue()) {
                            return zzap.f39838zzk;
                        }
                    }
                    return zzap.f39839zzl;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    zzh.zzj("sort", 1, list);
                    if (zzaeVar.zzc() >= 2) {
                        List listZzm = zzaeVar.zzm();
                        if (!list.isEmpty()) {
                            zzap zzapVarZzb11 = zzgVar.zzb((zzap) list.get(0));
                            if (!(zzapVarZzb11 instanceof zzai)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            zzaiVar = (zzai) zzapVarZzb11;
                        }
                        Collections.sort(listZzm, new zzba(zzaiVar, zzgVar));
                        zzaeVar.zzn();
                        Iterator it11 = listZzm.iterator();
                        while (it11.hasNext()) {
                            zzaeVar.zzq(i, (zzap) it11.next());
                            i++;
                        }
                    }
                    return zzaeVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    zzh.zzh("every", 1, list);
                    zzap zzapVarZzb12 = zzgVar.zzb((zzap) list.get(0));
                    if (!(zzapVarZzb12 instanceof zzao)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (zzaeVar.zzc() != 0 && zzb(zzaeVar, zzgVar, (zzao) zzapVarZzb12, Boolean.FALSE, Boolean.TRUE).zzc() != zzaeVar.zzc()) {
                        return zzap.f39839zzl;
                    }
                    return zzap.f39838zzk;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    zzh.zzh("shift", 0, list);
                    if (zzaeVar.zzc() == 0) {
                        return zzap.f39833zzf;
                    }
                    zzap zzapVarZze2 = zzaeVar.zze(0);
                    zzaeVar.zzp(0);
                    return zzapVarZze2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    zzh.zzj("slice", 2, list);
                    if (list.isEmpty()) {
                        return zzaeVar.zzd();
                    }
                    double dZzc3 = zzaeVar.zzc();
                    double dZza = zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                    double dMax = dZza < 0.0d ? Math.max(dZza + dZzc3, 0.0d) : Math.min(dZza, dZzc3);
                    if (list.size() == 2) {
                        double dZza2 = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                        dZzc3 = dZza2 < 0.0d ? Math.max(dZzc3 + dZza2, 0.0d) : Math.min(dZzc3, dZza2);
                    }
                    zzae zzaeVar8 = new zzae();
                    for (int i6 = (int) dMax; i6 < dZzc3; i6++) {
                        zzaeVar8.zzq(zzaeVar8.zzc(), zzaeVar.zze(i6));
                    }
                    return zzaeVar8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return zzc(zzaeVar, zzgVar, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    zzh.zzh("reverse", 0, list);
                    int iZzc6 = zzaeVar.zzc();
                    if (iZzc6 != 0) {
                        while (i < iZzc6 / 2) {
                            if (zzaeVar.zzs(i)) {
                                zzap zzapVarZze3 = zzaeVar.zze(i);
                                zzaeVar.zzq(i, null);
                                int i21 = (iZzc6 - 1) - i;
                                if (zzaeVar.zzs(i21)) {
                                    zzaeVar.zzq(i, zzaeVar.zze(i21));
                                }
                                zzaeVar.zzq(i21, zzapVarZze3);
                            }
                            i++;
                        }
                    }
                    return zzaeVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.zzj("indexOf", 2, list);
                    zzap zzapVarZzb13 = zzap.f39833zzf;
                    if (!list.isEmpty()) {
                        zzapVarZzb13 = zzgVar.zzb((zzap) list.get(0));
                    }
                    if (list.size() > 1) {
                        double dZza3 = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                        if (dZza3 >= zzaeVar.zzc()) {
                            return new zzah(dValueOf);
                        }
                        dZzc2 = dZza3 < 0.0d ? ((double) zzaeVar.zzc()) + dZza3 : dZza3;
                    }
                    Iterator itZzk6 = zzaeVar.zzk();
                    while (itZzk6.hasNext()) {
                        int iIntValue2 = ((Integer) itZzk6.next()).intValue();
                        double d = iIntValue2;
                        if (d >= dZzc2 && zzh.zzl(zzaeVar.zze(iIntValue2), zzapVarZzb13)) {
                            return new zzah(Double.valueOf(d));
                        }
                    }
                    return new zzah(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzae zzb(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator itZzk = zzaeVar.zzk();
        while (itZzk.hasNext()) {
            int iIntValue = ((Integer) itZzk.next()).intValue();
            if (zzaeVar.zzs(iIntValue)) {
                zzap zzapVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zze(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
                if (zzapVarZza.zzg().equals(bool)) {
                    break;
                }
                if (bool2 == null || zzapVarZza.zzg().equals(bool2)) {
                    zzaeVar2.zzq(iIntValue, zzapVarZza);
                }
            }
        }
        return zzaeVar2;
    }

    private static zzap zzc(zzae zzaeVar, zzg zzgVar, List list, boolean z) {
        zzap zzapVarZza;
        zzh.zzi("reduce", 1, list);
        zzh.zzj("reduce", 2, list);
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
        if (!(zzapVarZzb instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzapVarZza = zzgVar.zzb((zzap) list.get(1));
            if (zzapVarZza instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.zzc() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzapVarZza = null;
        }
        zzai zzaiVar = (zzai) zzapVarZzb;
        int iZzc = zzaeVar.zzc();
        int i = z ? 0 : iZzc - 1;
        int i2 = z ? iZzc - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (zzapVarZza == null) {
            zzapVarZza = zzaeVar.zze(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (zzaeVar.zzs(i)) {
                zzapVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzapVarZza, zzaeVar.zze(i), new zzah(Double.valueOf(i)), zzaeVar));
                if (zzapVarZza instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return zzapVarZza;
    }
}
