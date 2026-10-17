package j7b;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f171896a;

    public k(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f171896a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f171896a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f171896a, ((k) obj2).f171896a);
    }

    public final int hashCode() {
        return this.f171896a.hashCode();
    }
}
