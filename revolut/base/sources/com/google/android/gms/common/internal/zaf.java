package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes16.dex */
final class zaf extends zag {
    final /* synthetic */ Intent zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ LifecycleFragment f38111zab;

    public zaf(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.zaa = intent;
        this.f38111zab = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.f38111zab.startActivityForResult(intent, 2);
        }
    }
}
