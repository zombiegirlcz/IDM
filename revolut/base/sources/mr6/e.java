package mr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f208064a;

    public e(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f208064a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f208064a, ((e) obj2).f208064a);
    }

    public final int hashCode() {
        return this.f208064a.hashCode();
    }
}
