package sog;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f264827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f264828b;

    public b(ArrayList popular, ArrayList other) {
        Intrinsics.checkNotNullParameter(popular, "popular");
        Intrinsics.checkNotNullParameter(other, "other");
        this.f264827a = popular;
        this.f264828b = other;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f264827a.equals(bVar.f264827a) && this.f264828b.equals(bVar.f264828b);
    }

    public final int hashCode() {
        return this.f264828b.hashCode() + (this.f264827a.hashCode() * 31);
    }
}
