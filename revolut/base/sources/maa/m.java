package maa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f203983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203984b;

    public m(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203983a = items;
        this.f203984b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f203983a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f203983a, mVar.f203983a) && this.f203984b == mVar.f203984b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203984b) + (this.f203983a.hashCode() * 31);
    }

    public m() {
        this(f0.f322471a, false);
    }
}
