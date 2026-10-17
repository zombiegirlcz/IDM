package a99;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f2385a;

    public a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f2385a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f2385a, ((a) obj2).f2385a);
    }

    public final int hashCode() {
        return this.f2385a.hashCode();
    }
}
