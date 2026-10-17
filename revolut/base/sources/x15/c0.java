package x15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f302248a;

    public c0(b0 application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f302248a = application;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f302248a, ((c0) obj2).f302248a);
    }

    public final int hashCode() {
        return this.f302248a.hashCode();
    }
}
