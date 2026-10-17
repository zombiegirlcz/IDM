package ngg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f215156a;

    public j(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f215156a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f215156a.equals(((j) obj2).f215156a);
    }

    public final int hashCode() {
        return this.f215156a.hashCode();
    }
}
