package i58;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j38.a f158783a;

    public b(j38.a relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        this.f158783a = relationship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f158783a, ((b) obj2).f158783a);
    }

    public final int hashCode() {
        return this.f158783a.hashCode();
    }
}
