package im8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import mii.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f162315a;

    public b(f dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.f162315a = dialogModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f162315a, ((b) obj2).f162315a);
    }

    public final int hashCode() {
        return this.f162315a.hashCode();
    }
}
