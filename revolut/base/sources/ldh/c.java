package ldh;

import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f194107a;

    public c(y0 dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.f194107a = dialogModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f194107a, ((c) obj2).f194107a);
    }

    public final int hashCode() {
        return this.f194107a.hashCode();
    }
}
