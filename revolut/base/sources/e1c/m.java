package e1c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f121955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121956b;

    public m(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f121955a = items;
        this.f121956b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f121955a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f121955a, mVar.f121955a) && this.f121956b == mVar.f121956b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121956b) + (this.f121955a.hashCode() * 31);
    }
}
