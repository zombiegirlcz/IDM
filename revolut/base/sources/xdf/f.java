package xdf;

import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f304432a;

    public f(z instrumentType) {
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f304432a = instrumentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f304432a == ((f) obj2).f304432a;
    }

    public final int hashCode() {
        return this.f304432a.hashCode();
    }
}
