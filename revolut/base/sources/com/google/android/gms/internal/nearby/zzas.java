package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzas extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ List f45088zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45089zzb;

    public zzas(zzax zzaxVar, List list, TaskCompletionSource taskCompletionSource) {
        this.f45088zza = list;
        this.f45089zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        Iterator it8 = this.f45088zza.iterator();
        while (it8.hasNext()) {
            try {
                ((ParcelFileDescriptor) it8.next()).close();
            } catch (IOException e) {
            }
        }
        TaskUtil.trySetResultOrApiException(status, null, this.f45089zzb);
    }
}
