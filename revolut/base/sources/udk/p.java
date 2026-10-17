package udk;

import aw0.na;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final na f279264a;

    public p(na introTitle) {
        Intrinsics.checkNotNullParameter(introTitle, "introTitle");
        this.f279264a = introTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f279264a, ((p) obj2).f279264a);
    }

    public final int hashCode() {
        return this.f279264a.hashCode();
    }
}
