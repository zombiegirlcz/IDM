package c2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f20770a;

    public e(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f20770a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f20770a, ((e) obj2).f20770a);
    }

    public final int hashCode() {
        return this.f20770a.hashCode();
    }
}
