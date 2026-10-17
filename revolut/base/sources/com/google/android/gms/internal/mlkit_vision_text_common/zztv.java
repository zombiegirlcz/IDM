package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zztv implements zzts {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final List f44981zza;

    public zztv(Context context, zztu zztuVar) {
        ArrayList arrayList = new ArrayList();
        this.f44981zza = arrayList;
        if (zztuVar.zzc()) {
            arrayList.add(new zzuk(context, zztuVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        Iterator it8 = this.f44981zza.iterator();
        while (it8.hasNext()) {
            ((zzts) it8.next()).zza(zztrVar);
        }
    }
}
