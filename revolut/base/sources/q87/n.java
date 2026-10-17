package q87;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f243026a;

    public n(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f243026a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f243026a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f243026a.equals(((n) obj2).f243026a);
    }

    public final int hashCode() {
        return this.f243026a.hashCode();
    }
}
