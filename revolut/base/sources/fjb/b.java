package fjb;

import kotlin.jvm.internal.Intrinsics;
import nii.n1;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f135563a;

    public b(n1 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f135563a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f135563a, ((b) obj2).f135563a);
    }

    public final int hashCode() {
        return this.f135563a.hashCode();
    }
}
