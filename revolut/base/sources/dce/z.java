package dce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f112913a;

    public z(Object payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f112913a = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f112913a, ((z) obj2).f112913a);
    }

    public final int hashCode() {
        return this.f112913a.hashCode();
    }
}
