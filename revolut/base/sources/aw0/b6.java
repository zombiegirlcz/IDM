package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b6 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10248a;

    public b6(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10248a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b6) && Intrinsics.f(this.f10248a, ((b6) obj2).f10248a);
    }

    public final int hashCode() {
        return this.f10248a.hashCode();
    }
}
