package k1g;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f180252a;

    public j(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f180252a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f180252a.equals(((j) obj2).f180252a);
    }

    public final int hashCode() {
        return this.f180252a.hashCode();
    }
}
