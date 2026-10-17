package nxa;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f220502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f220503c;
    public final o d;

    public l() {
        this(0);
    }

    public static l a(l lVar, String str, Data trackingDetails, boolean z, o oVar, int i) {
        if ((i & 1) != 0) {
            str = lVar.f220501a;
        }
        if ((i & 2) != 0) {
            trackingDetails = lVar.f220502b;
        }
        if ((i & 4) != 0) {
            z = lVar.f220503c;
        }
        if ((i & 8) != 0) {
            oVar = lVar.d;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(trackingDetails, "trackingDetails");
        return new l(str, trackingDetails, z, oVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f220501a, lVar.f220501a) && Intrinsics.f(this.f220502b, lVar.f220502b) && this.f220503c == lVar.f220503c && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        String str = this.f220501a;
        int iC = j6.a.c(kii.e.c(this.f220502b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f220503c);
        o oVar = this.d;
        return iC + (oVar != null ? oVar.hashCode() : 0);
    }

    public l(String str, Data trackingDetails, boolean z, o oVar) {
        Intrinsics.checkNotNullParameter(trackingDetails, "trackingDetails");
        this.f220501a = str;
        this.f220502b = trackingDetails;
        this.f220503c = z;
        this.d = oVar;
    }

    public /* synthetic */ l(int i) {
        this(null, new Data(null, null, true, 3, null), false, null);
    }
}
