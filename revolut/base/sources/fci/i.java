package fci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f133782a;

    public i(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f133782a = purposes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f133782a, ((i) obj2).f133782a);
    }

    public final int hashCode() {
        return this.f133782a.hashCode();
    }
}
