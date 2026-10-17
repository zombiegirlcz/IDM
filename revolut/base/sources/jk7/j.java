package jk7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175117a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f175117a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f175117a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f175117a, ((j) obj2).f175117a);
    }

    public final int hashCode() {
        return this.f175117a.hashCode();
    }
}
