package v7f;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f286627a;

    public b(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f286627a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f286627a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f286627a.equals(((b) obj2).f286627a);
    }

    public final int hashCode() {
        return this.f286627a.hashCode();
    }
}
