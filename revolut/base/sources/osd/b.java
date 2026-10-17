package osd;

import amd.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em4.a f229314a;

    public b(em4.a entryPointUiModel) {
        Intrinsics.checkNotNullParameter(entryPointUiModel, "entryPointUiModel");
        this.f229314a = entryPointUiModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f229314a, ((b) obj2).f229314a);
    }

    public final int hashCode() {
        return this.f229314a.hashCode();
    }
}
