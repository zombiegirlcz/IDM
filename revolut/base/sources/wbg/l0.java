package wbg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296186a;

    public l0(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f296186a = draftId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f296186a, ((l0) obj2).f296186a);
    }

    public final int hashCode() {
        return this.f296186a.hashCode();
    }
}
