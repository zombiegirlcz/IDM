package iuf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f168578b;

    public t(List items, k kVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168577a = items;
        this.f168578b = kVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f168577a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f168577a, tVar.f168577a) && Intrinsics.f(this.f168578b, tVar.f168578b);
    }

    public final int hashCode() {
        int iHashCode = this.f168577a.hashCode() * 31;
        k kVar = this.f168578b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
