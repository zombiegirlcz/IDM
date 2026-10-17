package cn5;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25354a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25354a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f25354a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f25354a, ((j) obj2).f25354a);
    }

    public final int hashCode() {
        return this.f25354a.hashCode();
    }
}
