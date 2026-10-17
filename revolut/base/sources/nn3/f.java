package nn3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cn3.g f217449a;

    public f(cn3.g recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f217449a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f217449a, ((f) obj2).f217449a);
    }

    public final int hashCode() {
        return this.f217449a.hashCode();
    }
}
