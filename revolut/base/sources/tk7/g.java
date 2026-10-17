package tk7;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f271909a;

    public g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f271909a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f271909a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f271909a.equals(((g) obj2).f271909a);
    }

    public final int hashCode() {
        return this.f271909a.hashCode();
    }
}
