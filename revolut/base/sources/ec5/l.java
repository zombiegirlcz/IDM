package ec5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124444a;

    public l(String rfiWorkflowId) {
        Intrinsics.checkNotNullParameter(rfiWorkflowId, "rfiWorkflowId");
        this.f124444a = rfiWorkflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f124444a, ((l) obj2).f124444a);
    }

    public final int hashCode() {
        return this.f124444a.hashCode();
    }
}
