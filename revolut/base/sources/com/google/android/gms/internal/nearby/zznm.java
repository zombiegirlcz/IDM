package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.messages.MessageListener;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zznm extends zznq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ List f45519zza;

    public zznm(zznn zznnVar, List list) {
        this.f45519zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj2) {
        zznn.zzc(this.f45519zza, (MessageListener) obj2);
    }
}
