package yc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv3.b f312529a;

    public s(iv3.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f312529a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f312529a, ((s) obj2).f312529a);
    }

    public final int hashCode() {
        return this.f312529a.hashCode();
    }
}
