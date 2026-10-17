package epd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f128159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f128160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f128161c;

    public b(Data data, f fVar, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f128159a = data;
        this.f128160b = fVar;
        this.f128161c = z;
    }

    public static b a(b bVar, Data data) {
        f fVar = bVar.f128160b;
        boolean z = bVar.f128161c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new b(data, fVar, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f128159a, bVar.f128159a) && Intrinsics.f(this.f128160b, bVar.f128160b) && this.f128161c == bVar.f128161c;
    }

    public final int hashCode() {
        int iHashCode = this.f128159a.hashCode() * 31;
        f fVar = this.f128160b;
        return Boolean.hashCode(this.f128161c) + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }
}
