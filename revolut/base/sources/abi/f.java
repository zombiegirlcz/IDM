package abi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2968a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f2968a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f2968a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f2968a, ((f) obj2).f2968a);
    }

    public final int hashCode() {
        return this.f2968a.hashCode();
    }
}
