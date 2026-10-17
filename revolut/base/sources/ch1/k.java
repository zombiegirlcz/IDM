package ch1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24111a;

    public k(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f24111a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f24111a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f24111a, ((k) obj2).f24111a);
    }

    public final int hashCode() {
        return this.f24111a.hashCode();
    }
}
