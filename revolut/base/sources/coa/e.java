package coa;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25504a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25504a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f25504a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f25504a, ((e) obj2).f25504a);
    }

    public final int hashCode() {
        return this.f25504a.hashCode();
    }
}
