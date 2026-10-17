package ld2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f194018a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f194018a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f194018a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f194018a, ((c) obj2).f194018a);
    }

    public final int hashCode() {
        return this.f194018a.hashCode();
    }
}
