package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzsc implements zzrz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final List f41199zza;

    public zzsc(Context context, zzsb zzsbVar) {
        ArrayList arrayList = new ArrayList();
        this.f41199zza = arrayList;
        if (zzsbVar.zzc()) {
            arrayList.add(new zzsp(context, zzsbVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        Iterator it8 = this.f41199zza.iterator();
        while (it8.hasNext()) {
            ((zzrz) it8.next()).zza(zzryVar);
        }
    }
}
