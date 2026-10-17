package x7e;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f303183a;

    public h(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f303183a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f303183a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f303183a.equals(((h) obj2).f303183a);
    }

    public final int hashCode() {
        return this.f303183a.hashCode();
    }
}
