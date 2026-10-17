package dt5;

import kotlin.jvm.internal.Intrinsics;
import mii.i;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f117388a;

    public e(i shotDialogModel) {
        Intrinsics.checkNotNullParameter(shotDialogModel, "shotDialogModel");
        this.f117388a = shotDialogModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f117388a.equals(((e) obj2).f117388a);
    }

    public final int hashCode() {
        return this.f117388a.hashCode();
    }
}
