package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes16.dex */
final class zad extends zag {
    final /* synthetic */ Intent zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ Activity f38107zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ int f38108zac;

    public zad(Intent intent, Activity activity, int i) {
        this.zaa = intent;
        this.f38107zab = activity;
        this.f38108zac = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.f38107zab.startActivityForResult(intent, this.f38108zac);
        }
    }
}
