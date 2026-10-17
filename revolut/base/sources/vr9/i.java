package vr9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f291527a;

    public i(List members) {
        Intrinsics.checkNotNullParameter(members, "members");
        this.f291527a = members;
    }

    @Override // vr9.j
    public final List a() {
        return this.f291527a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f291527a, ((i) obj2).f291527a);
    }

    public final int hashCode() {
        return this.f291527a.hashCode();
    }
}
