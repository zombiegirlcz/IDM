package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ac implements bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb f163417a;

    public ac() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ac) && this.f163417a == ((ac) obj2).f163417a;
    }

    public final int hashCode() {
        return this.f163417a.hashCode();
    }

    public ac(int i) {
        xb horizontalGravity = xb.START;
        Intrinsics.checkNotNullParameter(horizontalGravity, "horizontalGravity");
        this.f163417a = horizontalGravity;
    }
}
