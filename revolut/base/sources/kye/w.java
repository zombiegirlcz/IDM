package kye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f190861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190862b;

    public w(List limits, String methodName) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        this.f190861a = limits;
        this.f190862b = methodName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f190861a, wVar.f190861a) && Intrinsics.f(this.f190862b, wVar.f190862b);
    }

    public final int hashCode() {
        return this.f190862b.hashCode() + (this.f190861a.hashCode() * 31);
    }
}
