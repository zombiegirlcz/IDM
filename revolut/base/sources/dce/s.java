package dce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.delegates.t f112894a;

    public s(com.revolut.core.ui_kit.delegates.t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f112894a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f112894a, ((s) obj2).f112894a);
    }

    public final int hashCode() {
        return this.f112894a.hashCode();
    }
}
