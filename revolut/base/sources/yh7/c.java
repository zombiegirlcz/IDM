package yh7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313870a;

    public c(List instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f313870a = instruments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f313870a, ((c) obj2).f313870a);
    }

    public final int hashCode() {
        return this.f313870a.hashCode();
    }
}
