package o97;

import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f223113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5a.g f223114b;

    public j0(y0 statusDialog, p5a.g primaryAction) {
        Intrinsics.checkNotNullParameter(statusDialog, "statusDialog");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        this.f223113a = statusDialog;
        this.f223114b = primaryAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f223113a.equals(j0Var.f223113a) && this.f223114b.equals(j0Var.f223114b);
    }

    public final int hashCode() {
        return this.f223114b.hashCode() + (this.f223113a.hashCode() * 31);
    }
}
