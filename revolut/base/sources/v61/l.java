package v61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286306b;

    public l(String name, String point) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(point, "point");
        this.f286305a = name;
        this.f286306b = point;
    }

    @Override // v61.o
    public final String b3() {
        return this.f286306b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f286305a, lVar.f286305a) && Intrinsics.f(this.f286306b, lVar.f286306b);
    }

    @Override // v61.o
    public final String getName() {
        return this.f286305a;
    }

    public final int hashCode() {
        return this.f286306b.hashCode() + (this.f286305a.hashCode() * 31);
    }
}
