package jn8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f176659a;

    public b(List restrictedSignInMethods) {
        Intrinsics.checkNotNullParameter(restrictedSignInMethods, "restrictedSignInMethods");
        this.f176659a = restrictedSignInMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f176659a, ((b) obj2).f176659a);
    }

    public final int hashCode() {
        return this.f176659a.hashCode();
    }
}
