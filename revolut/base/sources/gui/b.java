package gui;

import kotlin.jvm.internal.Intrinsics;
import nii.n1;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f146945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f146946b;

    public b(dj0.d amountLacking, n1 dialogResult) {
        Intrinsics.checkNotNullParameter(amountLacking, "amountLacking");
        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
        this.f146945a = amountLacking;
        this.f146946b = dialogResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f146945a, bVar.f146945a) && Intrinsics.f(this.f146946b, bVar.f146946b);
    }

    public final int hashCode() {
        return this.f146946b.hashCode() + (this.f146945a.hashCode() * 31);
    }
}
