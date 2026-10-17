package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zznu implements zzob {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final List f44346zza;

    public zznu(Context context, zznt zzntVar) {
        ArrayList arrayList = new ArrayList();
        this.f44346zza = arrayList;
        if (zzntVar.zzc()) {
            arrayList.add(new zzok(context, zzntVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        Iterator it8 = this.f44346zza.iterator();
        while (it8.hasNext()) {
            ((zzob) it8.next()).zza(zznrVar);
        }
    }
}
