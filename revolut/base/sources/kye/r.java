package kye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f190819a;

    public r(List limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f190819a = limits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f190819a, ((r) obj2).f190819a);
    }

    public final int hashCode() {
        return this.f190819a.hashCode();
    }
}
