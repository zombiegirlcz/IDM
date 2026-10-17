package zve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f325671a;

    public d(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f325671a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f325671a, ((d) obj2).f325671a);
    }

    public final int hashCode() {
        return this.f325671a.hashCode();
    }
}
