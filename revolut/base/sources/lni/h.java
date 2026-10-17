package lni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197264a;

    public h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f197264a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f197264a, ((h) obj2).f197264a);
    }

    public final int hashCode() {
        return this.f197264a.hashCode();
    }
}
