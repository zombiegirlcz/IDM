package stc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265552a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f265552a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f265552a, ((b) obj2).f265552a);
    }

    @Override // stc.d
    public final List getItems() {
        return this.f265552a;
    }

    public final int hashCode() {
        return this.f265552a.hashCode();
    }
}
