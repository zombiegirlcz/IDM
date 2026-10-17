package y50;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oq0.b f310976a;

    public c(oq0.b listItem) {
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        this.f310976a = listItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f310976a, ((c) obj2).f310976a);
    }

    public final int hashCode() {
        return this.f310976a.hashCode();
    }
}
