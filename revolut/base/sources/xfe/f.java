package xfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f305250a;

    public f(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f305250a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f305250a, ((f) obj2).f305250a);
    }

    public final int hashCode() {
        return this.f305250a.hashCode();
    }
}
