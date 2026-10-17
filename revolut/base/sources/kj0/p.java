package kj0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f184278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f184279b;

    public p(b properties, List firstSegmentsOfPairedPath) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(firstSegmentsOfPairedPath, "firstSegmentsOfPairedPath");
        this.f184278a = properties;
        this.f184279b = firstSegmentsOfPairedPath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f184278a, pVar.f184278a) && Intrinsics.f(this.f184279b, pVar.f184279b);
    }

    public final int hashCode() {
        return this.f184279b.hashCode() + (this.f184278a.hashCode() * 31);
    }
}
