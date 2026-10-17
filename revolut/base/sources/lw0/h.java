package lw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f200397a;

    public h(i loadingType) {
        Intrinsics.checkNotNullParameter(loadingType, "loadingType");
        this.f200397a = loadingType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f200397a == ((h) obj2).f200397a;
    }

    public final int hashCode() {
        return this.f200397a.hashCode();
    }
}
