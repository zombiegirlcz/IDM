package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
abstract class zzs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final int f37621zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final TaskCompletionSource f37622zzb = new TaskCompletionSource();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final int f37623zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final Bundle f37624zzd;

    public zzs(int i, int i2, Bundle bundle) {
        this.f37621zza = i;
        this.f37623zzc = i2;
        this.f37624zzd = bundle;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Request { what=");
        sb6.append(this.f37623zzc);
        sb6.append(" id=");
        sb6.append(this.f37621zza);
        sb6.append(" oneWay=");
        return a.t(sb6, zzb(), "}");
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str = "Failing " + toString() + " with " + zztVar.toString();
        }
        this.f37622zzb.setException(zztVar);
    }

    public final void zzd(Object obj2) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str = "Finishing " + toString() + " with " + String.valueOf(obj2);
        }
        this.f37622zzb.setResult(obj2);
    }
}
