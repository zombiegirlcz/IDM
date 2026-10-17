package r0f;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j71.c f250792a;

    public h(j71.c transferReview) {
        Intrinsics.checkNotNullParameter(transferReview, "transferReview");
        this.f250792a = transferReview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f250792a, ((h) obj2).f250792a);
    }

    public final int hashCode() {
        return this.f250792a.hashCode();
    }
}
