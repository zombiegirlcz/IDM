package md8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204507a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f204507a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f204507a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f204507a, ((f) obj2).f204507a);
    }

    public final int hashCode() {
        return this.f204507a.hashCode();
    }
}
