package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzao extends zzai implements zzal {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    protected final List f39830zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @VisibleForTesting
    protected final List f39831zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @VisibleForTesting
    protected zzg f39832zzc;

    private zzao(zzao zzaoVar) {
        super(zzaoVar.f39826zzd);
        ArrayList arrayList = new ArrayList(zzaoVar.f39830zza.size());
        this.f39830zza = arrayList;
        arrayList.addAll(zzaoVar.f39830zza);
        ArrayList arrayList2 = new ArrayList(zzaoVar.f39831zzb.size());
        this.f39831zzb = arrayList2;
        arrayList2.addAll(zzaoVar.f39831zzb);
        this.f39832zzc = zzaoVar.f39832zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzg zzgVarZza = this.f39832zzc.zza();
        int i = 0;
        while (true) {
            List list2 = this.f39830zza;
            if (i >= list2.size()) {
                break;
            }
            if (i < list.size()) {
                zzgVarZza.zze((String) list2.get(i), zzgVar.zzb((zzap) list.get(i)));
            } else {
                zzgVarZza.zze((String) list2.get(i), zzap.f39833zzf);
            }
            i++;
        }
        for (zzap zzapVar : this.f39831zzb) {
            zzap zzapVarZzb = zzgVarZza.zzb(zzapVar);
            if (zzapVarZzb instanceof zzaq) {
                zzapVarZzb = zzgVarZza.zzb(zzapVar);
            }
            if (zzapVarZzb instanceof zzag) {
                return ((zzag) zzapVarZzb).zzb();
            }
        }
        return zzap.f39833zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzao(this);
    }

    public zzao(String str, List list, List list2, zzg zzgVar) {
        super(str);
        this.f39830zza = new ArrayList();
        this.f39832zzc = zzgVar;
        if (!list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                this.f39830zza.add(((zzap) it8.next()).zzi());
            }
        }
        this.f39831zzb = new ArrayList(list2);
    }
}
