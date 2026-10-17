package xk7;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f306616a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f306616a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f306616a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f306616a.equals(((f) obj2).f306616a);
    }

    public final int hashCode() {
        return this.f306616a.hashCode();
    }
}
