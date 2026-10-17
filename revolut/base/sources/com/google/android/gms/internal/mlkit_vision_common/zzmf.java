package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmf implements zzmc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final List f43385zza;

    public zzmf(Context context, zzme zzmeVar) {
        ArrayList arrayList = new ArrayList();
        this.f43385zza = arrayList;
        if (zzmeVar.zzc()) {
            arrayList.add(new zzmp(context, zzmeVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        Iterator it8 = this.f43385zza.iterator();
        while (it8.hasNext()) {
            ((zzmc) it8.next()).zza(zzmbVar);
        }
    }
}
