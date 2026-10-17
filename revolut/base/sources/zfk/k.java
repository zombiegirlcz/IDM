package zfk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f322028a;

    public k() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f322028a, ((k) obj2).f322028a);
    }

    public final int hashCode() {
        Function0 function0 = this.f322028a;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }

    public k(Function0 function0) {
        this.f322028a = function0;
    }
}
