package hye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156865a;

    public j(List indiaLimits) {
        Intrinsics.checkNotNullParameter(indiaLimits, "indiaLimits");
        this.f156865a = indiaLimits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f156865a, ((j) obj2).f156865a);
    }

    public final int hashCode() {
        return this.f156865a.hashCode();
    }
}
