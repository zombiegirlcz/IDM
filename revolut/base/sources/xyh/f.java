package xyh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f309730a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309730a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f309730a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f309730a.equals(((f) obj2).f309730a);
    }

    public final int hashCode() {
        return this.f309730a.hashCode();
    }
}
