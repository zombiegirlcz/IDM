package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes16.dex */
final class zae extends zag {
    final /* synthetic */ Intent zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ Fragment f38109zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ int f38110zac;

    public zae(Intent intent, Fragment fragment, int i) {
        this.zaa = intent;
        this.f38109zab = fragment;
        this.f38110zac = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.f38109zab.startActivityForResult(intent, this.f38110zac);
        }
    }
}
