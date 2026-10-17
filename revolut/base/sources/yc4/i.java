package yc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv3.c f312519a;

    public i(iv3.c kontomatikError) {
        Intrinsics.checkNotNullParameter(kontomatikError, "kontomatikError");
        this.f312519a = kontomatikError;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f312519a.equals(((i) obj2).f312519a);
    }

    public final int hashCode() {
        return this.f312519a.f168709a.hashCode();
    }
}
