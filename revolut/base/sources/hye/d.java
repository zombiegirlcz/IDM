package hye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156857b;

    public d(List limits, String methodName) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        this.f156856a = limits;
        this.f156857b = methodName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f156856a, dVar.f156856a) && Intrinsics.f(this.f156857b, dVar.f156857b);
    }

    public final int hashCode() {
        return this.f156857b.hashCode() + (this.f156856a.hashCode() * 31);
    }
}
