package pk9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236948a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f236948a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f236948a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f236948a, ((j) obj2).f236948a);
    }

    public final int hashCode() {
        return this.f236948a.hashCode();
    }
}
