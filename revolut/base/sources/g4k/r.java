package g4k;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f140582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f140583c;
    public final boolean d;

    public r(Data corridorPropertyData, ArrayList counterLimits, dj0.d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(corridorPropertyData, "corridorPropertyData");
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        this.f140581a = corridorPropertyData;
        this.f140582b = counterLimits;
        this.f140583c = dVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f140581a, rVar.f140581a) && this.f140582b.equals(rVar.f140582b) && Intrinsics.f(this.f140583c, rVar.f140583c) && this.d == rVar.d;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f140582b, this.f140581a.hashCode() * 31, 31);
        dj0.d dVar = this.f140583c;
        return Boolean.hashCode(this.d) + ((iB + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
