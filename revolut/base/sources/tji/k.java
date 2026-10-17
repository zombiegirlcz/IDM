package tji;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f271793a;

    public k(m modelResult) {
        Intrinsics.checkNotNullParameter(modelResult, "modelResult");
        this.f271793a = modelResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f271793a, ((k) obj2).f271793a);
    }

    public final int hashCode() {
        return this.f271793a.hashCode();
    }
}
