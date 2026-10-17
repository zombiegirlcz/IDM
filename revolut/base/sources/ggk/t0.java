package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143782a;

    public t0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f143782a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && Intrinsics.f(this.f143782a, ((t0) obj2).f143782a);
    }

    public final int hashCode() {
        return this.f143782a.hashCode();
    }
}
