package tjg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f271714a;

    public a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f271714a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f271714a, ((a) obj2).f271714a);
    }

    public final int hashCode() {
        return this.f271714a.hashCode();
    }
}
