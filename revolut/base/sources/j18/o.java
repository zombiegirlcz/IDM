package j18;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f170149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f170150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f170151c;
    public final ArrayList d;
    public final String e;

    public o(List assetsFilters, int i, Instant instant, ArrayList types, String str) {
        Intrinsics.checkNotNullParameter(assetsFilters, "assetsFilters");
        Intrinsics.checkNotNullParameter(types, "types");
        this.f170149a = assetsFilters;
        this.f170150b = i;
        this.f170151c = instant;
        this.d = types;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f170149a, oVar.f170149a) && this.f170150b == oVar.f170150b && Intrinsics.f(this.f170151c, oVar.f170151c) && this.d.equals(oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f170150b, this.f170149a.hashCode() * 31, 31);
        Instant instant = this.f170151c;
        int iB2 = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iB + (instant == null ? 0 : instant.hashCode())) * 31, 31);
        String str = this.e;
        return iB2 + (str != null ? str.hashCode() : 0);
    }
}
