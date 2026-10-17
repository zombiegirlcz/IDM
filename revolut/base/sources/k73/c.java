package k73;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181814a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f181814a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f181814a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f181814a, ((c) obj2).f181814a);
    }

    public final int hashCode() {
        return this.f181814a.hashCode();
    }
}
