package knd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186100a;

    public j1(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List params2 = kotlin.collections.d.L(params);
        Intrinsics.checkNotNullParameter(params2, "params");
        this.f186100a = params2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j1) && Intrinsics.f(this.f186100a, ((j1) obj2).f186100a);
    }

    public final int hashCode() {
        return this.f186100a.hashCode();
    }
}
