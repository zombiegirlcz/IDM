package n1a;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f211300a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f211300a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f211300a, ((c) obj2).f211300a);
    }

    public final int hashCode() {
        return this.f211300a.hashCode();
    }
}
