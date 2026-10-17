package lni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197263a;

    public g(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f197263a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f197263a, ((g) obj2).f197263a);
    }

    public final int hashCode() {
        return this.f197263a.hashCode();
    }
}
