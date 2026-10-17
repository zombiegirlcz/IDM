package eck;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124762a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124762a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f124762a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f124762a, ((h) obj2).f124762a);
    }

    public final int hashCode() {
        return this.f124762a.hashCode();
    }
}
