package hwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156251a;

    public r0(String loungeId) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        this.f156251a = loungeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r0) && Intrinsics.f(this.f156251a, ((r0) obj2).f156251a);
    }

    public final int hashCode() {
        return this.f156251a.hashCode();
    }
}
