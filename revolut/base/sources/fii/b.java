package fii;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f135424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f135425b;

    public b(Object obj2, n1 statusDialogResult) {
        Intrinsics.checkNotNullParameter(statusDialogResult, "statusDialogResult");
        this.f135424a = obj2;
        this.f135425b = statusDialogResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f135424a, bVar.f135424a) && Intrinsics.f(this.f135425b, bVar.f135425b);
    }

    public final int hashCode() {
        Object obj2 = this.f135424a;
        return this.f135425b.hashCode() + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }
}
