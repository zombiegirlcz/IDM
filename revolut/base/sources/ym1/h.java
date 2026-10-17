package ym1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f314833a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314833a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f314833a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f314833a, ((h) obj2).f314833a);
    }

    public final int hashCode() {
        return this.f314833a.hashCode();
    }
}
