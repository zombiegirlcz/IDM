package id2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160413a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f160413a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f160413a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f160413a, ((f) obj2).f160413a);
    }

    public final int hashCode() {
        return this.f160413a.hashCode();
    }
}
