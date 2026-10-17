package yy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f317783a;

    public l(q popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f317783a = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f317783a, ((l) obj2).f317783a);
    }

    public final int hashCode() {
        return this.f317783a.hashCode();
    }
}
