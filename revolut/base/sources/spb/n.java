package spb;

import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f264941a;

    public n(s sVar) {
        this.f264941a = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f264941a, ((n) obj2).f264941a);
    }

    public final int hashCode() {
        s sVar = this.f264941a;
        if (sVar == null) {
            return 0;
        }
        return sVar.hashCode();
    }
}
