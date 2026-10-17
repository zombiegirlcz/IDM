package mp7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f207777b;

    public k(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f207776a = items;
        this.f207777b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f207776a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f207776a, kVar.f207776a) && this.f207777b == kVar.f207777b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207777b) + (this.f207776a.hashCode() * 31);
    }
}
