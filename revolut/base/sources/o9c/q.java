package o9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.e f223220a;

    public q(aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f223220a = actionFooterModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f223220a.equals(((q) obj2).f223220a);
    }

    public final int hashCode() {
        return this.f223220a.hashCode();
    }
}
