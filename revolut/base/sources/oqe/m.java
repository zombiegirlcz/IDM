package oqe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f227896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f227897b;

    public m(l header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f227896a = header;
        this.f227897b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f227897b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f227896a, mVar.f227896a) && Intrinsics.f(this.f227897b, mVar.f227897b);
    }

    public final int hashCode() {
        return this.f227897b.hashCode() + (this.f227896a.hashCode() * 31);
    }
}
