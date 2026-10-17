package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zztq implements zztn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final List f42431zza;

    public zztq(Context context, zztp zztpVar) {
        ArrayList arrayList = new ArrayList();
        this.f42431zza = arrayList;
        if (zztpVar.zzc()) {
            arrayList.add(new zzuf(context, zztpVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztn
    public final void zza(zztm zztmVar) {
        Iterator it8 = this.f42431zza.iterator();
        while (it8.hasNext()) {
            ((zztn) it8.next()).zza(zztmVar);
        }
    }
}
