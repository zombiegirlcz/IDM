package l2f;

import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f191791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191792b;

    public a(y0 dialogModel, boolean z) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.f191791a = dialogModel;
        this.f191792b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f191791a, aVar.f191791a) && this.f191792b == aVar.f191792b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191792b) + (this.f191791a.hashCode() * 31);
    }
}
