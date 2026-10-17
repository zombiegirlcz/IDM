package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143775a;

    public r0(String placeholder) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.f143775a = placeholder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r0) && Intrinsics.f(this.f143775a, ((r0) obj2).f143775a);
    }

    public final int hashCode() {
        return this.f143775a.hashCode();
    }
}
