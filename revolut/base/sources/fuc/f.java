package fuc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138174a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138174a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f138174a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f138174a, ((f) obj2).f138174a);
    }

    public final int hashCode() {
        return this.f138174a.hashCode();
    }

    public f() {
        this(f0.f322471a);
    }
}
