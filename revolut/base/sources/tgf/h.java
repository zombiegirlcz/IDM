package tgf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f271175a;

    public h(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f271175a = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f271175a, ((h) obj2).f271175a);
    }

    public final int hashCode() {
        return this.f271175a.hashCode();
    }
}
