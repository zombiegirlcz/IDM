package wu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f300044a;

    public e(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f300044a = throwable;
    }

    public final Throwable a() {
        return this.f300044a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f300044a, ((e) obj2).f300044a);
    }

    public final int hashCode() {
        return this.f300044a.hashCode();
    }
}
