package tx5;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f275335a;

    public g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f275335a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f275335a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f275335a.equals(((g) obj2).f275335a);
    }

    public final int hashCode() {
        return this.f275335a.hashCode();
    }
}
