package eaj;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124270a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124270a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f124270a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f124270a, ((e) obj2).f124270a);
    }

    public final int hashCode() {
        return this.f124270a.hashCode();
    }
}
