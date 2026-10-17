package jfb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173818a;

    public k0(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f173818a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f173818a, ((k0) obj2).f173818a);
    }

    public final int hashCode() {
        return this.f173818a.hashCode();
    }
}
