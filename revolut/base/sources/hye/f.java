package hye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156859a;

    public f(List limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f156859a = limits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f156859a, ((f) obj2).f156859a);
    }

    public final int hashCode() {
        return this.f156859a.hashCode();
    }
}
