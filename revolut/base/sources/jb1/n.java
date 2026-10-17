package jb1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f172561a;

    public n(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172561a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f172561a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f172561a.equals(((n) obj2).f172561a);
    }

    public final int hashCode() {
        return this.f172561a.hashCode();
    }
}
