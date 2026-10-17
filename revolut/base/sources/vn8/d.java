package vn8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f290772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f290773b;

    public d(int i, Function1 condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f290772a = condition;
        this.f290773b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f290772a, dVar.f290772a) && this.f290773b == dVar.f290773b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f290773b) + (this.f290772a.hashCode() * 31);
    }
}
