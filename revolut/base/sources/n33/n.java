package n33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp0.y f211766a;

    public n(rp0.y dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f211766a = dialog;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f211766a, ((n) obj2).f211766a);
    }

    public final int hashCode() {
        return this.f211766a.hashCode();
    }
}
