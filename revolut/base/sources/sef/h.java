package sef;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f262191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f262192b;

    public h(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f262191a = z;
        this.f262192b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f262192b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f262191a == hVar.f262191a && Intrinsics.f(this.f262192b, hVar.f262192b);
    }

    public final int hashCode() {
        return this.f262192b.hashCode() + (Boolean.hashCode(this.f262191a) * 31);
    }
}
