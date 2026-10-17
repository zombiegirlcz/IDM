package jni;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f176790a;

    public g(List methods) {
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f176790a = methods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f176790a, ((g) obj2).f176790a);
    }

    public final int hashCode() {
        return this.f176790a.hashCode();
    }
}
