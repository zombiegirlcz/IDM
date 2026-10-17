package vlg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f290442b;

    public m(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290441a = items;
        this.f290442b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f290441a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f290441a, mVar.f290441a) && this.f290442b == mVar.f290442b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f290442b) + (this.f290441a.hashCode() * 31);
    }
}
