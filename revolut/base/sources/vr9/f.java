package vr9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f291522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f291523b;

    public f(List members, l type) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f291522a = members;
        this.f291523b = type;
    }

    @Override // vr9.j
    public final List a() {
        return this.f291522a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f291522a, fVar.f291522a) && Intrinsics.f(this.f291523b, fVar.f291523b);
    }

    public final int hashCode() {
        return this.f291523b.hashCode() + (this.f291522a.hashCode() * 31);
    }
}
