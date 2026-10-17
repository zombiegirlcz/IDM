package ud;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f279058a;

    public b(c cVar) {
        this.f279058a = cVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzkc
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        c cVar = this.f279058a;
        if (cVar.f279059a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            ImmutableSet immutableSet = a.f279055a;
            String strZza = zzjy.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            cVar.f279060b.r(2, bundle2);
        }
    }
}
