package qx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f249976b;

    public c(String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f249975a = value;
        this.f249976b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f249975a, cVar.f249975a) && this.f249976b == cVar.f249976b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249976b) + (this.f249975a.hashCode() * 31);
    }
}
