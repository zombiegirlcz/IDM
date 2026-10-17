package oph;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227662a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f227662a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f227662a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f227662a, ((c) obj2).f227662a);
    }

    public final int hashCode() {
        return this.f227662a.hashCode();
    }

    public c() {
        this(f0.f322471a);
    }
}
