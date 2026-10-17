package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.internal.nearby.zznq;
import com.google.android.gms.nearby.messages.PublishCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzbd extends zznq {
    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj2) {
        ((PublishCallback) obj2).onExpired();
    }
}
