package s32;

import g12.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259404a;

    public i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f259404a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f259404a, ((i) obj2).f259404a);
    }

    public final int hashCode() {
        return this.f259404a.hashCode();
    }
}
