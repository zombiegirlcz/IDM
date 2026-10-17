package usb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f282882a;

    public n(m validation) {
        Intrinsics.checkNotNullParameter(validation, "validation");
        this.f282882a = validation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f282882a, ((n) obj2).f282882a);
    }

    public final int hashCode() {
        return this.f282882a.hashCode();
    }
}
