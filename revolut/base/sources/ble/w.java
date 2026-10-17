package ble;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f16604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16606c;
    public final AnalyticsContext d;

    public w(u header, ArrayList items, String str, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f16604a = header;
        this.f16605b = items;
        this.f16606c = str;
        this.d = analyticsContext;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        String str = null;
        w wVar = oldState instanceof w ? (w) oldState : null;
        if (wVar == null) {
            return null;
        }
        String str2 = wVar.f16606c;
        String str3 = this.f16606c;
        boolean zF = Intrinsics.f(str3, str2);
        boolean z = !zF;
        if (str3 == null && !zF) {
            str = str2;
        }
        return new v(wVar, z, str);
    }

    @Override // cli.p
    public final List c() {
        return this.f16605b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f16604a.equals(wVar.f16604a) && this.f16605b.equals(wVar.f16605b) && Intrinsics.f(this.f16606c, wVar.f16606c) && Intrinsics.f(this.d, wVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f16605b, this.f16604a.hashCode() * 31, 31);
        String str = this.f16606c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
