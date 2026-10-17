package c4k;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21311b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f21310a = items;
        this.f21311b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f21310a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f21310a, iVar.f21310a) && this.f21311b == iVar.f21311b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21311b) + (this.f21310a.hashCode() * 31);
    }
}
