package i81;

import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f159410a;

    public b(y0 dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.f159410a = dialogModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f159410a, ((b) obj2).f159410a);
    }

    public final int hashCode() {
        return this.f159410a.hashCode();
    }
}
