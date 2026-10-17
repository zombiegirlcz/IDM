package no;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f217872a;

    public y0(a1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f217872a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y0) && Intrinsics.f(this.f217872a, ((y0) obj2).f217872a);
    }

    @Override // no.c1
    public final a1 getDescriptor() {
        return this.f217872a;
    }

    public final int hashCode() {
        return this.f217872a.hashCode();
    }

    public final String toString() {
        return "DialogViewScreen.Closed";
    }
}
