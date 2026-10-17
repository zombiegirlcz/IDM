package vy2;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f293123b;

    public e(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f293122a = items;
        this.f293123b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f293122a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f293122a, eVar.f293122a) && this.f293123b == eVar.f293123b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f293123b) + (this.f293122a.hashCode() * 31);
    }
}
