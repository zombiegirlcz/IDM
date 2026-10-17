package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
final class zzab implements Continuation {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Collection f48758zza;

    public zzab(Collection collection) {
        this.f48758zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(@NonNull Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f48758zza);
        return Tasks.forResult(arrayList);
    }
}
