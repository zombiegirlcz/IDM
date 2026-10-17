package ya2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f311914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f311915b;

    public k(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f311914a = items;
        this.f311915b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f311914a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f311914a, kVar.f311914a) && this.f311915b == kVar.f311915b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f311915b) + (this.f311914a.hashCode() * 31);
    }
}
