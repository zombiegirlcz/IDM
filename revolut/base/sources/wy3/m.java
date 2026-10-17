package wy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301082a;

    public m(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f301082a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f301082a, ((m) obj2).f301082a);
    }

    public final int hashCode() {
        return this.f301082a.hashCode();
    }
}
