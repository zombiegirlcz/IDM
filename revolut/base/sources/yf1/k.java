package yf1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313122a;

    public k(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f313122a = input;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f313122a, ((k) obj2).f313122a);
    }

    public final int hashCode() {
        return this.f313122a.hashCode();
    }
}
