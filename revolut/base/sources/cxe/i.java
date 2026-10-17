package cxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi3.s f109945a;

    public i(pi3.s preorderType) {
        Intrinsics.checkNotNullParameter(preorderType, "preorderType");
        this.f109945a = preorderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f109945a == ((i) obj2).f109945a;
    }

    public final int hashCode() {
        return this.f109945a.hashCode();
    }
}
