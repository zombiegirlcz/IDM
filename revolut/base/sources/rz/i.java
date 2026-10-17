package rz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258449a;

    public i(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f258449a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f258449a, ((i) obj2).f258449a);
    }

    public final int hashCode() {
        return this.f258449a.hashCode();
    }
}
