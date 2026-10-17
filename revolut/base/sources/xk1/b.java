package xk1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f306594a;

    public b(g processingState) {
        Intrinsics.checkNotNullParameter(processingState, "processingState");
        this.f306594a = processingState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f306594a == ((b) obj2).f306594a;
    }

    public final int hashCode() {
        return this.f306594a.hashCode();
    }
}
