package vfk;

import kotlin.jvm.internal.Intrinsics;
import vfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f288667b;

    public b(String preorderId, Long l2) {
        Intrinsics.checkNotNullParameter(preorderId, "preorderId");
        this.f288666a = preorderId;
        this.f288667b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f288666a, bVar.f288666a) && Intrinsics.f(this.f288667b, bVar.f288667b);
    }

    public final int hashCode() {
        int iHashCode = this.f288666a.hashCode() * 31;
        Long l2 = this.f288667b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
