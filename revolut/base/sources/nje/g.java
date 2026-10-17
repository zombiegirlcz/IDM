package nje;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f216460a;

    public g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f216460a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f216460a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f216460a.equals(((g) obj2).f216460a);
    }

    public final int hashCode() {
        return this.f216460a.hashCode();
    }
}
