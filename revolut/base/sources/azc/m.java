package azc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11437b;

    public m(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f11436a = items;
        this.f11437b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f11436a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f11436a, mVar.f11436a) && this.f11437b == mVar.f11437b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11437b) + (this.f11436a.hashCode() * 31);
    }
}
