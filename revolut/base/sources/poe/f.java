package poe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zme.h f237965b;

    public f(Data rationalesData, zme.h hVar) {
        Intrinsics.checkNotNullParameter(rationalesData, "rationalesData");
        this.f237964a = rationalesData;
        this.f237965b = hVar;
    }

    public static f a(f fVar, Data rationalesData, zme.h hVar, int i) {
        if ((i & 1) != 0) {
            rationalesData = fVar.f237964a;
        }
        if ((i & 2) != 0) {
            hVar = fVar.f237965b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(rationalesData, "rationalesData");
        return new f(rationalesData, hVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f237964a, fVar.f237964a) && Intrinsics.f(this.f237965b, fVar.f237965b);
    }

    public final int hashCode() {
        int iHashCode = this.f237964a.hashCode() * 31;
        zme.h hVar = this.f237965b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
