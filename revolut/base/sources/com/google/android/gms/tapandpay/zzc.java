package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tapandpay.TapAndPay;

/* JADX INFO: loaded from: classes16.dex */
final class zzc implements ListenerHolder.Notifier {
    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj2) {
        ((TapAndPay.DataChangedListener) obj2).onDataChanged();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
