package bw6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19249a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f19249a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f19249a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f19249a, ((i) obj2).f19249a);
    }

    public final int hashCode() {
        return this.f19249a.hashCode();
    }
}
