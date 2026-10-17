package uy6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f284090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f284091b;

    public o(n headerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f284090a = headerState;
        this.f284091b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f284091b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f284090a, oVar.f284090a) && Intrinsics.f(this.f284091b, oVar.f284091b);
    }

    public final int hashCode() {
        return this.f284091b.hashCode() + (this.f284090a.f284089a.hashCode() * 31);
    }
}
