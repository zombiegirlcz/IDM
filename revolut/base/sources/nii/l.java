package nii;

import grl.n7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n7 f216183a;

    public l(n7 outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this.f216183a = outcome;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f216183a == ((l) obj2).f216183a;
    }

    public final int hashCode() {
        return this.f216183a.hashCode();
    }
}
