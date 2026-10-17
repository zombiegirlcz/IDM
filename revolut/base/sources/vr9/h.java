package vr9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f291526a;

    public h(List members) {
        Intrinsics.checkNotNullParameter(members, "members");
        this.f291526a = members;
    }

    @Override // vr9.j
    public final List a() {
        return this.f291526a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f291526a, ((h) obj2).f291526a);
    }

    public final int hashCode() {
        return this.f291526a.hashCode();
    }
}
