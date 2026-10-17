package vge;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f288897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f288898b;

    public g(Data data, b bVar) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f288897a = data;
        this.f288898b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f288897a, gVar.f288897a) && Intrinsics.f(this.f288898b, gVar.f288898b);
    }

    public final int hashCode() {
        int iHashCode = this.f288897a.hashCode() * 31;
        b bVar = this.f288898b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
