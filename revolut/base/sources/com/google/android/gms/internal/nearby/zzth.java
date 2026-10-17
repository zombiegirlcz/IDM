package com.google.android.gms.internal.nearby;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes16.dex */
final class zzth extends ContentObserver {
    public zzth(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzti.f45719zzl.set(true);
    }
}
