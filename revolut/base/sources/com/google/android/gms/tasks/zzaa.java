package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzaa implements Continuation {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Collection f48757zza;

    public zzaa(Collection collection) {
        this.f48757zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(@NonNull Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = this.f48757zza.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Task) it8.next()).getResult());
        }
        return arrayList;
    }
}
