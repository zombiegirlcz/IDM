package qyc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f250279b;

    public m(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f250278a = items;
        this.f250279b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f250278a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f250278a, mVar.f250278a) && this.f250279b == mVar.f250279b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250279b) + (this.f250278a.hashCode() * 31);
    }
}
