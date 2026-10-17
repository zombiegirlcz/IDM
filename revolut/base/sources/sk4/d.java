package sk4;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f263771a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f263771a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f263771a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f263771a, ((d) obj2).f263771a);
    }

    public final int hashCode() {
        return this.f263771a.hashCode();
    }
}
