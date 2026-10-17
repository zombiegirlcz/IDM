package uv;

import kotlin.jvm.internal.Intrinsics;
import xv.l;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f283249a;

    public a(l detectorResult) {
        Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
        this.f283249a = detectorResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f283249a, ((a) obj2).f283249a);
    }

    public final int hashCode() {
        return this.f283249a.hashCode();
    }
}
