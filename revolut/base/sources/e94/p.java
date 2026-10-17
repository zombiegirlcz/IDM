package e94;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f123917a;

    public p(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f123917a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f123917a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f123917a.equals(((p) obj2).f123917a);
    }

    public final int hashCode() {
        return this.f123917a.hashCode();
    }
}
