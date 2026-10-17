package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class zau extends zaa {
    final /* synthetic */ AtomicReference zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38216zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ InstallStatusListener f38217zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    final /* synthetic */ zay f38218zad;

    public zau(zay zayVar, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, InstallStatusListener installStatusListener) {
        this.f38218zad = zayVar;
        this.zaa = atomicReference;
        this.f38216zab = taskCompletionSource;
        this.f38217zac = installStatusListener;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.zaa.set(moduleInstallResponse);
        }
        TaskUtil.trySetResultOrApiException(status, null, this.f38216zab);
        if (!status.isSuccess() || (moduleInstallResponse != null && moduleInstallResponse.zaa())) {
            this.f38218zad.doUnregisterEventListener(ListenerHolders.createListenerKey(this.f38217zac, "InstallStatusListener"), 27306);
        }
    }
}
