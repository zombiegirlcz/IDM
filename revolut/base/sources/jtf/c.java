package jtf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178504a;

    public c(List rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.f178504a = rows;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f178504a, ((c) obj2).f178504a);
    }

    public final int hashCode() {
        return this.f178504a.hashCode();
    }
}
