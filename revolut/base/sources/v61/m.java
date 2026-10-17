package v61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286308b;

    public m(String name, String point) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(point, "point");
        this.f286307a = name;
        this.f286308b = point;
    }

    @Override // v61.o
    public final String b3() {
        return this.f286308b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f286307a, mVar.f286307a) && Intrinsics.f(this.f286308b, mVar.f286308b);
    }

    @Override // v61.o
    public final String getName() {
        return this.f286307a;
    }

    public final int hashCode() {
        return this.f286308b.hashCode() + (this.f286307a.hashCode() * 31);
    }
}
