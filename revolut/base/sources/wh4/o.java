package wh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.e f297408a;

    public o(aw0.e actionModel) {
        Intrinsics.checkNotNullParameter(actionModel, "actionModel");
        this.f297408a = actionModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f297408a.equals(((o) obj2).f297408a);
    }

    public final int hashCode() {
        return this.f297408a.hashCode();
    }
}
