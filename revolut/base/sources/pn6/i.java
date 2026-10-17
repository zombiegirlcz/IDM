package pn6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237672b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f237671a = items;
        this.f237672b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f237671a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f237671a, iVar.f237671a) && this.f237672b == iVar.f237672b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237672b) + (this.f237671a.hashCode() * 31);
    }
}
