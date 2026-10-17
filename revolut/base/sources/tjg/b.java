package tjg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f271715a;

    public b(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f271715a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f271715a, ((b) obj2).f271715a);
    }

    public final int hashCode() {
        return this.f271715a.hashCode();
    }
}
