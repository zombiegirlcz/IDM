package com.google.firebase.analytics.connector.internal;

import ah.a;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import ce.c;
import ce.n;
import ce.o;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import pd.g;
import td.b;
import td.d;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static b lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        ze.c cVar2 = (ze.c) cVar.a(ze.c.class);
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(cVar2);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (td.c.f269903c == null) {
            synchronized (td.c.class) {
                try {
                    if (td.c.f269903c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f235024b)) {
                            ((o) cVar2).a(new d(0), new a(15));
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        td.c.f269903c = new td.c(zzff.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return td.c.f269903c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @KeepForSdk
    public List<ce.b> getComponents() {
        ce.a aVarB = ce.b.b(b.class);
        aVarB.a(n.c(g.class));
        aVarB.a(n.c(Context.class));
        aVarB.a(n.c(ze.c.class));
        aVarB.f = new dfm.c(15);
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), mo3.a.d("fire-analytics", "22.4.0"));
    }
}
