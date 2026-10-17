package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zaac implements OnCompleteListener {
    final /* synthetic */ TaskCompletionSource zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ zaad f37827zab;

    public zaac(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.f37827zab = zaadVar;
        this.zaa = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.f37827zab.f37828zab.remove(this.zaa);
    }
}
