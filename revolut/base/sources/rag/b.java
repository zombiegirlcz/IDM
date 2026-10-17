package rag;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import h9g.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private b() {
    }

    public static Long a(HotelsProperty property) {
        dj0.d dVarJ;
        dj0.d dVarK;
        Intrinsics.checkNotNullParameter(property, "property");
        Pricing pricing = property.i;
        if (pricing == null || (dVarJ = m.j(pricing)) == null) {
            return null;
        }
        long j2 = dVarJ.f115082a;
        Pricing pricing2 = property.i;
        if (pricing2 == null || (dVarK = boh.f.k(pricing2)) == null) {
            return null;
        }
        long j3 = 100;
        long j5 = j3 - ((dVarK.f115082a * j3) / j2);
        if (j5 <= 0) {
            return null;
        }
        return Long.valueOf(j5);
    }
}
