package paf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8f.d f234552a;

    public c(u8f.d preselectedTransferDirection) {
        Intrinsics.checkNotNullParameter(preselectedTransferDirection, "preselectedTransferDirection");
        this.f234552a = preselectedTransferDirection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f234552a == ((c) obj2).f234552a;
    }

    public final int hashCode() {
        return this.f234552a.hashCode();
    }

    public c() {
        this(u8f.d.NONE);
    }
}
