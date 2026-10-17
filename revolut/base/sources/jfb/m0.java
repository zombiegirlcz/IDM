package jfb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173824a;

    public m0(zhm.f0 items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f173824a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f173824a, ((m0) obj2).f173824a);
    }

    public final int hashCode() {
        return this.f173824a.hashCode();
    }
}
