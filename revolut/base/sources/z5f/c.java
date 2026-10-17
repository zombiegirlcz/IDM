package z5f;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f319614a;

    public c(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f319614a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f319614a.equals(((c) obj2).f319614a);
    }

    public final int hashCode() {
        return this.f319614a.hashCode();
    }
}
