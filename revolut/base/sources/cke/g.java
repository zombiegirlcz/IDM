package cke;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24824a;

    public g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f24824a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f24824a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f24824a.equals(((g) obj2).f24824a);
    }

    public final int hashCode() {
        return this.f24824a.hashCode();
    }
}
