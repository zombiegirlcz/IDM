package upe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281999b;

    public o(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f281998a = items;
        this.f281999b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f281998a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f281998a, oVar.f281998a) && this.f281999b == oVar.f281999b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281999b) + (this.f281998a.hashCode() * 31);
    }
}
