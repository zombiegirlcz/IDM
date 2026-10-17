package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143710a;

    public e1(String backgroundCode) {
        Intrinsics.checkNotNullParameter(backgroundCode, "backgroundCode");
        this.f143710a = backgroundCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e1) && Intrinsics.f(this.f143710a, ((e1) obj2).f143710a);
    }

    public final int hashCode() {
        return this.f143710a.hashCode();
    }
}
