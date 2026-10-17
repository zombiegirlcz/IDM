package qna;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f247909a;

    public g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f247909a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f247909a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f247909a.equals(((g) obj2).f247909a);
    }

    public final int hashCode() {
        return this.f247909a.hashCode();
    }
}
