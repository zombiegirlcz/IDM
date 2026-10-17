package pwe;

import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f240435a;

    public c(y0 dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.f240435a = dialogModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f240435a, ((c) obj2).f240435a);
    }

    public final int hashCode() {
        return this.f240435a.hashCode();
    }
}
