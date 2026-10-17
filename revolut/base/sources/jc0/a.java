package jc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f172684a;

    public a(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f172684a = cause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f172684a, ((a) obj2).f172684a);
    }

    public final int hashCode() {
        return this.f172684a.hashCode();
    }
}
