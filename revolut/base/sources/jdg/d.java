package jdg;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173067a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f173067a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f173067a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f173067a, ((d) obj2).f173067a);
    }

    public final int hashCode() {
        return this.f173067a.hashCode();
    }
}
