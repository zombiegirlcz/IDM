package rbg;

import kotlin.jvm.internal.Intrinsics;
import nii.j0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f253049a;

    public a(j0 statusConfig) {
        Intrinsics.checkNotNullParameter(statusConfig, "statusConfig");
        this.f253049a = statusConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f253049a.equals(((a) obj2).f253049a);
    }

    public final int hashCode() {
        return this.f253049a.hashCode();
    }
}
