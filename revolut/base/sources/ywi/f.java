package ywi;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317446a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317446a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f317446a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f317446a, ((f) obj2).f317446a);
    }

    public final int hashCode() {
        return this.f317446a.hashCode();
    }
}
