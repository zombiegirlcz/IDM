package zte;

import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f325100a;

    public d(y0 dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        this.f325100a = dialogModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f325100a, ((d) obj2).f325100a);
    }

    public final int hashCode() {
        return this.f325100a.hashCode();
    }
}
