package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
final class zae implements View.OnClickListener {
    final /* synthetic */ Context zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ Intent f38413zab;

    public zae(Context context, Intent intent) {
        this.zaa = context;
        this.f38413zab = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.zaa.startActivity(this.f38413zab);
        } catch (ActivityNotFoundException e) {
        }
    }
}
