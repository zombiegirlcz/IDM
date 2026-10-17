package ti4;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f271420a;

    public j(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f271420a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f271420a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f271420a.equals(((j) obj2).f271420a);
    }

    public final int hashCode() {
        return this.f271420a.hashCode();
    }
}
