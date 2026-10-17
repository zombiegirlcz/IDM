package syc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f266654a;

    public h(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f266654a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f266654a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f266654a.equals(((h) obj2).f266654a);
    }

    public final int hashCode() {
        return this.f266654a.hashCode();
    }
}
