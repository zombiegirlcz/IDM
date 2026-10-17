package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10249a;

    public b7(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10249a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b7) && Intrinsics.f(this.f10249a, ((b7) obj2).f10249a);
    }

    public final int hashCode() {
        return this.f10249a.hashCode();
    }
}
