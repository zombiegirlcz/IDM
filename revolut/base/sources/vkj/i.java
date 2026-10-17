package vkj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f289973b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f289972a = items;
        this.f289973b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f289972a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f289972a, iVar.f289972a) && this.f289973b == iVar.f289973b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f289973b) + (this.f289972a.hashCode() * 31);
    }
}
