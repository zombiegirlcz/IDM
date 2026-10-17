package lyd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f200791a;

    public h(Set selectedItemIds) {
        Intrinsics.checkNotNullParameter(selectedItemIds, "selectedItemIds");
        this.f200791a = selectedItemIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f200791a, ((h) obj2).f200791a);
    }

    public final int hashCode() {
        return this.f200791a.hashCode();
    }
}
