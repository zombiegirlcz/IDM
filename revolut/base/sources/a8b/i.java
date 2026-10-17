package a8b;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2153a;

    public i(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f2153a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f2153a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f2153a.equals(((i) obj2).f2153a);
    }

    public final int hashCode() {
        return this.f2153a.hashCode();
    }
}
