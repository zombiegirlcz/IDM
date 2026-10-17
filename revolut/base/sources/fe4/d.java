package fe4;

import kotlin.jvm.internal.Intrinsics;
import wy3.p;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f134437a;

    public d(p item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f134437a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f134437a, ((d) obj2).f134437a);
    }

    public final int hashCode() {
        return this.f134437a.hashCode();
    }
}
